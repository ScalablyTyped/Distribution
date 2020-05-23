package typings.wordpressComponents.baseControlMod.BaseControl

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisualLabelProps extends js.Object {
  var children: ReactNode
  var className: js.UndefOr[String] = js.undefined
}

object VisualLabelProps {
  @scala.inline
  def apply(children: ReactNode = null, className: String = null): VisualLabelProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualLabelProps]
  }
}

