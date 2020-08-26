package typings.stylus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait H extends js.Object {
  var __type: String = js.native
  var a: Double = js.native
  var column: Double = js.native
  var filename: String = js.native
  var h: Double = js.native
  var l: Double = js.native
  var lineno: Double = js.native
  var s: Double = js.native
}

object H {
  @scala.inline
  def apply(
    __type: String,
    a: Double,
    column: Double,
    filename: String,
    h: Double,
    l: Double,
    lineno: Double,
    s: Double
  ): H = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], a = a.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[H]
  }
  @scala.inline
  implicit class HOps[Self <: H] (val x: Self) extends AnyVal {
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
    def setA(value: Double): Self = this.set("a", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setH(value: Double): Self = this.set("h", value.asInstanceOf[js.Any])
    @scala.inline
    def setL(value: Double): Self = this.set("l", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineno(value: Double): Self = this.set("lineno", value.asInstanceOf[js.Any])
    @scala.inline
    def setS(value: Double): Self = this.set("s", value.asInstanceOf[js.Any])
  }
  
}

