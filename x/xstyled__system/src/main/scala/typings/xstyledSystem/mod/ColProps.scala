package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColProps extends js.Object {
  val col: js.UndefOr[ResponsiveValue[String | Double | Boolean]] = js.native
}

object ColProps {
  @scala.inline
  def apply(): ColProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColProps]
  }
  @scala.inline
  implicit class ColPropsOps[Self <: ColProps] (val x: Self) extends AnyVal {
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
    def setCol(value: ResponsiveValue[String | Double | Boolean]): Self = this.set("col", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCol: Self = this.set("col", js.undefined)
  }
  
}

