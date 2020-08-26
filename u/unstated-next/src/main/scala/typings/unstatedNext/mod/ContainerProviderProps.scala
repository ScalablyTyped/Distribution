package typings.unstatedNext.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerProviderProps[State] extends js.Object {
  var children: ReactNode = js.native
  var initialState: js.UndefOr[State] = js.native
}

object ContainerProviderProps {
  @scala.inline
  def apply[State](): ContainerProviderProps[State] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerProviderProps[State]]
  }
  @scala.inline
  implicit class ContainerProviderPropsOps[Self <: ContainerProviderProps[_], State] (val x: Self with ContainerProviderProps[State]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setInitialState(value: State): Self = this.set("initialState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
  }
  
}

