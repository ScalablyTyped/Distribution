package typings
package wouterLib.preactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteProps extends js.Object {
  var children: js.UndefOr[
    (js.Function1[/* params */ Params, preactLib.preactMod.ComponentChildren]) | preactLib.preactMod.ComponentChildren
  ] = js.undefined
  var component: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType<any> */ js.Any
  ] = js.undefined
  var `match`: js.UndefOr[scala.Boolean] = js.undefined
  var path: Path
}

object RouteProps {
  @scala.inline
  def apply(
    path: Path,
    children: (js.Function1[/* params */ Params, preactLib.preactMod.ComponentChildren]) | preactLib.preactMod.ComponentChildren = null,
    component: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType<any> */ js.Any = null,
    `match`: js.UndefOr[scala.Boolean] = js.undefined
  ): RouteProps = {
    val __obj = js.Dynamic.literal(path = path)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component)
    if (!js.isUndefined(`match`)) __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[RouteProps]
  }
}

