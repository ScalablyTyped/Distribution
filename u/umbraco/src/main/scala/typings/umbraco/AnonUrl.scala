package typings.umbraco

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUrl extends js.Object {
  var Url: String
}

object AnonUrl {
  @scala.inline
  def apply(Url: String): AnonUrl = {
    val __obj = js.Dynamic.literal(Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUrl]
  }
}

