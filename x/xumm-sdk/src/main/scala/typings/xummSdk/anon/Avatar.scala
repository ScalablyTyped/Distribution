package typings.xummSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Avatar extends StObject {
  
  var avatar: js.UndefOr[String] = js.undefined
  
  var currency: String
  
  var id: Double
  
  var issuer_id: Double
  
  var name: String
  
  var shortlist: Double
}
object Avatar {
  
  inline def apply(currency: String, id: Double, issuer_id: Double, name: String, shortlist: Double): Avatar = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issuer_id = issuer_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shortlist = shortlist.asInstanceOf[js.Any])
    __obj.asInstanceOf[Avatar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Avatar] (val x: Self) extends AnyVal {
    
    inline def setAvatar(value: String): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
    
    inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIssuer_id(value: Double): Self = StObject.set(x, "issuer_id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setShortlist(value: Double): Self = StObject.set(x, "shortlist", value.asInstanceOf[js.Any])
  }
}
