package typings.undici.mod

import typings.undici.typesMockAgentMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Undici {
  
  /* was `typeof imported_agent` */
  type Agent = typings.undici.typesAgentMod.^
  
  /* was `typeof imported_balanced-pool` */
  type BalancedPool = typings.undici.typesBalancedPoolMod.^
  
  /** A basic HTTP/1.1 client, mapped on top a single TCP/TLS connection. Pipelining is disabled by default. */
  /* was `typeof imported_client` */
  type Client = typings.undici.typesClientMod.^
  
  /* was `typeof imported_handlers.DecoratorHandler` */
  type DecoratorHandler = typings.undici.typesHandlersMod.DecoratorHandler
  
  /** Dispatcher is the core API used to dispatch requests. */
  /* was `typeof imported_dispatcher` */
  type Dispatcher = typings.undici.typesDispatcherMod.^
  
  /** A mocked Agent class that implements the Agent API. It allows one to intercept HTTP requests made through undici and return mocked responses instead. */
  /* was `typeof imported_mock-agent` */
  type MockAgent[TMockAgentOptions /* <: Options */] = typings.undici.typesMockAgentMod.^[TMockAgentOptions]
  
  /** MockClient extends the Client API and allows one to mock requests. */
  /* was `typeof imported_mock-client` */
  type MockClient = typings.undici.typesMockClientMod.^
  
  /** MockPool extends the Pool API and allows one to mock requests. */
  /* was `typeof imported_mock-pool` */
  type MockPool = typings.undici.typesMockPoolMod.^
  
  /* was `typeof imported_pool` */
  type Pool = typings.undici.typesPoolMod.^
  
  /* was `typeof imported_handlers.RedirectHandler` */
  type RedirectHandler = typings.undici.typesHandlersMod.RedirectHandler
  
  /* was `typeof imported_errors` */
  object errors {
    
    type BodyTimeoutError = typings.undici.typesErrorsMod.BodyTimeoutError
    
    type ClientClosedError = typings.undici.typesErrorsMod.ClientClosedError
    
    type ClientDestroyedError = typings.undici.typesErrorsMod.ClientDestroyedError
    
    type HeadersTimeoutError = typings.undici.typesErrorsMod.HeadersTimeoutError
    
    type InformationalError = typings.undici.typesErrorsMod.InformationalError
    
    type InvalidArgumentError = typings.undici.typesErrorsMod.InvalidArgumentError
    
    type InvalidReturnError = typings.undici.typesErrorsMod.InvalidReturnError
    
    type NotSupportedError = typings.undici.typesErrorsMod.NotSupportedError
    
    type RequestAbortedError = typings.undici.typesErrorsMod.RequestAbortedError
    
    type RequestContentLengthMismatchError = typings.undici.typesErrorsMod.RequestContentLengthMismatchError
    
    type ResponseStatusCodeError = typings.undici.typesErrorsMod.ResponseStatusCodeError
    
    type SocketError = typings.undici.typesErrorsMod.SocketError
    
    type SocketTimeoutError = typings.undici.typesErrorsMod.SocketTimeoutError
    
    type UndiciError = typings.undici.typesErrorsMod.UndiciError
  }
  
  /* was `typeof imported_mock-errors` */
  object mockErrors {
    
    type MockNotMatchedError = typings.undici.typesMockErrorsMod.MockNotMatchedError
  }
}
