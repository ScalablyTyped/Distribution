package typings.swr.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.Required
import typings.swr.distTypesMod.BareFetcher
import typings.swr.distTypesMod.Middleware
import typings.swr.distTypesMod.PublicConfiguration
import typings.swr.distTypesMod.Revalidator
import typings.swr.distTypesMod.RevalidatorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<swr.swr/dist/types.PublicConfiguration<any, any, swr.swr/dist/types.BareFetcher<any>>> */
trait ReadonlyPublicConfiguratiCompare extends StObject {
  
  val compare: js.Function2[/* a */ js.UndefOr[Any], /* b */ js.UndefOr[Any], Boolean]
  
  val dedupingInterval: Double
  
  val errorRetryCount: js.UndefOr[Double] = js.undefined
  
  val errorRetryInterval: Double
  
  val fallback: StringDictionary[Any]
  
  val fallbackData: js.UndefOr[Any] = js.undefined
  
  val fetcher: js.UndefOr[BareFetcher[Any]] = js.undefined
  
  val focusThrottleInterval: Double
  
  val isOnline: js.Function0[Boolean]
  
  val isPaused: js.Function0[Boolean]
  
  val isVisible: js.Function0[Boolean]
  
  val loadingTimeout: Double
  
  val onDiscarded: js.Function1[/* key */ String, Unit]
  
  val onError: js.Function3[
    /* err */ Any, 
    /* key */ String, 
    /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]], 
    Unit
  ]
  
  val onErrorRetry: js.Function5[
    /* err */ Any, 
    /* key */ String, 
    /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]], 
    /* revalidate */ Revalidator, 
    /* revalidateOpts */ Required[RevalidatorOptions], 
    Unit
  ]
  
  val onLoadingSlow: js.Function2[/* key */ String, /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]], Unit]
  
  val onSuccess: js.Function3[
    /* data */ Any, 
    /* key */ String, 
    /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]], 
    Unit
  ]
  
  val refreshInterval: js.UndefOr[Double | (js.Function1[/* latestData */ js.UndefOr[Any], Double])] = js.undefined
  
  val refreshWhenHidden: js.UndefOr[Boolean] = js.undefined
  
  val refreshWhenOffline: js.UndefOr[Boolean] = js.undefined
  
  val revalidateIfStale: Boolean
  
  val revalidateOnFocus: Boolean
  
  val revalidateOnMount: js.UndefOr[Boolean] = js.undefined
  
  val revalidateOnReconnect: Boolean
  
  val shouldRetryOnError: Boolean | (js.Function1[/* err */ Any, Boolean])
  
  val suspense: js.UndefOr[Boolean] = js.undefined
  
  val use: js.UndefOr[js.Array[Middleware]] = js.undefined
}
object ReadonlyPublicConfiguratiCompare {
  
  inline def apply(
    compare: (/* a */ js.UndefOr[Any], /* b */ js.UndefOr[Any]) => Boolean,
    dedupingInterval: Double,
    errorRetryInterval: Double,
    fallback: StringDictionary[Any],
    focusThrottleInterval: Double,
    isOnline: () => Boolean,
    isPaused: () => Boolean,
    isVisible: () => Boolean,
    loadingTimeout: Double,
    onDiscarded: /* key */ String => Unit,
    onError: (/* err */ Any, /* key */ String, /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]]) => Unit,
    onErrorRetry: (/* err */ Any, /* key */ String, /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]], /* revalidate */ Revalidator, /* revalidateOpts */ Required[RevalidatorOptions]) => Unit,
    onLoadingSlow: (/* key */ String, /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]]) => Unit,
    onSuccess: (/* data */ Any, /* key */ String, /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]]) => Unit,
    revalidateIfStale: Boolean,
    revalidateOnFocus: Boolean,
    revalidateOnReconnect: Boolean,
    shouldRetryOnError: Boolean | (js.Function1[/* err */ Any, Boolean])
  ): ReadonlyPublicConfiguratiCompare = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare), dedupingInterval = dedupingInterval.asInstanceOf[js.Any], errorRetryInterval = errorRetryInterval.asInstanceOf[js.Any], fallback = fallback.asInstanceOf[js.Any], focusThrottleInterval = focusThrottleInterval.asInstanceOf[js.Any], isOnline = js.Any.fromFunction0(isOnline), isPaused = js.Any.fromFunction0(isPaused), isVisible = js.Any.fromFunction0(isVisible), loadingTimeout = loadingTimeout.asInstanceOf[js.Any], onDiscarded = js.Any.fromFunction1(onDiscarded), onError = js.Any.fromFunction3(onError), onErrorRetry = js.Any.fromFunction5(onErrorRetry), onLoadingSlow = js.Any.fromFunction2(onLoadingSlow), onSuccess = js.Any.fromFunction3(onSuccess), revalidateIfStale = revalidateIfStale.asInstanceOf[js.Any], revalidateOnFocus = revalidateOnFocus.asInstanceOf[js.Any], revalidateOnReconnect = revalidateOnReconnect.asInstanceOf[js.Any], shouldRetryOnError = shouldRetryOnError.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyPublicConfiguratiCompare]
  }
  
  extension [Self <: ReadonlyPublicConfiguratiCompare](x: Self) {
    
    inline def setCompare(value: (/* a */ js.UndefOr[Any], /* b */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
    
    inline def setDedupingInterval(value: Double): Self = StObject.set(x, "dedupingInterval", value.asInstanceOf[js.Any])
    
    inline def setErrorRetryCount(value: Double): Self = StObject.set(x, "errorRetryCount", value.asInstanceOf[js.Any])
    
    inline def setErrorRetryCountUndefined: Self = StObject.set(x, "errorRetryCount", js.undefined)
    
    inline def setErrorRetryInterval(value: Double): Self = StObject.set(x, "errorRetryInterval", value.asInstanceOf[js.Any])
    
    inline def setFallback(value: StringDictionary[Any]): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setFallbackData(value: Any): Self = StObject.set(x, "fallbackData", value.asInstanceOf[js.Any])
    
    inline def setFallbackDataUndefined: Self = StObject.set(x, "fallbackData", js.undefined)
    
    inline def setFetcher(value: BareFetcher[Any]): Self = StObject.set(x, "fetcher", value.asInstanceOf[js.Any])
    
    inline def setFetcherUndefined: Self = StObject.set(x, "fetcher", js.undefined)
    
    inline def setFocusThrottleInterval(value: Double): Self = StObject.set(x, "focusThrottleInterval", value.asInstanceOf[js.Any])
    
    inline def setIsOnline(value: () => Boolean): Self = StObject.set(x, "isOnline", js.Any.fromFunction0(value))
    
    inline def setIsPaused(value: () => Boolean): Self = StObject.set(x, "isPaused", js.Any.fromFunction0(value))
    
    inline def setIsVisible(value: () => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
    
    inline def setLoadingTimeout(value: Double): Self = StObject.set(x, "loadingTimeout", value.asInstanceOf[js.Any])
    
    inline def setOnDiscarded(value: /* key */ String => Unit): Self = StObject.set(x, "onDiscarded", js.Any.fromFunction1(value))
    
    inline def setOnError(
      value: (/* err */ Any, /* key */ String, /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]]) => Unit
    ): Self = StObject.set(x, "onError", js.Any.fromFunction3(value))
    
    inline def setOnErrorRetry(
      value: (/* err */ Any, /* key */ String, /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]], /* revalidate */ Revalidator, /* revalidateOpts */ Required[RevalidatorOptions]) => Unit
    ): Self = StObject.set(x, "onErrorRetry", js.Any.fromFunction5(value))
    
    inline def setOnLoadingSlow(value: (/* key */ String, /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]]) => Unit): Self = StObject.set(x, "onLoadingSlow", js.Any.fromFunction2(value))
    
    inline def setOnSuccess(
      value: (/* data */ Any, /* key */ String, /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]]) => Unit
    ): Self = StObject.set(x, "onSuccess", js.Any.fromFunction3(value))
    
    inline def setRefreshInterval(value: Double | (js.Function1[/* latestData */ js.UndefOr[Any], Double])): Self = StObject.set(x, "refreshInterval", value.asInstanceOf[js.Any])
    
    inline def setRefreshIntervalFunction1(value: /* latestData */ js.UndefOr[Any] => Double): Self = StObject.set(x, "refreshInterval", js.Any.fromFunction1(value))
    
    inline def setRefreshIntervalUndefined: Self = StObject.set(x, "refreshInterval", js.undefined)
    
    inline def setRefreshWhenHidden(value: Boolean): Self = StObject.set(x, "refreshWhenHidden", value.asInstanceOf[js.Any])
    
    inline def setRefreshWhenHiddenUndefined: Self = StObject.set(x, "refreshWhenHidden", js.undefined)
    
    inline def setRefreshWhenOffline(value: Boolean): Self = StObject.set(x, "refreshWhenOffline", value.asInstanceOf[js.Any])
    
    inline def setRefreshWhenOfflineUndefined: Self = StObject.set(x, "refreshWhenOffline", js.undefined)
    
    inline def setRevalidateIfStale(value: Boolean): Self = StObject.set(x, "revalidateIfStale", value.asInstanceOf[js.Any])
    
    inline def setRevalidateOnFocus(value: Boolean): Self = StObject.set(x, "revalidateOnFocus", value.asInstanceOf[js.Any])
    
    inline def setRevalidateOnMount(value: Boolean): Self = StObject.set(x, "revalidateOnMount", value.asInstanceOf[js.Any])
    
    inline def setRevalidateOnMountUndefined: Self = StObject.set(x, "revalidateOnMount", js.undefined)
    
    inline def setRevalidateOnReconnect(value: Boolean): Self = StObject.set(x, "revalidateOnReconnect", value.asInstanceOf[js.Any])
    
    inline def setShouldRetryOnError(value: Boolean | (js.Function1[/* err */ Any, Boolean])): Self = StObject.set(x, "shouldRetryOnError", value.asInstanceOf[js.Any])
    
    inline def setShouldRetryOnErrorFunction1(value: /* err */ Any => Boolean): Self = StObject.set(x, "shouldRetryOnError", js.Any.fromFunction1(value))
    
    inline def setSuspense(value: Boolean): Self = StObject.set(x, "suspense", value.asInstanceOf[js.Any])
    
    inline def setSuspenseUndefined: Self = StObject.set(x, "suspense", js.undefined)
    
    inline def setUse(value: js.Array[Middleware]): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    
    inline def setUseVarargs(value: Middleware*): Self = StObject.set(x, "use", js.Array(value*))
  }
}
