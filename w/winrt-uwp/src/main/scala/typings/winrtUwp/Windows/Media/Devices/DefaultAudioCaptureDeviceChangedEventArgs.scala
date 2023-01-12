package typings.winrtUwp.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about a default audio capture device change event. */
trait DefaultAudioCaptureDeviceChangedEventArgs extends StObject {
  
  /** Gets the ID of the newly selected audio capture device that caused the change event. */
  var id: String
  
  /** Gets the role of the newly selected audio capture device that caused the change event. */
  var role: AudioDeviceRole
}
object DefaultAudioCaptureDeviceChangedEventArgs {
  
  inline def apply(id: String, role: AudioDeviceRole): DefaultAudioCaptureDeviceChangedEventArgs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultAudioCaptureDeviceChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultAudioCaptureDeviceChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRole(value: AudioDeviceRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
