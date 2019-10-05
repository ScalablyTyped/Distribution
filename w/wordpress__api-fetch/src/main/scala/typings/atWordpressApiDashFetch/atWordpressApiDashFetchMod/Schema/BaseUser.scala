package typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema

import typings.atWordpressApiDashFetch.Anon_Href
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseUser[T /* <: Context */] extends BaseResponse {
  var avatar_urls: Record[Double, String]
  var capabilities: Record[String, Boolean]
  var description: String
  var email: String
  var extra_capabilities: Record[String, Boolean]
  var first_name: String
  var id: Double
  var last_name: String
  var link: String
  var meta: js.Array[_]
  var name: String
  var nickname: String
  var registered_date: String
  var roles: js.Array[String]
  var slug: String
  var url: String
  var username: String
}

object BaseUser {
  @scala.inline
  def apply[T /* <: Context */](
    _links: Record[String, js.Array[Anon_Href]],
    avatar_urls: Record[Double, String],
    capabilities: Record[String, Boolean],
    description: String,
    email: String,
    extra_capabilities: Record[String, Boolean],
    first_name: String,
    id: Double,
    last_name: String,
    link: String,
    meta: js.Array[_],
    name: String,
    nickname: String,
    registered_date: String,
    roles: js.Array[String],
    slug: String,
    url: String,
    username: String,
    _embedded: Record[String, js.Array[_]] = null
  ): BaseUser[T] = {
    val __obj = js.Dynamic.literal(_links = _links, avatar_urls = avatar_urls, capabilities = capabilities, description = description, email = email, extra_capabilities = extra_capabilities, first_name = first_name, id = id, last_name = last_name, link = link, meta = meta, name = name, nickname = nickname, registered_date = registered_date, roles = roles, slug = slug, url = url, username = username)
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded)
    __obj.asInstanceOf[BaseUser[T]]
  }
}

