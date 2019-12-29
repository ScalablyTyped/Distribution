package typings.typescriptDashServices.typescriptDashServicesMod.Services.Formatting

import typings.typescriptDashServices.FormattingOptions
import typings.typescriptDashServices.TypeScript.Services.Formatting.ITextSnapshot
import typings.typescriptDashServices.TypeScript.SourceUnitSyntax
import typings.typescriptDashServices.TypeScript.TextSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.Formatting.Formatter")
@js.native
class Formatter protected ()
  extends typings.typescriptDashServices.TypeScript.Services.Formatting.Formatter {
  def this(
    textSpan: TextSpan,
    sourceUnit: SourceUnitSyntax,
    indentFirstToken: Boolean,
    options: FormattingOptions,
    snapshot: ITextSnapshot,
    rulesProvider: typings.typescriptDashServices.TypeScript.Services.Formatting.RulesProvider,
    formattingRequestKind: typings.typescriptDashServices.TypeScript.Services.Formatting.FormattingRequestKind
  ) = this()
}

/* static members */
@JSImport("typescript-services", "Services.Formatting.Formatter")
@js.native
object Formatter extends js.Object {
  def getEdits(
    textSpan: TextSpan,
    sourceUnit: SourceUnitSyntax,
    options: FormattingOptions,
    indentFirstToken: Boolean,
    snapshot: ITextSnapshot,
    rulesProvider: typings.typescriptDashServices.TypeScript.Services.Formatting.RulesProvider,
    formattingRequestKind: typings.typescriptDashServices.TypeScript.Services.Formatting.FormattingRequestKind
  ): js.Array[typings.typescriptDashServices.TypeScript.Services.Formatting.TextEditInfo] = js.native
}

