package typings.wordpressApiFetch.mod.Schema

import typings.std.Record
import typings.wordpressApiFetch.anon.Dictk
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
  def apply[T](
    _links: Record[String, js.Array[Dictk]],
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
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], avatar_urls = avatar_urls.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], extra_capabilities = extra_capabilities.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], registered_date = registered_date.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseUser[T]]
  }
}

