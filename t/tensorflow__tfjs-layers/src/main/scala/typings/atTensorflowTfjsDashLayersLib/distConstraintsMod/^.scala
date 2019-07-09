package typings
package atTensorflowTfjsDashLayersLib.distConstraintsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/constraints", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def deserializeConstraint(config: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict): Constraint = js.native
  def deserializeConstraint(
    config: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict,
    customObjects: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict
  ): Constraint = js.native
  def getConstraint(identifier: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict): Constraint = js.native
  def getConstraint(identifier: Constraint): Constraint = js.native
  def getConstraint(identifier: ConstraintIdentifier): Constraint = js.native
  def serializeConstraint(constraint: Constraint): atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDictValue = js.native
}

