package typings.typescriptDashServices.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Diagnostic")
@js.native
class Diagnostic protected ()
  extends typings.typescriptDashServices.TypeScriptNs.Diagnostic {
  def this(
    fileName: String,
    lineMap: typings.typescriptDashServices.TypeScriptNs.LineMap,
    start: Double,
    length: Double,
    diagnosticKey: String
  ) = this()
  def this(
    fileName: String,
    lineMap: typings.typescriptDashServices.TypeScriptNs.LineMap,
    start: Double,
    length: Double,
    diagnosticKey: String,
    _arguments: js.Array[_]
  ) = this()
  def this(
    fileName: String,
    lineMap: typings.typescriptDashServices.TypeScriptNs.LineMap,
    start: Double,
    length: Double,
    diagnosticKey: String,
    _arguments: js.Array[_],
    additionalLocations: js.Array[typings.typescriptDashServices.TypeScriptNs.Location]
  ) = this()
}

/* static members */
@JSImport("typescript-services", "Diagnostic")
@js.native
object Diagnostic extends js.Object {
  def equals(
    diagnostic1: typings.typescriptDashServices.TypeScriptNs.Diagnostic,
    diagnostic2: typings.typescriptDashServices.TypeScriptNs.Diagnostic
  ): Boolean = js.native
}

