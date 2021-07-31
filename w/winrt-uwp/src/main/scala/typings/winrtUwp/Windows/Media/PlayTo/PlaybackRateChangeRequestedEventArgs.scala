package typings.winrtUwp.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the PlaybackRateChangeRequested event. */
trait PlaybackRateChangeRequestedEventArgs extends StObject {
  
  /** Gets the new playback rate. */
  var rate: Double
}
object PlaybackRateChangeRequestedEventArgs {
  
  @scala.inline
  def apply(rate: Double): PlaybackRateChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackRateChangeRequestedEventArgs]
  }
  
  @scala.inline
  implicit class PlaybackRateChangeRequestedEventArgsMutableBuilder[Self <: PlaybackRateChangeRequestedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
  }
}
