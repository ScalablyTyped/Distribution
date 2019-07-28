package typings.typeDashFest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Email extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var name: String
  var url: js.UndefOr[String] = js.undefined
}

object Anon_Email {
  @scala.inline
  def apply(name: String, email: String = null, url: String = null): Anon_Email = {
    val __obj = js.Dynamic.literal(name = name)
    if (email != null) __obj.updateDynamic("email")(email)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Email]
  }
}

