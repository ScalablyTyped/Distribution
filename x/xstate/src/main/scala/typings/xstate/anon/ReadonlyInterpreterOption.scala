package typings.xstate.anon

import typings.xstate.interpreterMod.Clock
import typings.xstate.interpreterMod.Interpreter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<xstate.xstate/lib/types.InterpreterOptions> */
@js.native
trait ReadonlyInterpreterOption extends js.Object {
  val clock: Clock = js.native
  val deferEvents: Boolean = js.native
  val devTools: Boolean | js.Object = js.native
  val execute: Boolean = js.native
  val id: js.UndefOr[String] = js.native
  val parent: js.UndefOr[Interpreter[_, _, _, _]] = js.native
  def logger(args: js.Any*): Unit = js.native
}

object ReadonlyInterpreterOption {
  @scala.inline
  def apply(
    clock: Clock,
    deferEvents: Boolean,
    devTools: Boolean | js.Object,
    execute: Boolean,
    logger: /* repeated */ js.Any => Unit
  ): ReadonlyInterpreterOption = {
    val __obj = js.Dynamic.literal(clock = clock.asInstanceOf[js.Any], deferEvents = deferEvents.asInstanceOf[js.Any], devTools = devTools.asInstanceOf[js.Any], execute = execute.asInstanceOf[js.Any], logger = js.Any.fromFunction1(logger))
    __obj.asInstanceOf[ReadonlyInterpreterOption]
  }
  @scala.inline
  implicit class ReadonlyInterpreterOptionOps[Self <: ReadonlyInterpreterOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClock(value: Clock): Self = this.set("clock", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeferEvents(value: Boolean): Self = this.set("deferEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def setDevTools(value: Boolean | js.Object): Self = this.set("devTools", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecute(value: Boolean): Self = this.set("execute", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogger(value: /* repeated */ js.Any => Unit): Self = this.set("logger", js.Any.fromFunction1(value))
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setParent(value: Interpreter[_, _, _, _]): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
  }
  
}

