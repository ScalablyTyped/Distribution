package typings.wordpressCoreData.schemaMod.Schema

import typings.std.Record
import typings.wordpressCoreData.anon.Dictk
import typings.wordpressCoreData.wordpressCoreDataStrings.approved
import typings.wordpressCoreData.wordpressCoreDataStrings.hold
import typings.wordpressCoreData.wordpressCoreDataStrings.spam
import typings.wordpressCoreData.wordpressCoreDataStrings.trash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseComment[T /* <: Context */]
  extends StObject
     with BaseResponse {
  
  var author: Double
  
  var author_avatar_urls: Record[Double, String]
  
  var author_email: String
  
  var author_ip: String
  
  var author_name: String
  
  var author_url: String
  
  var author_user_agent: String
  
  var content: Contextual[T, js.Object, js.Object]
  
  var date: String
  
  var date_gmt: String
  
  var id: Double
  
  var link: String
  
  var meta: js.Array[Any]
  
  var parent: Double
  
  var post: Double
  
  var status: approved | hold | spam | trash
  
  var `type`: String
}
object BaseComment {
  
  inline def apply[T /* <: Context */](
    _links: Record[String, js.Array[Dictk]],
    author: Double,
    author_avatar_urls: Record[Double, String],
    author_email: String,
    author_ip: String,
    author_name: String,
    author_url: String,
    author_user_agent: String,
    content: Contextual[T, js.Object, js.Object],
    date: String,
    date_gmt: String,
    id: Double,
    link: String,
    meta: js.Array[Any],
    parent: Double,
    post: Double,
    status: approved | hold | spam | trash,
    `type`: String
  ): BaseComment[T] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], author_avatar_urls = author_avatar_urls.asInstanceOf[js.Any], author_email = author_email.asInstanceOf[js.Any], author_ip = author_ip.asInstanceOf[js.Any], author_name = author_name.asInstanceOf[js.Any], author_url = author_url.asInstanceOf[js.Any], author_user_agent = author_user_agent.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], date_gmt = date_gmt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseComment[T]]
  }
  
  extension [Self <: BaseComment[?], T /* <: Context */](x: Self & BaseComment[T]) {
    
    inline def setAuthor(value: Double): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthor_avatar_urls(value: Record[Double, String]): Self = StObject.set(x, "author_avatar_urls", value.asInstanceOf[js.Any])
    
    inline def setAuthor_email(value: String): Self = StObject.set(x, "author_email", value.asInstanceOf[js.Any])
    
    inline def setAuthor_ip(value: String): Self = StObject.set(x, "author_ip", value.asInstanceOf[js.Any])
    
    inline def setAuthor_name(value: String): Self = StObject.set(x, "author_name", value.asInstanceOf[js.Any])
    
    inline def setAuthor_url(value: String): Self = StObject.set(x, "author_url", value.asInstanceOf[js.Any])
    
    inline def setAuthor_user_agent(value: String): Self = StObject.set(x, "author_user_agent", value.asInstanceOf[js.Any])
    
    inline def setContent(value: Contextual[T, js.Object, js.Object]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDate_gmt(value: String): Self = StObject.set(x, "date_gmt", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: js.Array[Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaVarargs(value: Any*): Self = StObject.set(x, "meta", js.Array(value*))
    
    inline def setParent(value: Double): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Double): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: approved | hold | spam | trash): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
