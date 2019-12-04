package typings.twilioDashSync

import typings.twilioDashSync.libMergingqueueMod.InputReducer
import typings.twilioDashSync.libMergingqueueMod.MergingQueue
import typings.twilioDashSync.libMergingqueueMod.RequestFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-sync/lib/mergingqueue", JSImport.Namespace)
@js.native
object libMergingqueueMod extends js.Object {
  @js.native
  class MergingQueue[InputType, ReturnType] protected () extends js.Object {
    def this(inputMergingFunction: InputReducer[InputType]) = this()
    var inputMergingFunction: js.Any = js.native
    var isRequestInFlight: js.Any = js.native
    var queuedRequests: js.Any = js.native
    var wakeupQueue: js.Any = js.native
    def add(input: InputType, requestFunction: RequestFunction[InputType, ReturnType]): js.Promise[ReturnType] = js.native
    def isEmpty(): Boolean = js.native
    def squashAndAdd(input: InputType, requestFunction: RequestFunction[InputType, ReturnType]): js.Promise[ReturnType] = js.native
  }
  
  @js.native
  class NamespacedMergingQueue[K, InputType, ReturnType] protected () extends js.Object {
    def this(inputReducer: InputReducer[InputType]) = this()
    var inputReducer: js.Any = js.native
    var queueByNamespaceKey: js.Any = js.native
    def add(namespaceKey: K, input: InputType, requestFunction: RequestFunction[InputType, ReturnType]): js.Promise[ReturnType] = js.native
    def invokeQueueMethod(
      namespaceKey: K,
      queueMethodInvoker: js.Function1[/* queue */ MergingQueue[InputType, ReturnType], js.Promise[ReturnType]]
    ): js.Promise[ReturnType] = js.native
    def squashAndAdd(namespaceKey: K, input: InputType, requestFunction: RequestFunction[InputType, ReturnType]): js.Promise[ReturnType] = js.native
  }
  
  @js.native
  trait QueuedRequest[InputType, ReturnType] extends js.Object {
    var input: InputType = js.native
    @JSName("requestFunction")
    var requestFunction_Original: RequestFunction[InputType, ReturnType] = js.native
    def reject(error: js.Any): js.Any = js.native
    def requestFunction(input: InputType): js.Promise[ReturnType] = js.native
    def resolve(result: ReturnType): js.Any = js.native
  }
  
  type InputReducer[InputType] = js.Function2[/* acc */ InputType, /* input */ InputType, InputType]
  type RequestFunction[InputType, ReturnType] = js.Function1[/* input */ InputType, js.Promise[ReturnType]]
}

