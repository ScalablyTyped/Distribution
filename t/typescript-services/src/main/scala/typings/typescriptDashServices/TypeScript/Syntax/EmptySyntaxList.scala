package typings.typescriptDashServices.TypeScript.Syntax

import typings.typescriptDashServices.TypeScript.ISyntaxElement
import typings.typescriptDashServices.TypeScript.ISyntaxList
import typings.typescriptDashServices.TypeScript.ISyntaxNodeOrToken
import typings.typescriptDashServices.TypeScript.ISyntaxToken
import typings.typescriptDashServices.TypeScript.ISyntaxTriviaList
import typings.typescriptDashServices.TypeScript.PositionedElement
import typings.typescriptDashServices.TypeScript.PositionedToken
import typings.typescriptDashServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Syntax.EmptySyntaxList")
@js.native
class EmptySyntaxList () extends ISyntaxList {
  /* CompleteClass */
  override def childAt(index: Double): ISyntaxElement = js.native
  /* CompleteClass */
  override def childCount(): Double = js.native
  /* CompleteClass */
  override def collectTextElements(elements: js.Array[String]): Unit = js.native
  def findTokenInternal(parent: PositionedElement, position: Double, fullStart: Double): PositionedToken = js.native
  /* CompleteClass */
  override def firstToken(): ISyntaxToken = js.native
  /* CompleteClass */
  override def fullText(): String = js.native
  /* CompleteClass */
  override def fullWidth(): Double = js.native
  /* CompleteClass */
  override def insertChildrenInto(array: js.Array[ISyntaxElement], index: Double): Unit = js.native
  /* CompleteClass */
  override def isIncrementallyUnusable(): Boolean = js.native
  /* CompleteClass */
  override def isList(): Boolean = js.native
  /* CompleteClass */
  override def isNode(): Boolean = js.native
  /* CompleteClass */
  override def isSeparatedList(): Boolean = js.native
  /* CompleteClass */
  override def isToken(): Boolean = js.native
  /* CompleteClass */
  override def isTypeScriptSpecific(): Boolean = js.native
  /* CompleteClass */
  override def kind(): SyntaxKind = js.native
  /* CompleteClass */
  override def lastToken(): ISyntaxToken = js.native
  /* CompleteClass */
  override def leadingTrivia(): ISyntaxTriviaList = js.native
  /* CompleteClass */
  override def leadingTriviaWidth(): Double = js.native
  /* CompleteClass */
  override def toArray(): js.Array[ISyntaxNodeOrToken] = js.native
  def toJSON(key: js.Any): js.Any = js.native
  /* CompleteClass */
  override def trailingTrivia(): ISyntaxTriviaList = js.native
  /* CompleteClass */
  override def trailingTriviaWidth(): Double = js.native
  /* CompleteClass */
  override def width(): Double = js.native
}

