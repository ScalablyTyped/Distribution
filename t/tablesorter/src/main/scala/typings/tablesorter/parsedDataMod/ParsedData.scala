package typings.tablesorter.parsedDataMod

import typings.tablesorter.mod.global.HTMLElement
import typings.tablesorter.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedData extends js.Object {
  /**
    * The jQuery-objects containing the cells of the rows.
    */
  @JSName("$cells")
  var $cells: js.Array[JQuery[HTMLElement]] = js.native
  /**
    * The parsed values of the rows.
    */
  var parsed: js.Array[_] = js.native
  /**
    * The raw values of the rows.
    */
  var raw: js.Array[String] = js.native
}

object ParsedData {
  @scala.inline
  def apply($cells: js.Array[JQuery[HTMLElement]], parsed: js.Array[_], raw: js.Array[String]): ParsedData = {
    val __obj = js.Dynamic.literal($cells = $cells.asInstanceOf[js.Any], parsed = parsed.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedData]
  }
  @scala.inline
  implicit class ParsedDataOps[Self <: ParsedData] (val x: Self) extends AnyVal {
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
    def set$cellsVarargs(value: JQuery[HTMLElement]*): Self = this.set("$cells", js.Array(value :_*))
    @scala.inline
    def set$cells(value: js.Array[JQuery[HTMLElement]]): Self = this.set("$cells", value.asInstanceOf[js.Any])
    @scala.inline
    def setParsedVarargs(value: js.Any*): Self = this.set("parsed", js.Array(value :_*))
    @scala.inline
    def setParsed(value: js.Array[_]): Self = this.set("parsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setRawVarargs(value: String*): Self = this.set("raw", js.Array(value :_*))
    @scala.inline
    def setRaw(value: js.Array[String]): Self = this.set("raw", value.asInstanceOf[js.Any])
  }
  
}

