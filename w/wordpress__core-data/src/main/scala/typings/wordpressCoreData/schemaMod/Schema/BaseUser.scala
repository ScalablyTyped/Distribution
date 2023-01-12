package typings.wordpressCoreData.schemaMod.Schema

import typings.std.Record
import typings.wordpressCoreData.anon.Dictk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseUser[T /* <: Context */]
  extends StObject
     with BaseResponse {
  
  var avatar_urls: Record[Double, String]
  
  var capabilities: Record[String, Boolean]
  
  var description: String
  
  var email: String
  
  var extra_capabilities: Record[String, Boolean]
  
  var first_name: String
  
  var id: Double
  
  var last_name: String
  
  var link: String
  
  var meta: js.Array[Any]
  
  var name: String
  
  var nickname: String
  
  var registered_date: String
  
  var roles: js.Array[String]
  
  var slug: String
  
  var url: String
  
  var username: String
}
object BaseUser {
  
  inline def apply[T /* <: Context */](
    _links: Record[String, js.Array[Dictk]],
    avatar_urls: Record[Double, String],
    capabilities: Record[String, Boolean],
    description: String,
    email: String,
    extra_capabilities: Record[String, Boolean],
    first_name: String,
    id: Double,
    last_name: String,
    link: String,
    meta: js.Array[Any],
    name: String,
    nickname: String,
    registered_date: String,
    roles: js.Array[String],
    slug: String,
    url: String,
    username: String
  ): BaseUser[T] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], avatar_urls = avatar_urls.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], extra_capabilities = extra_capabilities.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], registered_date = registered_date.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseUser[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseUser[?], T /* <: Context */] (val x: Self & BaseUser[T]) extends AnyVal {
    
    inline def setAvatar_urls(value: Record[Double, String]): Self = StObject.set(x, "avatar_urls", value.asInstanceOf[js.Any])
    
    inline def setCapabilities(value: Record[String, Boolean]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setExtra_capabilities(value: Record[String, Boolean]): Self = StObject.set(x, "extra_capabilities", value.asInstanceOf[js.Any])
    
    inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: js.Array[Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaVarargs(value: Any*): Self = StObject.set(x, "meta", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    inline def setRegistered_date(value: String): Self = StObject.set(x, "registered_date", value.asInstanceOf[js.Any])
    
    inline def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value*))
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
