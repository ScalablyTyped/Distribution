package typings.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Position extends js.Object {
  /**
    * Character offset on a line in a document (zero-based). Assuming that the line is
    * represented as a string, the `character` value represents the gap between the
    * `character` and `character + 1`.
    *
    * If the character value is greater than the line length it defaults back to the
    * line length.
    * If a line number is negative, it defaults to 0.
    */
  var character: Double = js.native
  /**
    * Line position in a document (zero-based).
    * If a line number is greater than the number of lines in a document, it defaults back to the number of lines in the document.
    * If a line number is negative, it defaults to 0.
    */
  var line: Double = js.native
}

@JSImport("vscode-languageserver-types", "Position")
@js.native
object Position extends js.Object {
  /**
    * Creates a new Position literal from the given line and character.
    * @param line The position's line.
    * @param character The position's character.
    */
  def create(line: Double, character: Double): Position = js.native
  /**
    * Checks whether the given liternal conforms to the [Position](#Position) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Position */ Boolean = js.native
}

