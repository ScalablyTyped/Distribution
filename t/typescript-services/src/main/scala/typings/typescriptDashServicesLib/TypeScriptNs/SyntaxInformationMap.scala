package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.SyntaxInformationMap")
@js.native
class SyntaxInformationMap protected () extends SyntaxWalker {
  def this(trackParents: scala.Boolean, trackPreviousToken: scala.Boolean) = this()
  var _currentPosition: js.Any = js.native
  var _elementToParent: js.Any = js.native
  var _parentStack: js.Any = js.native
  var _previousToken: js.Any = js.native
  var _previousTokenInformation: js.Any = js.native
  var elementToPosition: js.Any = js.native
  var tokenToInformation: js.Any = js.native
  var trackParents: js.Any = js.native
  var trackPreviousToken: js.Any = js.native
  def end(element: ISyntaxElement): scala.Double = js.native
  def firstTokenInLineContainingToken(token: ISyntaxToken): ISyntaxToken = js.native
  def fullStart(element: ISyntaxElement): scala.Double = js.native
  def isFirstTokenInLine(token: ISyntaxToken): scala.Boolean = js.native
  /* private */ def isFirstTokenInLineWorker(information: js.Any): js.Any = js.native
  def parent(element: ISyntaxElement): SyntaxNode = js.native
  def previousToken(token: ISyntaxToken): ISyntaxToken = js.native
  def start(element: ISyntaxElement): scala.Double = js.native
  def tokenInformation(token: ISyntaxToken): ITokenInformation = js.native
}

/* static members */
@JSGlobal("TypeScript.SyntaxInformationMap")
@js.native
object SyntaxInformationMap extends js.Object {
  def create(
    node: typescriptDashServicesLib.TypeScriptNs.SyntaxNode,
    trackParents: scala.Boolean,
    trackPreviousToken: scala.Boolean
  ): typescriptDashServicesLib.TypeScriptNs.SyntaxInformationMap = js.native
}

