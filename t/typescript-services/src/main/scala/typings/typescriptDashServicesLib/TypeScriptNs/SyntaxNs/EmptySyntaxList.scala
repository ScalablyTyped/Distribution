package typings
package typescriptDashServicesLib.TypeScriptNs.SyntaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Syntax.EmptySyntaxList")
@js.native
class EmptySyntaxList ()
  extends typescriptDashServicesLib.TypeScriptNs.ISyntaxList {
  /* CompleteClass */
  override def childAt(index: scala.Double): typescriptDashServicesLib.TypeScriptNs.ISyntaxElement = js.native
  /* CompleteClass */
  override def childCount(): scala.Double = js.native
  /* CompleteClass */
  override def collectTextElements(elements: js.Array[java.lang.String]): scala.Unit = js.native
  def findTokenInternal(
    parent: typescriptDashServicesLib.TypeScriptNs.PositionedElement,
    position: scala.Double,
    fullStart: scala.Double
  ): typescriptDashServicesLib.TypeScriptNs.PositionedToken = js.native
  /* CompleteClass */
  override def firstToken(): typescriptDashServicesLib.TypeScriptNs.ISyntaxToken = js.native
  /* CompleteClass */
  override def fullText(): java.lang.String = js.native
  /* CompleteClass */
  override def fullWidth(): scala.Double = js.native
  /* CompleteClass */
  override def insertChildrenInto(array: js.Array[typescriptDashServicesLib.TypeScriptNs.ISyntaxElement], index: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def isIncrementallyUnusable(): scala.Boolean = js.native
  /* CompleteClass */
  override def isList(): scala.Boolean = js.native
  /* CompleteClass */
  override def isNode(): scala.Boolean = js.native
  /* CompleteClass */
  override def isSeparatedList(): scala.Boolean = js.native
  /* CompleteClass */
  override def isToken(): scala.Boolean = js.native
  /* CompleteClass */
  override def isTypeScriptSpecific(): scala.Boolean = js.native
  /* CompleteClass */
  override def kind(): typescriptDashServicesLib.TypeScriptNs.SyntaxKind = js.native
  /* CompleteClass */
  override def lastToken(): typescriptDashServicesLib.TypeScriptNs.ISyntaxToken = js.native
  /* CompleteClass */
  override def leadingTrivia(): typescriptDashServicesLib.TypeScriptNs.ISyntaxTriviaList = js.native
  /* CompleteClass */
  override def leadingTriviaWidth(): scala.Double = js.native
  /* CompleteClass */
  override def toArray(): js.Array[typescriptDashServicesLib.TypeScriptNs.ISyntaxNodeOrToken] = js.native
  def toJSON(key: js.Any): js.Any = js.native
  /* CompleteClass */
  override def trailingTrivia(): typescriptDashServicesLib.TypeScriptNs.ISyntaxTriviaList = js.native
  /* CompleteClass */
  override def trailingTriviaWidth(): scala.Double = js.native
  /* CompleteClass */
  override def width(): scala.Double = js.native
}

