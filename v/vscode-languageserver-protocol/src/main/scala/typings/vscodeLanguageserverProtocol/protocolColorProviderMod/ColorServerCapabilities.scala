package typings.vscodeLanguageserverProtocol.protocolColorProviderMod

import typings.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorServerCapabilities extends js.Object {
  /**
    * The server provides color provider support.
    */
  var colorProvider: js.UndefOr[
    Boolean | ColorProviderOptions | (ColorProviderOptions with TextDocumentRegistrationOptions with StaticRegistrationOptions)
  ] = js.undefined
}

object ColorServerCapabilities {
  @scala.inline
  def apply(
    colorProvider: Boolean | ColorProviderOptions | (ColorProviderOptions with TextDocumentRegistrationOptions with StaticRegistrationOptions) = null
  ): ColorServerCapabilities = {
    val __obj = js.Dynamic.literal()
    if (colorProvider != null) __obj.updateDynamic("colorProvider")(colorProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorServerCapabilities]
  }
}

