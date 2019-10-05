package typings.typescriptDashServices.typescriptDashServicesMod.Services.Formatting

import typings.typescriptDashServices.FormattingOptions
import typings.typescriptDashServices.TypeScript.Services.Formatting.ITextSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.Formatting.IndentationTrackingWalker")
@js.native
class IndentationTrackingWalker protected ()
  extends typings.typescriptDashServices.TypeScript.Services.Formatting.IndentationTrackingWalker {
  def this(
    textSpan: typings.typescriptDashServices.TypeScript.TextSpan,
    sourceUnit: typings.typescriptDashServices.TypeScript.SourceUnitSyntax,
    snapshot: ITextSnapshot,
    indentFirstToken: Boolean,
    options: FormattingOptions
  ) = this()
}

