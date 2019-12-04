package typings.tablesorter.parsingParsedOptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedOption extends js.Object {
  /**
    * The parsed value of the cell.
    */
  var parsed: js.Any
  /**
    * The unparsed text of the cell.
    */
  var raw: String
}

object ParsedOption {
  @scala.inline
  def apply(parsed: js.Any, raw: String): ParsedOption = {
    val __obj = js.Dynamic.literal(parsed = parsed.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParsedOption]
  }
}

