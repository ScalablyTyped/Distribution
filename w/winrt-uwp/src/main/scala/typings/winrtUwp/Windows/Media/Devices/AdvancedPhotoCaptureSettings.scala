package typings.winrtUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents settings for an AdvancedPhotoControl object. */
@js.native
trait AdvancedPhotoCaptureSettings extends js.Object {
  
  /** Gets or sets the advanced capture mode for which an AdvancedPhotoControl will be configured. */
  var mode: AdvancedPhotoMode = js.native
}
object AdvancedPhotoCaptureSettings {
  
  @scala.inline
  def apply(mode: AdvancedPhotoMode): AdvancedPhotoCaptureSettings = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedPhotoCaptureSettings]
  }
  
  @scala.inline
  implicit class AdvancedPhotoCaptureSettingsOps[Self <: AdvancedPhotoCaptureSettings] (val x: Self) extends AnyVal {
    
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
    def setMode(value: AdvancedPhotoMode): Self = this.set("mode", value.asInstanceOf[js.Any])
  }
}
