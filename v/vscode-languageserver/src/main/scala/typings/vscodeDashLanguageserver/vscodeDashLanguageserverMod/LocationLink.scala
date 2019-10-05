package typings.vscodeDashLanguageserver.vscodeDashLanguageserverMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "LocationLink")
@js.native
object LocationLink extends js.Object {
  /**
    * Creates a LocationLink literal.
    * @param targetUri The definition's uri.
    * @param targetRange The full range of the definition.
    * @param targetSelectionRange The span of the symbol definition at the target.
    * @param originSelectionRange The span of the symbol being defined in the originating source file.
    */
  def create(targetUri: String, targetRange: Range, targetSelectionRange: Range): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.LocationLink = js.native
  def create(targetUri: String, targetRange: Range, targetSelectionRange: Range, originSelectionRange: Range): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.LocationLink = js.native
  /**
    * Checks whether the given literal conforms to the [LocationLink](#LocationLink) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.LocationLink */ Boolean = js.native
}

