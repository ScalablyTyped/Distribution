package typings.xstate.typesMod

import typings.xstate.anon.ContextAny
import typings.xstate.anon.ContextTFinalContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvokeConfig[TContext, TEvent /* <: EventObject */] extends StObject {
  
  /**
    * If `true`, events sent to the parent service will be forwarded to the invoked service.
    *
    * Default: `false`
    */
  var autoForward: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Data from the parent machine's context to set as the (partial or full) context
    * for the invoked child machine.
    *
    * Data should be mapped to match the child machine's context shape.
    */
  var data: js.UndefOr[(Mapper[TContext, TEvent, js.Any]) | (PropertyMapper[TContext, TEvent, js.Any])] = js.undefined
  
  /**
    * @deprecated
    *
    *  Use `autoForward` property instead of `forward`. Support for `forward` will get removed in the future.
    */
  var forward: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The unique identifier for the invoked machine. If not specified, this
    * will be the machine's own `id`, or the URL (from `src`).
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The transition to take upon the invoked child machine reaching its final top-level state.
    */
  var onDone: js.UndefOr[String | (SingleOrArray[TransitionConfig[TContext, DoneInvokeEvent[js.Any]]])] = js.undefined
  
  /**
    * The transition to take upon the invoked child machine sending an error event.
    */
  var onError: js.UndefOr[String | (SingleOrArray[TransitionConfig[TContext, DoneInvokeEvent[js.Any]]])] = js.undefined
  
  /**
    * The source of the machine to be invoked, or the machine itself.
    */
  var src: String | InvokeSourceDefinition | (StateMachine[js.Any, js.Any, js.Any, ContextAny]) | (InvokeCreator[TContext, TEvent, js.Any])
}
object InvokeConfig {
  
  inline def apply[TContext, TEvent /* <: EventObject */](
    src: String | InvokeSourceDefinition | (StateMachine[js.Any, js.Any, js.Any, ContextAny]) | (InvokeCreator[TContext, TEvent, js.Any])
  ): InvokeConfig[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeConfig[TContext, TEvent]]
  }
  
  extension [Self <: InvokeConfig[?, ?], TContext, TEvent /* <: EventObject */](x: Self & (InvokeConfig[TContext, TEvent])) {
    
    inline def setAutoForward(value: Boolean): Self = StObject.set(x, "autoForward", value.asInstanceOf[js.Any])
    
    inline def setAutoForwardUndefined: Self = StObject.set(x, "autoForward", js.undefined)
    
    inline def setData(value: (Mapper[TContext, TEvent, js.Any]) | (PropertyMapper[TContext, TEvent, js.Any])): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataFunction2(value: (TContext, TEvent) => js.Any): Self = StObject.set(x, "data", js.Any.fromFunction2(value))
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setForward(value: Boolean): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
    
    inline def setForwardUndefined: Self = StObject.set(x, "forward", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOnDone(value: String | (SingleOrArray[TransitionConfig[TContext, DoneInvokeEvent[js.Any]]])): Self = StObject.set(x, "onDone", value.asInstanceOf[js.Any])
    
    inline def setOnDoneUndefined: Self = StObject.set(x, "onDone", js.undefined)
    
    inline def setOnDoneVarargs(value: (TransitionConfig[TContext, DoneInvokeEvent[js.Any]])*): Self = StObject.set(x, "onDone", js.Array(value :_*))
    
    inline def setOnError(value: String | (SingleOrArray[TransitionConfig[TContext, DoneInvokeEvent[js.Any]]])): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnErrorVarargs(value: (TransitionConfig[TContext, DoneInvokeEvent[js.Any]])*): Self = StObject.set(x, "onError", js.Array(value :_*))
    
    inline def setSrc(
      value: String | InvokeSourceDefinition | (StateMachine[js.Any, js.Any, js.Any, ContextAny]) | (InvokeCreator[TContext, TEvent, js.Any])
    ): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcFunction3(
      value: (TContext, TEvent, /* meta */ InvokeMeta) => js.Thenable[js.Any] | (StateMachine[js.Any, js.Any, js.Any, ContextTFinalContext[js.Any]]) | Subscribable[js.Any] | InvokeCallback
    ): Self = StObject.set(x, "src", js.Any.fromFunction3(value))
  }
}
