package typings
package vscodeDashLanguageserverLib.libMainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver/lib/main", "Position")
@js.native
object PositionNs extends js.Object {
  /**
    * Creates a new Position literal from the given line and character.
    * @param line The position's line.
    * @param character The position's character.
    */
  def create(line: scala.Double, character: scala.Double): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Position = js.native
  /**
    * Checks whether the given liternal conforms to the [Position](#Position) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Position */ scala.Boolean = js.native
}

