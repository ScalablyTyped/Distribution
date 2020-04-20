package typings.uuidJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait uuid extends js.Object {
  def equals(uuid: uuid): Boolean
  def fromParts(
    timeLow: js.Any,
    timeMid: js.Any,
    timeHiAndVersion: js.Any,
    clockSeqHiAndReserved: js.Any,
    clockSeqLow: js.Any,
    node: js.Any
  ): uuid
  def toBytes(): js.Array[_]
  def toURN(): String
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
}

