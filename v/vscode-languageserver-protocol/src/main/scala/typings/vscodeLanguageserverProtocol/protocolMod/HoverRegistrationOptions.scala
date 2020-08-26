package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HoverRegistrationOptions
  extends TextDocumentRegistrationOptions
     with WorkDoneProgressOptions

object HoverRegistrationOptions {
  @scala.inline
  def apply(): HoverRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoverRegistrationOptions]
  }
}

