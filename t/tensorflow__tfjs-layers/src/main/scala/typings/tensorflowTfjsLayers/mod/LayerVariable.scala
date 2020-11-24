package typings.tensorflowTfjsLayers.mod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.constraintsMod.Constraint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers", "LayerVariable")
@js.native
class LayerVariable protected ()
  extends typings.tensorflowTfjsLayers.variablesMod.LayerVariable {
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
  def this(`val`: Tensor[Rank], dtype: js.UndefOr[scala.Nothing], name: String) = this()
  def this(`val`: Tensor[Rank], dtype: DataType, name: String) = this()
  def this(
    `val`: Tensor[Rank],
    dtype: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    trainable: Boolean
  ) = this()
  def this(`val`: Tensor[Rank], dtype: js.UndefOr[scala.Nothing], name: String, trainable: Boolean) = this()
  def this(`val`: Tensor[Rank], dtype: DataType, name: js.UndefOr[scala.Nothing], trainable: Boolean) = this()
  def this(`val`: Tensor[Rank], dtype: DataType, name: String, trainable: Boolean) = this()
  def this(
    `val`: Tensor[Rank],
    dtype: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    trainable: js.UndefOr[scala.Nothing],
    constraint: Constraint
  ) = this()
  def this(
    `val`: Tensor[Rank],
    dtype: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    trainable: Boolean,
    constraint: Constraint
  ) = this()
  def this(
    `val`: Tensor[Rank],
    dtype: js.UndefOr[scala.Nothing],
    name: String,
    trainable: js.UndefOr[scala.Nothing],
    constraint: Constraint
  ) = this()
  def this(
    `val`: Tensor[Rank],
    dtype: js.UndefOr[scala.Nothing],
    name: String,
    trainable: Boolean,
    constraint: Constraint
  ) = this()
  def this(
    `val`: Tensor[Rank],
    dtype: DataType,
    name: js.UndefOr[scala.Nothing],
    trainable: js.UndefOr[scala.Nothing],
    constraint: Constraint
  ) = this()
  def this(
    `val`: Tensor[Rank],
    dtype: DataType,
    name: js.UndefOr[scala.Nothing],
    trainable: Boolean,
    constraint: Constraint
  ) = this()
  def this(
    `val`: Tensor[Rank],
    dtype: DataType,
    name: String,
    trainable: js.UndefOr[scala.Nothing],
    constraint: Constraint
  ) = this()
  def this(`val`: Tensor[Rank], dtype: DataType, name: String, trainable: Boolean, constraint: Constraint) = this()
}
