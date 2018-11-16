package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends TextRange {
  var decorators: js.UndefOr[NodeArray[Decorator]] = js.native
  var flags: NodeFlags = js.native
  var kind: SyntaxKind = js.native
  var modifiers: js.UndefOr[ModifiersArray] = js.native
  var parent: Node = js.native
  def forEachChild[T](cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]]): js.UndefOr[T] = js.native
  def forEachChild[T](
    cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]],
    cbNodeArray: js.Function1[/* nodes */ NodeArray[this.type], js.UndefOr[T]]
  ): js.UndefOr[T] = js.native
  def getChildAt(index: scala.Double): Node = js.native
  def getChildAt(index: scala.Double, sourceFile: SourceFile): Node = js.native
  def getChildCount(): scala.Double = js.native
  def getChildCount(sourceFile: SourceFile): scala.Double = js.native
  def getChildren(): js.Array[Node] = js.native
  def getChildren(sourceFile: SourceFile): js.Array[Node] = js.native
  def getEnd(): scala.Double = js.native
  def getFirstToken(): js.UndefOr[Node] = js.native
  def getFirstToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
  def getFullStart(): scala.Double = js.native
  def getFullText(): java.lang.String = js.native
  def getFullText(sourceFile: SourceFile): java.lang.String = js.native
  def getFullWidth(): scala.Double = js.native
  def getLastToken(): js.UndefOr[Node] = js.native
  def getLastToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
  def getLeadingTriviaWidth(): scala.Double = js.native
  def getLeadingTriviaWidth(sourceFile: SourceFile): scala.Double = js.native
  def getSourceFile(): SourceFile = js.native
  def getStart(): scala.Double = js.native
  def getStart(sourceFile: SourceFile): scala.Double = js.native
  def getStart(sourceFile: SourceFile, includeJsDocComment: scala.Boolean): scala.Double = js.native
  def getText(): java.lang.String = js.native
  def getText(sourceFile: SourceFile): java.lang.String = js.native
  def getWidth(): scala.Double = js.native
  def getWidth(sourceFile: SourceFileLike): scala.Double = js.native
}

