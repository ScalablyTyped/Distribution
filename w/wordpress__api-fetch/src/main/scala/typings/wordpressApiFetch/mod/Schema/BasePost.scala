package typings.wordpressApiFetch.mod.Schema

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.wordpressApiFetch.anon.Blockversion
import typings.wordpressApiFetch.anon.Dictk
import typings.wordpressApiFetch.anon.Protected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasePost[T /* <: Context */]
  extends StObject
     with BaseResponse
     with /* k */ StringDictionary[js.Any] {
  
  var author: Double
  
  var categories: js.Array[Double]
  
  var comment_status: OpenOrClosed
  
  var content: Contextual[T, Protected, Blockversion]
  
  var date: String
  
  var date_gmt: String
  
  var excerpt: Contextual[T, Protected, js.Object]
  
  var featured_media: Double
  
  var format: PostFormat
  
  var generated_slug: String
  
  var guid: Contextual[T, js.Object, js.Object]
  
  var id: Double
  
  var link: String
  
  var meta: js.Array[js.Any]
  
  var modified: String
  
  var modified_gmt: String
  
  var password: String
  
  var permalink_template: String
  
  var ping_status: OpenOrClosed
  
  var slug: String
  
  var status: PostStatus
  
  var sticky: Boolean
  
  var tags: js.Array[String]
  
  var template: String
  
  var title: Contextual[T, js.Object, js.Object]
  
  var `type`: String
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
    meta: js.Array[js.Any],
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
  implicit class BasePostMutableBuilder[Self <: BasePost[?], T /* <: Context */] (val x: Self & BasePost[T]) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: Double): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategories(value: js.Array[Double]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesVarargs(value: Double*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setComment_status(value: OpenOrClosed): Self = StObject.set(x, "comment_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: Contextual[T, Protected, Blockversion]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate_gmt(value: String): Self = StObject.set(x, "date_gmt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcerpt(value: Contextual[T, Protected, js.Object]): Self = StObject.set(x, "excerpt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatured_media(value: Double): Self = StObject.set(x, "featured_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: PostFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerated_slug(value: String): Self = StObject.set(x, "generated_slug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuid(value: Contextual[T, js.Object, js.Object]): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: js.Array[js.Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaVarargs(value: js.Any*): Self = StObject.set(x, "meta", js.Array(value :_*))
    
    @scala.inline
    def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModified_gmt(value: String): Self = StObject.set(x, "modified_gmt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermalink_template(value: String): Self = StObject.set(x, "permalink_template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPing_status(value: OpenOrClosed): Self = StObject.set(x, "ping_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: PostStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: Contextual[T, js.Object, js.Object]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
