package typings.webcola.anon

import typings.webcola.vpscMod.Block
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constraint extends js.Object {
  var constraint: typings.webcola.vpscMod.Constraint
  var lb: Block
  var rb: Block
}

object Constraint {
  @scala.inline
  def apply(constraint: typings.webcola.vpscMod.Constraint, lb: Block, rb: Block): Constraint = {
    val __obj = js.Dynamic.literal(constraint = constraint.asInstanceOf[js.Any], lb = lb.asInstanceOf[js.Any], rb = rb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constraint]
  }
}

