package typings.vlq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vlq", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def decode(string: String): js.Array[Double] = js.native
  def encode(value: js.Array[Double]): String = js.native
  def encode(value: Double): String = js.native
}

