package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeLensRegistrationOptions
  extends CodeLensOptions
     with TextDocumentRegistrationOptions

object CodeLensRegistrationOptions {
  @scala.inline
  def apply(): CodeLensRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeLensRegistrationOptions]
  }
}

