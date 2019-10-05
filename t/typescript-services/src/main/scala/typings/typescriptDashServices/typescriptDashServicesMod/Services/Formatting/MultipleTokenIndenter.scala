package typings.typescriptDashServices.typescriptDashServicesMod.Services.Formatting

import typings.typescriptDashServices.FormattingOptions
import typings.typescriptDashServices.TypeScript.Services.Formatting.ITextSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.Formatting.MultipleTokenIndenter")
@js.native
class MultipleTokenIndenter protected ()
  extends typings.typescriptDashServices.TypeScript.Services.Formatting.MultipleTokenIndenter {
  def this(
    textSpan: typings.typescriptDashServices.TypeScript.TextSpan,
    sourceUnit: typings.typescriptDashServices.TypeScript.SourceUnitSyntax,
    snapshot: ITextSnapshot,
    indentFirstToken: Boolean,
    options: FormattingOptions
  ) = this()
}

