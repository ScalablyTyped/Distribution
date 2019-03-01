package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolDotDeclarationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationClientCapabilities extends js.Object {
  /**
    * The text document client capabilities
    */
  var textDocument: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_Declaration] = js.undefined
}

object DeclarationClientCapabilities {
  @scala.inline
  def apply(textDocument: vscodeDashLanguageserverDashProtocolLib.Anon_Declaration = null): DeclarationClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (textDocument != null) __obj.updateDynamic("textDocument")(textDocument)
    __obj.asInstanceOf[DeclarationClientCapabilities]
  }
}

