package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Derived extends js.Object {
  var custom: scala.Double
  var derived: scala.Double
  var system: scala.Double
}

object Derived {
  @scala.inline
  def apply(custom: scala.Double, derived: scala.Double, system: scala.Double): Derived = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], derived = derived.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
    __obj.asInstanceOf[Derived]
  }
}

