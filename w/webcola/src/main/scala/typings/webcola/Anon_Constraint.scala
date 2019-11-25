package typings.webcola

import typings.webcola.distSrcVpscMod.Block
import typings.webcola.distSrcVpscMod.Constraint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Constraint extends js.Object {
  var constraint: Constraint
  var lb: Block
  var rb: Block
}

object Anon_Constraint {
  @scala.inline
  def apply(constraint: Constraint, lb: Block, rb: Block): Anon_Constraint = {
    val __obj = js.Dynamic.literal(constraint = constraint.asInstanceOf[js.Any], lb = lb.asInstanceOf[js.Any], rb = rb.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Constraint]
  }
}

