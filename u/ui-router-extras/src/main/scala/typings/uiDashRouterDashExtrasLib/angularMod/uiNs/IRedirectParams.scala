package typings
package uiDashRouterDashExtrasLib.angularMod.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRedirectParams extends js.Object {
  var params: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IStateParamsService */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IStateParamsService */ js.Any
  ] = js.undefined
  var state: java.lang.String
}

object IRedirectParams {
  @scala.inline
  def apply(
    state: java.lang.String,
    params: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IStateParamsService */ js.Any = null
  ): IRedirectParams = {
    val __obj = js.Dynamic.literal(state = state)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[IRedirectParams]
  }
}

