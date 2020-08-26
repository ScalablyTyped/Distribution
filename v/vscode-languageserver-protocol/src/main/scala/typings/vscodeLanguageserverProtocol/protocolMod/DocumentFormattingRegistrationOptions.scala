package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentFormattingRegistrationOptions
  extends TextDocumentRegistrationOptions
     with WorkDoneProgressOptions

object DocumentFormattingRegistrationOptions {
  @scala.inline
  def apply(): DocumentFormattingRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentFormattingRegistrationOptions]
  }
}

