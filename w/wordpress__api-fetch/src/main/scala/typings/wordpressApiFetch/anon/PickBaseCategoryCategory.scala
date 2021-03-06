package typings.wordpressApiFetch.anon

import typings.std.Record
import typings.wordpressApiFetch.mod.Schema.Category
import typings.wordpressApiFetch.mod.Schema.TaxonomyKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@wordpress/api-fetch.@wordpress/api-fetch.Schema.BaseCategory, @wordpress/api-fetch.@wordpress/api-fetch.Schema.EmbedKeys.Category> */
@js.native
trait PickBaseCategoryCategory
  extends Category[js.Any] {
  
  var _embedded: js.UndefOr[Record[String, js.Array[_]]] = js.native
  
  var _links: Record[String, js.Array[Dictk]] = js.native
  
  var id: Double = js.native
  
  var link: String = js.native
  
  var name: String = js.native
  
  var slug: String = js.native
  
  var taxonomy: TaxonomyKind = js.native
}
object PickBaseCategoryCategory {
  
  @scala.inline
  def apply(
    _links: Record[String, js.Array[Dictk]],
    id: Double,
    link: String,
    name: String,
    slug: String,
    taxonomy: TaxonomyKind
  ): PickBaseCategoryCategory = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], taxonomy = taxonomy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickBaseCategoryCategory]
  }
  
  @scala.inline
  implicit class PickBaseCategoryCategoryMutableBuilder[Self <: PickBaseCategoryCategory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxonomy(value: TaxonomyKind): Self = StObject.set(x, "taxonomy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_embedded(value: Record[String, js.Array[_]]): Self = StObject.set(x, "_embedded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_embeddedUndefined: Self = StObject.set(x, "_embedded", js.undefined)
    
    @scala.inline
    def set_links(value: Record[String, js.Array[Dictk]]): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
