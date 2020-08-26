package typings.unist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Position extends js.Object {
  /**
    * Place of the first character after the parsed source region.
    */
  var end: Point = js.native
  /**
    * Start column at each index (plus start line) in the source region,
    * for elements that span multiple lines.
    */
  var indent: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Place of the first character of the parsed source region.
    */
  var start: Point = js.native
}

object Position {
  @scala.inline
  def apply(end: Point, start: Point): Position = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  @scala.inline
  implicit class PositionOps[Self <: Position] (val x: Self) extends AnyVal {
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
    def setEnd(value: Point): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Point): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndentVarargs(value: Double*): Self = this.set("indent", js.Array(value :_*))
    @scala.inline
    def setIndent(value: js.Array[Double]): Self = this.set("indent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
  }
  
}

