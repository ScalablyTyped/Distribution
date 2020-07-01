package typings.vuex.loggerMod

import typings.vuex.mod.Payload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerOption[S] extends js.Object {
  var actionFilter: js.UndefOr[js.Function2[/* action */ Payload, /* state */ S, Boolean]] = js.undefined
  var actionTransformer: js.UndefOr[js.Function1[/* action */ Payload, _]] = js.undefined
  var collapsed: js.UndefOr[Boolean] = js.undefined
  var filter: js.UndefOr[
    js.Function3[/* mutation */ Payload, /* stateBefore */ S, /* stateAfter */ S, Boolean]
  ] = js.undefined
  var logActions: js.UndefOr[Boolean] = js.undefined
  var logMutations: js.UndefOr[Boolean] = js.undefined
  var mutationTransformer: js.UndefOr[js.Function1[/* mutation */ Payload, _]] = js.undefined
  var transformer: js.UndefOr[js.Function1[/* state */ S, _]] = js.undefined
}

object LoggerOption {
  @scala.inline
  def apply[S](
    actionFilter: (/* action */ Payload, /* state */ S) => Boolean = null,
    actionTransformer: /* action */ Payload => _ = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    filter: (/* mutation */ Payload, /* stateBefore */ S, /* stateAfter */ S) => Boolean = null,
    logActions: js.UndefOr[Boolean] = js.undefined,
    logMutations: js.UndefOr[Boolean] = js.undefined,
    mutationTransformer: /* mutation */ Payload => _ = null,
    transformer: /* state */ S => _ = null
  ): LoggerOption[S] = {
    val __obj = js.Dynamic.literal()
    if (actionFilter != null) __obj.updateDynamic("actionFilter")(js.Any.fromFunction2(actionFilter))
    if (actionTransformer != null) __obj.updateDynamic("actionTransformer")(js.Any.fromFunction1(actionTransformer))
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.get.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction3(filter))
    if (!js.isUndefined(logActions)) __obj.updateDynamic("logActions")(logActions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(logMutations)) __obj.updateDynamic("logMutations")(logMutations.get.asInstanceOf[js.Any])
    if (mutationTransformer != null) __obj.updateDynamic("mutationTransformer")(js.Any.fromFunction1(mutationTransformer))
    if (transformer != null) __obj.updateDynamic("transformer")(js.Any.fromFunction1(transformer))
    __obj.asInstanceOf[LoggerOption[S]]
  }
}

