package typings.wouter.preactMod

import typings.preact.mod.ComponentChildren
import typings.preact.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteProps[T /* <: DefaultParams */] extends js.Object {
  var children: js.UndefOr[(js.Function1[/* params */ Params[T], ComponentChildren]) | ComponentChildren] = js.undefined
  var component: js.UndefOr[ComponentType[RouteComponentProps[T]]] = js.undefined
  var path: Path
}

object RouteProps {
  @scala.inline
  def apply[/* <: typings.wouter.preactMod.DefaultParams */ T](
    path: Path,
    children: js.UndefOr[
      Null | (js.Function1[/* params */ Params[T], ComponentChildren]) | ComponentChildren
    ] = js.undefined,
    component: ComponentType[RouteComponentProps[T]] = null
  ): RouteProps[T] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteProps[T]]
  }
}

