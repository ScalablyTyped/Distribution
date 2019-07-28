package typings.vscodeDashLanguageserverDashProtocol.libProtocolDotImplementationMod

import typings.vscodeDashLanguageserverDashProtocol.Anon_Implementation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImplementationClientCapabilities extends js.Object {
  /**
    * The text document client capabilities
    */
  var textDocument: js.UndefOr[Anon_Implementation] = js.undefined
}

object ImplementationClientCapabilities {
  @scala.inline
  def apply(textDocument: Anon_Implementation = null): ImplementationClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (textDocument != null) __obj.updateDynamic("textDocument")(textDocument)
    __obj.asInstanceOf[ImplementationClientCapabilities]
  }
}

