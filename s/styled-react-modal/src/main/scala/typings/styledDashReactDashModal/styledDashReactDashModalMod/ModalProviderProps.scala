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
  def apply(children: ReactNode, backgroundComponent: AnyStyledComponent = null): ModalProviderProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (backgroundComponent != null) __obj.updateDynamic("backgroundComponent")(backgroundComponent)
    __obj.asInstanceOf[ModalProviderProps]
  }
}

