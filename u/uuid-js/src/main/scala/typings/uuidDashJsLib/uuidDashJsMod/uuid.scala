package typings
package uuidDashJsLib.uuidDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait uuid extends js.Object {
  def equals(uuid: uuid): scala.Boolean
  def fromParts(
    timeLow: js.Any,
    timeMid: js.Any,
    timeHiAndVersion: js.Any,
    clockSeqHiAndReserved: js.Any,
    clockSeqLow: js.Any,
    node: js.Any
  ): uuid
  def toBytes(): js.Array[_]
  def toURN(): java.lang.String
}

object uuid {
  @scala.inline
  def apply(
    equals: uuid => scala.Boolean,
    fromParts: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => uuid,
    toBytes: () => js.Array[_],
    toString: () => java.lang.String,
    toURN: () => java.lang.String
  ): uuid = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), fromParts = js.Any.fromFunction6(fromParts), toBytes = js.Any.fromFunction0(toBytes), toString = js.Any.fromFunction0(toString), toURN = js.Any.fromFunction0(toURN))
  
    __obj.asInstanceOf[uuid]
  }
}

