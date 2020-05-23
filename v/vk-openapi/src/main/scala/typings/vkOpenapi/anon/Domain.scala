package typings.vkOpenapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Domain extends js.Object {
  var domain: String
  var first_name: String
  var href: String
  var id: String
  var last_name: String
  var nickname: String
}

object Domain {
  @scala.inline
  def apply(domain: String, first_name: String, href: String, id: String, last_name: String, nickname: String): Domain = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any])
    __obj.asInstanceOf[Domain]
  }
}

