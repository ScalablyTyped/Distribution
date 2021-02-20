package typings.xstate.typesMod

import typings.xstate.anon.ContextAny
import typings.xstate.anon.ContextTFinalContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvokeConfig[TContext, TEvent /* <: EventObject */] extends StObject {
  
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
  var src: String | InvokeSourceDefinition | (StateMachine[_, _, _, ContextAny]) | (InvokeCreator[TContext, TEvent, _]) = js.native
}
object InvokeConfig {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    src: String | InvokeSourceDefinition | (StateMachine[_, _, _, ContextAny]) | (InvokeCreator[TContext, TEvent, _])
  ): InvokeConfig[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeConfig[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class InvokeConfigMutableBuilder[Self <: InvokeConfig[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (InvokeConfig[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setAutoForward(value: Boolean): Self = StObject.set(x, "autoForward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoForwardUndefined: Self = StObject.set(x, "autoForward", js.undefined)
    
    @scala.inline
    def setData(value: (Mapper[TContext, TEvent, _]) | (PropertyMapper[TContext, TEvent, _])): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFunction2(value: (TContext, TEvent) => _): Self = StObject.set(x, "data", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setForward(value: Boolean): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardUndefined: Self = StObject.set(x, "forward", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setOnDone(value: String | (SingleOrArray[TransitionConfig[TContext, DoneInvokeEvent[_]]])): Self = StObject.set(x, "onDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDoneUndefined: Self = StObject.set(x, "onDone", js.undefined)
    
    @scala.inline
    def setOnDoneVarargs(value: (TransitionConfig[TContext, DoneInvokeEvent[js.Any]])*): Self = StObject.set(x, "onDone", js.Array(value :_*))
    
    @scala.inline
    def setOnError(value: String | (SingleOrArray[TransitionConfig[TContext, DoneInvokeEvent[_]]])): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnErrorVarargs(value: (TransitionConfig[TContext, DoneInvokeEvent[js.Any]])*): Self = StObject.set(x, "onError", js.Array(value :_*))
    
    @scala.inline
    def setSrc(
      value: String | InvokeSourceDefinition | (StateMachine[_, _, _, ContextAny]) | (InvokeCreator[TContext, TEvent, _])
    ): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcFunction3(
      value: (TContext, TEvent, /* meta */ InvokeMeta) => js.Thenable[_] | (StateMachine[_, js.Any, js.Any, ContextTFinalContext[_]]) | Subscribable[js.Any] | InvokeCallback
    ): Self = StObject.set(x, "src", js.Any.fromFunction3(value))
  }
}
