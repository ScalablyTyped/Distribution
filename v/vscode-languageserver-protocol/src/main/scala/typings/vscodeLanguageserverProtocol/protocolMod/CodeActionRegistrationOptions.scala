package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeActionRegistrationOptions
  extends CodeActionOptions
     with TextDocumentRegistrationOptions

object CodeActionRegistrationOptions {
  @scala.inline
  def apply(): CodeActionRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeActionRegistrationOptions]
  }
}

