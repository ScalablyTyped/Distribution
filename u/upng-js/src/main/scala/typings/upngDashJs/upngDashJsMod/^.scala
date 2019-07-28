package typings.upngDashJs.upngDashJsMod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("upng-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def decode(buffer: ArrayBuffer): Image = js.native
  def encode(imgs: js.Array[ArrayBuffer], w: Double, h: Double, cnum: Double): ArrayBuffer = js.native
  def encode(imgs: js.Array[ArrayBuffer], w: Double, h: Double, cnum: Double, dels: js.Array[Double]): ArrayBuffer = js.native
  def encodeLL(imgs: js.Array[ArrayBuffer], w: Double, h: Double, cc: Double, ac: Double, depth: Double): ArrayBuffer = js.native
  def encodeLL(
    imgs: js.Array[ArrayBuffer],
    w: Double,
    h: Double,
    cc: Double,
    ac: Double,
    depth: Double,
    dels: js.Array[Double]
  ): ArrayBuffer = js.native
  def quantize(data: ArrayBuffer, psize: Double): QuantizeResult = js.native
  def toRGBA8(out: Image): js.Array[ArrayBuffer] = js.native
}

