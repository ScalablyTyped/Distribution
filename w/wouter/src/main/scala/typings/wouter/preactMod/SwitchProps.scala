package typings.wouter.preactMod

import typings.preact.preactMod.VNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchProps extends js.Object {
  var children: js.Array[VNode[RouteProps[DefaultParams]]]
  var location: js.UndefOr[String] = js.undefined
}

object SwitchProps {
  @scala.inline
  def apply(children: js.Array[VNode[RouteProps[DefaultParams]]], location: String = null): SwitchProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchProps]
  }
}

