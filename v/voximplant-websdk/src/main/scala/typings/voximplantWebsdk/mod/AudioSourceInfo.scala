package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Audio recording device info
  */
trait AudioSourceInfo extends StObject {
  
  /**
    *    Device id that can be used to choose audio recording device
    */
  var id: Double | String
  
  /**
    *    Device name , in WebRTC mode populated with real data only when app has been opened using HTTPS protocol
    */
  var name: String
}
object AudioSourceInfo {
  
  @scala.inline
  def apply(id: Double | String, name: String): AudioSourceInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioSourceInfo]
  }
  
  @scala.inline
  implicit class AudioSourceInfoMutableBuilder[Self <: AudioSourceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
