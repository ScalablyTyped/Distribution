package typings
package wouterLib.preactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchProps extends js.Object {
  var children: js.Array[preactLib.preactMod.VNode[RouteProps]]
  var location: js.UndefOr[java.lang.String] = js.undefined
}

object SwitchProps {
  @scala.inline
  def apply(children: js.Array[preactLib.preactMod.VNode[RouteProps]], location: java.lang.String = null): SwitchProps = {
    val __obj = js.Dynamic.literal(children = children)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[SwitchProps]
  }
}

