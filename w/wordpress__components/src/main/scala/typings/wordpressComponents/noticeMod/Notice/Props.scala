package typings.wordpressComponents.noticeMod.Notice

import typings.react.mod.ReactNode
import typings.wordpressNotices.mod.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /**
    * An array of action objects.
    */
  var actions: js.UndefOr[js.Array[Action]] = js.undefined
  /**
    * Content to render in the notice.
    */
  var children: ReactNode
  var className: js.UndefOr[String] = js.undefined
  /**
    * Whether the notice should be dismissible or not.
    * @defaultValue true
    */
  var isDismissible: js.UndefOr[Boolean] = js.undefined
  /**
    * Function called when dismissing the notice.
    */
  var onRemove: js.UndefOr[js.Function0[Unit]] = js.undefined
  var status: js.UndefOr[Status] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    actions: js.Array[Action] = null,
    children: ReactNode = null,
    className: String = null,
    isDismissible: js.UndefOr[Boolean] = js.undefined,
    onRemove: () => Unit = null,
    status: Status = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(isDismissible)) __obj.updateDynamic("isDismissible")(isDismissible.get.asInstanceOf[js.Any])
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction0(onRemove))
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

