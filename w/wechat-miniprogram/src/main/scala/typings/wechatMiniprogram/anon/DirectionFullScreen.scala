package typings.wechatMiniprogram.anon

import typings.wechatMiniprogram.wechatMiniprogramStrings.horizontal
import typings.wechatMiniprogram.wechatMiniprogramStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionFullScreen extends StObject {
  
  var direction: vertical | horizontal = js.native
  
  var fullScreen: Boolean = js.native
}
object DirectionFullScreen {
  
  @scala.inline
  def apply(direction: vertical | horizontal, fullScreen: Boolean): DirectionFullScreen = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], fullScreen = fullScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionFullScreen]
  }
  
  @scala.inline
  implicit class DirectionFullScreenMutableBuilder[Self <: DirectionFullScreen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: vertical | horizontal): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullScreen(value: Boolean): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
  }
}
