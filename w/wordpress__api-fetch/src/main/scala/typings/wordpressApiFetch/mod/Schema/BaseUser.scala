package typings.wordpressApiFetch.mod.Schema

import typings.std.Record
import typings.wordpressApiFetch.anon.Dictk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseUser[T /* <: Context */] extends BaseResponse {
  
  var avatar_urls: Record[Double, String] = js.native
  
  var capabilities: Record[String, Boolean] = js.native
  
  var description: String = js.native
  
  var email: String = js.native
  
  var extra_capabilities: Record[String, Boolean] = js.native
  
  var first_name: String = js.native
  
  var id: Double = js.native
  
  var last_name: String = js.native
  
  var link: String = js.native
  
  var meta: js.Array[_] = js.native
  
  var name: String = js.native
  
  var nickname: String = js.native
  
  var registered_date: String = js.native
  
  var roles: js.Array[String] = js.native
  
  var slug: String = js.native
  
  var url: String = js.native
  
  var username: String = js.native
}
object BaseUser {
  
  @scala.inline
  def apply[T /* <: Context */](
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
    meta: js.Array[_],
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
  implicit class BaseUserMutableBuilder[Self <: BaseUser[_], T /* <: Context */] (val x: Self with BaseUser[T]) extends AnyVal {
    
    @scala.inline
    def setAvatar_urls(value: Record[Double, String]): Self = StObject.set(x, "avatar_urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilities(value: Record[String, Boolean]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtra_capabilities(value: Record[String, Boolean]): Self = StObject.set(x, "extra_capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: js.Array[_]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaVarargs(value: js.Any*): Self = StObject.set(x, "meta", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistered_date(value: String): Self = StObject.set(x, "registered_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value :_*))
    
    @scala.inline
    def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
