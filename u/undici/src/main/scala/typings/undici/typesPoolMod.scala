package typings.undici

import typings.node.urlMod.URL_
import typings.undici.typesPoolMod.Pool.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPoolMod {
  
  @JSImport("undici/types/pool", JSImport.Default)
  @js.native
  open class default protected () extends Pool {
    def this(url: String) = this()
    def this(url: URL_) = this()
    def this(url: String, options: Options) = this()
    def this(url: URL_, options: Options) = this()
  }
  
  @js.native
  trait Pool
    extends typings.undici.typesDispatcherMod.default {
    
    /** `true` after `pool.close()` has been called. */
    var closed: Boolean = js.native
    
    /** `true` after `pool.destroyed()` has been called or `pool.close()` has been called and the pool shutdown has completed. */
    var destroyed: Boolean = js.native
    
    /** Aggregate stats for a Pool. */
    val stats: typings.undici.typesPoolStatsMod.default = js.native
  }
  object Pool {
    
    trait Options
      extends StObject
         with typings.undici.typesClientMod.Client.Options {
      
      /** The max number of clients to create. `null` if no limit. Default `null`. */
      var connections: js.UndefOr[Double | Null] = js.undefined
      
      /** Default: `(origin, opts) => new Client(origin, opts)`. */
      var factory: js.UndefOr[
            js.Function2[/* origin */ URL_, /* opts */ js.Object, typings.undici.typesDispatcherMod.default]
          ] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        inline def setConnections(value: Double): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
        
        inline def setConnectionsNull: Self = StObject.set(x, "connections", null)
        
        inline def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
        
        inline def setFactory(value: (/* origin */ URL_, /* opts */ js.Object) => typings.undici.typesDispatcherMod.default): Self = StObject.set(x, "factory", js.Any.fromFunction2(value))
        
        inline def setFactoryUndefined: Self = StObject.set(x, "factory", js.undefined)
      }
    }
    
    type PoolStats = typings.undici.typesPoolStatsMod.default
  }
}
