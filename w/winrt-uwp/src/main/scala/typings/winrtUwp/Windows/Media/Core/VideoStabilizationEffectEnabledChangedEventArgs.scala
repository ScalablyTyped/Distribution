package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the VideoStabilizationEffect::EnabledChanged event. */
@js.native
trait VideoStabilizationEffectEnabledChangedEventArgs extends js.Object {
  
  /** Gets a value indicating the reason why the VideoStabilizationEffect::Enabled property changed. */
  var reason: VideoStabilizationEffectEnabledChangedReason = js.native
}
object VideoStabilizationEffectEnabledChangedEventArgs {
  
  @scala.inline
  def apply(reason: VideoStabilizationEffectEnabledChangedReason): VideoStabilizationEffectEnabledChangedEventArgs = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoStabilizationEffectEnabledChangedEventArgs]
  }
  
  @scala.inline
  implicit class VideoStabilizationEffectEnabledChangedEventArgsOps[Self <: VideoStabilizationEffectEnabledChangedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setReason(value: VideoStabilizationEffectEnabledChangedReason): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
}
