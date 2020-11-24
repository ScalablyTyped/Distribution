package typings.winrtUwp.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the PlaybackRateChangeRequested event. */
@js.native
trait PlaybackRateChangeRequestedEventArgs extends js.Object {
  
  /** Gets the requested playback rate. */
  var requestedPlaybackRate: Double = js.native
}
object PlaybackRateChangeRequestedEventArgs {
  
  @scala.inline
  def apply(requestedPlaybackRate: Double): PlaybackRateChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(requestedPlaybackRate = requestedPlaybackRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackRateChangeRequestedEventArgs]
  }
  
  @scala.inline
  implicit class PlaybackRateChangeRequestedEventArgsOps[Self <: PlaybackRateChangeRequestedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setRequestedPlaybackRate(value: Double): Self = this.set("requestedPlaybackRate", value.asInstanceOf[js.Any])
  }
}
