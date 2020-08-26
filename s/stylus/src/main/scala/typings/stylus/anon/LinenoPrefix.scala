package typings.stylus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinenoPrefix extends js.Object {
  var __type: String = js.native
  var column: Double = js.native
  var filename: String = js.native
  var lineno: Double = js.native
  var prefix: String = js.native
  var `val`: String = js.native
}

object LinenoPrefix {
  @scala.inline
  def apply(__type: String, column: Double, filename: String, lineno: Double, prefix: String, `val`: String): LinenoPrefix = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinenoPrefix]
  }
  @scala.inline
  implicit class LinenoPrefixOps[Self <: LinenoPrefix] (val x: Self) extends AnyVal {
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
    def set__type(value: String): Self = this.set("__type", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineno(value: Double): Self = this.set("lineno", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setVal(value: String): Self = this.set("val", value.asInstanceOf[js.Any])
  }
  
}

