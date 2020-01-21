package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCustomDerived extends js.Object {
  var custom: Double
  var derived: Double
  var system: Double
}

object AnonCustomDerived {
  @scala.inline
  def apply(custom: Double, derived: Double, system: Double): AnonCustomDerived = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], derived = derived.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCustomDerived]
  }
}

