package typings.typescriptDashServices.typescriptDashServicesMod.Services.Formatting

import typings.typescriptDashServices.FormattingOptions
import typings.typescriptDashServices.TypeScript.Services.Formatting.ITextSnapshot
import typings.typescriptDashServices.TypeScript.SourceUnitSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.Formatting.SingleTokenIndenter")
@js.native
class SingleTokenIndenter protected ()
  extends typings.typescriptDashServices.TypeScript.Services.Formatting.SingleTokenIndenter {
  def this(
    indentationPosition: Double,
    sourceUnit: SourceUnitSyntax,
    snapshot: ITextSnapshot,
    indentFirstToken: Boolean,
    options: FormattingOptions
  ) = this()
}

/* static members */
@JSImport("typescript-services", "Services.Formatting.SingleTokenIndenter")
@js.native
object SingleTokenIndenter extends js.Object {
  def getIndentationAmount(
    position: Double,
    sourceUnit: SourceUnitSyntax,
    snapshot: ITextSnapshot,
    options: FormattingOptions
  ): Double = js.native
}

