package typings.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowHeight extends StObject {
  
  /** 变化后的窗口高度，单位 px */
  var windowHeight: Double = js.native
  
  /** 变化后的窗口宽度，单位 px */
  var windowWidth: Double = js.native
}
object WindowHeight {
  
  @scala.inline
  def apply(windowHeight: Double, windowWidth: Double): WindowHeight = {
    val __obj = js.Dynamic.literal(windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowHeight]
  }
  
  @scala.inline
  implicit class WindowHeightMutableBuilder[Self <: WindowHeight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWindowHeight(value: Double): Self = StObject.set(x, "windowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
  }
}
