package typings.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Diagnostic")
@js.native
class Diagnostic protected ()
  extends typings.typescriptServices.TypeScript.Diagnostic {
  def this(
    fileName: String,
    lineMap: typings.typescriptServices.TypeScript.LineMap,
    start: Double,
    length: Double,
    diagnosticKey: String
  ) = this()
  def this(
    fileName: String,
    lineMap: typings.typescriptServices.TypeScript.LineMap,
    start: Double,
    length: Double,
    diagnosticKey: String,
    _arguments: js.Array[_]
  ) = this()
  def this(
    fileName: String,
    lineMap: typings.typescriptServices.TypeScript.LineMap,
    start: Double,
    length: Double,
    diagnosticKey: String,
    _arguments: js.UndefOr[scala.Nothing],
    additionalLocations: js.Array[typings.typescriptServices.TypeScript.Location]
  ) = this()
  def this(
    fileName: String,
    lineMap: typings.typescriptServices.TypeScript.LineMap,
    start: Double,
    length: Double,
    diagnosticKey: String,
    _arguments: js.Array[_],
    additionalLocations: js.Array[typings.typescriptServices.TypeScript.Location]
  ) = this()
}

/* static members */
@JSImport("typescript-services", "Diagnostic")
@js.native
object Diagnostic extends js.Object {
  def equals(
    diagnostic1: typings.typescriptServices.TypeScript.Diagnostic,
    diagnostic2: typings.typescriptServices.TypeScript.Diagnostic
  ): Boolean = js.native
}

