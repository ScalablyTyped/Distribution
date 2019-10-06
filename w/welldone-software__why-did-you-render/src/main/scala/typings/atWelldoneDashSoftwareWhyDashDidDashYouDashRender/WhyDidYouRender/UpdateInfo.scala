package typings.atWelldoneDashSoftwareWhyDashDidDashYouDashRender.WhyDidYouRender

import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateInfo extends js.Object {
  var Component: typings.react.reactMod.Component[js.Object, js.Object, _]
  var displayName: String
  var hookName: js.UndefOr[String] = js.undefined
  var nextHook: js.Any
  var nextProps: js.Any
  var nextState: js.Any
  var options: WhyDidYouRenderOptions
  var prevHook: js.Any
  var prevProps: js.Any
  var prevState: js.Any
  var reason: ReasonForUpdate
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
    reason: ReasonForUpdate,
    hookName: String = null
  ): UpdateInfo = {
    val __obj = js.Dynamic.literal(Component = Component, displayName = displayName, nextHook = nextHook, nextProps = nextProps, nextState = nextState, options = options, prevHook = prevHook, prevProps = prevProps, prevState = prevState, reason = reason)
    if (hookName != null) __obj.updateDynamic("hookName")(hookName)
    __obj.asInstanceOf[UpdateInfo]
  }
}

