package typings.undici

import typings.undici.typesAgentMod.DispatchOptions
import typings.undici.typesDispatcherMod.DispatchHandlers
import typings.undici.typesMockInterceptorMod.Interceptable
import typings.undici.typesMockInterceptorMod.MockInterceptor.MockDispatch
import typings.undici.typesMockInterceptorMod.MockInterceptor.MockDispatchData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMockAgentMod {
  
  /** A mocked Agent class that implements the Agent API. It allows one to intercept HTTP requests made through undici and return mocked responses instead. */
  @JSImport("undici/types/mock-agent", JSImport.Namespace)
  @js.native
  open class ^[TMockAgentOptions /* <: Options */] () extends MockAgent[TMockAgentOptions] {
    def this(options: Options) = this()
  }
  
  /** A mocked Agent class that implements the Agent API. It allows one to intercept HTTP requests made through undici and return mocked responses instead. */
  @js.native
  trait MockAgent[TMockAgentOptions /* <: Options */]
    extends typings.undici.typesDispatcherMod.^ {
    
    /** Enables mocking in a MockAgent instance. When instantiated, a MockAgent is automatically activated. Therefore, this method is only effective after `MockAgent.deactivate` has been called. */
    def activate(): Unit = js.native
    
    def assertNoPendingInterceptors(): Unit = js.native
    def assertNoPendingInterceptors(options: typings.undici.anon.PendingInterceptorsFormatter): Unit = js.native
    
    /** Disables mocking in MockAgent. */
    def deactivate(): Unit = js.native
    
    /** Causes all requests to throw when requests are not matched in a MockAgent intercept. */
    def disableNetConnect(): Unit = js.native
    
    /** Dispatches a mocked request. */
    def dispatch(options: DispatchOptions, handler: DispatchHandlers): Boolean = js.native
    
    /** Define host matchers so only matching requests that aren't intercepted by the mock dispatchers will be attempted. */
    def enableNetConnect(): Unit = js.native
    def enableNetConnect(host: String): Unit = js.native
    def enableNetConnect(host: js.Function1[/* host */ String, Boolean]): Unit = js.native
    def enableNetConnect(host: js.RegExp): Unit = js.native
    
    /** Creates and retrieves mock Dispatcher instances which can then be used to intercept HTTP requests. If the number of connections on the mock agent is set to 1, a MockClient instance is returned. Otherwise a MockPool instance is returned. */
    def get[TInterceptable /* <: Interceptable */](origin: String): TInterceptable = js.native
    def get[TInterceptable /* <: Interceptable */](origin: js.Function1[/* origin */ String, Boolean]): TInterceptable = js.native
    def get[TInterceptable /* <: Interceptable */](origin: js.RegExp): TInterceptable = js.native
    
    def pendingInterceptors(): js.Array[PendingInterceptor] = js.native
  }
  
  trait Options
    extends StObject
       with typings.undici.typesAgentMod.Options {
    
    /** A custom agent to be encapsulated by the MockAgent. */
    var agent: js.UndefOr[typings.undici.typesAgentMod.^] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAgent(value: typings.undici.typesAgentMod.^): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
    }
  }
  
  trait PendingInterceptor
    extends StObject
       with MockDispatch[js.Object, js.Error] {
    
    var origin: String
  }
  object PendingInterceptor {
    
    inline def apply(
      consumed: Boolean,
      data: MockDispatchData[js.Object, js.Error],
      origin: String,
      path: String | js.RegExp | (js.Function1[/* path */ String, Boolean]),
      persist: Boolean
    ): PendingInterceptor = {
      val __obj = js.Dynamic.literal(consumed = consumed.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], persist = persist.asInstanceOf[js.Any], times = null)
      __obj.asInstanceOf[PendingInterceptor]
    }
    
    extension [Self <: PendingInterceptor](x: Self) {
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    }
  }
  
  trait PendingInterceptorsFormatter extends StObject {
    
    def format(pendingInterceptors: js.Array[PendingInterceptor]): String
  }
  object PendingInterceptorsFormatter {
    
    inline def apply(format: js.Array[PendingInterceptor] => String): PendingInterceptorsFormatter = {
      val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format))
      __obj.asInstanceOf[PendingInterceptorsFormatter]
    }
    
    extension [Self <: PendingInterceptorsFormatter](x: Self) {
      
      inline def setFormat(value: js.Array[PendingInterceptor] => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    }
  }
}
