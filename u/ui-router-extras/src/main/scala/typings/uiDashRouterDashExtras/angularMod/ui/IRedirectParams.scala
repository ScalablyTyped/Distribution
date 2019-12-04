package typings.uiDashRouterDashExtras.angularMod.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRedirectParams extends js.Object {
  var params: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IStateParamsService */ js.Any
  ] = js.undefined
  var state: String
}

object IRedirectParams {
  @scala.inline
  def apply(
    state: String,
    params: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IStateParamsService */ js.Any = null
  ): IRedirectParams = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRedirectParams]
  }
}

