package typings
package vscodeDashLanguageserverLib.libMainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver/lib/main", "ColorInformation")
@js.native
object ColorInformationNs extends js.Object {
  /**
    * Creates a new ColorInformation literal.
    */
  def create(
    range: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range,
    color: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Color
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.ColorInformation = js.native
  /**
    * Checks whether the given literal conforms to the [ColorInformation](#ColorInformation) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.ColorInformation */ scala.Boolean = js.native
}

