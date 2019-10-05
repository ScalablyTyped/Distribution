package typings.uiDashRouterDashExtras.angularMod.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * Previous state
  */
trait IPreviousState extends js.Object {
  var params: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IStateParamsService */ js.Any
  ] = js.undefined
  var state: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IState */ js.Any
}

object IPreviousState {
  @scala.inline
  def apply(
    state: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IState */ js.Any,
    params: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IStateParamsService */ js.Any = null
  ): IPreviousState = {
    val __obj = js.Dynamic.literal(state = state)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[IPreviousState]
  }
}

