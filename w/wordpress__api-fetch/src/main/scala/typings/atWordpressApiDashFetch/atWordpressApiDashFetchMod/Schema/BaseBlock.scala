package typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema

import typings.atWordpressApiDashFetch.Anon_Blockversion
import typings.atWordpressApiDashFetch.Anon_Href
import typings.atWordpressApiDashFetch.Anon_ProtectedRaw
import typings.atWordpressApiDashFetch.Anon_RawString
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseBlock[T /* <: Context */] extends BaseResponse {
  var content: Anon_ProtectedRaw with (js.Object | Anon_Blockversion)
  var date: String
  var date_gmt: String
  var guid: Contextual[T, js.Object, js.Object]
  var id: Double
  var link: String
  var modified: String
  var modified_gmt: String
  var password: String
  var slug: String
  var status: PostStatus
  var template: String
  var title: Anon_RawString | js.Array[js.Any]
  var `type`: String
}

object BaseBlock {
  @scala.inline
  def apply[T /* <: Context */](
    _links: Record[String, js.Array[Anon_Href]],
    content: Anon_ProtectedRaw with (js.Object | Anon_Blockversion),
    date: String,
    date_gmt: String,
    guid: Contextual[T, js.Object, js.Object],
    id: Double,
    link: String,
    modified: String,
    modified_gmt: String,
    password: String,
    slug: String,
    status: PostStatus,
    template: String,
    title: Anon_RawString | js.Array[js.Any],
    `type`: String,
    _embedded: Record[String, js.Array[_]] = null
  ): BaseBlock[T] = {
    val __obj = js.Dynamic.literal(_links = _links, content = content, date = date, date_gmt = date_gmt, guid = guid.asInstanceOf[js.Any], id = id, link = link, modified = modified, modified_gmt = modified_gmt, password = password, slug = slug, status = status, template = template, title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded)
    __obj.asInstanceOf[BaseBlock[T]]
  }
}

