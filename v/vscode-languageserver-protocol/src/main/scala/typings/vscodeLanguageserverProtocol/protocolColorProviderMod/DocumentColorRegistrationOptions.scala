package typings.vscodeLanguageserverProtocol.protocolColorProviderMod

import typings.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentColorRegistrationOptions
  extends TextDocumentRegistrationOptions
     with StaticRegistrationOptions
     with WorkDoneProgressOptions
object DocumentColorRegistrationOptions {
  
  @scala.inline
  def apply(): DocumentColorRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentColorRegistrationOptions]
  }
}
