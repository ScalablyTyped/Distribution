package typings.atTensorflowTfjsDashCore.distOptimizersOptimizerMod

import typings.atTensorflowTfjsDashCore.distTensorMod.Variable
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptimizerVariable extends js.Object {
  var originalName: String
  var variable: Variable[Rank]
}

object OptimizerVariable {
  @scala.inline
  def apply(originalName: String, variable: Variable[Rank]): OptimizerVariable = {
    val __obj = js.Dynamic.literal(originalName = originalName, variable = variable)
  
    __obj.asInstanceOf[OptimizerVariable]
  }
}

