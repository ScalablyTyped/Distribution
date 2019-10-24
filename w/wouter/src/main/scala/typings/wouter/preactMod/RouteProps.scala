package typings.wouter.preactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteProps extends js.Object {
  var children: js.UndefOr[
    (js.Function1[
      /* params */ Params, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentChildren */ _
    ]) | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentChildren */ js.Any)
  ] = js.undefined
  var component: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType<any> */ js.Any
  ] = js.undefined
  var `match`: js.UndefOr[Boolean] = js.undefined
  var path: Path
}

object RouteProps {
  @scala.inline
  def apply(
    path: Path,
    children: (js.Function1[
      /* params */ Params, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentChildren */ _
    ]) | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentChildren */ js.Any) = null,
    component: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType<any> */ js.Any = null,
    `match`: js.UndefOr[Boolean] = js.undefined
  ): RouteProps = {
    val __obj = js.Dynamic.literal(path = path)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component)
    if (!js.isUndefined(`match`)) __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[RouteProps]
  }
}

