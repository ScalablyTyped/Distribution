package typings.vscodeLanguageserverProtocol.protocolTypeDefinitionMod

import typings.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeDefinitionRegistrationOptions
  extends TextDocumentRegistrationOptions
     with WorkDoneProgressOptions
     with StaticRegistrationOptions
object TypeDefinitionRegistrationOptions {
  
  @scala.inline
  def apply(): TypeDefinitionRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeDefinitionRegistrationOptions]
  }
}
