package typings
package atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseBlock[T /* <: Context */] extends BaseResponse {
  var content: atWordpressApiDashFetchLib.Anon_ProtectedRaw with (js.Object | atWordpressApiDashFetchLib.Anon_Blockversion)
  var date: java.lang.String
  var date_gmt: java.lang.String
  var guid: Contextual[T, js.Object, js.Object]
  var id: scala.Double
  var link: java.lang.String
  var modified: java.lang.String
  var modified_gmt: java.lang.String
  var password: java.lang.String
  var slug: java.lang.String
  var status: PostStatus
  var template: java.lang.String
  var title: atWordpressApiDashFetchLib.Anon_RawString | js.Array[js.Any]
  var `type`: java.lang.String
}

object BaseBlock {
  @scala.inline
  def apply[T /* <: Context */](
    _links: stdLib.Record[java.lang.String, js.Array[atWordpressApiDashFetchLib.Anon_Href]],
    content: atWordpressApiDashFetchLib.Anon_ProtectedRaw with (js.Object | atWordpressApiDashFetchLib.Anon_Blockversion),
    date: java.lang.String,
    date_gmt: java.lang.String,
    guid: Contextual[T, js.Object, js.Object],
    id: scala.Double,
    link: java.lang.String,
    modified: java.lang.String,
    modified_gmt: java.lang.String,
    password: java.lang.String,
    slug: java.lang.String,
    status: PostStatus,
    template: java.lang.String,
    title: atWordpressApiDashFetchLib.Anon_RawString | js.Array[js.Any],
    `type`: java.lang.String,
    _embedded: stdLib.Record[java.lang.String, js.Array[_]] = null
  ): BaseBlock[T] = {
    val __obj = js.Dynamic.literal(_links = _links, content = content, date = date, date_gmt = date_gmt, guid = guid.asInstanceOf[js.Any], id = id, link = link, modified = modified, modified_gmt = modified_gmt, password = password, slug = slug, status = status, template = template, title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded)
    __obj.asInstanceOf[BaseBlock[T]]
  }
}

