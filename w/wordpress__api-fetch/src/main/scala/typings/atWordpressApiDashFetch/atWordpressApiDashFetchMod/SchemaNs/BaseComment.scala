package typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs

import typings.atWordpressApiDashFetch.Anon_Href
import typings.atWordpressApiDashFetch.atWordpressApiDashFetchStrings.approved
import typings.atWordpressApiDashFetch.atWordpressApiDashFetchStrings.hold
import typings.atWordpressApiDashFetch.atWordpressApiDashFetchStrings.spam
import typings.atWordpressApiDashFetch.atWordpressApiDashFetchStrings.trash
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseComment[T /* <: Context */] extends BaseResponse {
  var author: Double
  var author_avatar_urls: Record[Double, String]
  var author_email: String
  var author_ip: String
  var author_name: String
  var author_url: String
  var author_user_agent: String
  var content: Contextual[T, js.Object, js.Object]
  var date: String
  var date_gmt: String
  var id: Double
  var link: String
  var meta: js.Array[_]
  var parent: Double
  var post: Double
  var status: approved | hold | spam | trash
  var `type`: String
}

object BaseComment {
  @scala.inline
  def apply[T /* <: Context */](
    _links: Record[String, js.Array[Anon_Href]],
    author: Double,
    author_avatar_urls: Record[Double, String],
    author_email: String,
    author_ip: String,
    author_name: String,
    author_url: String,
    author_user_agent: String,
    content: Contextual[T, js.Object, js.Object],
    date: String,
    date_gmt: String,
    id: Double,
    link: String,
    meta: js.Array[_],
    parent: Double,
    post: Double,
    status: approved | hold | spam | trash,
    `type`: String,
    _embedded: Record[String, js.Array[_]] = null
  ): BaseComment[T] = {
    val __obj = js.Dynamic.literal(_links = _links, author = author, author_avatar_urls = author_avatar_urls, author_email = author_email, author_ip = author_ip, author_name = author_name, author_url = author_url, author_user_agent = author_user_agent, content = content.asInstanceOf[js.Any], date = date, date_gmt = date_gmt, id = id, link = link, meta = meta, parent = parent, post = post, status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded)
    __obj.asInstanceOf[BaseComment[T]]
  }
}

