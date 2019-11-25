package typings.typescriptDashServices.typescriptDashServicesMod.Services.Formatting

import typings.typescriptDashServices.FormattingOptions
import typings.typescriptDashServices.TypeScript.Services.Formatting.ITextSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.Formatting.Formatter")
@js.native
class Formatter protected ()
  extends typings.typescriptDashServices.TypeScript.Services.Formatting.Formatter {
  def this(
    textSpan: typings.typescriptDashServices.TypeScript.TextSpan,
    sourceUnit: typings.typescriptDashServices.TypeScript.SourceUnitSyntax,
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
    textSpan: typings.typescriptDashServices.TypeScript.TextSpan,
    sourceUnit: typings.typescriptDashServices.TypeScript.SourceUnitSyntax,
    options: FormattingOptions,
    indentFirstToken: Boolean,
    snapshot: ITextSnapshot,
    rulesProvider: typings.typescriptDashServices.TypeScript.Services.Formatting.RulesProvider,
    formattingRequestKind: typings.typescriptDashServices.TypeScript.Services.Formatting.FormattingRequestKind
  ): js.Array[typings.typescriptDashServices.TypeScript.Services.Formatting.TextEditInfo] = js.native
}

