package typings.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowHeight extends StObject {
  
  /** 变化后的窗口高度，单位 px */
  var windowHeight: Double
  
  /** 变化后的窗口宽度，单位 px */
  var windowWidth: Double
}
object WindowHeight {
  
  inline def apply(windowHeight: Double, windowWidth: Double): WindowHeight = {
    val __obj = js.Dynamic.literal(windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowHeight]
  }
  
  extension [Self <: WindowHeight](x: Self) {
    
    inline def setWindowHeight(value: Double): Self = StObject.set(x, "windowHeight", value.asInstanceOf[js.Any])
    
    inline def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
  }
}
