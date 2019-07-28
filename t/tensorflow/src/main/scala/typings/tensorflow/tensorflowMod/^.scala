package typings.tensorflow.tensorflowMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tensorflow", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def graph(graphDef: String): Graph = js.native
  def graph(graphDef: js.Object): Graph = js.native
  def graph(graphDef: Buffer): Graph = js.native
  def tensor(value: Buffer): Tensor = js.native
  def tensor(value: Buffer, `type`: Types): Tensor = js.native
  def tensor(value: Buffer, `type`: Types, shape: js.Array[Double]): Tensor = js.native
  def tensor(value: TensorValue): Tensor = js.native
  def tensor(value: TensorValue, `type`: Types): Tensor = js.native
  def tensor(value: TensorValue, `type`: Types, shape: js.Array[Double]): Tensor = js.native
}

