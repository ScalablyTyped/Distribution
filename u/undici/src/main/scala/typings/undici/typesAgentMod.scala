package typings.undici

import typings.undici.typesAgentMod.Agent.DispatchOptions
import typings.undici.typesAgentMod.Agent.Options
import typings.undici.typesDispatcherMod.Dispatcher.DispatchHandlers
import typings.undici.typesDispatcherMod.Dispatcher.HttpMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAgentMod {
  
  @JSImport("undici/types/agent", JSImport.Default)
  @js.native
  open class default () extends Agent {
    def this(opts: Options) = this()
  }
  
  @js.native
  trait Agent
    extends typings.undici.typesDispatcherMod.default {
    
    /** `true` after `dispatcher.close()` has been called. */
    var closed: Boolean = js.native
    
    /** `true` after `dispatcher.destroyed()` has been called or `dispatcher.close()` has been called and the dispatcher shutdown has completed. */
    var destroyed: Boolean = js.native
    
    /** Dispatches a request. */
    def dispatch(options: DispatchOptions, handler: DispatchHandlers): Boolean = js.native
  }
  object Agent {
    
    trait DispatchOptions
      extends StObject
         with typings.undici.typesDispatcherMod.Dispatcher.DispatchOptions {
      
      /** Integer. */
      var maxRedirections: js.UndefOr[Double] = js.undefined
    }
    object DispatchOptions {
      
      inline def apply(method: HttpMethod, path: String): DispatchOptions = {
        val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
        __obj.asInstanceOf[DispatchOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: DispatchOptions] (val x: Self) extends AnyVal {
        
        inline def setMaxRedirections(value: Double): Self = StObject.set(x, "maxRedirections", value.asInstanceOf[js.Any])
        
        inline def setMaxRedirectionsUndefined: Self = StObject.set(x, "maxRedirections", js.undefined)
      }
    }
    
    trait Options
      extends StObject
         with typings.undici.typesPoolMod.Pool.Options
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
    }
  }
}
