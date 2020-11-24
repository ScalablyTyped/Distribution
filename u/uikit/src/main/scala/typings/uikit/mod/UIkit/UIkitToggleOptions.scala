package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitToggleOptions extends js.Object {
  
  var animation: js.UndefOr[String] = js.native
  
  var cls: js.UndefOr[String] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var media: js.UndefOr[Double | String] = js.native
  
  var mode: js.UndefOr[String] = js.native
  
  var queued: js.UndefOr[Boolean] = js.native
  
  var target: js.UndefOr[String] = js.native
}
object UIkitToggleOptions {
  
  @scala.inline
  def apply(): UIkitToggleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitToggleOptions]
  }
  
  @scala.inline
  implicit class UIkitToggleOptionsOps[Self <: UIkitToggleOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimation(value: String): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setCls(value: String): Self = this.set("cls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCls: Self = this.set("cls", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setMedia(value: Double | String): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setQueued(value: Boolean): Self = this.set("queued", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueued: Self = this.set("queued", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
