package typings
package atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseCategory extends BaseResponse {
  var count: scala.Double
  var description: java.lang.String
  var id: scala.Double
  var link: java.lang.String
  var meta: js.Array[_]
  var name: java.lang.String
  var parent: scala.Double
  var slug: java.lang.String
  var taxonomy: TaxonomyKind
}

object BaseCategory {
  @scala.inline
  def apply(
    _links: stdLib.Record[java.lang.String, js.Array[atWordpressApiDashFetchLib.Anon_Href]],
    count: scala.Double,
    description: java.lang.String,
    id: scala.Double,
    link: java.lang.String,
    meta: js.Array[_],
    name: java.lang.String,
    parent: scala.Double,
    slug: java.lang.String,
    taxonomy: TaxonomyKind,
    _embedded: stdLib.Record[java.lang.String, js.Array[_]] = null
  ): BaseCategory = {
    val __obj = js.Dynamic.literal(_links = _links, count = count, description = description, id = id, link = link, meta = meta, name = name, parent = parent, slug = slug, taxonomy = taxonomy)
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded)
    __obj.asInstanceOf[BaseCategory]
  }
}

