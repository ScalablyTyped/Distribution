package typings.wordpressApiFetch.mod.Schema

import typings.std.Record
import typings.wordpressApiFetch.anon.Addnewitem
import typings.wordpressApiFetch.anon.Assignterms
import typings.wordpressApiFetch.anon.Dictk
import typings.wordpressApiFetch.anon.Public
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
  implicit class BaseTaxonomyOps[Self <: BaseTaxonomy[_], T /* <: Context */] (val x: Self with BaseTaxonomy[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCapabilities(value: Assignterms): Self = this.set("capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchical(value: Boolean): Self = this.set("hierarchical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels(value: Addnewitem): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRest_base(value: String): Self = this.set("rest_base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_cloud(value: Boolean): Self = this.set("show_cloud", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlug(value: String): Self = this.set("slug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: String*): Self = this.set("types", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[String]): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibility(value: Public): Self = this.set("visibility", value.asInstanceOf[js.Any])
  }
}
