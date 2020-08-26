package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentSymbolRegistrationOptions
  extends TextDocumentRegistrationOptions
     with WorkDoneProgressOptions

object DocumentSymbolRegistrationOptions {
  @scala.inline
  def apply(): DocumentSymbolRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentSymbolRegistrationOptions]
  }
}

