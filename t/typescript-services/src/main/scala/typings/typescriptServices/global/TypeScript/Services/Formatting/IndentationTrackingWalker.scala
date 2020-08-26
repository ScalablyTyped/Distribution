package typings.typescriptServices.global.TypeScript.Services.Formatting

import typings.typescriptServices.FormattingOptions
import typings.typescriptServices.TypeScript.Services.Formatting.ITextSnapshot
import typings.typescriptServices.TypeScript.SourceUnitSyntax
import typings.typescriptServices.TypeScript.TextSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.IndentationTrackingWalker")
@js.native
class IndentationTrackingWalker protected ()
  extends typings.typescriptServices.TypeScript.Services.Formatting.IndentationTrackingWalker {
  def this(
    textSpan: TextSpan,
    sourceUnit: SourceUnitSyntax,
    snapshot: ITextSnapshot,
    indentFirstToken: Boolean,
    options: FormattingOptions
  ) = this()
}

