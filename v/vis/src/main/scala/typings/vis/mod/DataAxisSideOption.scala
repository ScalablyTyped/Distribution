package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataAxisSideOption extends js.Object {
  var format: js.UndefOr[js.Function0[String]] = js.native
  var range: js.UndefOr[RangeType] = js.native
  var title: js.UndefOr[TitleOption] = js.native
}

object DataAxisSideOption {
  @scala.inline
  def apply(): DataAxisSideOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataAxisSideOption]
  }
  @scala.inline
  implicit class DataAxisSideOptionOps[Self <: DataAxisSideOption] (val x: Self) extends AnyVal {
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
    def setFormat(value: () => String): Self = this.set("format", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setRange(value: RangeType): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setTitle(value: TitleOption): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

