package typings.webcola.anon

import typings.webcola.vpscMod.Block
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constraint extends js.Object {
  var constraint: typings.webcola.vpscMod.Constraint = js.native
  var lb: Block = js.native
  var rb: Block = js.native
}

object Constraint {
  @scala.inline
  def apply(constraint: typings.webcola.vpscMod.Constraint, lb: Block, rb: Block): Constraint = {
    val __obj = js.Dynamic.literal(constraint = constraint.asInstanceOf[js.Any], lb = lb.asInstanceOf[js.Any], rb = rb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constraint]
  }
  @scala.inline
  implicit class ConstraintOps[Self <: Constraint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConstraint(value: typings.webcola.vpscMod.Constraint): Self = this.set("constraint", value.asInstanceOf[js.Any])
    @scala.inline
    def setLb(value: Block): Self = this.set("lb", value.asInstanceOf[js.Any])
    @scala.inline
    def setRb(value: Block): Self = this.set("rb", value.asInstanceOf[js.Any])
  }
  
}

