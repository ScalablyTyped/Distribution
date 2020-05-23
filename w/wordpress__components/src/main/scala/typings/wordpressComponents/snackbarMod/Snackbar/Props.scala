package typings.wordpressComponents.snackbarMod.Snackbar

import typings.wordpressComponents.noticeMod.Notice.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /**
    * An array of `Notice.Action` objects.
    */
  var actions: js.UndefOr[js.Array[Action]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  /**
    * Callback to be called when the snackbar is to be removed.
    */
  var onRemove: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Props {
  @scala.inline
  def apply(actions: js.Array[Action] = null, className: String = null, onRemove: () => Unit = null): Props = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction0(onRemove))
    __obj.asInstanceOf[Props]
  }
}

