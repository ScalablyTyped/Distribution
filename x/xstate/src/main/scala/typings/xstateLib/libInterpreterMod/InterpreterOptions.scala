package typings
package xstateLib.libInterpreterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterpreterOptions extends js.Object {
  var clock: Clock
  /**
    * If `true`, states and events will be logged to Redux DevTools. Default: `true`
    */
  var devTools: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether state actions should be executed. Defaults to `true`.
    */
  var execute: scala.Boolean
  /**
    * The custom `id` for referencing this service.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  var parent: js.UndefOr[Interpreter[_, _, _]] = js.undefined
  def logger(args: js.Any*): scala.Unit
}

object InterpreterOptions {
  @scala.inline
  def apply(
    clock: Clock,
    execute: scala.Boolean,
    logger: /* repeated */ js.Any => scala.Unit,
    devTools: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    parent: Interpreter[_, _, _] = null
  ): InterpreterOptions = {
    val __obj = js.Dynamic.literal(clock = clock, execute = execute, logger = js.Any.fromFunction1(logger))
    if (!js.isUndefined(devTools)) __obj.updateDynamic("devTools")(devTools)
    if (id != null) __obj.updateDynamic("id")(id)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[InterpreterOptions]
  }
}

