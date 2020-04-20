package typings.typescriptServices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRest extends js.Object {
  var rest: String
  var value: Double
}

object AnonRest {
  @scala.inline
  def apply(rest: String, value: Double): AnonRest = {
    val __obj = js.Dynamic.literal(rest = rest.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRest]
  }
}

