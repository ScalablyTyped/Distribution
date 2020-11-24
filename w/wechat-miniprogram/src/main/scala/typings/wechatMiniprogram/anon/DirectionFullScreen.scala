package typings.wechatMiniprogram.anon

import typings.wechatMiniprogram.wechatMiniprogramStrings.horizontal
import typings.wechatMiniprogram.wechatMiniprogramStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionFullScreen extends js.Object {
  
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
  implicit class DirectionFullScreenOps[Self <: DirectionFullScreen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDirection(value: vertical | horizontal): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullScreen(value: Boolean): Self = this.set("fullScreen", value.asInstanceOf[js.Any])
  }
}
