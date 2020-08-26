package typings.vscodeLanguageserverProtocol.protocolDeclarationMod

import typings.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclarationRegistrationOptions
  extends WorkDoneProgressOptions
     with TextDocumentRegistrationOptions
     with StaticRegistrationOptions

object DeclarationRegistrationOptions {
  @scala.inline
  def apply(): DeclarationRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeclarationRegistrationOptions]
  }
}

