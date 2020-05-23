package typings.wordpressBlockEditor.urlPopoverMod.URLPopover

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props
  extends typings.wordpressComponents.popoverMod.Popover.Props {
  var additionalControls: js.UndefOr[ReactNode] = js.undefined
  /**
    * Callback used to return the React Elements that will be rendered inside the settings
    * drawer. When this function is provided, a toggle button will be rendered in the popover
    * that allows the user to open and close the settings drawer.
    */
  var renderSettings: js.UndefOr[js.Function0[Element]] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    Props: typings.wordpressComponents.popoverMod.Popover.Props,
    additionalControls: ReactNode = null,
    renderSettings: () => Element = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, Props)
    if (additionalControls != null) __obj.updateDynamic("additionalControls")(additionalControls.asInstanceOf[js.Any])
    if (renderSettings != null) __obj.updateDynamic("renderSettings")(js.Any.fromFunction0(renderSettings))
    __obj.asInstanceOf[Props]
  }
}

