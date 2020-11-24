package typings.videoJs.mod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextTrackSettingsOptions extends ModalDialogOptions {
  
  var persistTextTrackSettings: js.UndefOr[Boolean] = js.native
}
object TextTrackSettingsOptions {
  
  @scala.inline
  def apply(): TextTrackSettingsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextTrackSettingsOptions]
  }
  
  @scala.inline
  implicit class TextTrackSettingsOptionsOps[Self <: TextTrackSettingsOptions] (val x: Self) extends AnyVal {
    
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
    def setPersistTextTrackSettings(value: Boolean): Self = this.set("persistTextTrackSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersistTextTrackSettings: Self = this.set("persistTextTrackSettings", js.undefined)
  }
}
