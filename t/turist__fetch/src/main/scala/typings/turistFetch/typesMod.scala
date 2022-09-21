package typings.turistFetch

import typings.node.httpMod.Agent
import typings.nodeFetch.mod.Request
import typings.nodeFetch.mod.RequestInit
import typings.nodeFetch.mod.Response
import typings.turistFetch.fetchRetryErrorMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type AgentOptions = typings.node.httpMod.AgentOptions
  
  type Fetch = js.Function2[
    /* url */ String | Request, 
    /* options */ js.UndefOr[FetchOptions], 
    js.Promise[Response]
  ]
  
  trait FetchOptions
    extends StObject
       with RequestInit {
    
    @JSName("agent")
    var agent_FetchOptions: js.UndefOr[Agent] = js.undefined
    
    @JSName("body")
    var body_FetchOptions: js.UndefOr[Any] = js.undefined
    
    var onRedirect: js.UndefOr[js.Function2[/* res */ Response, /* redirectOpts */ this.type, Unit]] = js.undefined
    
    var onRetry: js.UndefOr[js.Function2[/* error */ default, /* opts */ this.type, Unit]] = js.undefined
    
    var retry: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RetryOptions */ Any
      ] = js.undefined
  }
  object FetchOptions {
    
    inline def apply(): FetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FetchOptions]
    }
    
    extension [Self <: FetchOptions](x: Self) {
      
      inline def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setOnRedirect(value: (/* res */ Response, FetchOptions) => Unit): Self = StObject.set(x, "onRedirect", js.Any.fromFunction2(value))
      
      inline def setOnRedirectUndefined: Self = StObject.set(x, "onRedirect", js.undefined)
      
      inline def setOnRetry(value: (/* error */ default, FetchOptions) => Unit): Self = StObject.set(x, "onRetry", js.Any.fromFunction2(value))
      
      inline def setOnRetryUndefined: Self = StObject.set(x, "onRetry", js.undefined)
      
      inline def setRetry(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RetryOptions */ Any
      ): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    }
  }
}
