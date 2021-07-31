package typings.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VolumeChangeRequestedEventArgs
  extends StObject
     with IVolumeChangeRequestedEventArgs
object VolumeChangeRequestedEventArgs {
  
  @scala.inline
  def apply(volume: Double): VolumeChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeChangeRequestedEventArgs]
  }
}
