package typings
package atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseComment[T /* <: Context */] extends BaseResponse {
  var author: scala.Double
  var author_avatar_urls: stdLib.Record[scala.Double, java.lang.String]
  var author_email: java.lang.String
  var author_ip: java.lang.String
  var author_name: java.lang.String
  var author_url: java.lang.String
  var author_user_agent: java.lang.String
  var content: Contextual[T, js.Object, js.Object]
  var date: java.lang.String
  var date_gmt: java.lang.String
  var id: scala.Double
  var link: java.lang.String
  var meta: js.Array[_]
  var parent: scala.Double
  var post: scala.Double
  var status: atWordpressApiDashFetchLib.atWordpressApiDashFetchLibStrings.approved | atWordpressApiDashFetchLib.atWordpressApiDashFetchLibStrings.hold | atWordpressApiDashFetchLib.atWordpressApiDashFetchLibStrings.spam | atWordpressApiDashFetchLib.atWordpressApiDashFetchLibStrings.trash
  var `type`: java.lang.String
}

object BaseComment {
  @scala.inline
  def apply[T /* <: Context */](
    _links: stdLib.Record[java.lang.String, js.Array[atWordpressApiDashFetchLib.Anon_Href]],
    author: scala.Double,
    author_avatar_urls: stdLib.Record[scala.Double, java.lang.String],
    author_email: java.lang.String,
    author_ip: java.lang.String,
    author_name: java.lang.String,
    author_url: java.lang.String,
    author_user_agent: java.lang.String,
    content: Contextual[T, js.Object, js.Object],
    date: java.lang.String,
    date_gmt: java.lang.String,
    id: scala.Double,
    link: java.lang.String,
    meta: js.Array[_],
    parent: scala.Double,
    post: scala.Double,
    status: atWordpressApiDashFetchLib.atWordpressApiDashFetchLibStrings.approved | atWordpressApiDashFetchLib.atWordpressApiDashFetchLibStrings.hold | atWordpressApiDashFetchLib.atWordpressApiDashFetchLibStrings.spam | atWordpressApiDashFetchLib.atWordpressApiDashFetchLibStrings.trash,
    `type`: java.lang.String,
    _embedded: stdLib.Record[java.lang.String, js.Array[_]] = null
  ): BaseComment[T] = {
    val __obj = js.Dynamic.literal(_links = _links, author = author, author_avatar_urls = author_avatar_urls, author_email = author_email, author_ip = author_ip, author_name = author_name, author_url = author_url, author_user_agent = author_user_agent, content = content.asInstanceOf[js.Any], date = date, date_gmt = date_gmt, id = id, link = link, meta = meta, parent = parent, post = post, status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded)
    __obj.asInstanceOf[BaseComment[T]]
  }
}

