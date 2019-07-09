package typings
package atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers", "LayerVariable")
@js.native
class LayerVariable protected ()
  extends atTensorflowTfjsDashLayersLib.distVariablesMod.LayerVariable {
  /**
    * Construct Variable from a `tf.Tensor`.
    *
    * If not explicitly named, the Variable will be given a name with the
    * prefix 'Variable'. Variable names are unique. In the case of name
    * collision, suffixies '_<num>' will be added to the name.
    *
    * @param val Initial value of the Variable.
    * @param name Name of the variable. If `null` or `undefined` is provided, it
    *   will default a name with the prefix 'Variable'.
    * @param constraint Optional, projection function to be applied to the
    * variable after optimize updates
    * @throws ValueError if `name` is `null` or `undefined`.
    */
  def this(`val`: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]) = this()
  def this(`val`: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank], dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType) = this()
  def this(`val`: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank], dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType, name: java.lang.String) = this()
  def this(`val`: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank], dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType, name: java.lang.String, trainable: scala.Boolean) = this()
  def this(`val`: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank], dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType, name: java.lang.String, trainable: scala.Boolean, constraint: atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint) = this()
}

