package typings.wordpressApiFetch.anon

import typings.std.Record
import typings.wordpressApiFetch.mod.Schema.Tag
import typings.wordpressApiFetch.mod.Schema.TaxonomyKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@wordpress/api-fetch.@wordpress/api-fetch.Schema.BaseTag, @wordpress/api-fetch.@wordpress/api-fetch.Schema.EmbedKeys.Tag> */
@js.native
trait PickBaseTagTag
  extends Tag[js.Any] {
  
  var _embedded: js.UndefOr[Record[String, js.Array[_]]] = js.native
  
  var _links: Record[String, js.Array[Dictk]] = js.native
  
  var id: Double = js.native
  
  var link: String = js.native
  
  var name: String = js.native
  
  var slug: String = js.native
  
  var taxonomy: TaxonomyKind = js.native
}
object PickBaseTagTag {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class PickBaseTagTagOps[Self <: PickBaseTagTag] (val x: Self) extends AnyVal {
    
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
    def set_links(value: Record[String, js.Array[Dictk]]): Self = this.set("_links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlug(value: String): Self = this.set("slug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxonomy(value: TaxonomyKind): Self = this.set("taxonomy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_embedded(value: Record[String, js.Array[_]]): Self = this.set("_embedded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_embedded: Self = this.set("_embedded", js.undefined)
  }
}
