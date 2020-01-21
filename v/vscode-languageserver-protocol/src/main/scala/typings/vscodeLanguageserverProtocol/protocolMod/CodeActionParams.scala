package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.CodeActionContext
import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeActionParams extends js.Object {
  /**
    * Context carrying additional information.
    */
  var context: CodeActionContext
  /**
    * The range for which the command was invoked.
    */
  var range: Range
  /**
    * The document in which the command was invoked.
    */
  var textDocument: TextDocumentIdentifier
}

object CodeActionParams {
  @scala.inline
  def apply(context: CodeActionContext, range: Range, textDocument: TextDocumentIdentifier): CodeActionParams = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CodeActionParams]
  }
}

