package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterpreterOptions extends js.Object {
  var clock: xstateLib.libInterpreterMod.Clock
  /**
    * If `true`, defers processing of sent events until the service
    * is initialized (`.start()`). Otherwise, an error will be thrown
    * for events sent to an uninitialized service.
    *
    * Default: `true`
    */
  var deferEvents: scala.Boolean
  /**
    * If `true`, states and events will be logged to Redux DevTools.
    *
    * Default: `false`
    */
  var devTools: scala.Boolean
  /**
    * Whether state actions should be executed immediately upon transition. Defaults to `true`.
    */
  var execute: scala.Boolean
  /**
    * The custom `id` for referencing this service.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  var parent: js.UndefOr[xstateLib.libInterpreterMod.Interpreter[_, _, _]] = js.undefined
  def logger(args: js.Any*): scala.Unit
}

object InterpreterOptions {
  @scala.inline
  def apply(
    clock: xstateLib.libInterpreterMod.Clock,
    deferEvents: scala.Boolean,
    devTools: scala.Boolean,
    execute: scala.Boolean,
    logger: /* repeated */ js.Any => scala.Unit,
    id: java.lang.String = null,
    parent: xstateLib.libInterpreterMod.Interpreter[_, _, _] = null
  ): InterpreterOptions = {
    val __obj = js.Dynamic.literal(clock = clock, deferEvents = deferEvents, devTools = devTools, execute = execute, logger = js.Any.fromFunction1(logger))
    if (id != null) __obj.updateDynamic("id")(id)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[InterpreterOptions]
  }
}

