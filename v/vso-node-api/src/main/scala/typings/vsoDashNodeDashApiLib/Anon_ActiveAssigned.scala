package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveAssigned extends js.Object {
  var active: scala.Double
  var assigned: scala.Double
  var moving: scala.Double
}

object Anon_ActiveAssigned {
  @scala.inline
  def apply(active: scala.Double, assigned: scala.Double, moving: scala.Double): Anon_ActiveAssigned = {
    val __obj = js.Dynamic.literal(active = active, assigned = assigned, moving = moving)
  
    __obj.asInstanceOf[Anon_ActiveAssigned]
  }
}

