package typings.wordpressCoreData.schemaMod.Schema

import typings.std.Record
import typings.wordpressCoreData.anon.Addnew
import typings.wordpressCoreData.anon.Author
import typings.wordpressCoreData.anon.Createposts
import typings.wordpressCoreData.anon.Dictk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseType[T /* <: Context */]
  extends StObject
     with BaseResponse {
  
  var capabilities: Createposts
  
  var description: String
  
  var hierarchical: Boolean
  
  var labels: Addnew
  
  var name: String
  
  var rest_base: String
  
  var slug: String
  
  var supports: Author
  
  var taxonomies: js.Array[TaxonomyKind]
  
  var viewable: Boolean
}
object BaseType {
  
  inline def apply[T /* <: Context */](
    _links: Record[String, js.Array[Dictk]],
    capabilities: Createposts,
    description: String,
    hierarchical: Boolean,
    labels: Addnew,
    name: String,
    rest_base: String,
    slug: String,
    supports: Author,
    taxonomies: js.Array[TaxonomyKind],
    viewable: Boolean
  ): BaseType[T] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], hierarchical = hierarchical.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rest_base = rest_base.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], supports = supports.asInstanceOf[js.Any], taxonomies = taxonomies.asInstanceOf[js.Any], viewable = viewable.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseType[T]]
  }
  
  extension [Self <: BaseType[?], T /* <: Context */](x: Self & BaseType[T]) {
    
    inline def setCapabilities(value: Createposts): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setHierarchical(value: Boolean): Self = StObject.set(x, "hierarchical", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: Addnew): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRest_base(value: String): Self = StObject.set(x, "rest_base", value.asInstanceOf[js.Any])
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setSupports(value: Author): Self = StObject.set(x, "supports", value.asInstanceOf[js.Any])
    
    inline def setTaxonomies(value: js.Array[TaxonomyKind]): Self = StObject.set(x, "taxonomies", value.asInstanceOf[js.Any])
    
    inline def setTaxonomiesVarargs(value: TaxonomyKind*): Self = StObject.set(x, "taxonomies", js.Array(value*))
    
    inline def setViewable(value: Boolean): Self = StObject.set(x, "viewable", value.asInstanceOf[js.Any])
  }
}
