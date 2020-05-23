package typings.xstate.anon

import typings.xstate.interpreterMod.Clock
import typings.xstate.interpreterMod.Interpreter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<xstate.xstate/lib/types.InterpreterOptions> */
trait ReadonlyInterpreterOption extends js.Object {
  val clock: Clock
  val deferEvents: Boolean
  val devTools: Boolean | js.Object
  val execute: Boolean
  val id: js.UndefOr[String] = js.undefined
  val parent: js.UndefOr[Interpreter[_, _, _, _]] = js.undefined
  def logger(args: js.Any*): Unit
}

object ReadonlyInterpreterOption {
  @scala.inline
  def apply(
    clock: Clock,
    deferEvents: Boolean,
    devTools: Boolean | js.Object,
    execute: Boolean,
    logger: /* repeated */ js.Any => Unit,
    id: String = null,
    parent: Interpreter[_, _, _, _] = null
  ): ReadonlyInterpreterOption = {
    val __obj = js.Dynamic.literal(clock = clock.asInstanceOf[js.Any], deferEvents = deferEvents.asInstanceOf[js.Any], devTools = devTools.asInstanceOf[js.Any], execute = execute.asInstanceOf[js.Any], logger = js.Any.fromFunction1(logger))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyInterpreterOption]
  }
}

