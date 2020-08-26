package typings.thrift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TStructLike extends js.Object {
  def read(input: TProtocol): Unit = js.native
  def write(output: TProtocol): Unit = js.native
}

object TStructLike {
  @scala.inline
  def apply(read: TProtocol => Unit, write: TProtocol => Unit): TStructLike = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[TStructLike]
  }
  @scala.inline
  implicit class TStructLikeOps[Self <: TStructLike] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRead(value: TProtocol => Unit): Self = this.set("read", js.Any.fromFunction1(value))
    @scala.inline
    def setWrite(value: TProtocol => Unit): Self = this.set("write", js.Any.fromFunction1(value))
  }
  
}

