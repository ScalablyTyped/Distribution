package typings.tensorflowTfjsCore.optimizerMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptimizerVariable extends js.Object {
  var originalName: String = js.native
  var variable: Variable[Rank] = js.native
}

object OptimizerVariable {
  @scala.inline
  def apply(originalName: String, variable: Variable[Rank]): OptimizerVariable = {
    val __obj = js.Dynamic.literal(originalName = originalName.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimizerVariable]
  }
  @scala.inline
  implicit class OptimizerVariableOps[Self <: OptimizerVariable] (val x: Self) extends AnyVal {
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
    def setOriginalName(value: String): Self = this.set("originalName", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariable(value: Variable[Rank]): Self = this.set("variable", value.asInstanceOf[js.Any])
  }
  
}

