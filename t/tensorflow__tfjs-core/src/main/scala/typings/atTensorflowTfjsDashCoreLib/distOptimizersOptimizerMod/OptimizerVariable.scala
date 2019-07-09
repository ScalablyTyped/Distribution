package typings
package atTensorflowTfjsDashCoreLib.distOptimizersOptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptimizerVariable extends js.Object {
  var originalName: java.lang.String
  var variable: atTensorflowTfjsDashCoreLib.distTensorMod.Variable[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
}

object OptimizerVariable {
  @scala.inline
  def apply(
    originalName: java.lang.String,
    variable: atTensorflowTfjsDashCoreLib.distTensorMod.Variable[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): OptimizerVariable = {
    val __obj = js.Dynamic.literal(originalName = originalName, variable = variable)
  
    __obj.asInstanceOf[OptimizerVariable]
  }
}

