package typings.typescriptServices.mod.Services.Formatting

import typings.typescriptServices.TypeScript.Services.Formatting.ITextSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.Formatting.FormattingContext")
@js.native
class FormattingContext protected ()
  extends typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext {
  def this(
    snapshot: ITextSnapshot,
    formattingRequestKind: typings.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind
  ) = this()
  /* CompleteClass */
  override var contextNode: typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext = js.native
  /* CompleteClass */
  override var contextNodeAllOnSameLine: js.Any = js.native
  /* CompleteClass */
  override var contextNodeBlockIsOnOneLine: js.Any = js.native
  /* CompleteClass */
  override var currentTokenParent: typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext = js.native
  /* CompleteClass */
  override var currentTokenSpan: typings.typescriptServices.TypeScript.Services.Formatting.TokenSpan = js.native
  /* CompleteClass */
  override var formattingRequestKind: typings.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind = js.native
  /* CompleteClass */
  override var nextNodeAllOnSameLine: js.Any = js.native
  /* CompleteClass */
  override var nextNodeBlockIsOnOneLine: js.Any = js.native
  /* CompleteClass */
  override var nextTokenParent: typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext = js.native
  /* CompleteClass */
  override var nextTokenSpan: typings.typescriptServices.TypeScript.Services.Formatting.TokenSpan = js.native
  /* CompleteClass */
  override var snapshot: js.Any = js.native
  /* CompleteClass */
  override var tokensAreOnSameLine: js.Any = js.native
  /* CompleteClass */
  override def BlockIsOnOneLine(node: typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext): Boolean = js.native
  /* CompleteClass */
  override def ContextNodeAllOnSameLine(): Boolean = js.native
  /* CompleteClass */
  override def ContextNodeBlockIsOnOneLine(): Boolean = js.native
  /* CompleteClass */
  override def NextNodeAllOnSameLine(): Boolean = js.native
  /* CompleteClass */
  override def NextNodeBlockIsOnOneLine(): Boolean = js.native
  /* CompleteClass */
  override def NodeIsOnOneLine(node: typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext): Boolean = js.native
  /* CompleteClass */
  override def TokensAreOnSameLine(): Boolean = js.native
  /* CompleteClass */
  override def updateContext(
    currentTokenSpan: typings.typescriptServices.TypeScript.Services.Formatting.TokenSpan,
    currentTokenParent: typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext,
    nextTokenSpan: typings.typescriptServices.TypeScript.Services.Formatting.TokenSpan,
    nextTokenParent: typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext,
    commonParent: typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext
  ): Unit = js.native
}

