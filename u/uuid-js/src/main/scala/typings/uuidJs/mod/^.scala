package typings.uuidJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uuid-js", JSImport.Namespace)
@js.native
class ^ () extends uuid

@JSImport("uuid-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var limitUI04: Double = js.native
  var limitUI06: Double = js.native
  var limitUI08: Double = js.native
  var limitUI12: Double = js.native
  var limitUI14: Double = js.native
  var limitUI16: Double = js.native
  var limitUI32: Double = js.native
  var limitUI40: Double = js.native
  var limitUI48: Double = js.native
  def create(): uuid = js.native
  def create(version: Double): uuid = js.native
  def firstFromTime(time: Double): uuid = js.native
  def fromBinary(binary: js.Any): uuid = js.native
  def fromBytes(ints: js.Array[Double]): uuid = js.native
  def fromTime(time: Double): uuid = js.native
  def fromTime(time: Double, last: Boolean): uuid = js.native
  def fromURN(strId: js.Any): uuid = js.native
  def getTimeFieldValues(time: js.Any): js.Any = js.native
  def lastFromTime(time: js.Any): uuid = js.native
  def maxFromBits(bits: Double): uuid = js.native
  def newTS(): uuid = js.native
  def paddedString(string: js.Any, length: js.Any, z: js.Any): uuid = js.native
  def randomUI04(): uuid = js.native
  def randomUI06(): uuid = js.native
  def randomUI08(): uuid = js.native
  def randomUI12(): uuid = js.native
  def randomUI14(): uuid = js.native
  def randomUI16(): uuid = js.native
  def randomUI32(): uuid = js.native
  def randomUI40(): uuid = js.native
  def randomUI48(): uuid = js.native
}

