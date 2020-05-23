package typings.wordpressComponents.baseControlMod.BaseControl

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlProps extends js.Object {
  /**
    * The class that will be added with `"components-base-control"` to
    * the classes of the wrapper div. If undefined, only
    * `"components-base-control"` is used.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * If this property is added, a help text will be generated using help
    * property as the content.
    */
  var help: js.UndefOr[ReactNode] = js.undefined
  /**
    * If true, the label will only be visible to screen readers.
    */
  var hideLabelFromVision: js.UndefOr[Boolean] = js.undefined
  /**
    * If this property is added, a label will be generated using label
    * property as the content.
    */
  var label: js.UndefOr[ReactNode] = js.undefined
}

object ControlProps {
  @scala.inline
  def apply(
    className: String = null,
    help: ReactNode = null,
    hideLabelFromVision: js.UndefOr[Boolean] = js.undefined,
    label: ReactNode = null
  ): ControlProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (!js.isUndefined(hideLabelFromVision)) __obj.updateDynamic("hideLabelFromVision")(hideLabelFromVision.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlProps]
  }
}

