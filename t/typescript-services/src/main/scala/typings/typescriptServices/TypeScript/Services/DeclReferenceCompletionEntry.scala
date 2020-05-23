package typings.typescriptServices.TypeScript.Services

import typings.typescriptServices.TypeScript.PullDecl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclReferenceCompletionEntry extends CachedCompletionEntryDetails {
  var decl: PullDecl
  var hasBeenResolved: js.Any
  def resolve(`type`: String, fullSymbolName: String, docComments: String): Unit
}

object DeclReferenceCompletionEntry {
  @scala.inline
  def apply(
    decl: PullDecl,
    docComment: String,
    fullSymbolName: String,
    hasBeenResolved: js.Any,
    isResolved: () => Boolean,
    kind: String,
    kindModifiers: String,
    name: String,
    resolve: (String, String, String) => Unit,
    `type`: String
  ): DeclReferenceCompletionEntry = {
    val __obj = js.Dynamic.literal(decl = decl.asInstanceOf[js.Any], docComment = docComment.asInstanceOf[js.Any], fullSymbolName = fullSymbolName.asInstanceOf[js.Any], hasBeenResolved = hasBeenResolved.asInstanceOf[js.Any], isResolved = js.Any.fromFunction0(isResolved), kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resolve = js.Any.fromFunction3(resolve))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclReferenceCompletionEntry]
  }
}

