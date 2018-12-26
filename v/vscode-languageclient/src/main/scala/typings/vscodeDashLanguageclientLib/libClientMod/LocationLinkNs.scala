package typings
package vscodeDashLanguageclientLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "LocationLink")
@js.native
object LocationLinkNs extends js.Object {
  /**
       * Creates a LocationLink literal.
       * @param targetUri The definition's uri.
       * @param targetRange The full range of the definition.
       * @param targetSelectionRange The span of the symbol definition at the target.
       * @param originSelectionRange The span of the symbol being defined in the originating source file.
       */
  def create(
    targetUri: java.lang.String,
    targetRange: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range,
    targetSelectionRange: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.LocationLink = js.native
  /**
       * Creates a LocationLink literal.
       * @param targetUri The definition's uri.
       * @param targetRange The full range of the definition.
       * @param targetSelectionRange The span of the symbol definition at the target.
       * @param originSelectionRange The span of the symbol being defined in the originating source file.
       */
  def create(
    targetUri: java.lang.String,
    targetRange: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range,
    targetSelectionRange: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range,
    originSelectionRange: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.LocationLink = js.native
  /**
       * Checks whether the given literal conforms to the [LocationLink](#LocationLink) interface.
       */
  def is(value: js.Any): /* is LocationLink */scala.Boolean = js.native
}

