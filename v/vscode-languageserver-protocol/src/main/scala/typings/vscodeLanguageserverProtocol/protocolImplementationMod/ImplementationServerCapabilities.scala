package typings.vscodeLanguageserverProtocol.protocolImplementationMod

import typings.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImplementationServerCapabilities extends js.Object {
  /**
    * The server provides Goto Implementation support.
    */
  var implementationProvider: js.UndefOr[Boolean | (TextDocumentRegistrationOptions with StaticRegistrationOptions)] = js.undefined
}

object ImplementationServerCapabilities {
  @scala.inline
  def apply(
    implementationProvider: Boolean | (TextDocumentRegistrationOptions with StaticRegistrationOptions) = null
  ): ImplementationServerCapabilities = {
    val __obj = js.Dynamic.literal()
    if (implementationProvider != null) __obj.updateDynamic("implementationProvider")(implementationProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImplementationServerCapabilities]
  }
}

