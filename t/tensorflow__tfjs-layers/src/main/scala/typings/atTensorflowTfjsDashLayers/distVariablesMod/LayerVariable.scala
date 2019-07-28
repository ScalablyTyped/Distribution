package typings.atTensorflowTfjsDashLayers.distVariablesMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Variable
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distConstraintsMod.Constraint
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.Shape
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
  def this(`val`: Tensor[Rank]) = this()
  def this(`val`: Tensor[Rank], dtype: DataType) = this()
  def this(`val`: Tensor[Rank], dtype: DataType, name: String) = this()
  def this(`val`: Tensor[Rank], dtype: DataType, name: String, trainable: Boolean) = this()
  def this(`val`: Tensor[Rank], dtype: DataType, name: String, trainable: Boolean, constraint: Constraint) = this()
  val constraint: Constraint = js.native
  val dtype: DataType = js.native
  val id: Double = js.native
  val name: String = js.native
  val originalName: String = js.native
  val shape: Shape = js.native
  var trainable: Boolean = js.native
  var trainable_ : js.Any = js.native
  val `val`: Variable[Rank] = js.native
  /* protected */ def assertNotDisposed(): Unit = js.native
  /**
    * Dispose this LayersVariable instance from memory.
    */
  def dispose(): Unit = js.native
  /**
    * Get a snapshot of the Variable's value.
    *
    * The returned value is a snapshot of the Variable's value at the time of
    * the invocation. Future mutations in the value of the tensor will only
    * be reflected by future calls to this method.
    */
  def read(): Tensor[Rank] = js.native
  /**
    * Update the value of the Variable.
    *
    * @param newVal: The new value to update to. Must be consistent with the
    *   dtype and shape of the Variable.
    * @return This Variable.
    */
  def write(newVal: Tensor[Rank]): this.type = js.native
}

