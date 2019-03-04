package typings
package upngDashJsLib.upngDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuantizeResult extends js.Object {
  var abuf: stdLib.ArrayBuffer
  var inds: stdLib.Uint8Array
  // Type is complicated and I am too lazy to work it out right now, sorry!
  var plte: js.Array[_]
}

object QuantizeResult {
  @scala.inline
  def apply(abuf: stdLib.ArrayBuffer, inds: stdLib.Uint8Array, plte: js.Array[_]): QuantizeResult = {
    val __obj = js.Dynamic.literal(abuf = abuf, inds = inds, plte = plte)
  
    __obj.asInstanceOf[QuantizeResult]
  }
}

