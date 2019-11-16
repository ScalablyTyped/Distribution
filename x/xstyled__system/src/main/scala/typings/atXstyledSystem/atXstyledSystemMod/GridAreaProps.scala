package typings.atXstyledSystem.atXstyledSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridAreaProps extends js.Object {
  // Number allowed here but is converted into px value, which is invalid.
  // readonly gridArea?: ResponsiveValue<CSS.GridAreaProperty>;
  val gridArea: js.UndefOr[ResponsiveValue[String]] = js.undefined
}

object GridAreaProps {
  @scala.inline
  def apply(gridArea: ResponsiveValue[String] = null): GridAreaProps = {
    val __obj = js.Dynamic.literal()
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridAreaProps]
  }
}

