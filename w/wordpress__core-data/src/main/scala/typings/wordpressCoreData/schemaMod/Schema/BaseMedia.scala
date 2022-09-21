package typings.wordpressCoreData.schemaMod.Schema

import typings.std.Record
import typings.wordpressCoreData.anon.Dictk
import typings.wordpressCoreData.anon.Height
import typings.wordpressCoreData.wordpressCoreDataStrings.file
import typings.wordpressCoreData.wordpressCoreDataStrings.image
import typings.wordpressCoreData.wordpressCoreDataStrings.inherit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseMedia[T /* <: Context */]
  extends StObject
     with BaseResponse {
  
  var alt_text: String
  
  var author: Double
  
  var caption: Contextual[T, js.Object, js.Object]
  
  var comment_status: OpenOrClosed
  
  var date: String
  
  var date_gmt: String
  
  var description: Contextual[T, js.Object, js.Object]
  
  var generated_slug: String
  
  var guid: Contextual[T, js.Object, js.Object]
  
  var id: Double
  
  var link: String
  
  var media_details: Height
  
  var media_type: file | image
  
  var meta: js.Array[Any]
  
  var mime_type: String
  
  var modified: String
  
  var modified_gmt: String
  
  var permalink_template: String
  
  var ping_status: OpenOrClosed
  
  var post: Double | Null
  
  var slug: String
  
  var source_url: String
  
  var status: PostStatus | inherit
  
  var template: String
  
  var title: Contextual[T, js.Object, js.Object]
  
  var `type`: String
}
object BaseMedia {
  
  inline def apply[T /* <: Context */](
    _links: Record[String, js.Array[Dictk]],
    alt_text: String,
    author: Double,
    caption: Contextual[T, js.Object, js.Object],
    comment_status: OpenOrClosed,
    date: String,
    date_gmt: String,
    description: Contextual[T, js.Object, js.Object],
    generated_slug: String,
    guid: Contextual[T, js.Object, js.Object],
    id: Double,
    link: String,
    media_details: Height,
    media_type: file | image,
    meta: js.Array[Any],
    mime_type: String,
    modified: String,
    modified_gmt: String,
    permalink_template: String,
    ping_status: OpenOrClosed,
    slug: String,
    source_url: String,
    status: PostStatus | inherit,
    template: String,
    title: Contextual[T, js.Object, js.Object],
    `type`: String
  ): BaseMedia[T] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], alt_text = alt_text.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], comment_status = comment_status.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], date_gmt = date_gmt.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], generated_slug = generated_slug.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], media_details = media_details.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], mime_type = mime_type.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], modified_gmt = modified_gmt.asInstanceOf[js.Any], permalink_template = permalink_template.asInstanceOf[js.Any], ping_status = ping_status.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], source_url = source_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], post = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseMedia[T]]
  }
  
  extension [Self <: BaseMedia[?], T /* <: Context */](x: Self & BaseMedia[T]) {
    
    inline def setAlt_text(value: String): Self = StObject.set(x, "alt_text", value.asInstanceOf[js.Any])
    
    inline def setAuthor(value: Double): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setCaption(value: Contextual[T, js.Object, js.Object]): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setComment_status(value: OpenOrClosed): Self = StObject.set(x, "comment_status", value.asInstanceOf[js.Any])
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDate_gmt(value: String): Self = StObject.set(x, "date_gmt", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Contextual[T, js.Object, js.Object]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setGenerated_slug(value: String): Self = StObject.set(x, "generated_slug", value.asInstanceOf[js.Any])
    
    inline def setGuid(value: Contextual[T, js.Object, js.Object]): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setMedia_details(value: Height): Self = StObject.set(x, "media_details", value.asInstanceOf[js.Any])
    
    inline def setMedia_type(value: file | image): Self = StObject.set(x, "media_type", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: js.Array[Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaVarargs(value: Any*): Self = StObject.set(x, "meta", js.Array(value*))
    
    inline def setMime_type(value: String): Self = StObject.set(x, "mime_type", value.asInstanceOf[js.Any])
    
    inline def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    inline def setModified_gmt(value: String): Self = StObject.set(x, "modified_gmt", value.asInstanceOf[js.Any])
    
    inline def setPermalink_template(value: String): Self = StObject.set(x, "permalink_template", value.asInstanceOf[js.Any])
    
    inline def setPing_status(value: OpenOrClosed): Self = StObject.set(x, "ping_status", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Double): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPostNull: Self = StObject.set(x, "post", null)
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setSource_url(value: String): Self = StObject.set(x, "source_url", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: PostStatus | inherit): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Contextual[T, js.Object, js.Object]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
