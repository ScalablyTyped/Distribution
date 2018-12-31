package typings
package vscodeDashLanguageclientLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "Range")
@js.native
object RangeNs extends js.Object {
  /**
    * Create a new Range liternal.
    * @param startLine The start line number.
    * @param startCharacter The start character.
    * @param endLine The end line number.
    * @param endCharacter The end character.
    */
  def create(
    startLine: scala.Double,
    startCharacter: scala.Double,
    endLine: scala.Double,
    endCharacter: scala.Double
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range = js.native
  /**
    * Create a new Range liternal.
    * @param start The range's start position.
    * @param end The range's end position.
    */
  def create(
    start: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Position,
    end: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Position
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range = js.native
  /**
    * Checks whether the given literal conforms to the [Range](#Range) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Range */ scala.Boolean = js.native
}

