package typings.undici.mod

import typings.undici.typesMockAgentMod.MockAgent.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Undici {
  
  /* was `typeof imported_agent.default` */
  type Agent = typings.undici.typesAgentMod.default
  
  /* was `typeof imported_balanced-pool.default` */
  type BalancedPool = typings.undici.typesBalancedPoolMod.default
  
  /* was `typeof imported_client.default` */
  type Client = typings.undici.typesClientMod.default
  
  /* was `typeof imported_handlers.DecoratorHandler` */
  type DecoratorHandler = typings.undici.typesHandlersMod.DecoratorHandler
  
  /** Dispatcher is the core API used to dispatch requests. */
  /* was `typeof imported_dispatcher.default` */
  type Dispatcher = typings.undici.typesDispatcherMod.default
  
  /** A mocked Agent class that implements the Agent API. It allows one to intercept HTTP requests made through undici and return mocked responses instead. */
  /* was `typeof imported_mock-agent.default` */
  type MockAgent[TMockAgentOptions /* <: Options */] = typings.undici.typesMockAgentMod.default[TMockAgentOptions]
  
  /** MockClient extends the Client API and allows one to mock requests. */
  /* was `typeof imported_mock-client.default` */
  type MockClient = typings.undici.typesMockClientMod.default
  
  /** MockPool extends the Pool API and allows one to mock requests. */
  /* was `typeof imported_mock-pool.default` */
  type MockPool = typings.undici.typesMockPoolMod.default
  
  /* was `typeof imported_pool.default` */
  type Pool = typings.undici.typesPoolMod.default
  
  /* was `typeof imported_handlers.RedirectHandler` */
  type RedirectHandler = typings.undici.typesHandlersMod.RedirectHandler
  
  /* was `typeof imported_errors.default` */
  object errors {
    
    type BalancedPoolMissingUpstreamError = typings.undici.typesErrorsMod.default.BalancedPoolMissingUpstreamError
    
    type BodyTimeoutError = typings.undici.typesErrorsMod.default.BodyTimeoutError
    
    type ClientClosedError = typings.undici.typesErrorsMod.default.ClientClosedError
    
    type ClientDestroyedError = typings.undici.typesErrorsMod.default.ClientDestroyedError
    
    type ConnectTimeoutError = typings.undici.typesErrorsMod.default.ConnectTimeoutError
    
    type HTTPParserError = typings.undici.typesErrorsMod.default.HTTPParserError
    
    type HeadersOverflowError = typings.undici.typesErrorsMod.default.HeadersOverflowError
    
    type HeadersTimeoutError = typings.undici.typesErrorsMod.default.HeadersTimeoutError
    
    type InformationalError = typings.undici.typesErrorsMod.default.InformationalError
    
    type InvalidArgumentError = typings.undici.typesErrorsMod.default.InvalidArgumentError
    
    type InvalidReturnValueError = typings.undici.typesErrorsMod.default.InvalidReturnValueError
    
    type NotSupportedError = typings.undici.typesErrorsMod.default.NotSupportedError
    
    type RequestAbortedError = typings.undici.typesErrorsMod.default.RequestAbortedError
    
    type RequestContentLengthMismatchError = typings.undici.typesErrorsMod.default.RequestContentLengthMismatchError
    
    type ResponseContentLengthMismatchError = typings.undici.typesErrorsMod.default.ResponseContentLengthMismatchError
    
    type ResponseExceededMaxSizeError = typings.undici.typesErrorsMod.default.ResponseExceededMaxSizeError
    
    type ResponseStatusCodeError = typings.undici.typesErrorsMod.default.ResponseStatusCodeError
    
    type SocketError = typings.undici.typesErrorsMod.default.SocketError
    
    type UndiciError = typings.undici.typesErrorsMod.default.UndiciError
  }
  
  /* was `typeof imported_mock-errors.default` */
  object mockErrors {
    
    type MockNotMatchedError = typings.undici.typesMockErrorsMod.default.MockNotMatchedError
  }
}
