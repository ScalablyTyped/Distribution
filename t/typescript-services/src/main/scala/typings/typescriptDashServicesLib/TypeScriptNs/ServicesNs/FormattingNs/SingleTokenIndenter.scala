package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.SingleTokenIndenter")
@js.native
class SingleTokenIndenter protected () extends IndentationTrackingWalker {
  def this(indentationPosition: scala.Double, sourceUnit: typescriptDashServicesLib.TypeScriptNs.SourceUnitSyntax, snapshot: ITextSnapshot, indentFirstToken: scala.Boolean, options: typescriptDashServicesLib.FormattingOptions) = this()
  var indentationAmount: js.Any = js.native
  var indentationPosition: js.Any = js.native
}

@JSGlobal("TypeScript.Services.Formatting.SingleTokenIndenter")
@js.native
object SingleTokenIndenter extends js.Object {
  def getIndentationAmount(
    position: scala.Double,
    sourceUnit: typescriptDashServicesLib.TypeScriptNs.SourceUnitSyntax,
    snapshot: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.ITextSnapshot,
    options: typescriptDashServicesLib.FormattingOptions
  ): scala.Double = js.native
}

