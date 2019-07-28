package typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs

import typings.atWordpressApiDashFetch.Anon_Href
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResult extends BaseResponse {
  var id: Double
  var subtype: String
  var title: String
  var `type`: String
  var url: String
}

object SearchResult {
  @scala.inline
  def apply(
    _links: Record[String, js.Array[Anon_Href]],
    id: Double,
    subtype: String,
    title: String,
    `type`: String,
    url: String,
    _embedded: Record[String, js.Array[_]] = null
  ): SearchResult = {
    val __obj = js.Dynamic.literal(_links = _links, id = id, subtype = subtype, title = title, url = url)
    __obj.updateDynamic("type")(`type`)
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded)
    __obj.asInstanceOf[SearchResult]
  }
}

