package typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var character: Double
  /**
    * Line position in a document (zero-based).
    * If a line number is greater than the number of lines in a document, it defaults back to the number of lines in the document.
    * If a line number is negative, it defaults to 0.
    */
  var line: Double
}

object Position {
  @scala.inline
  def apply(character: Double, line: Double): Position = {
    val __obj = js.Dynamic.literal(character = character, line = line)
  
    __obj.asInstanceOf[Position]
  }
}

