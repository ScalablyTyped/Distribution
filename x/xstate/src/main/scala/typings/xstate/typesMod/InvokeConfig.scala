package typings.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvokeConfig[TContext, TEvent /* <: EventObject */] extends js.Object {
  /**
    * If `true`, events sent to the parent service will be forwarded to the invoked service.
    *
    * Default: `false`
    */
  var autoForward: js.UndefOr[Boolean] = js.native
  /**
    * Data from the parent machine's context to set as the (partial or full) context
    * for the invoked child machine.
    *
    * Data should be mapped to match the child machine's context shape.
    */
  var data: js.UndefOr[(Mapper[TContext, TEvent, _]) | (PropertyMapper[TContext, TEvent, _])] = js.native
  /**
    * @deprecated
    *
    *  Use `autoForward` property instead of `forward`. Support for `forward` will get removed in the future.
    */
  var forward: js.UndefOr[Boolean] = js.native
  /**
    * The unique identifier for the invoked machine. If not specified, this
    * will be the machine's own `id`, or the URL (from `src`).
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The transition to take upon the invoked child machine reaching its final top-level state.
    */
  var onDone: js.UndefOr[String | (SingleOrArray[TransitionConfig[TContext, DoneInvokeEvent[_]]])] = js.native
  /**
    * The transition to take upon the invoked child machine sending an error event.
    */
  var onError: js.UndefOr[String | (SingleOrArray[TransitionConfig[TContext, DoneInvokeEvent[_]]])] = js.native
  /**
    * The source of the machine to be invoked, or the machine itself.
    */
  var src: String | (StateMachine[_, _, _, _]) | (InvokeCreator[TContext, TEvent, _]) = js.native
}

object InvokeConfig {
  @scala.inline
  def apply[TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent](src: String | (StateMachine[_, _, _, _]) | (InvokeCreator[TContext, TEvent, _])): InvokeConfig[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeConfig[TContext, TEvent]]
  }
  @scala.inline
  implicit class InvokeConfigOps[Self <: InvokeConfig[_, _], TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent] (val x: Self with (InvokeConfig[TContext, TEvent])) extends AnyVal {
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
    def setSrcFunction3(
      value: (TContext, TEvent, /* meta */ InvokeMeta) => js.Thenable[_] | (StateMachine[_, js.Any, js.Any, js.Any]) | Subscribable[js.Any] | InvokeCallback
    ): Self = this.set("src", js.Any.fromFunction3(value))
    @scala.inline
    def setSrc(value: String | (StateMachine[_, _, _, _]) | (InvokeCreator[TContext, TEvent, _])): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoForward(value: Boolean): Self = this.set("autoForward", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoForward: Self = this.set("autoForward", js.undefined)
    @scala.inline
    def setDataFunction2(value: (TContext, TEvent) => _): Self = this.set("data", js.Any.fromFunction2(value))
    @scala.inline
    def setData(value: (Mapper[TContext, TEvent, _]) | (PropertyMapper[TContext, TEvent, _])): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setForward(value: Boolean): Self = this.set("forward", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForward: Self = this.set("forward", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setOnDoneVarargs(value: (TransitionConfig[TContext, DoneInvokeEvent[js.Any]])*): Self = this.set("onDone", js.Array(value :_*))
    @scala.inline
    def setOnDone(value: String | (SingleOrArray[TransitionConfig[TContext, DoneInvokeEvent[_]]])): Self = this.set("onDone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDone: Self = this.set("onDone", js.undefined)
    @scala.inline
    def setOnErrorVarargs(value: (TransitionConfig[TContext, DoneInvokeEvent[js.Any]])*): Self = this.set("onError", js.Array(value :_*))
    @scala.inline
    def setOnError(value: String | (SingleOrArray[TransitionConfig[TContext, DoneInvokeEvent[_]]])): Self = this.set("onError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
  }
  
}

