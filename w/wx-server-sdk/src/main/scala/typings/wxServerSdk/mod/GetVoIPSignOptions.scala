package typings.wxServerSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVoIPSignOptions extends StObject {
  
  var groupId: String
  
  var nonce: String
  
  var timestamp: Double
}
object GetVoIPSignOptions {
  
  @scala.inline
  def apply(groupId: String, nonce: String, timestamp: Double): GetVoIPSignOptions = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVoIPSignOptions]
  }
  
  @scala.inline
  implicit class GetVoIPSignOptionsMutableBuilder[Self <: GetVoIPSignOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
