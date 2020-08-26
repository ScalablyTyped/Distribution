package typings.typescriptServices.global.TypeScript.Services.Formatting

import typings.typescriptServices.FormattingOptions
import typings.typescriptServices.TypeScript.Services.Formatting.ITextSnapshot
import typings.typescriptServices.TypeScript.SourceUnitSyntax
import typings.typescriptServices.TypeScript.TextSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.Formatter")
@js.native
class Formatter protected ()
  extends typings.typescriptServices.TypeScript.Services.Formatting.Formatter {
  def this(
    textSpan: TextSpan,
    sourceUnit: SourceUnitSyntax,
    indentFirstToken: Boolean,
    options: FormattingOptions,
    snapshot: ITextSnapshot,
    rulesProvider: typings.typescriptServices.TypeScript.Services.Formatting.RulesProvider,
    formattingRequestKind: typings.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind
  ) = this()
}

/* static members */
@JSGlobal("TypeScript.Services.Formatting.Formatter")
@js.native
object Formatter extends js.Object {
  def getEdits(
    textSpan: TextSpan,
    sourceUnit: SourceUnitSyntax,
    options: FormattingOptions,
    indentFirstToken: Boolean,
    snapshot: ITextSnapshot,
    rulesProvider: typings.typescriptServices.TypeScript.Services.Formatting.RulesProvider,
    formattingRequestKind: typings.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind
  ): js.Array[typings.typescriptServices.TypeScript.Services.Formatting.TextEditInfo] = js.native
}

