package typings.twilioSync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergingqueueMod {
  
  @JSImport("twilio-sync/lib/mergingqueue", "MergingQueue")
  @js.native
  class MergingQueue[InputType, ReturnType] protected () extends StObject {
    def this(inputMergingFunction: InputReducer[InputType]) = this()
    
    def add(input: InputType, requestFunction: RequestFunction[InputType, ReturnType]): js.Promise[ReturnType] = js.native
    
    var inputMergingFunction: js.Any = js.native
    
    def isEmpty(): Boolean = js.native
    
    var isRequestInFlight: js.Any = js.native
    
    var queuedRequests: js.Any = js.native
    
    def squashAndAdd(input: InputType, requestFunction: RequestFunction[InputType, ReturnType]): js.Promise[ReturnType] = js.native
    
    var wakeupQueue: js.Any = js.native
  }
  
  @JSImport("twilio-sync/lib/mergingqueue", "NamespacedMergingQueue")
  @js.native
  class NamespacedMergingQueue[K, InputType, ReturnType] protected () extends StObject {
    def this(inputReducer: InputReducer[InputType]) = this()
    
    def add(namespaceKey: K, input: InputType, requestFunction: RequestFunction[InputType, ReturnType]): js.Promise[ReturnType] = js.native
    
    var inputReducer: js.Any = js.native
    
    def invokeQueueMethod(
      namespaceKey: K,
      queueMethodInvoker: js.Function1[/* queue */ MergingQueue[InputType, ReturnType], js.Promise[ReturnType]]
    ): js.Promise[ReturnType] = js.native
    
    var queueByNamespaceKey: js.Any = js.native
    
    def squashAndAdd(namespaceKey: K, input: InputType, requestFunction: RequestFunction[InputType, ReturnType]): js.Promise[ReturnType] = js.native
  }
  
  type InputReducer[InputType] = js.Function2[/* acc */ InputType, /* input */ InputType, InputType]
  
  trait QueuedRequest[InputType, ReturnType] extends StObject {
    
    var input: InputType
    
    def reject(error: js.Any): js.Any
    
    def requestFunction(input: InputType): js.Promise[ReturnType]
    @JSName("requestFunction")
    var requestFunction_Original: RequestFunction[InputType, ReturnType]
    
    def resolve(result: ReturnType): js.Any
  }
  object QueuedRequest {
    
    @scala.inline
    def apply[InputType, ReturnType](
      input: InputType,
      reject: js.Any => js.Any,
      requestFunction: InputType => js.Promise[ReturnType],
      resolve: ReturnType => js.Any
    ): QueuedRequest[InputType, ReturnType] = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], reject = js.Any.fromFunction1(reject), requestFunction = js.Any.fromFunction1(requestFunction), resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[QueuedRequest[InputType, ReturnType]]
    }
    
    @scala.inline
    implicit class QueuedRequestMutableBuilder[Self <: QueuedRequest[?, ?], InputType, ReturnType] (val x: Self & (QueuedRequest[InputType, ReturnType])) extends AnyVal {
      
      @scala.inline
      def setInput(value: InputType): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReject(value: js.Any => js.Any): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRequestFunction(value: InputType => js.Promise[ReturnType]): Self = StObject.set(x, "requestFunction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResolve(value: ReturnType => js.Any): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
  
  type RequestFunction[InputType, ReturnType] = js.Function1[/* input */ InputType, js.Promise[ReturnType]]
}
