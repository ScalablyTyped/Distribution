package typings.wouter.preactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchProps extends js.Object {
  var children: js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VNode<RouteProps> */ _
  ]
  var location: js.UndefOr[String] = js.undefined
}

object SwitchProps {
  @scala.inline
  def apply(
    children: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VNode<RouteProps> */ _
    ],
    location: String = null
  ): SwitchProps = {
    val __obj = js.Dynamic.literal(children = children)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[SwitchProps]
  }
}

