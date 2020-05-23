package typings.wordpressApiFetch.anon

import typings.std.Record
import typings.wordpressApiFetch.mod.Schema.Category
import typings.wordpressApiFetch.mod.Schema.TaxonomyKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@wordpress/api-fetch.@wordpress/api-fetch.Schema.BaseCategory, @wordpress/api-fetch.@wordpress/api-fetch.Schema.EmbedKeys.Category> */
trait PickBaseCategoryCategory
  extends Category[js.Any] {
  var _embedded: js.UndefOr[Record[String, js.Array[_]]] = js.undefined
  var _links: Record[String, js.Array[Dictk]]
  var id: Double
  var link: String
  var name: String
  var slug: String
  var taxonomy: TaxonomyKind
}

object PickBaseCategoryCategory {
  @scala.inline
  def apply(
    _links: Record[String, js.Array[Dictk]],
    id: Double,
    link: String,
    name: String,
    slug: String,
    taxonomy: TaxonomyKind,
    _embedded: Record[String, js.Array[_]] = null
  ): PickBaseCategoryCategory = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], taxonomy = taxonomy.asInstanceOf[js.Any])
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickBaseCategoryCategory]
  }
}

