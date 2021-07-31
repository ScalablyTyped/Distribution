package typings.winrtUwp.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the VolumeChangeRequested event. */
trait VolumeChangeRequestedEventArgs extends StObject {
  
  /** Gets the new volume level. */
  var volume: Double
}
object VolumeChangeRequestedEventArgs {
  
  @scala.inline
  def apply(volume: Double): VolumeChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeChangeRequestedEventArgs]
  }
  
  @scala.inline
  implicit class VolumeChangeRequestedEventArgsMutableBuilder[Self <: VolumeChangeRequestedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
