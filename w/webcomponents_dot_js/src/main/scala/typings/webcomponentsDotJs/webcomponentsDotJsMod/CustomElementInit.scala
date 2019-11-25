package typings.webcomponentsDotJs.webcomponentsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomElementInit extends js.Object {
  var `extends`: js.UndefOr[String] = js.undefined
}

object CustomElementInit {
  @scala.inline
  def apply(`extends`: String = null): CustomElementInit = {
    val __obj = js.Dynamic.literal()
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomElementInit]
  }
}

