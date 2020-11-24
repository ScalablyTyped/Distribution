package typings.wordpressApiFetch.mod.Schema

import typings.std.Record
import typings.wordpressApiFetch.anon.Addnew
import typings.wordpressApiFetch.anon.Author
import typings.wordpressApiFetch.anon.Createposts
import typings.wordpressApiFetch.anon.Dictk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseType[T /* <: Context */] extends BaseResponse {
  
  var capabilities: Createposts = js.native
  
  var description: String = js.native
  
  var hierarchical: Boolean = js.native
  
  var labels: Addnew = js.native
  
  var name: String = js.native
  
  var rest_base: String = js.native
  
  var slug: String = js.native
  
  var supports: Author = js.native
  
  var taxonomies: js.Array[TaxonomyKind] = js.native
  
  var viewable: Boolean = js.native
}
object BaseType {
  
  @scala.inline
  def apply[T /* <: Context */](
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
  
  @scala.inline
  implicit class BaseTypeOps[Self <: BaseType[_], T /* <: Context */] (val x: Self with BaseType[T]) extends AnyVal {
    
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
    def setCapabilities(value: Createposts): Self = this.set("capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchical(value: Boolean): Self = this.set("hierarchical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels(value: Addnew): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRest_base(value: String): Self = this.set("rest_base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlug(value: String): Self = this.set("slug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupports(value: Author): Self = this.set("supports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxonomiesVarargs(value: TaxonomyKind*): Self = this.set("taxonomies", js.Array(value :_*))
    
    @scala.inline
    def setTaxonomies(value: js.Array[TaxonomyKind]): Self = this.set("taxonomies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewable(value: Boolean): Self = this.set("viewable", value.asInstanceOf[js.Any])
  }
}
