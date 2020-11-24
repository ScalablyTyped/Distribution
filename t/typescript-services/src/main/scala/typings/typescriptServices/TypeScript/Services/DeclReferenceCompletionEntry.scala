package typings.typescriptServices.TypeScript.Services

import typings.typescriptServices.TypeScript.PullDecl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeclReferenceCompletionEntry extends CachedCompletionEntryDetails {
  
  var decl: PullDecl = js.native
  
  var hasBeenResolved: js.Any = js.native
  
  def resolve(`type`: String, fullSymbolName: String, docComments: String): Unit = js.native
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
  
  @scala.inline
  implicit class DeclReferenceCompletionEntryOps[Self <: DeclReferenceCompletionEntry] (val x: Self) extends AnyVal {
    
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
    def setDecl(value: PullDecl): Self = this.set("decl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasBeenResolved(value: js.Any): Self = this.set("hasBeenResolved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolve(value: (String, String, String) => Unit): Self = this.set("resolve", js.Any.fromFunction3(value))
  }
}
