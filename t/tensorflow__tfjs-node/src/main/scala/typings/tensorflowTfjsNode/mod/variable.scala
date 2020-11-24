package typings.tensorflowTfjsNode.mod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.Variable
import typings.tensorflowTfjsCore.distTypesMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-node", "variable")
@js.native
object variable extends js.Object {
  
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */](initialValue: Tensor[R]): Variable[R] = js.native
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */](
    initialValue: Tensor[R],
    trainable: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    dtype: DataType
  ): Variable[R] = js.native
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */](initialValue: Tensor[R], trainable: js.UndefOr[scala.Nothing], name: String): Variable[R] = js.native
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */](initialValue: Tensor[R], trainable: js.UndefOr[scala.Nothing], name: String, dtype: DataType): Variable[R] = js.native
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */](initialValue: Tensor[R], trainable: Boolean): Variable[R] = js.native
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */](initialValue: Tensor[R], trainable: Boolean, name: js.UndefOr[scala.Nothing], dtype: DataType): Variable[R] = js.native
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */](initialValue: Tensor[R], trainable: Boolean, name: String): Variable[R] = js.native
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */](initialValue: Tensor[R], trainable: Boolean, name: String, dtype: DataType): Variable[R] = js.native
}
