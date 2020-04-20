package typings.upngJs.mod

import typings.std.ArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuantizeResult extends js.Object {
  var abuf: ArrayBuffer
  var inds: Uint8Array
  // Type is complicated and I am too lazy to work it out right now, sorry!
  var plte: js.Array[_]
}

object QuantizeResult {
  @scala.inline
  def apply(abuf: ArrayBuffer, inds: Uint8Array, plte: js.Array[_]): QuantizeResult = {
    val __obj = js.Dynamic.literal(abuf = abuf.asInstanceOf[js.Any], inds = inds.asInstanceOf[js.Any], plte = plte.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantizeResult]
  }
}

