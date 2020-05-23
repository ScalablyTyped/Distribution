package typings.wordpressApiFetch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Protected extends js.Object {
  var `protected`: Boolean
}

object Protected {
  @scala.inline
  def apply(`protected`: Boolean): Protected = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Protected]
  }
}

