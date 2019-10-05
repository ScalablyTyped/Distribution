package typings.atWelldoneDashSoftwareWhyDashDidDashYouDashRender.WhyDidYouRender

import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateInfo extends js.Object {
  var Component: typings.react.reactMod.Component[js.Object, js.Object, _]
  var displayName: String
  var nextProps: js.Any
  var nextState: js.Any
  var options: WhyDidYouRenderOptions
  var prevProps: js.Any
  var prevState: js.Any
  var reason: ReasonForUpdate
}

object UpdateInfo {
  @scala.inline
  def apply(
    Component: Component[js.Object, js.Object, _],
    displayName: String,
    nextProps: js.Any,
    nextState: js.Any,
    options: WhyDidYouRenderOptions,
    prevProps: js.Any,
    prevState: js.Any,
    reason: ReasonForUpdate
  ): UpdateInfo = {
    val __obj = js.Dynamic.literal(Component = Component, displayName = displayName, nextProps = nextProps, nextState = nextState, options = options, prevProps = prevProps, prevState = prevState, reason = reason)
  
    __obj.asInstanceOf[UpdateInfo]
  }
}

