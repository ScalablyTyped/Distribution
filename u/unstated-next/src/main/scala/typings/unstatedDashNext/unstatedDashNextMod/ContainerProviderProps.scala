package typings.unstatedDashNext.unstatedDashNextMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerProviderProps[State] extends js.Object {
  var children: ReactNode
  var initialState: js.UndefOr[State] = js.undefined
}

object ContainerProviderProps {
  @scala.inline
  def apply[State](children: ReactNode = null, initialState: State = null): ContainerProviderProps[State] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerProviderProps[State]]
  }
}

