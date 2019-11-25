package typings.atXstyledSystem.atXstyledSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorProps extends js.Object {
  // Clash with HTMLAttributes interface declared in React module
  // that includes a non-standard HTML attribute `color?: string`.
  // Type here should be `ResponsiveValue<CSS.ColorProperty>`.
  val color: js.UndefOr[js.Any] = js.undefined
}

object ColorProps {
  @scala.inline
  def apply(color: js.Any = null): ColorProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorProps]
  }
}

