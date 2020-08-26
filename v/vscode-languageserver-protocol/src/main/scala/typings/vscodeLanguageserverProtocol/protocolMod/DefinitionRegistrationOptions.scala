package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefinitionRegistrationOptions
  extends TextDocumentRegistrationOptions
     with WorkDoneProgressOptions

object DefinitionRegistrationOptions {
  @scala.inline
  def apply(): DefinitionRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefinitionRegistrationOptions]
  }
}

