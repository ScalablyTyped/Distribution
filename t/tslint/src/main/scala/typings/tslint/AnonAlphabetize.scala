package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlphabetize extends js.Object {
  var alphabetize: Boolean
  var order: String
}

object AnonAlphabetize {
  @scala.inline
  def apply(alphabetize: Boolean, order: String): AnonAlphabetize = {
    val __obj = js.Dynamic.literal(alphabetize = alphabetize.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlphabetize]
  }
}

