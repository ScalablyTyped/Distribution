package typings.wouter.wouterMod

import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchProps extends js.Object {
  var children: js.Array[ReactElement]
  var location: js.UndefOr[String] = js.undefined
}

object SwitchProps {
  @scala.inline
  def apply(children: js.Array[ReactElement], location: String = null): SwitchProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchProps]
  }
}

