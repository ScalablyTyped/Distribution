package typings
package vscodeDashLanguageserverLib.vscodeDashLanguageserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "Location")
@js.native
object LocationNs extends js.Object {
  /**
       * Creates a Location literal.
       * @param uri The location's uri.
       * @param range The location's range.
       */
  def create(
    uri: java.lang.String,
    range: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Location = js.native
  /**
       * Checks whether the given literal conforms to the [Location](#Location) interface.
       */
  def is(value: js.Any): /* is Location */scala.Boolean = js.native
}

