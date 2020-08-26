package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridAreaProps extends js.Object {
  // Number allowed here but is converted into px value, which is invalid.
  // readonly gridArea?: ResponsiveValue<CSS.GridAreaProperty>;
  val gridArea: js.UndefOr[ResponsiveValue[String]] = js.native
}

object GridAreaProps {
  @scala.inline
  def apply(): GridAreaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridAreaProps]
  }
  @scala.inline
  implicit class GridAreaPropsOps[Self <: GridAreaProps] (val x: Self) extends AnyVal {
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
    def setGridArea(value: ResponsiveValue[String]): Self = this.set("gridArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridArea: Self = this.set("gridArea", js.undefined)
  }
  
}

