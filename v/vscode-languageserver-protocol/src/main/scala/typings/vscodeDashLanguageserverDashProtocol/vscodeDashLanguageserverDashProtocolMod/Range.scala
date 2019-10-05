package typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "Range")
@js.native
object Range extends js.Object {
  /**
    * Create a new Range liternal.
    * @param startLine The start line number.
    * @param startCharacter The start character.
    * @param endLine The end line number.
    * @param endCharacter The end character.
    */
  def create(startLine: Double, startCharacter: Double, endLine: Double, endCharacter: Double): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range = js.native
  /**
    * Create a new Range liternal.
    * @param start The range's start position.
    * @param end The range's end position.
    */
  def create(start: Position, end: Position): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range = js.native
  /**
    * Checks whether the given literal conforms to the [Range](#Range) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Range */ Boolean = js.native
}

