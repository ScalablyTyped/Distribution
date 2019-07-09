package typings
package tensorflowLib.tensorflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tensorflow", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def graph(graphDef: java.lang.String): Graph = js.native
  def graph(graphDef: js.Object): Graph = js.native
  def graph(graphDef: nodeLib.Buffer): Graph = js.native
  def tensor(value: nodeLib.Buffer): Tensor = js.native
  def tensor(value: nodeLib.Buffer, `type`: Types): Tensor = js.native
  def tensor(value: nodeLib.Buffer, `type`: Types, shape: js.Array[scala.Double]): Tensor = js.native
  def tensor(value: TensorValue): Tensor = js.native
  def tensor(value: TensorValue, `type`: Types): Tensor = js.native
  def tensor(value: TensorValue, `type`: Types, shape: js.Array[scala.Double]): Tensor = js.native
}

