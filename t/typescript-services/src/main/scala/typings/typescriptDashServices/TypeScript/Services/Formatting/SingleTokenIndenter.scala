package typings.typescriptDashServices.TypeScript.Services.Formatting

import typings.typescriptDashServices.FormattingOptions
import typings.typescriptDashServices.TypeScript.SourceUnitSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.SingleTokenIndenter")
@js.native
class SingleTokenIndenter protected () extends IndentationTrackingWalker {
  def this(
    indentationPosition: Double,
    sourceUnit: SourceUnitSyntax,
    snapshot: ITextSnapshot,
    indentFirstToken: Boolean,
    options: FormattingOptions
  ) = this()
  var indentationAmount: js.Any = js.native
  var indentationPosition: js.Any = js.native
}

/* static members */
@JSGlobal("TypeScript.Services.Formatting.SingleTokenIndenter")
@js.native
object SingleTokenIndenter extends js.Object {
  def getIndentationAmount(
    position: Double,
    sourceUnit: SourceUnitSyntax,
    snapshot: ITextSnapshot,
    options: FormattingOptions
  ): Double = js.native
}

