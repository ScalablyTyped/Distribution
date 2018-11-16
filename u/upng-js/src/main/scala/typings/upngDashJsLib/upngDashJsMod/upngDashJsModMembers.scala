package typings
package upngDashJsLib.upngDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("upng-js", JSImport.Namespace)
@js.native
object upngDashJsModMembers extends js.Object {
  def decode(buffer: stdLib.ArrayBuffer): Image = js.native
  def encode(imgs: js.Array[stdLib.ArrayBuffer], w: scala.Double, h: scala.Double, cnum: scala.Double): stdLib.ArrayBuffer = js.native
  def encode(
    imgs: js.Array[stdLib.ArrayBuffer],
    w: scala.Double,
    h: scala.Double,
    cnum: scala.Double,
    dels: js.Array[scala.Double]
  ): stdLib.ArrayBuffer = js.native
  def encodeLL(
    imgs: js.Array[stdLib.ArrayBuffer],
    w: scala.Double,
    h: scala.Double,
    cc: scala.Double,
    ac: scala.Double,
    depth: scala.Double
  ): stdLib.ArrayBuffer = js.native
  def encodeLL(
    imgs: js.Array[stdLib.ArrayBuffer],
    w: scala.Double,
    h: scala.Double,
    cc: scala.Double,
    ac: scala.Double,
    depth: scala.Double,
    dels: js.Array[scala.Double]
  ): stdLib.ArrayBuffer = js.native
  def quantize(data: stdLib.ArrayBuffer, psize: scala.Double): QuantizeResult = js.native
  def toRGBA8(out: Image): js.Array[stdLib.ArrayBuffer] = js.native
}

