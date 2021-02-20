package typings.wordpressApiFetch.mod.Schema

import typings.std.Record
import typings.wordpressApiFetch.anon.Addnewitem
import typings.wordpressApiFetch.anon.Assignterms
import typings.wordpressApiFetch.anon.Dictk
import typings.wordpressApiFetch.anon.Public
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseTaxonomy[T /* <: Context */] extends BaseResponse {
  
  var capabilities: Assignterms = js.native
  
  var description: String = js.native
  
  var hierarchical: Boolean = js.native
  
  var labels: Addnewitem = js.native
  
  var name: String = js.native
  
  var rest_base: String = js.native
  
  var show_cloud: Boolean = js.native
  
  var slug: String = js.native
  
  var types: js.Array[String] = js.native
  
  var visibility: Public = js.native
}
object BaseTaxonomy {
  
  @scala.inline
  def apply[T /* <: Context */](
    _links: Record[String, js.Array[Dictk]],
    capabilities: Assignterms,
    description: String,
    hierarchical: Boolean,
    labels: Addnewitem,
    name: String,
    rest_base: String,
    show_cloud: Boolean,
    slug: String,
    types: js.Array[String],
    visibility: Public
  ): BaseTaxonomy[T] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], hierarchical = hierarchical.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rest_base = rest_base.asInstanceOf[js.Any], show_cloud = show_cloud.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseTaxonomy[T]]
  }
  
  @scala.inline
  implicit class BaseTaxonomyMutableBuilder[Self <: BaseTaxonomy[_], T /* <: Context */] (val x: Self with BaseTaxonomy[T]) extends AnyVal {
    
    @scala.inline
    def setCapabilities(value: Assignterms): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchical(value: Boolean): Self = StObject.set(x, "hierarchical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels(value: Addnewitem): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRest_base(value: String): Self = StObject.set(x, "rest_base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_cloud(value: Boolean): Self = StObject.set(x, "show_cloud", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
    
    @scala.inline
    def setVisibility(value: Public): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
