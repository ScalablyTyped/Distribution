package typings.uuidjs.uuidjsMod

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UUIDFields[T] extends Array[T] {
  var clockSeqHiAndReserved: T = js.native
  var clockSeqLow: T = js.native
  var node: T = js.native
  var timeHiAndVersion: T = js.native
  var timeLow: T = js.native
  var timeMid: T = js.native
}

