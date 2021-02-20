package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowResizeResult extends StObject {
  
  /**
    * 变化后的窗口高度，单位 px
    */
  var windowHeight: js.UndefOr[Double] = js.native
  
  /**
    * 变化后的窗口宽度，单位 px
    */
  var windowWidth: js.UndefOr[Double] = js.native
}
object WindowResizeResult {
  
  @scala.inline
  def apply(): WindowResizeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowResizeResult]
  }
  
  @scala.inline
  implicit class WindowResizeResultMutableBuilder[Self <: WindowResizeResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWindowHeight(value: Double): Self = StObject.set(x, "windowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowHeightUndefined: Self = StObject.set(x, "windowHeight", js.undefined)
    
    @scala.inline
    def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowWidthUndefined: Self = StObject.set(x, "windowWidth", js.undefined)
  }
}
