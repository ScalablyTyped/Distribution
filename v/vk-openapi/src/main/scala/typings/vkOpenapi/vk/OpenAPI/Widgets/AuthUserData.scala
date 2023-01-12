package typings.vkOpenapi.vk.OpenAPI.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthUserData extends StObject {
  
  var first_name: String
  
  var hash: String
  
  var last_name: String
  
  var photo: String
  
  var photo_rec: String
  
  var uid: Double
}
object AuthUserData {
  
  inline def apply(first_name: String, hash: String, last_name: String, photo: String, photo_rec: String, uid: Double): AuthUserData = {
    val __obj = js.Dynamic.literal(first_name = first_name.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any], photo = photo.asInstanceOf[js.Any], photo_rec = photo_rec.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthUserData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthUserData] (val x: Self) extends AnyVal {
    
    inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
    
    inline def setPhoto(value: String): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    inline def setPhoto_rec(value: String): Self = StObject.set(x, "photo_rec", value.asInstanceOf[js.Any])
    
    inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
