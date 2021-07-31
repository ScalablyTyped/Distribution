package typings.turistFetch

import typings.std.RegExp
import typings.turistFetch.anon.Typeofdns
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dnsResolveMod {
  
  @JSImport("@turist/fetch/dist/dns-resolve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(host: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(host.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def default(host: String, options: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(host.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @JSImport("@turist/fetch/dist/dns-resolve", "localhostRegex")
  @js.native
  val localhostRegex: RegExp = js.native
  
  @scala.inline
  def setupCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setupCache")().asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    var ipv6: js.UndefOr[Boolean] = js.undefined
    
    var minimumCacheTime: js.UndefOr[Double] = js.undefined
    
    var refreshCache: js.UndefOr[Boolean] = js.undefined
    
    var resolver: js.UndefOr[Typeofdns] = js.undefined
    
    var retryOpts: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RetryOptions */ js.Any
      ] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIpv6(value: Boolean): Self = StObject.set(x, "ipv6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6Undefined: Self = StObject.set(x, "ipv6", js.undefined)
      
      @scala.inline
      def setMinimumCacheTime(value: Double): Self = StObject.set(x, "minimumCacheTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumCacheTimeUndefined: Self = StObject.set(x, "minimumCacheTime", js.undefined)
      
      @scala.inline
      def setRefreshCache(value: Boolean): Self = StObject.set(x, "refreshCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshCacheUndefined: Self = StObject.set(x, "refreshCache", js.undefined)
      
      @scala.inline
      def setResolver(value: Typeofdns): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolverUndefined: Self = StObject.set(x, "resolver", js.undefined)
      
      @scala.inline
      def setRetryOpts(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RetryOptions */ js.Any
      ): Self = StObject.set(x, "retryOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryOptsUndefined: Self = StObject.set(x, "retryOpts", js.undefined)
    }
  }
}
