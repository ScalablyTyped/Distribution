package typings.styledDashReactDashModal.styledDashReactDashModalMod

import typings.react.reactMod.ReactNode
import typings.styledDashComponents.styledDashComponentsMod.AnyStyledComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProviderProps extends js.Object {
  var backgroundComponent: js.UndefOr[AnyStyledComponent] = js.undefined
  var children: ReactNode
}

object ModalProviderProps {
  @scala.inline
  def apply(backgroundComponent: AnyStyledComponent = null, children: ReactNode = null): ModalProviderProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundComponent != null) __obj.updateDynamic("backgroundComponent")(backgroundComponent)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalProviderProps]
  }
}

