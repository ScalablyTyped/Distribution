package typings
package atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseStatus extends BaseResponse {
  var name: java.lang.String
  var `private`: scala.Boolean
  var `protected`: scala.Boolean
  var public: scala.Boolean
  var queryable: scala.Boolean
  var show_in_list: scala.Boolean
  var slug: java.lang.String
}

object BaseStatus {
  @scala.inline
  def apply(
    _links: stdLib.Record[java.lang.String, js.Array[atWordpressApiDashFetchLib.Anon_Href]],
    name: java.lang.String,
    `private`: scala.Boolean,
    `protected`: scala.Boolean,
    public: scala.Boolean,
    queryable: scala.Boolean,
    show_in_list: scala.Boolean,
    slug: java.lang.String,
    _embedded: stdLib.Record[java.lang.String, js.Array[_]] = null
  ): BaseStatus = {
    val __obj = js.Dynamic.literal(_links = _links, name = name, public = public, queryable = queryable, show_in_list = show_in_list, slug = slug)
    __obj.updateDynamic("private")(`private`)
    __obj.updateDynamic("protected")(`protected`)
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded)
    __obj.asInstanceOf[BaseStatus]
  }
}

