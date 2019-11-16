package typings.atXstyledSystem.atXstyledSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionProps extends js.Object {
  val transition: js.UndefOr[ResponsiveValue[String]] = js.undefined
}

object TransitionProps {
  @scala.inline
  def apply(transition: ResponsiveValue[String] = null): TransitionProps = {
    val __obj = js.Dynamic.literal()
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionProps]
  }
}

