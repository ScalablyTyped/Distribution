package typings.styletronReact.mod

import typings.react.mod.ReactNode
import typings.styletronStandard.mod.StandardEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevProviderProps extends js.Object {
  var children: ReactNode = js.native
  /** DebugEngineContext */
  var debug: js.UndefOr[DebugEngine] = js.native
  var debugAfterHydration: js.UndefOr[Boolean] = js.native
  var value: StandardEngine = js.native
}

object DevProviderProps {
  @scala.inline
  def apply(value: StandardEngine): DevProviderProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevProviderProps]
  }
  @scala.inline
  implicit class DevProviderPropsOps[Self <: DevProviderProps] (val x: Self) extends AnyVal {
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
    def setValue(value: StandardEngine): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDebug(value: DebugEngine): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setDebugAfterHydration(value: Boolean): Self = this.set("debugAfterHydration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugAfterHydration: Self = this.set("debugAfterHydration", js.undefined)
  }
  
}

