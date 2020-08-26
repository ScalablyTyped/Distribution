package typings.uuidJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait uuid extends js.Object {
  def equals(uuid: uuid): Boolean = js.native
  def fromParts(
    timeLow: js.Any,
    timeMid: js.Any,
    timeHiAndVersion: js.Any,
    clockSeqHiAndReserved: js.Any,
    clockSeqLow: js.Any,
    node: js.Any
  ): uuid = js.native
  def toBytes(): js.Array[_] = js.native
  def toURN(): String = js.native
}

object uuid {
  @scala.inline
  def apply(
    equals: uuid => Boolean,
    fromParts: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => uuid,
    toBytes: () => js.Array[_],
    toURN: () => String
  ): uuid = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), fromParts = js.Any.fromFunction6(fromParts), toBytes = js.Any.fromFunction0(toBytes), toURN = js.Any.fromFunction0(toURN))
    __obj.asInstanceOf[uuid]
  }
  @scala.inline
  implicit class uuidOps[Self <: uuid] (val x: Self) extends AnyVal {
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
    def setEquals(value: uuid => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    @scala.inline
    def setFromParts(value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => uuid): Self = this.set("fromParts", js.Any.fromFunction6(value))
    @scala.inline
    def setToBytes(value: () => js.Array[_]): Self = this.set("toBytes", js.Any.fromFunction0(value))
    @scala.inline
    def setToURN(value: () => String): Self = this.set("toURN", js.Any.fromFunction0(value))
  }
  
}

