package typings.twilioSync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait QueuedRequest[InputType, ReturnType] extends StObject {
    
    var input: InputType = js.native
    
    def reject(error: js.Any): js.Any = js.native
    
    def requestFunction(input: InputType): js.Promise[ReturnType] = js.native
    @JSName("requestFunction")
    var requestFunction_Original: RequestFunction[InputType, ReturnType] = js.native
    
    def resolve(result: ReturnType): js.Any = js.native
  }
  
  type RequestFunction[InputType, ReturnType] = js.Function1[/* input */ InputType, js.Promise[ReturnType]]
}
