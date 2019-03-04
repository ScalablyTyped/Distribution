package typings
package thriftLib.thriftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TStructLike extends js.Object {
  def read(input: TProtocol): scala.Unit
  def write(output: TProtocol): scala.Unit
}

object TStructLike {
  @scala.inline
  def apply(read: js.Function1[TProtocol, scala.Unit], write: js.Function1[TProtocol, scala.Unit]): TStructLike = {
    val __obj = js.Dynamic.literal(read = read, write = write)
  
    __obj.asInstanceOf[TStructLike]
  }
}

