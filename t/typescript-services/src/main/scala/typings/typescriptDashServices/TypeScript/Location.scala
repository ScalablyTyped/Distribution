package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Location")
@js.native
class Location protected () extends js.Object {
  def this(fileName: String, lineMap: LineMap, start: Double, length: Double) = this()
  var _fileName: js.Any = js.native
  var _length: js.Any = js.native
  var _lineMap: js.Any = js.native
  var _start: js.Any = js.native
  def character(): Double = js.native
  def fileName(): String = js.native
  def length(): Double = js.native
  def line(): Double = js.native
  def lineMap(): LineMap = js.native
  def start(): Double = js.native
}

/* static members */
@JSGlobal("TypeScript.Location")
@js.native
object Location extends js.Object {
  def equals(location1: Location, location2: Location): Boolean = js.native
}

