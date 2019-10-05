package typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema

import typings.atWordpressApiDashFetch.Anon_Href
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseStatus extends BaseResponse {
  var name: String
  var `private`: Boolean
  var `protected`: Boolean
  var public: Boolean
  var queryable: Boolean
  var show_in_list: Boolean
  var slug: String
}

object BaseStatus {
  @scala.inline
  def apply(
    _links: Record[String, js.Array[Anon_Href]],
    name: String,
    `private`: Boolean,
    `protected`: Boolean,
    public: Boolean,
    queryable: Boolean,
    show_in_list: Boolean,
    slug: String,
    _embedded: Record[String, js.Array[_]] = null
  ): BaseStatus = {
    val __obj = js.Dynamic.literal(_links = _links, name = name, public = public, queryable = queryable, show_in_list = show_in_list, slug = slug)
    __obj.updateDynamic("private")(`private`)
    __obj.updateDynamic("protected")(`protected`)
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded)
    __obj.asInstanceOf[BaseStatus]
  }
}

