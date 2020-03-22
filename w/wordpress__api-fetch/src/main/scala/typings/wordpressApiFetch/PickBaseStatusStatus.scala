package typings.wordpressApiFetch

import typings.std.Record
import typings.wordpressApiFetch.mod.Schema.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@wordpress/api-fetch.@wordpress/api-fetch.Schema.BaseStatus, @wordpress/api-fetch.@wordpress/api-fetch.Schema.EmbedKeys.Status> */
trait PickBaseStatusStatus
  extends Status[js.Any] {
  var _embedded: js.UndefOr[Record[String, js.Array[_]]] = js.undefined
  var _links: Record[String, js.Array[AnonDictk]]
  var name: String
  var slug: String
}

object PickBaseStatusStatus {
  @scala.inline
  def apply(
    _links: Record[String, js.Array[AnonDictk]],
    name: String,
    slug: String,
    _embedded: Record[String, js.Array[_]] = null
  ): PickBaseStatusStatus = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickBaseStatusStatus]
  }
}

