package typings.vscodeLanguageserverProtocol.protocolImplementationMod

import typings.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImplementationRegistrationOptions
  extends TextDocumentRegistrationOptions
     with WorkDoneProgressOptions
     with StaticRegistrationOptions

object ImplementationRegistrationOptions {
  @scala.inline
  def apply(): ImplementationRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImplementationRegistrationOptions]
  }
}

