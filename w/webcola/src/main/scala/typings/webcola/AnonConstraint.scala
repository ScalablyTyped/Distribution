package typings.webcola

import typings.webcola.vpscMod.Block
import typings.webcola.vpscMod.Constraint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConstraint extends js.Object {
  var constraint: Constraint
  var lb: Block
  var rb: Block
}

object AnonConstraint {
  @scala.inline
  def apply(constraint: Constraint, lb: Block, rb: Block): AnonConstraint = {
    val __obj = js.Dynamic.literal(constraint = constraint.asInstanceOf[js.Any], lb = lb.asInstanceOf[js.Any], rb = rb.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonConstraint]
  }
}

