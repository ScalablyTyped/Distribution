package typings.wordpressApiFetch.anon

import typings.std.Record
import typings.wordpressApiFetch.mod.Schema.Category
import typings.wordpressApiFetch.mod.Schema.TaxonomyKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@wordpress/api-fetch.@wordpress/api-fetch.Schema.BaseCategory, @wordpress/api-fetch.@wordpress/api-fetch.Schema.ViewKeys.Category> */
trait PickBaseCategoryCategoryCount
  extends Category[js.Any] {
  var _embedded: js.UndefOr[Record[String, js.Array[_]]] = js.undefined
  var _links: Record[String, js.Array[Dictk]]
  var count: Double
  var description: String
  var id: Double
  var link: String
  var meta: js.Array[_]
  var name: String
  var parent: Double
  var slug: String
  var taxonomy: TaxonomyKind
}

object PickBaseCategoryCategoryCount {
  @scala.inline
  def apply(
    _links: Record[String, js.Array[Dictk]],
    count: Double,
    description: String,
    id: Double,
    link: String,
    meta: js.Array[_],
    name: String,
    parent: Double,
    slug: String,
    taxonomy: TaxonomyKind,
    _embedded: Record[String, js.Array[_]] = null
  ): PickBaseCategoryCategoryCount = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], taxonomy = taxonomy.asInstanceOf[js.Any])
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickBaseCategoryCategoryCount]
  }
}

