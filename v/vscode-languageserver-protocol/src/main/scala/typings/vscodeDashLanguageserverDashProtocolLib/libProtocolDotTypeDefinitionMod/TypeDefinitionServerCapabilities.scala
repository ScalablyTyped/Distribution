package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolDotTypeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeDefinitionServerCapabilities extends js.Object {
  /**
    * The server provides Goto Type Definition support.
    */
  var typeDefinitionProvider: js.UndefOr[
    scala.Boolean | (vscodeDashLanguageserverDashProtocolLib.libProtocolMod.TextDocumentRegistrationOptions with vscodeDashLanguageserverDashProtocolLib.libProtocolMod.StaticRegistrationOptions)
  ] = js.undefined
}

object TypeDefinitionServerCapabilities {
  @scala.inline
  def apply(
    typeDefinitionProvider: scala.Boolean | (vscodeDashLanguageserverDashProtocolLib.libProtocolMod.TextDocumentRegistrationOptions with vscodeDashLanguageserverDashProtocolLib.libProtocolMod.StaticRegistrationOptions) = null
  ): TypeDefinitionServerCapabilities = {
    val __obj = js.Dynamic.literal()
    if (typeDefinitionProvider != null) __obj.updateDynamic("typeDefinitionProvider")(typeDefinitionProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefinitionServerCapabilities]
  }
}

