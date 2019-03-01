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
    equals: js.Function1[uuid, scala.Boolean],
    fromParts: js.Function6[js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, uuid],
    toBytes: js.Function0[js.Array[_]],
    toString: js.Function0[java.lang.String],
    toURN: js.Function0[java.lang.String]
  ): uuid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("equals")(equals)
    __obj.updateDynamic("fromParts")(fromParts)
    __obj.updateDynamic("toBytes")(toBytes)
    __obj.updateDynamic("toString")(toString)
    __obj.updateDynamic("toURN")(toURN)
    __obj.asInstanceOf[uuid]
  }
}

