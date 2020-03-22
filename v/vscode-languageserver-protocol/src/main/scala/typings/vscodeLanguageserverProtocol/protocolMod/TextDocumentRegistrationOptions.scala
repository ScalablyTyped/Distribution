package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDocumentRegistrationOptions extends js.Object {
  /**
    * A document selector to identify the scope of the registration. If set to null
    * the document selector provided on the client side will be used.
    */
  var documentSelector: DocumentSelector | Null
}

@JSImport("vscode-languageserver-protocol/lib/protocol", "TextDocumentRegistrationOptions")
@js.native
object TextDocumentRegistrationOptions extends js.Object {
  def is(value: js.Any): /* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/protocol.TextDocumentRegistrationOptions */ Boolean = js.native
}

