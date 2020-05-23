package typings.wordpressComponents.baseControlMod.BaseControl

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends ControlProps {
  /**
    * The content to be displayed within the BaseControl.
    */
  var children: ReactNode
  /**
    * The id of the element to which labels and help text are being
    * generated. That element should be passed as a child.
    */
  var id: String
}

object Props {
  @scala.inline
  def apply(
    id: String,
    children: ReactNode = null,
    className: String = null,
    help: ReactNode = null,
    hideLabelFromVision: js.UndefOr[Boolean] = js.undefined,
    label: ReactNode = null
  ): Props = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (!js.isUndefined(hideLabelFromVision)) __obj.updateDynamic("hideLabelFromVision")(hideLabelFromVision.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

