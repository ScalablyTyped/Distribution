package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomDerived extends js.Object {
  var custom: Double
  var derived: Double
  var system: Double
}

object Anon_CustomDerived {
  @scala.inline
  def apply(custom: Double, derived: Double, system: Double): Anon_CustomDerived = {
    val __obj = js.Dynamic.literal(custom = custom, derived = derived, system = system)
  
    __obj.asInstanceOf[Anon_CustomDerived]
  }
}

