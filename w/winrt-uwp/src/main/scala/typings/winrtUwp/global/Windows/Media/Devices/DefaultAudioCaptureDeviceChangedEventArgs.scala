package typings.winrtUwp.global.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about a default audio capture device change event. */
@JSGlobal("Windows.Media.Devices.DefaultAudioCaptureDeviceChangedEventArgs")
@js.native
abstract class DefaultAudioCaptureDeviceChangedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Devices.DefaultAudioCaptureDeviceChangedEventArgs {
  
  /** Gets the ID of the newly selected audio capture device that caused the change event. */
  /* CompleteClass */
  var id: String = js.native
  
  /** Gets the role of the newly selected audio capture device that caused the change event. */
  /* CompleteClass */
  var role: typings.winrtUwp.Windows.Media.Devices.AudioDeviceRole = js.native
}
