package typings.welldoneSoftwareWhyDidYouRender.WhyDidYouRender

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateInfo extends js.Object {
  var Component: typings.react.mod.Component[js.Object, js.Object, _]
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
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], nextHook = nextHook.asInstanceOf[js.Any], nextProps = nextProps.asInstanceOf[js.Any], nextState = nextState.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], prevHook = prevHook.asInstanceOf[js.Any], prevProps = prevProps.asInstanceOf[js.Any], prevState = prevState.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    if (hookName != null) __obj.updateDynamic("hookName")(hookName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInfo]
  }
}

