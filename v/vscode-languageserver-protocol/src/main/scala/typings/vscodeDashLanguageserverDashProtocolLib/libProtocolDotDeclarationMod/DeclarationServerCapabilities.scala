package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolDotDeclarationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationServerCapabilities extends js.Object {
  /**
    * The server provides Goto Type Definition support.
    */
  var declarationProvider: js.UndefOr[
    scala.Boolean | (vscodeDashLanguageserverDashProtocolLib.libProtocolMod.TextDocumentRegistrationOptions with vscodeDashLanguageserverDashProtocolLib.libProtocolMod.StaticRegistrationOptions)
  ] = js.undefined
}

object DeclarationServerCapabilities {
  @scala.inline
  def apply(
    declarationProvider: scala.Boolean | (vscodeDashLanguageserverDashProtocolLib.libProtocolMod.TextDocumentRegistrationOptions with vscodeDashLanguageserverDashProtocolLib.libProtocolMod.StaticRegistrationOptions) = null
  ): DeclarationServerCapabilities = {
    val __obj = js.Dynamic.literal()
    if (declarationProvider != null) __obj.updateDynamic("declarationProvider")(declarationProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarationServerCapabilities]
  }
}

