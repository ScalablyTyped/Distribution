package typings.welldoneSoftwareWhyDidYouRender.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateInfo extends js.Object {
  var Component: typings.react.mod.Component[js.Object, js.Object, _] = js.native
  var displayName: String = js.native
  var hookName: js.UndefOr[String] = js.native
  var nextHook: js.Any = js.native
  var nextProps: js.Any = js.native
  var nextState: js.Any = js.native
  var options: WhyDidYouRenderOptions = js.native
  var prevHook: js.Any = js.native
  var prevProps: js.Any = js.native
  var prevState: js.Any = js.native
  var reason: ReasonForUpdate = js.native
}

object UpdateInfo {
  @scala.inline
  def apply(
    Component: Component[js.Object, js.Object, _],
    displayName: String,
    nextHook: js.Any,
    nextProps: js.Any,
    nextState: js.Any,
    options: WhyDidYouRenderOptions,
    prevHook: js.Any,
    prevProps: js.Any,
    prevState: js.Any,
    reason: ReasonForUpdate
  ): UpdateInfo = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], nextHook = nextHook.asInstanceOf[js.Any], nextProps = nextProps.asInstanceOf[js.Any], nextState = nextState.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], prevHook = prevHook.asInstanceOf[js.Any], prevProps = prevProps.asInstanceOf[js.Any], prevState = prevState.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInfo]
  }
  @scala.inline
  implicit class UpdateInfoOps[Self <: UpdateInfo] (val x: Self) extends AnyVal {
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
    def setComponent(value: Component[js.Object, js.Object, _]): Self = this.set("Component", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextHook(value: js.Any): Self = this.set("nextHook", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextProps(value: js.Any): Self = this.set("nextProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextState(value: js.Any): Self = this.set("nextState", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: WhyDidYouRenderOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevHook(value: js.Any): Self = this.set("prevHook", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevProps(value: js.Any): Self = this.set("prevProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevState(value: js.Any): Self = this.set("prevState", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: ReasonForUpdate): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setHookName(value: String): Self = this.set("hookName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHookName: Self = this.set("hookName", js.undefined)
  }
  
}

