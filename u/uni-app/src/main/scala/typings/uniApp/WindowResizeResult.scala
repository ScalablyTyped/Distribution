package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowResizeResult extends StObject {
  
  /**
    * 变化后的窗口高度，单位 px
    */
  var windowHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * 变化后的窗口宽度，单位 px
    */
  var windowWidth: js.UndefOr[Double] = js.undefined
}
object WindowResizeResult {
  
  inline def apply(): WindowResizeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowResizeResult]
  }
  
  extension [Self <: WindowResizeResult](x: Self) {
    
    inline def setWindowHeight(value: Double): Self = StObject.set(x, "windowHeight", value.asInstanceOf[js.Any])
    
    inline def setWindowHeightUndefined: Self = StObject.set(x, "windowHeight", js.undefined)
    
    inline def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
    
    inline def setWindowWidthUndefined: Self = StObject.set(x, "windowWidth", js.undefined)
  }
}
