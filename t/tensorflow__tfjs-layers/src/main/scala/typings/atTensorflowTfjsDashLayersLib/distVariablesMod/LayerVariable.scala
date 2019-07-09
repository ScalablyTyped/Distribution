package typings
package atTensorflowTfjsDashLayersLib.distVariablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/variables", "LayerVariable")
@js.native
class LayerVariable protected () extends js.Object {
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
  val constraint: atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint = js.native
  val dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = js.native
  val id: scala.Double = js.native
  val name: java.lang.String = js.native
  val originalName: java.lang.String = js.native
  val shape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = js.native
  var trainable: scala.Boolean = js.native
  var trainable_ : js.Any = js.native
  val `val`: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Variable[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  /* protected */ def assertNotDisposed(): scala.Unit = js.native
  /**
    * Dispose this LayersVariable instance from memory.
    */
  def dispose(): scala.Unit = js.native
  /**
    * Get a snapshot of the Variable's value.
    *
    * The returned value is a snapshot of the Variable's value at the time of
    * the invocation. Future mutations in the value of the tensor will only
    * be reflected by future calls to this method.
    */
  def read(): atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  /**
    * Update the value of the Variable.
    *
    * @param newVal: The new value to update to. Must be consistent with the
    *   dtype and shape of the Variable.
    * @return This Variable.
    */
  def write(
    newVal: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): this.type = js.native
}

