package typings.turistFetch

import typings.turistFetch.anon.Typeofdns
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDnsResolveMod {
  
  @JSImport("@turist/fetch/dist/dns-resolve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(host: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(host.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def default(host: String, options: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(host.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @JSImport("@turist/fetch/dist/dns-resolve", "localhostRegex")
  @js.native
  val localhostRegex: js.RegExp = js.native
  
  inline def setupCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setupCache")().asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    var ipv6: js.UndefOr[Boolean] = js.undefined
    
    var minimumCacheTime: js.UndefOr[Double] = js.undefined
    
    var refreshCache: js.UndefOr[Boolean] = js.undefined
    
    var resolver: js.UndefOr[Typeofdns] = js.undefined
    
    var retryOpts: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RetryOptions */ Any
      ] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setIpv6(value: Boolean): Self = StObject.set(x, "ipv6", value.asInstanceOf[js.Any])
      
      inline def setIpv6Undefined: Self = StObject.set(x, "ipv6", js.undefined)
      
      inline def setMinimumCacheTime(value: Double): Self = StObject.set(x, "minimumCacheTime", value.asInstanceOf[js.Any])
      
      inline def setMinimumCacheTimeUndefined: Self = StObject.set(x, "minimumCacheTime", js.undefined)
      
      inline def setRefreshCache(value: Boolean): Self = StObject.set(x, "refreshCache", value.asInstanceOf[js.Any])
      
      inline def setRefreshCacheUndefined: Self = StObject.set(x, "refreshCache", js.undefined)
      
      inline def setResolver(value: Typeofdns): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
      
      inline def setResolverUndefined: Self = StObject.set(x, "resolver", js.undefined)
      
      inline def setRetryOpts(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RetryOptions */ Any
      ): Self = StObject.set(x, "retryOpts", value.asInstanceOf[js.Any])
      
      inline def setRetryOptsUndefined: Self = StObject.set(x, "retryOpts", js.undefined)
    }
  }
}
