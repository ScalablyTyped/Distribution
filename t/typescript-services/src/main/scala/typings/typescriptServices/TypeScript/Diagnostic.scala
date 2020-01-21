package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Diagnostic")
@js.native
class Diagnostic protected () extends Location {
  def this(fileName: String, lineMap: LineMap, start: Double, length: Double, diagnosticKey: String) = this()
  def this(
    fileName: String,
    lineMap: LineMap,
    start: Double,
    length: Double,
    diagnosticKey: String,
    _arguments: js.Array[_]
  ) = this()
  def this(
    fileName: String,
    lineMap: LineMap,
    start: Double,
    length: Double,
    diagnosticKey: String,
    _arguments: js.Array[_],
    additionalLocations: js.Array[Location]
  ) = this()
  var _additionalLocations: js.Any = js.native
  var _arguments: js.Any = js.native
  var _diagnosticKey: js.Any = js.native
  def additionalLocations(): js.Array[Location] = js.native
  def arguments(): js.Array[_] = js.native
  def diagnosticKey(): String = js.native
  def info(): DiagnosticInfo = js.native
  def message(): String = js.native
  def text(): String = js.native
  def toJSON(key: js.Any): js.Any = js.native
}

/* static members */
@JSGlobal("TypeScript.Diagnostic")
@js.native
object Diagnostic extends js.Object {
  def equals(diagnostic1: Diagnostic, diagnostic2: Diagnostic): Boolean = js.native
}

