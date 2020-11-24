package typings.vegas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Support extends js.Object {
  
  val objectFit: Boolean = js.native
  
  val transition: Boolean = js.native
  
  val video: Boolean = js.native
}
object Support {
  
  @scala.inline
  def apply(objectFit: Boolean, transition: Boolean, video: Boolean): Support = {
    val __obj = js.Dynamic.literal(objectFit = objectFit.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[Support]
  }
  
  @scala.inline
  implicit class SupportOps[Self <: Support] (val x: Self) extends AnyVal {
    
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
    def setObjectFit(value: Boolean): Self = this.set("objectFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransition(value: Boolean): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo(value: Boolean): Self = this.set("video", value.asInstanceOf[js.Any])
  }
}
