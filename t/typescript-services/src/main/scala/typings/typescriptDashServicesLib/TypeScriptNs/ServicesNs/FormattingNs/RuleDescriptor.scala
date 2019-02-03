package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.RuleDescriptor")
@js.native
class RuleDescriptor protected () extends js.Object {
  def this(LeftTokenRange: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange, RightTokenRange: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange) = this()
  var LeftTokenRange: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
  var RightTokenRange: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
}

/* static members */
@JSGlobal("TypeScript.Services.Formatting.RuleDescriptor")
@js.native
object RuleDescriptor extends js.Object {
  def create1(
    left: typescriptDashServicesLib.TypeScriptNs.SyntaxKind,
    right: typescriptDashServicesLib.TypeScriptNs.SyntaxKind
  ): typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleDescriptor = js.native
  def create2(
    left: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange,
    right: typescriptDashServicesLib.TypeScriptNs.SyntaxKind
  ): typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleDescriptor = js.native
  def create3(
    left: typescriptDashServicesLib.TypeScriptNs.SyntaxKind,
    right: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange
  ): typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleDescriptor = js.native
  def create4(
    left: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange,
    right: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange
  ): typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleDescriptor = js.native
}

