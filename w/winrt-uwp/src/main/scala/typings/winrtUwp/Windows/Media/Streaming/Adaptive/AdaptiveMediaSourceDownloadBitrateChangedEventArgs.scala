package typings.winrtUwp.Windows.Media.Streaming.Adaptive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the DownloadBitrateChanged event. */
@js.native
trait AdaptiveMediaSourceDownloadBitrateChangedEventArgs extends js.Object {
  
  /** Gets a value indicating the new download bitrate for the media source. */
  var newValue: Double = js.native
  
  /** Gets a value indicating the previous download bitrate for the media source. */
  var oldValue: Double = js.native
}
object AdaptiveMediaSourceDownloadBitrateChangedEventArgs {
  
  @scala.inline
  def apply(newValue: Double, oldValue: Double): AdaptiveMediaSourceDownloadBitrateChangedEventArgs = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdaptiveMediaSourceDownloadBitrateChangedEventArgs]
  }
  
  @scala.inline
  implicit class AdaptiveMediaSourceDownloadBitrateChangedEventArgsOps[Self <: AdaptiveMediaSourceDownloadBitrateChangedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setNewValue(value: Double): Self = this.set("newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValue(value: Double): Self = this.set("oldValue", value.asInstanceOf[js.Any])
  }
}
