package typings
package atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseResponse extends js.Object {
  var _embedded: js.UndefOr[stdLib.Record[java.lang.String, js.Array[_]]] = js.undefined
  var _links: stdLib.Record[java.lang.String, js.Array[atWordpressApiDashFetchLib.Anon_Href]]
}

object BaseResponse {
  @scala.inline
  def apply(
    _links: stdLib.Record[java.lang.String, js.Array[atWordpressApiDashFetchLib.Anon_Href]],
    _embedded: stdLib.Record[java.lang.String, js.Array[_]] = null
  ): BaseResponse = {
    val __obj = js.Dynamic.literal(_links = _links)
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded)
    __obj.asInstanceOf[BaseResponse]
  }
}

