package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenameRegistrationOptions
  extends RenameOptions
     with TextDocumentRegistrationOptions

object RenameRegistrationOptions {
  @scala.inline
  def apply(): RenameRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenameRegistrationOptions]
  }
}

