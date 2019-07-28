package typings.vscodeDashLanguageserverDashProtocol.libProtocolDotDeclarationMod

import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.StaticRegistrationOptions
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationServerCapabilities extends js.Object {
  /**
    * The server provides Goto Type Definition support.
    */
  var declarationProvider: js.UndefOr[Boolean | (TextDocumentRegistrationOptions with StaticRegistrationOptions)] = js.undefined
}

object DeclarationServerCapabilities {
  @scala.inline
  def apply(
    declarationProvider: Boolean | (TextDocumentRegistrationOptions with StaticRegistrationOptions) = null
  ): DeclarationServerCapabilities = {
    val __obj = js.Dynamic.literal()
    if (declarationProvider != null) __obj.updateDynamic("declarationProvider")(declarationProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarationServerCapabilities]
  }
}

