package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCodeChange extends js.Object {
  var codeChange: Double
  var system: Double
  var text: Double
  var unknown: Double
}

object AnonCodeChange {
  @scala.inline
  def apply(codeChange: Double, system: Double, text: Double, unknown: Double): AnonCodeChange = {
    val __obj = js.Dynamic.literal(codeChange = codeChange.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCodeChange]
  }
}

