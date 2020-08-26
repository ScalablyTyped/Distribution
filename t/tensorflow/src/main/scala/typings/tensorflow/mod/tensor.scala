package typings.tensorflow.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tensorflow", "tensor")
@js.native
object tensor extends js.Object {
  def apply(value: Buffer): Tensor_ = js.native
  def apply(value: Buffer, `type`: js.UndefOr[scala.Nothing], shape: js.Array[Double]): Tensor_ = js.native
  def apply(value: Buffer, `type`: Types): Tensor_ = js.native
  def apply(value: Buffer, `type`: Types, shape: js.Array[Double]): Tensor_ = js.native
  def apply(value: TensorValue): Tensor_ = js.native
  def apply(value: TensorValue, `type`: js.UndefOr[scala.Nothing], shape: js.Array[Double]): Tensor_ = js.native
  def apply(value: TensorValue, `type`: Types): Tensor_ = js.native
  def apply(value: TensorValue, `type`: Types, shape: js.Array[Double]): Tensor_ = js.native
}

