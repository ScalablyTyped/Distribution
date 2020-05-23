package typings.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alphabetize extends js.Object {
  var alphabetize: Boolean
  var order: String
}

object Alphabetize {
  @scala.inline
  def apply(alphabetize: Boolean, order: String): Alphabetize = {
    val __obj = js.Dynamic.literal(alphabetize = alphabetize.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alphabetize]
  }
}

