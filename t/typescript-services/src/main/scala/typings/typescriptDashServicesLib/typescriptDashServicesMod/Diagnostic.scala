package typings
package typescriptDashServicesLib.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Diagnostic")
@js.native
class Diagnostic protected ()
  extends typescriptDashServicesLib.TypeScriptNs.Diagnostic {
  def this(fileName: java.lang.String, lineMap: typescriptDashServicesLib.TypeScriptNs.LineMap, start: scala.Double, length: scala.Double, diagnosticKey: java.lang.String) = this()
  def this(fileName: java.lang.String, lineMap: typescriptDashServicesLib.TypeScriptNs.LineMap, start: scala.Double, length: scala.Double, diagnosticKey: java.lang.String, _arguments: js.Array[_]) = this()
  def this(fileName: java.lang.String, lineMap: typescriptDashServicesLib.TypeScriptNs.LineMap, start: scala.Double, length: scala.Double, diagnosticKey: java.lang.String, _arguments: js.Array[_], additionalLocations: js.Array[typescriptDashServicesLib.TypeScriptNs.Location]) = this()
}

/* static members */
@JSImport("typescript-services", "Diagnostic")
@js.native
object Diagnostic extends js.Object {
  def equals(
    diagnostic1: typescriptDashServicesLib.TypeScriptNs.Diagnostic,
    diagnostic2: typescriptDashServicesLib.TypeScriptNs.Diagnostic
  ): scala.Boolean = js.native
}

