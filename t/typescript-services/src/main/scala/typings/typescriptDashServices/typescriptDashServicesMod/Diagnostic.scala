package typings.typescriptDashServices.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Diagnostic")
@js.native
class Diagnostic protected ()
  extends typings.typescriptDashServices.TypeScript.Diagnostic {
  def this(
    fileName: String,
    lineMap: typings.typescriptDashServices.TypeScript.LineMap,
    start: Double,
    length: Double,
    diagnosticKey: String
  ) = this()
  def this(
    fileName: String,
    lineMap: typings.typescriptDashServices.TypeScript.LineMap,
    start: Double,
    length: Double,
    diagnosticKey: String,
    _arguments: js.Array[_]
  ) = this()
  def this(
    fileName: String,
    lineMap: typings.typescriptDashServices.TypeScript.LineMap,
    start: Double,
    length: Double,
    diagnosticKey: String,
    _arguments: js.Array[_],
    additionalLocations: js.Array[typings.typescriptDashServices.TypeScript.Location]
  ) = this()
}

/* static members */
@JSImport("typescript-services", "Diagnostic")
@js.native
object Diagnostic extends js.Object {
  def equals(
    diagnostic1: typings.typescriptDashServices.TypeScript.Diagnostic,
    diagnostic2: typings.typescriptDashServices.TypeScript.Diagnostic
  ): Boolean = js.native
}

