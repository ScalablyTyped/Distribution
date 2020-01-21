package typings.styledReactModal.mod

import typings.react.mod.ReactNode
import typings.styledComponents.styledComponentsMod.AnyStyledComponent
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
    if (backgroundComponent != null) __obj.updateDynamic("backgroundComponent")(backgroundComponent.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalProviderProps]
  }
}

