package typings
package vscodeDashLanguageclientLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "ColorInformation")
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
  def is(value: js.Any): /* is ColorInformation */scala.Boolean = js.native
}

