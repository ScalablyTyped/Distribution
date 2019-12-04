package typings.vscodeDashLanguageclient

import typings.vscode.vscodeMod.DocumentLink
import typings.vscode.vscodeMod.Range
import typings.vscode.vscodeMod.Uri
import typings.vscodeDashLanguageclient.libProtocolDocumentLinkMod.ProtocolDocumentLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/protocolDocumentLink", JSImport.Namespace)
@js.native
object libProtocolDocumentLinkMod extends js.Object {
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

