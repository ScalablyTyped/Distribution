package typings
package uuidDashJsLib.uuidDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uuid-js", JSImport.Namespace)
@js.native
class namespaced () extends uuid {
  /* CompleteClass */
  override def equals(uuid: uuid): scala.Boolean = js.native
  /* CompleteClass */
  override def fromParts(
    timeLow: js.Any,
    timeMid: js.Any,
    timeHiAndVersion: js.Any,
    clockSeqHiAndReserved: js.Any,
    clockSeqLow: js.Any,
    node: js.Any
  ): uuid = js.native
  /* CompleteClass */
  override def toBytes(): js.Array[_] = js.native
  /* CompleteClass */
  override def toURN(): java.lang.String = js.native
}

/* static members */
@JSImport("uuid-js", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  var limitUI04: scala.Double = js.native
  var limitUI06: scala.Double = js.native
  var limitUI08: scala.Double = js.native
  var limitUI12: scala.Double = js.native
  var limitUI14: scala.Double = js.native
  var limitUI16: scala.Double = js.native
  var limitUI32: scala.Double = js.native
  var limitUI40: scala.Double = js.native
  var limitUI48: scala.Double = js.native
  def create(): uuidDashJsLib.uuidDashJsMod.uuid = js.native
  def create(version: scala.Double): uuidDashJsLib.uuidDashJsMod.uuid = js.native
  def firstFromTime(time: scala.Double): uuidDashJsLib.uuidDashJsMod.uuid = js.native
  def fromBinary(binary: js.Any): uuidDashJsLib.uuidDashJsMod.uuid = js.native
  def fromBytes(ints: js.Array[scala.Double]): uuidDashJsLib.uuidDashJsMod.uuid = js.native
  def fromTime(time: scala.Double): uuidDashJsLib.uuidDashJsMod.uuid = js.native
  def fromTime(time: scala.Double, last: scala.Boolean): uuidDashJsLib.uuidDashJsMod.uuid = js.native
  def fromURN(strId: js.Any): uuidDashJsLib.uuidDashJsMod.uuid = js.native
  def getTimeFieldValues(time: js.Any): js.Any = js.native
  def lastFromTime(time: js.Any): uuidDashJsLib.uuidDashJsMod.uuid = js.native
  def maxFromBits(bits: scala.Double): uuidDashJsLib.uuidDashJsMod.uuid = js.native
  def newTS(): uuidDashJsLib.uuidDashJsMod.uuid = js.native
  def paddedString(string: js.Any, length: js.Any, z: js.Any): uuidDashJsLib.uuidDashJsMod.uuid = js.native
  def randomUI04(): uuidDashJsLib.uuidDashJsMod.uuid = js.native
  def randomUI06(): uuidDashJsLib.uuidDashJsMod.uuid = js.native
  def randomUI08(): uuidDashJsLib.uuidDashJsMod.uuid = js.native
  def randomUI12(): uuidDashJsLib.uuidDashJsMod.uuid = js.native
  def randomUI14(): uuidDashJsLib.uuidDashJsMod.uuid = js.native
  def randomUI16(): uuidDashJsLib.uuidDashJsMod.uuid = js.native
  def randomUI32(): uuidDashJsLib.uuidDashJsMod.uuid = js.native
  def randomUI40(): uuidDashJsLib.uuidDashJsMod.uuid = js.native
  def randomUI48(): uuidDashJsLib.uuidDashJsMod.uuid = js.native
}

