package typings.atTensorflowTfjsDashLayers.distConstraintsMod

import typings.atTensorflowTfjsDashCore.distSerializationMod.ConfigDict
import typings.atTensorflowTfjsDashCore.distSerializationMod.ConfigDictValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/constraints", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def deserializeConstraint(config: ConfigDict): Constraint = js.native
  def deserializeConstraint(config: ConfigDict, customObjects: ConfigDict): Constraint = js.native
  def getConstraint(identifier: ConfigDict): Constraint = js.native
  def getConstraint(identifier: Constraint): Constraint = js.native
  def getConstraint(identifier: ConstraintIdentifier): Constraint = js.native
  def serializeConstraint(constraint: Constraint): ConfigDictValue = js.native
}

