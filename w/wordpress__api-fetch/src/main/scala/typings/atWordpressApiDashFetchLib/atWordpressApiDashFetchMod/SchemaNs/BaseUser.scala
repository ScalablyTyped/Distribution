package typings
package atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseUser[T /* <: Context */] extends BaseResponse {
  var avatar_urls: stdLib.Record[scala.Double, java.lang.String]
  var capabilities: stdLib.Record[java.lang.String, scala.Boolean]
  var description: java.lang.String
  var email: java.lang.String
  var extra_capabilities: stdLib.Record[java.lang.String, scala.Boolean]
  var first_name: java.lang.String
  var id: scala.Double
  var last_name: java.lang.String
  var link: java.lang.String
  var meta: js.Array[_]
  var name: java.lang.String
  var nickname: java.lang.String
  var registered_date: java.lang.String
  var roles: js.Array[java.lang.String]
  var slug: java.lang.String
  var url: java.lang.String
  var username: java.lang.String
}

object BaseUser {
  @scala.inline
  def apply[T /* <: Context */](
    _links: stdLib.Record[java.lang.String, js.Array[atWordpressApiDashFetchLib.Anon_Href]],
    avatar_urls: stdLib.Record[scala.Double, java.lang.String],
    capabilities: stdLib.Record[java.lang.String, scala.Boolean],
    description: java.lang.String,
    email: java.lang.String,
    extra_capabilities: stdLib.Record[java.lang.String, scala.Boolean],
    first_name: java.lang.String,
    id: scala.Double,
    last_name: java.lang.String,
    link: java.lang.String,
    meta: js.Array[_],
    name: java.lang.String,
    nickname: java.lang.String,
    registered_date: java.lang.String,
    roles: js.Array[java.lang.String],
    slug: java.lang.String,
    url: java.lang.String,
    username: java.lang.String,
    _embedded: stdLib.Record[java.lang.String, js.Array[_]] = null
  ): BaseUser[T] = {
    val __obj = js.Dynamic.literal(_links = _links, avatar_urls = avatar_urls, capabilities = capabilities, description = description, email = email, extra_capabilities = extra_capabilities, first_name = first_name, id = id, last_name = last_name, link = link, meta = meta, name = name, nickname = nickname, registered_date = registered_date, roles = roles, slug = slug, url = url, username = username)
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded)
    __obj.asInstanceOf[BaseUser[T]]
  }
}

