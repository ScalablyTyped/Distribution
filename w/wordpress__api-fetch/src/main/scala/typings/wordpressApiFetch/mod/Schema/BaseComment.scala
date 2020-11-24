package typings.wordpressApiFetch.mod.Schema

import typings.std.Record
import typings.wordpressApiFetch.anon.Dictk
import typings.wordpressApiFetch.wordpressApiFetchStrings.approved
import typings.wordpressApiFetch.wordpressApiFetchStrings.hold
import typings.wordpressApiFetch.wordpressApiFetchStrings.spam
import typings.wordpressApiFetch.wordpressApiFetchStrings.trash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseComment[T /* <: Context */] extends BaseResponse {
  
  var author: Double = js.native
  
  var author_avatar_urls: Record[Double, String] = js.native
  
  var author_email: String = js.native
  
  var author_ip: String = js.native
  
  var author_name: String = js.native
  
  var author_url: String = js.native
  
  var author_user_agent: String = js.native
  
  var content: Contextual[T, js.Object, js.Object] = js.native
  
  var date: String = js.native
  
  var date_gmt: String = js.native
  
  var id: Double = js.native
  
  var link: String = js.native
  
  var meta: js.Array[_] = js.native
  
  var parent: Double = js.native
  
  var post: Double = js.native
  
  var status: approved | hold | spam | trash = js.native
  
  var `type`: String = js.native
}
object BaseComment {
  
  @scala.inline
  def apply[T /* <: Context */](
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
    meta: js.Array[_],
    parent: Double,
    post: Double,
    status: approved | hold | spam | trash,
    `type`: String
  ): BaseComment[T] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], author_avatar_urls = author_avatar_urls.asInstanceOf[js.Any], author_email = author_email.asInstanceOf[js.Any], author_ip = author_ip.asInstanceOf[js.Any], author_name = author_name.asInstanceOf[js.Any], author_url = author_url.asInstanceOf[js.Any], author_user_agent = author_user_agent.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], date_gmt = date_gmt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseComment[T]]
  }
  
  @scala.inline
  implicit class BaseCommentOps[Self <: BaseComment[_], T /* <: Context */] (val x: Self with BaseComment[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthor(value: Double): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor_avatar_urls(value: Record[Double, String]): Self = this.set("author_avatar_urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor_email(value: String): Self = this.set("author_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor_ip(value: String): Self = this.set("author_ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor_name(value: String): Self = this.set("author_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor_url(value: String): Self = this.set("author_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor_user_agent(value: String): Self = this.set("author_user_agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: Contextual[T, js.Object, js.Object]): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate_gmt(value: String): Self = this.set("date_gmt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaVarargs(value: js.Any*): Self = this.set("meta", js.Array(value :_*))
    
    @scala.inline
    def setMeta(value: js.Array[_]): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: Double): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPost(value: Double): Self = this.set("post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: approved | hold | spam | trash): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
