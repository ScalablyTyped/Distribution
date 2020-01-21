package typings.wordpressApiFetch.mod.Schema

import typings.std.Record
import typings.wordpressApiFetch.AnonHref
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
    _links: Record[String, js.Array[AnonHref]],
    id: Double,
    subtype: String,
    title: String,
    `type`: String,
    url: String,
    _embedded: Record[String, js.Array[_]] = null
  ): SearchResult = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
}

