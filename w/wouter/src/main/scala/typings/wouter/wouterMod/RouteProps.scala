package typings.wouter.wouterMod

import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteProps extends js.Object {
  var children: js.UndefOr[(js.Function1[/* params */ Params, ReactNode]) | ReactNode] = js.undefined
  var component: js.UndefOr[ComponentType[_]] = js.undefined
  var `match`: js.UndefOr[Boolean] = js.undefined
  var path: Path
}

object RouteProps {
  @scala.inline
  def apply(
    path: Path,
    children: (js.Function1[/* params */ Params, ReactNode]) | ReactNode = null,
    component: ComponentType[_] = null,
    `match`: js.UndefOr[Boolean] = js.undefined
  ): RouteProps = {
    val __obj = js.Dynamic.literal(path = path)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(`match`)) __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[RouteProps]
  }
}

