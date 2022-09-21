package typings.wordpressCoreData.anon

import typings.std.Record
import typings.wordpressCoreData.schemaMod.Schema.Category
import typings.wordpressCoreData.schemaMod.Schema.TaxonomyKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BaseCategory, @wordpress/core-data.@wordpress/core-data/schema.Schema.ViewKeys.Category> */
trait PickBaseCategoryCategoryCount
  extends StObject
     with Category[Any] {
  
  var _embedded: js.UndefOr[Record[String, js.Array[Any]]] = js.undefined
  
  var _links: Record[String, js.Array[Dictk]]
  
  var count: Double
  
  var description: String
  
  var id: Double
  
  var link: String
  
  var meta: js.Array[Any]
  
  var name: String
  
  var parent: Double
  
  var slug: String
  
  var taxonomy: TaxonomyKind
}
object PickBaseCategoryCategoryCount {
  
  inline def apply(
    _links: Record[String, js.Array[Dictk]],
    count: Double,
    description: String,
    id: Double,
    link: String,
    meta: js.Array[Any],
    name: String,
    parent: Double,
    slug: String,
    taxonomy: TaxonomyKind
  ): PickBaseCategoryCategoryCount = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], taxonomy = taxonomy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickBaseCategoryCategoryCount]
  }
  
  extension [Self <: PickBaseCategoryCategoryCount](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: js.Array[Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaVarargs(value: Any*): Self = StObject.set(x, "meta", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Double): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setTaxonomy(value: TaxonomyKind): Self = StObject.set(x, "taxonomy", value.asInstanceOf[js.Any])
    
    inline def set_embedded(value: Record[String, js.Array[Any]]): Self = StObject.set(x, "_embedded", value.asInstanceOf[js.Any])
    
    inline def set_embeddedUndefined: Self = StObject.set(x, "_embedded", js.undefined)
    
    inline def set_links(value: Record[String, js.Array[Dictk]]): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
