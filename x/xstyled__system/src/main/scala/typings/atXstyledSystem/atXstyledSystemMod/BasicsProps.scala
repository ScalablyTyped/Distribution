package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.GlobalsNumber
import typings.csstype.csstypeMod.OverflowProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicsProps
  extends OpacityProps
     with OverflowProps
     with TransitionProps

object BasicsProps {
  @scala.inline
  def apply(
    opacity: ResponsiveValue[GlobalsNumber] = null,
    overflow: ResponsiveValue[OverflowProperty] = null,
    transition: ResponsiveValue[String] = null
  ): BasicsProps = {
    val __obj = js.Dynamic.literal()
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicsProps]
  }
}

