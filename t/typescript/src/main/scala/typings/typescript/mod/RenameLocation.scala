package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenameLocation extends DocumentSpan {
  val prefixText: js.UndefOr[java.lang.String] = js.native
  val suffixText: js.UndefOr[java.lang.String] = js.native
}

object RenameLocation {
  @scala.inline
  def apply(fileName: java.lang.String, textSpan: TextSpan): RenameLocation = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameLocation]
  }
  @scala.inline
  implicit class RenameLocationOps[Self <: RenameLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPrefixText(value: java.lang.String): Self = this.set("prefixText", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixText: Self = this.set("prefixText", js.undefined)
    @scala.inline
    def setSuffixText(value: java.lang.String): Self = this.set("suffixText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffixText: Self = this.set("suffixText", js.undefined)
  }
  
}

