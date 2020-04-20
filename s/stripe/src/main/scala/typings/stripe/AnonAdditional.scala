package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdditional extends js.Object {
  var additional: js.Array[String]
  var minimum: js.Array[String]
}

object AnonAdditional {
  @scala.inline
  def apply(additional: js.Array[String], minimum: js.Array[String]): AnonAdditional = {
    val __obj = js.Dynamic.literal(additional = additional.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdditional]
  }
}

