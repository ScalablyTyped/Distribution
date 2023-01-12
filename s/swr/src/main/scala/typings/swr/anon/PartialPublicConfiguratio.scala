package typings.swr.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.Required
import typings.swr.distTypesMod.BareFetcher
import typings.swr.distTypesMod.Cache
import typings.swr.distTypesMod.Middleware
import typings.swr.distTypesMod.PublicConfiguration
import typings.swr.distTypesMod.Revalidator
import typings.swr.distTypesMod.RevalidatorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<swr.swr/dist/types.PublicConfiguration<any, any, swr.swr/dist/types.BareFetcher<any>>> & std.Partial<swr.swr/dist/types.ProviderConfiguration> & {  provider :(cache : std.Readonly<swr.swr/dist/types.Cache<any>>): swr.swr/dist/types.Cache<any> | undefined} */
trait PartialPublicConfiguratio extends StObject {
  
  var compare: js.UndefOr[js.Function2[/* a */ js.UndefOr[Any], /* b */ js.UndefOr[Any], Boolean]] = js.undefined
  
  var dedupingInterval: js.UndefOr[Double] = js.undefined
  
  var errorRetryCount: js.UndefOr[Double] = js.undefined
  
  var errorRetryInterval: js.UndefOr[Double] = js.undefined
  
  var fallback: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var fallbackData: js.UndefOr[Any] = js.undefined
  
  var fetcher: js.UndefOr[BareFetcher[Any]] = js.undefined
  
  var focusThrottleInterval: js.UndefOr[Double] = js.undefined
  
  var initFocus: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], js.Function0[Unit] | Unit]] = js.undefined
  
  var initReconnect: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], js.Function0[Unit] | Unit]] = js.undefined
  
  var isOnline: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  var isPaused: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  var isVisible: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  var loadingTimeout: js.UndefOr[Double] = js.undefined
  
  var onDiscarded: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.undefined
  
  var onError: js.UndefOr[
    js.Function3[
      /* err */ Any, 
      /* key */ String, 
      /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]], 
      Unit
    ]
  ] = js.undefined
  
  var onErrorRetry: js.UndefOr[
    js.Function5[
      /* err */ Any, 
      /* key */ String, 
      /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]], 
      /* revalidate */ Revalidator, 
      /* revalidateOpts */ Required[RevalidatorOptions], 
      Unit
    ]
  ] = js.undefined
  
  var onLoadingSlow: js.UndefOr[
    js.Function2[/* key */ String, /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]], Unit]
  ] = js.undefined
  
  var onSuccess: js.UndefOr[
    js.Function3[
      /* data */ Any, 
      /* key */ String, 
      /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]], 
      Unit
    ]
  ] = js.undefined
  
  var provider: js.UndefOr[js.Function1[/* cache */ Cache[Any], Cache[Any]]] = js.undefined
  
  var refreshInterval: js.UndefOr[Double | (js.Function1[/* latestData */ js.UndefOr[Any], Double])] = js.undefined
  
  var refreshWhenHidden: js.UndefOr[Boolean] = js.undefined
  
  var refreshWhenOffline: js.UndefOr[Boolean] = js.undefined
  
  var revalidateIfStale: js.UndefOr[Boolean] = js.undefined
  
  var revalidateOnFocus: js.UndefOr[Boolean] = js.undefined
  
  var revalidateOnMount: js.UndefOr[Boolean] = js.undefined
  
  var revalidateOnReconnect: js.UndefOr[Boolean] = js.undefined
  
  var shouldRetryOnError: js.UndefOr[Boolean | (js.Function1[/* err */ Any, Boolean])] = js.undefined
  
  var suspense: js.UndefOr[Boolean] = js.undefined
  
  var use: js.UndefOr[js.Array[Middleware]] = js.undefined
}
object PartialPublicConfiguratio {
  
  inline def apply(): PartialPublicConfiguratio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPublicConfiguratio]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialPublicConfiguratio] (val x: Self) extends AnyVal {
    
    inline def setCompare(value: (/* a */ js.UndefOr[Any], /* b */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
    
    inline def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
    
    inline def setDedupingInterval(value: Double): Self = StObject.set(x, "dedupingInterval", value.asInstanceOf[js.Any])
    
    inline def setDedupingIntervalUndefined: Self = StObject.set(x, "dedupingInterval", js.undefined)
    
    inline def setErrorRetryCount(value: Double): Self = StObject.set(x, "errorRetryCount", value.asInstanceOf[js.Any])
    
    inline def setErrorRetryCountUndefined: Self = StObject.set(x, "errorRetryCount", js.undefined)
    
    inline def setErrorRetryInterval(value: Double): Self = StObject.set(x, "errorRetryInterval", value.asInstanceOf[js.Any])
    
    inline def setErrorRetryIntervalUndefined: Self = StObject.set(x, "errorRetryInterval", js.undefined)
    
    inline def setFallback(value: StringDictionary[Any]): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setFallbackData(value: Any): Self = StObject.set(x, "fallbackData", value.asInstanceOf[js.Any])
    
    inline def setFallbackDataUndefined: Self = StObject.set(x, "fallbackData", js.undefined)
    
    inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    inline def setFetcher(value: BareFetcher[Any]): Self = StObject.set(x, "fetcher", value.asInstanceOf[js.Any])
    
    inline def setFetcherUndefined: Self = StObject.set(x, "fetcher", js.undefined)
    
    inline def setFocusThrottleInterval(value: Double): Self = StObject.set(x, "focusThrottleInterval", value.asInstanceOf[js.Any])
    
    inline def setFocusThrottleIntervalUndefined: Self = StObject.set(x, "focusThrottleInterval", js.undefined)
    
    inline def setInitFocus(value: /* callback */ js.Function0[Unit] => js.Function0[Unit] | Unit): Self = StObject.set(x, "initFocus", js.Any.fromFunction1(value))
    
    inline def setInitFocusUndefined: Self = StObject.set(x, "initFocus", js.undefined)
    
    inline def setInitReconnect(value: /* callback */ js.Function0[Unit] => js.Function0[Unit] | Unit): Self = StObject.set(x, "initReconnect", js.Any.fromFunction1(value))
    
    inline def setInitReconnectUndefined: Self = StObject.set(x, "initReconnect", js.undefined)
    
    inline def setIsOnline(value: () => Boolean): Self = StObject.set(x, "isOnline", js.Any.fromFunction0(value))
    
    inline def setIsOnlineUndefined: Self = StObject.set(x, "isOnline", js.undefined)
    
    inline def setIsPaused(value: () => Boolean): Self = StObject.set(x, "isPaused", js.Any.fromFunction0(value))
    
    inline def setIsPausedUndefined: Self = StObject.set(x, "isPaused", js.undefined)
    
    inline def setIsVisible(value: () => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
    
    inline def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
    
    inline def setLoadingTimeout(value: Double): Self = StObject.set(x, "loadingTimeout", value.asInstanceOf[js.Any])
    
    inline def setLoadingTimeoutUndefined: Self = StObject.set(x, "loadingTimeout", js.undefined)
    
    inline def setOnDiscarded(value: /* key */ String => Unit): Self = StObject.set(x, "onDiscarded", js.Any.fromFunction1(value))
    
    inline def setOnDiscardedUndefined: Self = StObject.set(x, "onDiscarded", js.undefined)
    
    inline def setOnError(
      value: (/* err */ Any, /* key */ String, /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]]) => Unit
    ): Self = StObject.set(x, "onError", js.Any.fromFunction3(value))
    
    inline def setOnErrorRetry(
      value: (/* err */ Any, /* key */ String, /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]], /* revalidate */ Revalidator, /* revalidateOpts */ Required[RevalidatorOptions]) => Unit
    ): Self = StObject.set(x, "onErrorRetry", js.Any.fromFunction5(value))
    
    inline def setOnErrorRetryUndefined: Self = StObject.set(x, "onErrorRetry", js.undefined)
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnLoadingSlow(value: (/* key */ String, /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]]) => Unit): Self = StObject.set(x, "onLoadingSlow", js.Any.fromFunction2(value))
    
    inline def setOnLoadingSlowUndefined: Self = StObject.set(x, "onLoadingSlow", js.undefined)
    
    inline def setOnSuccess(
      value: (/* data */ Any, /* key */ String, /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]]) => Unit
    ): Self = StObject.set(x, "onSuccess", js.Any.fromFunction3(value))
    
    inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
    
    inline def setProvider(value: /* cache */ Cache[Any] => Cache[Any]): Self = StObject.set(x, "provider", js.Any.fromFunction1(value))
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setRefreshInterval(value: Double | (js.Function1[/* latestData */ js.UndefOr[Any], Double])): Self = StObject.set(x, "refreshInterval", value.asInstanceOf[js.Any])
    
    inline def setRefreshIntervalFunction1(value: /* latestData */ js.UndefOr[Any] => Double): Self = StObject.set(x, "refreshInterval", js.Any.fromFunction1(value))
    
    inline def setRefreshIntervalUndefined: Self = StObject.set(x, "refreshInterval", js.undefined)
    
    inline def setRefreshWhenHidden(value: Boolean): Self = StObject.set(x, "refreshWhenHidden", value.asInstanceOf[js.Any])
    
    inline def setRefreshWhenHiddenUndefined: Self = StObject.set(x, "refreshWhenHidden", js.undefined)
    
    inline def setRefreshWhenOffline(value: Boolean): Self = StObject.set(x, "refreshWhenOffline", value.asInstanceOf[js.Any])
    
    inline def setRefreshWhenOfflineUndefined: Self = StObject.set(x, "refreshWhenOffline", js.undefined)
    
    inline def setRevalidateIfStale(value: Boolean): Self = StObject.set(x, "revalidateIfStale", value.asInstanceOf[js.Any])
    
    inline def setRevalidateIfStaleUndefined: Self = StObject.set(x, "revalidateIfStale", js.undefined)
    
    inline def setRevalidateOnFocus(value: Boolean): Self = StObject.set(x, "revalidateOnFocus", value.asInstanceOf[js.Any])
    
    inline def setRevalidateOnFocusUndefined: Self = StObject.set(x, "revalidateOnFocus", js.undefined)
    
    inline def setRevalidateOnMount(value: Boolean): Self = StObject.set(x, "revalidateOnMount", value.asInstanceOf[js.Any])
    
    inline def setRevalidateOnMountUndefined: Self = StObject.set(x, "revalidateOnMount", js.undefined)
    
    inline def setRevalidateOnReconnect(value: Boolean): Self = StObject.set(x, "revalidateOnReconnect", value.asInstanceOf[js.Any])
    
    inline def setRevalidateOnReconnectUndefined: Self = StObject.set(x, "revalidateOnReconnect", js.undefined)
    
    inline def setShouldRetryOnError(value: Boolean | (js.Function1[/* err */ Any, Boolean])): Self = StObject.set(x, "shouldRetryOnError", value.asInstanceOf[js.Any])
    
    inline def setShouldRetryOnErrorFunction1(value: /* err */ Any => Boolean): Self = StObject.set(x, "shouldRetryOnError", js.Any.fromFunction1(value))
    
    inline def setShouldRetryOnErrorUndefined: Self = StObject.set(x, "shouldRetryOnError", js.undefined)
    
    inline def setSuspense(value: Boolean): Self = StObject.set(x, "suspense", value.asInstanceOf[js.Any])
    
    inline def setSuspenseUndefined: Self = StObject.set(x, "suspense", js.undefined)
    
    inline def setUse(value: js.Array[Middleware]): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    
    inline def setUseVarargs(value: Middleware*): Self = StObject.set(x, "use", js.Array(value*))
  }
}
