package typings.turistFetch

import typings.node.httpMod.Agent
import typings.nodeFetch.mod.Request
import typings.nodeFetch.mod.RequestInit
import typings.nodeFetch.mod.Response
import typings.turistFetch.fetchRetryErrorMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type AgentOptions = typings.node.httpMod.AgentOptions
  
  type Fetch = js.Function2[
    /* url */ String | Request, 
    /* options */ js.UndefOr[FetchOptions], 
    js.Promise[Response]
  ]
  
  @js.native
  trait FetchOptions extends RequestInit {
    
    @JSName("agent")
    var agent_FetchOptions: js.UndefOr[Agent] = js.native
    
    @JSName("body")
    var body_FetchOptions: js.UndefOr[js.Any] = js.native
    
    var onRedirect: js.UndefOr[js.Function2[/* res */ Response, /* redirectOpts */ this.type, Unit]] = js.native
    
    var onRetry: js.UndefOr[js.Function2[/* error */ default, /* opts */ this.type, Unit]] = js.native
    
    var retry: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RetryOptions */ js.Any
      ] = js.native
  }
  object FetchOptions {
    
    @scala.inline
    def apply(): FetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FetchOptions]
    }
    
    @scala.inline
    implicit class FetchOptionsMutableBuilder[Self <: FetchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setOnRedirect(value: (/* res */ Response, FetchOptions) => Unit): Self = StObject.set(x, "onRedirect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRedirectUndefined: Self = StObject.set(x, "onRedirect", js.undefined)
      
      @scala.inline
      def setOnRetry(value: (/* error */ default, FetchOptions) => Unit): Self = StObject.set(x, "onRetry", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRetryUndefined: Self = StObject.set(x, "onRetry", js.undefined)
      
      @scala.inline
      def setRetry(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RetryOptions */ js.Any
      ): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    }
  }
}
