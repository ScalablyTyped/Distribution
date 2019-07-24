package typings
package atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResult extends BaseResponse {
  var id: scala.Double
  var subtype: java.lang.String
  var title: java.lang.String
  var `type`: java.lang.String
  var url: java.lang.String
}

object SearchResult {
  @scala.inline
  def apply(
    _links: stdLib.Record[java.lang.String, js.Array[atWordpressApiDashFetchLib.Anon_Href]],
    id: scala.Double,
    subtype: java.lang.String,
    title: java.lang.String,
    `type`: java.lang.String,
    url: java.lang.String,
    _embedded: stdLib.Record[java.lang.String, js.Array[_]] = null
  ): SearchResult = {
    val __obj = js.Dynamic.literal(_links = _links, id = id, subtype = subtype, title = title, url = url)
    __obj.updateDynamic("type")(`type`)
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded)
    __obj.asInstanceOf[SearchResult]
  }
}

