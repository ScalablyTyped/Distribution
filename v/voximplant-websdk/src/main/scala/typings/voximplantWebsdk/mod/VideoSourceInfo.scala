package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Video recording device info
  */
@js.native
trait VideoSourceInfo extends StObject {
  
  /**
    *    Device id that can be used to choose video recording device
    */
  var id: Double | String = js.native
  
  /**
    *    Device name , in WebRTC mode populated with real data only when app has been opened using HTTPS protocol
    */
  var name: String = js.native
}
object VideoSourceInfo {
  
  @scala.inline
  def apply(id: Double | String, name: String): VideoSourceInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoSourceInfo]
  }
  
  @scala.inline
  implicit class VideoSourceInfoMutableBuilder[Self <: VideoSourceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
