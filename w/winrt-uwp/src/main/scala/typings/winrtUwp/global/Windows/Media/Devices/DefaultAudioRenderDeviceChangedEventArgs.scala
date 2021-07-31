package typings.winrtUwp.global.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about a default audio render device change event. */
@JSGlobal("Windows.Media.Devices.DefaultAudioRenderDeviceChangedEventArgs")
@js.native
abstract class DefaultAudioRenderDeviceChangedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Devices.DefaultAudioRenderDeviceChangedEventArgs {
  
  /** Gets the ID of the newly selected default audio render device that caused the change event. */
  /* CompleteClass */
  var id: String = js.native
  
  /** Gets the role of the newly selected default audio render device that caused the change event. */
  /* CompleteClass */
  var role: typings.winrtUwp.Windows.Media.Devices.AudioDeviceRole = js.native
}
