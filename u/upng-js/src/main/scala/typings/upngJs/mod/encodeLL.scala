package typings.upngJs.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("upng-js", "encodeLL")
@js.native
object encodeLL extends js.Object {
  def apply(imgs: js.Array[ArrayBuffer], w: Double, h: Double, cc: Double, ac: Double, depth: Double): ArrayBuffer = js.native
  def apply(
    imgs: js.Array[ArrayBuffer],
    w: Double,
    h: Double,
    cc: Double,
    ac: Double,
    depth: Double,
    dels: js.Array[Double]
  ): ArrayBuffer = js.native
}

