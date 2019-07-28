package typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs

import typings.atWordpressApiDashFetch.Anon_Href
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseCategory extends BaseResponse {
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

object BaseCategory {
  @scala.inline
  def apply(
    _links: Record[String, js.Array[Anon_Href]],
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
  ): BaseCategory = {
    val __obj = js.Dynamic.literal(_links = _links, count = count, description = description, id = id, link = link, meta = meta, name = name, parent = parent, slug = slug, taxonomy = taxonomy)
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded)
    __obj.asInstanceOf[BaseCategory]
  }
}

