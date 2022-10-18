package typings.tensorflowTfjsNode.mod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsLayers.distConstraintsMod.Constraint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-node", "LayerVariable")
@js.native
open class LayerVariable protected ()
  extends typings.tensorflowTfjs.mod.LayerVariable {
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
  def this(`val`: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]) = this()
  def this(`val`: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], dtype: DataType) = this()
  def this(`val`: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], dtype: Unit, name: String) = this()
  def this(`val`: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], dtype: DataType, name: String) = this()
  def this(
    `val`: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    dtype: Unit,
    name: String,
    trainable: Boolean
  ) = this()
  def this(
    `val`: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    dtype: Unit,
    name: Unit,
    trainable: Boolean
  ) = this()
  def this(
    `val`: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    dtype: DataType,
    name: String,
    trainable: Boolean
  ) = this()
  def this(
    `val`: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    dtype: DataType,
    name: Unit,
    trainable: Boolean
  ) = this()
  def this(
    `val`: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    dtype: Unit,
    name: String,
    trainable: Boolean,
    constraint: Constraint
  ) = this()
  def this(
    `val`: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    dtype: Unit,
    name: String,
    trainable: Unit,
    constraint: Constraint
  ) = this()
  def this(
    `val`: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    dtype: Unit,
    name: Unit,
    trainable: Boolean,
    constraint: Constraint
  ) = this()
  def this(
    `val`: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    dtype: Unit,
    name: Unit,
    trainable: Unit,
    constraint: Constraint
  ) = this()
  def this(
    `val`: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    dtype: DataType,
    name: String,
    trainable: Boolean,
    constraint: Constraint
  ) = this()
  def this(
    `val`: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    dtype: DataType,
    name: String,
    trainable: Unit,
    constraint: Constraint
  ) = this()
  def this(
    `val`: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    dtype: DataType,
    name: Unit,
    trainable: Boolean,
    constraint: Constraint
  ) = this()
  def this(
    `val`: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    dtype: DataType,
    name: Unit,
    trainable: Unit,
    constraint: Constraint
  ) = this()
}
