package typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs

import typings.atWordpressApiDashFetch.Anon_Href
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseResponse extends js.Object {
  var _embedded: js.UndefOr[Record[String, js.Array[_]]] = js.undefined
  var _links: Record[String, js.Array[Anon_Href]]
}

object BaseResponse {
  @scala.inline
  def apply(_links: Record[String, js.Array[Anon_Href]], _embedded: Record[String, js.Array[_]] = null): BaseResponse = {
    val __obj = js.Dynamic.literal(_links = _links)
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded)
    __obj.asInstanceOf[BaseResponse]
  }
}

