package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompletionRegistrationOptions
  extends CompletionOptions
     with TextDocumentRegistrationOptions

object CompletionRegistrationOptions {
  @scala.inline
  def apply(): CompletionRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompletionRegistrationOptions]
  }
}

