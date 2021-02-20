package typings.wordpressApiFetch.mod.Schema

import typings.std.Record
import typings.wordpressApiFetch.anon.Blockversion
import typings.wordpressApiFetch.anon.Dictk
import typings.wordpressApiFetch.anon.Protected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<@wordpress/api-fetch.@wordpress/api-fetch.Schema.BasePost<T>, 'categories' | 'format' | 'sticky' | 'tags'> */
@js.native
trait BasePage[T /* <: Context */] extends StObject {
  
  var _embedded: js.UndefOr[Record[String, js.Array[_]]] = js.native
  
  var _links: Record[String, js.Array[Dictk]] = js.native
  
  var author: Double = js.native
  
  var comment_status: OpenOrClosed = js.native
  
  var content: Contextual[T, Protected, Blockversion] = js.native
  
  var date: String = js.native
  
  var date_gmt: String = js.native
  
  var excerpt: Contextual[T, Protected, js.Object] = js.native
  
  var featured_media: Double = js.native
  
  var generated_slug: String = js.native
  
  var guid: Contextual[T, js.Object, js.Object] = js.native
  
  var id: Double = js.native
  
  var link: String = js.native
  
  var menu_order: Double = js.native
  
  var meta: js.Array[_] = js.native
  
  var modified: String = js.native
  
  var modified_gmt: String = js.native
  
  var parent: Double = js.native
  
  var password: String = js.native
  
  var permalink_template: String = js.native
  
  var ping_status: OpenOrClosed = js.native
  
  var slug: String = js.native
  
  var status: PostStatus = js.native
  
  var template: String = js.native
  
  var title: Contextual[T, js.Object, js.Object] = js.native
  
  var `type`: String = js.native
}
object BasePage {
  
  @scala.inline
  def apply[T /* <: Context */](
    _links: Record[String, js.Array[Dictk]],
    author: Double,
    comment_status: OpenOrClosed,
    content: Contextual[T, Protected, Blockversion],
    date: String,
    date_gmt: String,
    excerpt: Contextual[T, Protected, js.Object],
    featured_media: Double,
    generated_slug: String,
    guid: Contextual[T, js.Object, js.Object],
    id: Double,
    link: String,
    menu_order: Double,
    meta: js.Array[_],
    modified: String,
    modified_gmt: String,
    parent: Double,
    password: String,
    permalink_template: String,
    ping_status: OpenOrClosed,
    slug: String,
    status: PostStatus,
    template: String,
    title: Contextual[T, js.Object, js.Object],
    `type`: String
  ): BasePage[T] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], comment_status = comment_status.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], date_gmt = date_gmt.asInstanceOf[js.Any], excerpt = excerpt.asInstanceOf[js.Any], featured_media = featured_media.asInstanceOf[js.Any], generated_slug = generated_slug.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], menu_order = menu_order.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], modified_gmt = modified_gmt.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], permalink_template = permalink_template.asInstanceOf[js.Any], ping_status = ping_status.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePage[T]]
  }
  
  @scala.inline
  implicit class BasePageMutableBuilder[Self <: BasePage[_], T /* <: Context */] (val x: Self with BasePage[T]) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: Double): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
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
    def setGenerated_slug(value: String): Self = StObject.set(x, "generated_slug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuid(value: Contextual[T, js.Object, js.Object]): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenu_order(value: Double): Self = StObject.set(x, "menu_order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: js.Array[_]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaVarargs(value: js.Any*): Self = StObject.set(x, "meta", js.Array(value :_*))
    
    @scala.inline
    def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModified_gmt(value: String): Self = StObject.set(x, "modified_gmt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: Double): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
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
    def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: Contextual[T, js.Object, js.Object]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_embedded(value: Record[String, js.Array[_]]): Self = StObject.set(x, "_embedded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_embeddedUndefined: Self = StObject.set(x, "_embedded", js.undefined)
    
    @scala.inline
    def set_links(value: Record[String, js.Array[Dictk]]): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
