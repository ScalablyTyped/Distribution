package typings.typescriptServices.global.TypeScript.Services.Formatting

import typings.typescriptServices.TypeScript.SyntaxKind
import typings.typescriptServices.TypeScript.SyntaxNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.IndentationNodeContext")
@js.native
class IndentationNodeContext protected ()
  extends typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext {
  def this(
    parent: typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext,
    node: SyntaxNode,
    fullStart: Double,
    indentationAmount: Double,
    childIndentationAmountDelta: Double
  ) = this()
  /* CompleteClass */
  override var _childIndentationAmountDelta: js.Any = js.native
  /* CompleteClass */
  override var _depth: js.Any = js.native
  /* CompleteClass */
  override var _fullStart: js.Any = js.native
  /* CompleteClass */
  override var _hasSkippedOrMissingTokenChild: js.Any = js.native
  /* CompleteClass */
  override var _indentationAmount: js.Any = js.native
  /* CompleteClass */
  override var _node: js.Any = js.native
  /* CompleteClass */
  override var _parent: js.Any = js.native
  /* CompleteClass */
  override def childIndentationAmountDelta(): Double = js.native
  /* CompleteClass */
  override def clone(pool: typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContextPool): typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext = js.native
  /* CompleteClass */
  override def depth(): Double = js.native
  /* CompleteClass */
  override def end(): Double = js.native
  /* CompleteClass */
  override def fullStart(): Double = js.native
  /* CompleteClass */
  override def fullWidth(): Double = js.native
  /* CompleteClass */
  override def hasSkippedOrMissingTokenChild(): Boolean = js.native
  /* CompleteClass */
  override def indentationAmount(): Double = js.native
  /* CompleteClass */
  override def kind(): SyntaxKind = js.native
  /* CompleteClass */
  override def node(): SyntaxNode = js.native
  /* CompleteClass */
  override def parent(): typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext = js.native
  /* CompleteClass */
  override def start(): Double = js.native
  /* CompleteClass */
  override def update(
    parent: typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext,
    node: SyntaxNode,
    fullStart: Double,
    indentationAmount: Double,
    childIndentationAmountDelta: Double
  ): Unit = js.native
}

