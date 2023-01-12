package typings.winrt.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDefaultAudioDeviceChangedEventArgs extends StObject {
  
  var id: String
  
  var role: AudioDeviceRole
}
object IDefaultAudioDeviceChangedEventArgs {
  
  inline def apply(id: String, role: AudioDeviceRole): IDefaultAudioDeviceChangedEventArgs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDefaultAudioDeviceChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDefaultAudioDeviceChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRole(value: AudioDeviceRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
