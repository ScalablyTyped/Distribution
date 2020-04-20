package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLang extends js.Object {
  var lang: String
  var timeout: Double
  var withCredentials: Boolean
}

object AnonLang {
  @scala.inline
  def apply(lang: String, timeout: Double, withCredentials: Boolean): AnonLang = {
    val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], withCredentials = withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLang]
  }
}

