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
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], date_gmt = date_gmt.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], modified_gmt = modified_gmt.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseBlock[T]]
  }
}

