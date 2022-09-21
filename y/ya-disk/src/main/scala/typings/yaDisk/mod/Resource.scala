package typings.yaDisk.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resource extends StObject {
  
  var _embedded: js.UndefOr[Boolean] = js.undefined
  
  var created: String
  
  var custom_properties: Record[String, String]
  
  var file: js.UndefOr[String] = js.undefined
  
  var md5: String
  
  var mime_type: String
  
  var modified: String
  
  var name: String
  
  var origin_path: js.UndefOr[String] = js.undefined
  
  var path: String
  
  var preview: js.UndefOr[String] = js.undefined
  
  var public_key: js.UndefOr[String] = js.undefined
  
  var public_url: js.UndefOr[String] = js.undefined
  
  var size: Double
  
  var `type`: ResourceType
}
object Resource {
  
  inline def apply(
    created: String,
    custom_properties: Record[String, String],
    md5: String,
    mime_type: String,
    modified: String,
    name: String,
    path: String,
    size: Double,
    `type`: ResourceType
  ): Resource = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], custom_properties = custom_properties.asInstanceOf[js.Any], md5 = md5.asInstanceOf[js.Any], mime_type = mime_type.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  
  extension [Self <: Resource](x: Self) {
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCustom_properties(value: Record[String, String]): Self = StObject.set(x, "custom_properties", value.asInstanceOf[js.Any])
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setMd5(value: String): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
    
    inline def setMime_type(value: String): Self = StObject.set(x, "mime_type", value.asInstanceOf[js.Any])
    
    inline def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOrigin_path(value: String): Self = StObject.set(x, "origin_path", value.asInstanceOf[js.Any])
    
    inline def setOrigin_pathUndefined: Self = StObject.set(x, "origin_path", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPreview(value: String): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    
    inline def setPublic_key(value: String): Self = StObject.set(x, "public_key", value.asInstanceOf[js.Any])
    
    inline def setPublic_keyUndefined: Self = StObject.set(x, "public_key", js.undefined)
    
    inline def setPublic_url(value: String): Self = StObject.set(x, "public_url", value.asInstanceOf[js.Any])
    
    inline def setPublic_urlUndefined: Self = StObject.set(x, "public_url", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setType(value: ResourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_embedded(value: Boolean): Self = StObject.set(x, "_embedded", value.asInstanceOf[js.Any])
    
    inline def set_embeddedUndefined: Self = StObject.set(x, "_embedded", js.undefined)
  }
}
