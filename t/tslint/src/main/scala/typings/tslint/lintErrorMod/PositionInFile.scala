package typings.tslint.lintErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PositionInFile extends js.Object {
  var col: Double = js.native
  var line: Double = js.native
}

object PositionInFile {
  @scala.inline
  def apply(col: Double, line: Double): PositionInFile = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionInFile]
  }
  @scala.inline
  implicit class PositionInFileOps[Self <: PositionInFile] (val x: Self) extends AnyVal {
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
    def setCol(value: Double): Self = this.set("col", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
  }
  
}

