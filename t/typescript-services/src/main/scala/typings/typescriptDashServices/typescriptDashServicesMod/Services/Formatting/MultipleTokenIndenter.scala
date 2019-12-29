package typings.typescriptDashServices.typescriptDashServicesMod.Services.Formatting

import typings.typescriptDashServices.FormattingOptions
import typings.typescriptDashServices.TypeScript.Services.Formatting.ITextSnapshot
import typings.typescriptDashServices.TypeScript.SourceUnitSyntax
import typings.typescriptDashServices.TypeScript.TextSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.Formatting.MultipleTokenIndenter")
@js.native
class MultipleTokenIndenter protected ()
  extends typings.typescriptDashServices.TypeScript.Services.Formatting.MultipleTokenIndenter {
  def this(
    textSpan: TextSpan,
    sourceUnit: SourceUnitSyntax,
    snapshot: ITextSnapshot,
    indentFirstToken: Boolean,
    options: FormattingOptions
  ) = this()
}

