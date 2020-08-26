package typings.typescriptServices.TypeScript.Syntax

import typings.typescriptServices.TypeScript.ISyntaxElement
import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxNodeOrToken
import typings.typescriptServices.TypeScript.ISyntaxToken
import typings.typescriptServices.TypeScript.ISyntaxTriviaList
import typings.typescriptServices.TypeScript.PositionedElement
import typings.typescriptServices.TypeScript.PositionedToken
import typings.typescriptServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmptySyntaxList extends ISyntaxList {
  def findTokenInternal(parent: PositionedElement, position: Double, fullStart: Double): PositionedToken = js.native
  def toJSON(key: js.Any): js.Any = js.native
}

object EmptySyntaxList {
  @scala.inline
  def apply(
    childAt: Double => ISyntaxElement,
    childCount: () => Double,
    collectTextElements: js.Array[String] => Unit,
    findTokenInternal: (PositionedElement, Double, Double) => PositionedToken,
    firstToken: () => ISyntaxToken,
    fullText: () => String,
    fullWidth: () => Double,
    insertChildrenInto: (js.Array[ISyntaxElement], Double) => Unit,
    isIncrementallyUnusable: () => Boolean,
    isList: () => Boolean,
    isNode: () => Boolean,
    isSeparatedList: () => Boolean,
    isToken: () => Boolean,
    isTypeScriptSpecific: () => Boolean,
    kind: () => SyntaxKind,
    lastToken: () => ISyntaxToken,
    leadingTrivia: () => ISyntaxTriviaList,
    leadingTriviaWidth: () => Double,
    toArray: () => js.Array[ISyntaxNodeOrToken],
    toJSON: js.Any => js.Any,
    trailingTrivia: () => ISyntaxTriviaList,
    trailingTriviaWidth: () => Double,
    width: () => Double
  ): EmptySyntaxList = {
    val __obj = js.Dynamic.literal(childAt = js.Any.fromFunction1(childAt), childCount = js.Any.fromFunction0(childCount), collectTextElements = js.Any.fromFunction1(collectTextElements), findTokenInternal = js.Any.fromFunction3(findTokenInternal), firstToken = js.Any.fromFunction0(firstToken), fullText = js.Any.fromFunction0(fullText), fullWidth = js.Any.fromFunction0(fullWidth), insertChildrenInto = js.Any.fromFunction2(insertChildrenInto), isIncrementallyUnusable = js.Any.fromFunction0(isIncrementallyUnusable), isList = js.Any.fromFunction0(isList), isNode = js.Any.fromFunction0(isNode), isSeparatedList = js.Any.fromFunction0(isSeparatedList), isToken = js.Any.fromFunction0(isToken), isTypeScriptSpecific = js.Any.fromFunction0(isTypeScriptSpecific), kind = js.Any.fromFunction0(kind), lastToken = js.Any.fromFunction0(lastToken), leadingTrivia = js.Any.fromFunction0(leadingTrivia), leadingTriviaWidth = js.Any.fromFunction0(leadingTriviaWidth), toArray = js.Any.fromFunction0(toArray), toJSON = js.Any.fromFunction1(toJSON), trailingTrivia = js.Any.fromFunction0(trailingTrivia), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[EmptySyntaxList]
  }
  @scala.inline
  implicit class EmptySyntaxListOps[Self <: EmptySyntaxList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFindTokenInternal(value: (PositionedElement, Double, Double) => PositionedToken): Self = this.set("findTokenInternal", js.Any.fromFunction3(value))
    @scala.inline
    def setToJSON(value: js.Any => js.Any): Self = this.set("toJSON", js.Any.fromFunction1(value))
  }
  
}

