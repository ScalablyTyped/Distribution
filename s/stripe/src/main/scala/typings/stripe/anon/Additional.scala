package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Additional extends js.Object {
  var additional: js.Array[String]
  var minimum: js.Array[String]
}

object Additional {
  @scala.inline
  def apply(additional: js.Array[String], minimum: js.Array[String]): Additional = {
    val __obj = js.Dynamic.literal(additional = additional.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Additional]
  }
}

