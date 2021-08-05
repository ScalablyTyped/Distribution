package typings.wordpressApiFetch.anon

import typings.std.Record
import typings.wordpressApiFetch.mod.Schema.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@wordpress/api-fetch.@wordpress/api-fetch.Schema.BaseStatus, @wordpress/api-fetch.@wordpress/api-fetch.Schema.EmbedKeys.Status> */
trait PickBaseStatusStatus
  extends StObject
     with Status[js.Any] {
  
  var _embedded: js.UndefOr[Record[String, js.Array[js.Any]]] = js.undefined
  
  var _links: Record[String, js.Array[Dictk]]
  
  var name: String
  
  var slug: String
}
object PickBaseStatusStatus {
  
  inline def apply(_links: Record[String, js.Array[Dictk]], name: String, slug: String): PickBaseStatusStatus = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickBaseStatusStatus]
  }
  
  extension [Self <: PickBaseStatusStatus](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def set_embedded(value: Record[String, js.Array[js.Any]]): Self = StObject.set(x, "_embedded", value.asInstanceOf[js.Any])
    
    inline def set_embeddedUndefined: Self = StObject.set(x, "_embedded", js.undefined)
    
    inline def set_links(value: Record[String, js.Array[Dictk]]): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
