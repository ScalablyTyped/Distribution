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
  
  inline def apply(volume: Double): VolumeChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeChangeRequestedEventArgs]
  }
  
  extension [Self <: VolumeChangeRequestedEventArgs](x: Self) {
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
