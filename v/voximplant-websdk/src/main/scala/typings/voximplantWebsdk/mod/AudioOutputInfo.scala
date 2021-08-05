package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Audio playback device info
  */
trait AudioOutputInfo extends StObject {
  
  /**
    *    Device id that can be used to choose audio playback device
    */
  var id: Double | String
  
  /**
    *    Device name , in WebRTC mode populated with real data only when app has been opened using HTTPS protocol
    */
  var name: String
}
object AudioOutputInfo {
  
  inline def apply(id: Double | String, name: String): AudioOutputInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioOutputInfo]
  }
  
  extension [Self <: AudioOutputInfo](x: Self) {
    
    inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
