package typings.wordpressCoreData.anon

import typings.std.Record
import typings.wordpressCoreData.schemaMod.Schema.Tag
import typings.wordpressCoreData.schemaMod.Schema.TaxonomyKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BaseTag, @wordpress/core-data.@wordpress/core-data/schema.Schema.EmbedKeys.Tag> */
trait PickBaseTagTag
  extends StObject
     with Tag[Any] {
  
  var _embedded: js.UndefOr[Record[String, js.Array[Any]]] = js.undefined
  
  var _links: Record[String, js.Array[Dictk]]
  
  var id: Double
  
  var link: String
  
  var name: String
  
  var slug: String
  
  var taxonomy: TaxonomyKind
}
object PickBaseTagTag {
  
  inline def apply(
    _links: Record[String, js.Array[Dictk]],
    id: Double,
    link: String,
    name: String,
    slug: String,
    taxonomy: TaxonomyKind
  ): PickBaseTagTag = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], taxonomy = taxonomy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickBaseTagTag]
  }
  
  extension [Self <: PickBaseTagTag](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setTaxonomy(value: TaxonomyKind): Self = StObject.set(x, "taxonomy", value.asInstanceOf[js.Any])
    
    inline def set_embedded(value: Record[String, js.Array[Any]]): Self = StObject.set(x, "_embedded", value.asInstanceOf[js.Any])
    
    inline def set_embeddedUndefined: Self = StObject.set(x, "_embedded", js.undefined)
    
    inline def set_links(value: Record[String, js.Array[Dictk]]): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
