package typings.tablesorter.parsedOptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedOption extends js.Object {
  /**
    * The parsed value of the cell.
    */
  var parsed: js.Any = js.native
  /**
    * The unparsed text of the cell.
    */
  var raw: String = js.native
}

object ParsedOption {
  @scala.inline
  def apply(parsed: js.Any, raw: String): ParsedOption = {
    val __obj = js.Dynamic.literal(parsed = parsed.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedOption]
  }
  @scala.inline
  implicit class ParsedOptionOps[Self <: ParsedOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParsed(value: js.Any): Self = this.set("parsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
  }
  
}

