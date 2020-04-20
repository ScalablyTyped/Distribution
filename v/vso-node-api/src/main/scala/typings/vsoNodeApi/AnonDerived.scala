package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDerived extends js.Object {
  var custom: Double
  var derived: Double
  var system: Double
}

object AnonDerived {
  @scala.inline
  def apply(custom: Double, derived: Double, system: Double): AnonDerived = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], derived = derived.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDerived]
  }
}

