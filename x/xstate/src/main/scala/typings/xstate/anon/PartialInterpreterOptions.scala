package typings.xstate.anon

import typings.xstate.interpreterMod.Clock
import typings.xstate.interpreterMod.Interpreter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<xstate.xstate/lib/types.InterpreterOptions> */
trait PartialInterpreterOptions extends js.Object {
  var clock: js.UndefOr[Clock] = js.undefined
  var deferEvents: js.UndefOr[Boolean] = js.undefined
  var devTools: js.UndefOr[Boolean | js.Object] = js.undefined
  var execute: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var logger: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var parent: js.UndefOr[Interpreter[_, _, _, _]] = js.undefined
}

object PartialInterpreterOptions {
  @scala.inline
  def apply(
    clock: Clock = null,
    deferEvents: js.UndefOr[Boolean] = js.undefined,
    devTools: Boolean | js.Object = null,
    execute: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    logger: /* repeated */ js.Any => Unit = null,
    parent: Interpreter[_, _, _, _] = null
  ): PartialInterpreterOptions = {
    val __obj = js.Dynamic.literal()
    if (clock != null) __obj.updateDynamic("clock")(clock.asInstanceOf[js.Any])
    if (!js.isUndefined(deferEvents)) __obj.updateDynamic("deferEvents")(deferEvents.get.asInstanceOf[js.Any])
    if (devTools != null) __obj.updateDynamic("devTools")(devTools.asInstanceOf[js.Any])
    if (!js.isUndefined(execute)) __obj.updateDynamic("execute")(execute.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(js.Any.fromFunction1(logger))
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialInterpreterOptions]
  }
}

