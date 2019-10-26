package typings.wouter.preactMod

import typings.preact.srcMod.VNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchProps extends js.Object {
  var children: js.Array[VNode[RouteProps]]
  var location: js.UndefOr[String] = js.undefined
}

object SwitchProps {
  @scala.inline
  def apply(children: js.Array[VNode[RouteProps]], location: String = null): SwitchProps = {
    val __obj = js.Dynamic.literal(children = children)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[SwitchProps]
  }
}

