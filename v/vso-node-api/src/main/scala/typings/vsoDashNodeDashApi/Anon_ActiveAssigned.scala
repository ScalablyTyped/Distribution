package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveAssigned extends js.Object {
  var active: Double
  var assigned: Double
  var moving: Double
}

object Anon_ActiveAssigned {
  @scala.inline
  def apply(active: Double, assigned: Double, moving: Double): Anon_ActiveAssigned = {
    val __obj = js.Dynamic.literal(active = active, assigned = assigned, moving = moving)
  
    __obj.asInstanceOf[Anon_ActiveAssigned]
  }
}

