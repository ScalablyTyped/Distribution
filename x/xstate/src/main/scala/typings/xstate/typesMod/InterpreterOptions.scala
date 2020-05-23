package typings.xstate.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.xstate.interpreterMod.Clock
import typings.xstate.interpreterMod.Interpreter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterpreterOptions
  extends /* option */ StringDictionary[js.Any] {
  var clock: Clock
  /**
    * If `true`, defers processing of sent events until the service
    * is initialized (`.start()`). Otherwise, an error will be thrown
    * for events sent to an uninitialized service.
    *
    * Default: `true`
    */
  var deferEvents: Boolean
  /**
    * If `true`, states and events will be logged to Redux DevTools.
    *
    * Default: `false`
    */
  var devTools: Boolean | js.Object
  /**
    * Whether state actions should be executed immediately upon transition. Defaults to `true`.
    */
  var execute: Boolean
  /**
    * The custom `id` for referencing this service.
    */
  var id: js.UndefOr[String] = js.undefined
  var parent: js.UndefOr[Interpreter[_, _, _, _]] = js.undefined
  def logger(args: js.Any*): Unit
}

object InterpreterOptions {
  @scala.inline
  def apply(
    clock: Clock,
    deferEvents: Boolean,
    devTools: Boolean | js.Object,
    execute: Boolean,
    logger: /* repeated */ js.Any => Unit,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    id: String = null,
    parent: Interpreter[_, _, _, _] = null
  ): InterpreterOptions = {
    val __obj = js.Dynamic.literal(clock = clock.asInstanceOf[js.Any], deferEvents = deferEvents.asInstanceOf[js.Any], devTools = devTools.asInstanceOf[js.Any], execute = execute.asInstanceOf[js.Any], logger = js.Any.fromFunction1(logger))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpreterOptions]
  }
}

