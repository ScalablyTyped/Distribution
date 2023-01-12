package typings.wordpressCoreData.schemaMod.Schema

import typings.std.Record
import typings.wordpressCoreData.anon.Blockversion
import typings.wordpressCoreData.anon.Dictk
import typings.wordpressCoreData.anon.Protected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<@wordpress/core-data.@wordpress/core-data/schema.Schema.BasePost<T>, 'categories' | 'format' | 'sticky' | 'tags'> */
trait BasePage[T /* <: Context */] extends StObject {
  
  var _embedded: js.UndefOr[Record[String, js.Array[Any]]] = js.undefined
  
  var _links: Record[String, js.Array[Dictk]]
  
  var author: Double
  
  var comment_status: OpenOrClosed
  
  var content: Contextual[T, Protected, Blockversion]
  
  var date: String
  
  var date_gmt: String
  
  var excerpt: Contextual[T, Protected, js.Object]
  
  var featured_media: Double
  
  var generated_slug: String
  
  var guid: Contextual[T, js.Object, js.Object]
  
  var id: Double
  
  var link: String
  
  var menu_order: Double
  
  var meta: js.Array[Any]
  
  var modified: String
  
  var modified_gmt: String
  
  var parent: Double
  
  var password: String
  
  var permalink_template: String
  
  var ping_status: OpenOrClosed
  
  var slug: String
  
  var status: PostStatus
  
  var template: String
  
  var title: Contextual[T, js.Object, js.Object]
  
  var `type`: String
}
object BasePage {
  
  inline def apply[T /* <: Context */](
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
    meta: js.Array[Any],
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
  implicit open class MutableBuilder[Self <: BasePage[?], T /* <: Context */] (val x: Self & BasePage[T]) extends AnyVal {
    
    inline def setAuthor(value: Double): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setComment_status(value: OpenOrClosed): Self = StObject.set(x, "comment_status", value.asInstanceOf[js.Any])
    
    inline def setContent(value: Contextual[T, Protected, Blockversion]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDate_gmt(value: String): Self = StObject.set(x, "date_gmt", value.asInstanceOf[js.Any])
    
    inline def setExcerpt(value: Contextual[T, Protected, js.Object]): Self = StObject.set(x, "excerpt", value.asInstanceOf[js.Any])
    
    inline def setFeatured_media(value: Double): Self = StObject.set(x, "featured_media", value.asInstanceOf[js.Any])
    
    inline def setGenerated_slug(value: String): Self = StObject.set(x, "generated_slug", value.asInstanceOf[js.Any])
    
    inline def setGuid(value: Contextual[T, js.Object, js.Object]): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setMenu_order(value: Double): Self = StObject.set(x, "menu_order", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: js.Array[Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaVarargs(value: Any*): Self = StObject.set(x, "meta", js.Array(value*))
    
    inline def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    inline def setModified_gmt(value: String): Self = StObject.set(x, "modified_gmt", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Double): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPermalink_template(value: String): Self = StObject.set(x, "permalink_template", value.asInstanceOf[js.Any])
    
    inline def setPing_status(value: OpenOrClosed): Self = StObject.set(x, "ping_status", value.asInstanceOf[js.Any])
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: PostStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Contextual[T, js.Object, js.Object]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_embedded(value: Record[String, js.Array[Any]]): Self = StObject.set(x, "_embedded", value.asInstanceOf[js.Any])
    
    inline def set_embeddedUndefined: Self = StObject.set(x, "_embedded", js.undefined)
    
    inline def set_links(value: Record[String, js.Array[Dictk]]): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
