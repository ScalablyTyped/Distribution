package typings.twilio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Identity extends StObject {
  
  var accountSid: String
  
  var identity: String
  
  var listSid: String
  
  var manage: Boolean
  
  var read: Boolean
  
  var serviceSid: String
  
  var url: String
  
  var write: Boolean
}
object Identity {
  
  inline def apply(
    accountSid: String,
    identity: String,
    listSid: String,
    manage: Boolean,
    read: Boolean,
    serviceSid: String,
    url: String,
    write: Boolean
  ): Identity = {
    val __obj = js.Dynamic.literal(accountSid = accountSid.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], listSid = listSid.asInstanceOf[js.Any], manage = manage.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], serviceSid = serviceSid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Identity] (val x: Self) extends AnyVal {
    
    inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
    
    inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setListSid(value: String): Self = StObject.set(x, "listSid", value.asInstanceOf[js.Any])
    
    inline def setManage(value: Boolean): Self = StObject.set(x, "manage", value.asInstanceOf[js.Any])
    
    inline def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWrite(value: Boolean): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
  }
}
