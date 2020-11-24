package typings.wordpressApiFetch.mod.Schema

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.wordpressApiFetch.anon.Blockversion
import typings.wordpressApiFetch.anon.Dictk
import typings.wordpressApiFetch.anon.Protected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasePost[T /* <: Context */]
  extends BaseResponse
     with /* k */ StringDictionary[js.Any] {
  
  var author: Double = js.native
  
  var categories: js.Array[Double] = js.native
  
  var comment_status: OpenOrClosed = js.native
  
  var content: Contextual[T, Protected, Blockversion] = js.native
  
  var date: String = js.native
  
  var date_gmt: String = js.native
  
  var excerpt: Contextual[T, Protected, js.Object] = js.native
  
  var featured_media: Double = js.native
  
  var format: PostFormat = js.native
  
  var generated_slug: String = js.native
  
  var guid: Contextual[T, js.Object, js.Object] = js.native
  
  var id: Double = js.native
  
  var link: String = js.native
  
  var meta: js.Array[_] = js.native
  
  var modified: String = js.native
  
  var modified_gmt: String = js.native
  
  var password: String = js.native
  
  var permalink_template: String = js.native
  
  var ping_status: OpenOrClosed = js.native
  
  var slug: String = js.native
  
  var status: PostStatus = js.native
  
  var sticky: Boolean = js.native
  
  var tags: js.Array[String] = js.native
  
  var template: String = js.native
  
  var title: Contextual[T, js.Object, js.Object] = js.native
  
  var `type`: String = js.native
}
object BasePost {
  
  @scala.inline
  def apply[T /* <: Context */](
    _links: Record[String, js.Array[Dictk]],
    author: Double,
    categories: js.Array[Double],
    comment_status: OpenOrClosed,
    content: Contextual[T, Protected, Blockversion],
    date: String,
    date_gmt: String,
    excerpt: Contextual[T, Protected, js.Object],
    featured_media: Double,
    format: PostFormat,
    generated_slug: String,
    guid: Contextual[T, js.Object, js.Object],
    id: Double,
    link: String,
    meta: js.Array[_],
    modified: String,
    modified_gmt: String,
    password: String,
    permalink_template: String,
    ping_status: OpenOrClosed,
    slug: String,
    status: PostStatus,
    sticky: Boolean,
    tags: js.Array[String],
    template: String,
    title: Contextual[T, js.Object, js.Object],
    `type`: String
  ): BasePost[T] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], comment_status = comment_status.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], date_gmt = date_gmt.asInstanceOf[js.Any], excerpt = excerpt.asInstanceOf[js.Any], featured_media = featured_media.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], generated_slug = generated_slug.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], modified_gmt = modified_gmt.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], permalink_template = permalink_template.asInstanceOf[js.Any], ping_status = ping_status.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], sticky = sticky.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePost[T]]
  }
  
  @scala.inline
  implicit class BasePostOps[Self <: BasePost[_], T /* <: Context */] (val x: Self with BasePost[T]) extends AnyVal {
    
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
    def setCategoriesVarargs(value: Double*): Self = this.set("categories", js.Array(value :_*))
    
    @scala.inline
    def setCategories(value: js.Array[Double]): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_status(value: OpenOrClosed): Self = this.set("comment_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: Contextual[T, Protected, Blockversion]): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate_gmt(value: String): Self = this.set("date_gmt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcerpt(value: Contextual[T, Protected, js.Object]): Self = this.set("excerpt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatured_media(value: Double): Self = this.set("featured_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: PostFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerated_slug(value: String): Self = this.set("generated_slug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuid(value: Contextual[T, js.Object, js.Object]): Self = this.set("guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaVarargs(value: js.Any*): Self = this.set("meta", js.Array(value :_*))
    
    @scala.inline
    def setMeta(value: js.Array[_]): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModified(value: String): Self = this.set("modified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModified_gmt(value: String): Self = this.set("modified_gmt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermalink_template(value: String): Self = this.set("permalink_template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPing_status(value: OpenOrClosed): Self = this.set("ping_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlug(value: String): Self = this.set("slug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: PostStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSticky(value: Boolean): Self = this.set("sticky", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: Contextual[T, js.Object, js.Object]): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
