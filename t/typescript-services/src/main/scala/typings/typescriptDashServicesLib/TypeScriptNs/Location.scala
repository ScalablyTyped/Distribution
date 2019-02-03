package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Location")
@js.native
class Location protected () extends js.Object {
  def this(fileName: java.lang.String, lineMap: LineMap, start: scala.Double, length: scala.Double) = this()
  var _fileName: js.Any = js.native
  var _length: js.Any = js.native
  var _lineMap: js.Any = js.native
  var _start: js.Any = js.native
  def character(): scala.Double = js.native
  def fileName(): java.lang.String = js.native
  def length(): scala.Double = js.native
  def line(): scala.Double = js.native
  def lineMap(): LineMap = js.native
  def start(): scala.Double = js.native
}

/* static members */
@JSGlobal("TypeScript.Location")
@js.native
object Location extends js.Object {
  def equals(
    location1: typescriptDashServicesLib.TypeScriptNs.Location,
    location2: typescriptDashServicesLib.TypeScriptNs.Location
  ): scala.Boolean = js.native
}

