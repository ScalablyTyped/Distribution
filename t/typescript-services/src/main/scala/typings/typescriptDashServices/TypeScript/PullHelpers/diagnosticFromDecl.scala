package typings.typescriptDashServices.TypeScript.PullHelpers

import typings.typescriptDashServices.TypeScript.Diagnostic
import typings.typescriptDashServices.TypeScript.Location
import typings.typescriptDashServices.TypeScript.PullDecl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullHelpers.diagnosticFromDecl")
@js.native
object diagnosticFromDecl extends js.Object {
  def apply(decl: PullDecl, diagnosticKey: String): Diagnostic = js.native
  def apply(decl: PullDecl, diagnosticKey: String, _arguments: js.Array[_]): Diagnostic = js.native
  def apply(
    decl: PullDecl,
    diagnosticKey: String,
    _arguments: js.Array[_],
    additionalLocations: js.Array[Location]
  ): Diagnostic = js.native
}

