package typings.wordpressCoreData.schemaMod.Schema

import typings.std.Record
import typings.wordpressCoreData.anon.Dictk
import typings.wordpressCoreData.anon.Raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseBlock[T /* <: Context */]
  extends StObject
     with BaseResponse {
  
  var content: Raw & (/* import warning: importer.ImportType#apply Failed type conversion: T extends 'edit' ? {  block_version :number} : {} */ js.Any)
  
  var date: String
  
  var date_gmt: String
  
  var guid: Contextual[T, js.Object, js.Object]
  
  var id: Double
  
  var link: String
  
  var modified: String
  
  var modified_gmt: String
  
  var password: String
  
  var slug: String
  
  var status: PostStatus
  
  var template: String
  
  var title: /* import warning: importer.ImportType#apply Failed type conversion: T extends 'embed' ? [] : {  raw :string} */ js.Any
  
  var `type`: String
}
object BaseBlock {
  
  inline def apply[T /* <: Context */](
    _links: Record[String, js.Array[Dictk]],
    content: Raw & (/* import warning: importer.ImportType#apply Failed type conversion: T extends 'edit' ? {  block_version :number} : {} */ js.Any),
    date: String,
    date_gmt: String,
    guid: Contextual[T, js.Object, js.Object],
    id: Double,
    link: String,
    modified: String,
    modified_gmt: String,
    password: String,
    slug: String,
    status: PostStatus,
    template: String,
    title: /* import warning: importer.ImportType#apply Failed type conversion: T extends 'embed' ? [] : {  raw :string} */ js.Any,
    `type`: String
  ): BaseBlock[T] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], date_gmt = date_gmt.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], modified_gmt = modified_gmt.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseBlock[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseBlock[?], T /* <: Context */] (val x: Self & BaseBlock[T]) extends AnyVal {
    
    inline def setContent(
      value: Raw & (/* import warning: importer.ImportType#apply Failed type conversion: T extends 'edit' ? {  block_version :number} : {} */ js.Any)
    ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDate_gmt(value: String): Self = StObject.set(x, "date_gmt", value.asInstanceOf[js.Any])
    
    inline def setGuid(value: Contextual[T, js.Object, js.Object]): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    inline def setModified_gmt(value: String): Self = StObject.set(x, "modified_gmt", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: PostStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTitle(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T extends 'embed' ? [] : {  raw :string} */ js.Any
    ): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
