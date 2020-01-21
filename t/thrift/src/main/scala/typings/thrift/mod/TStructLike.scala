package typings.thrift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TStructLike extends js.Object {
  def read(input: TProtocol): Unit
  def write(output: TProtocol): Unit
}

object TStructLike {
  @scala.inline
  def apply(read: TProtocol => Unit, write: TProtocol => Unit): TStructLike = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read), write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[TStructLike]
  }
}

