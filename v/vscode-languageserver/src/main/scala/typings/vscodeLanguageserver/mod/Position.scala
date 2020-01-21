package typings.vscodeLanguageserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "Position")
@js.native
object Position extends js.Object {
  /**
    * Creates a new Position literal from the given line and character.
    * @param line The position's line.
    * @param character The position's character.
    */
  def create(line: Double, character: Double): typings.vscodeLanguageserverTypes.mod.Position = js.native
  /**
    * Checks whether the given liternal conforms to the [Position](#Position) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Position */ Boolean = js.native
}

