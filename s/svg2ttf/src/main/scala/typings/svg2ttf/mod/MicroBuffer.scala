package typings.svg2ttf.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MicroBuffer extends js.Object {
  var buffer: Uint8Array
}

object MicroBuffer {
  @scala.inline
  def apply(buffer: Uint8Array): MicroBuffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[MicroBuffer]
  }
}

