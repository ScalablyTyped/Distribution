package typings.vscodeLanguageclient

import typings.vscode.mod.DocumentLink
import typings.vscode.mod.Range
import typings.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/protocolDocumentLink", JSImport.Namespace)
@js.native
object protocolDocumentLinkMod extends js.Object {
  
  @js.native
  trait ProtocolDocumentLink extends DocumentLink {
    
    var data: js.Any = js.native
  }
  
  @js.native
  class default protected () extends ProtocolDocumentLink {
    def this(range: Range) = this()
    def this(range: Range, target: Uri) = this()
  }
}
