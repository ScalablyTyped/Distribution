package typings.swr

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.swr.anon.RequiredRevalidatorOption
import typings.swr.swrBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  type Arguments = js.UndefOr[String | ArgumentsTuple | (Record[Any, Any]) | Null | `false`]
  
  type ArgumentsTuple = Array[Any]
  
  @js.native
  trait BareFetcher[Data] extends StObject {
    
    def apply(args: Any*): FetcherResponse[Data] = js.native
  }
  
  type Broadcaster[Data, Error] = js.Function7[
    /* cache */ Cache[Data], 
    /* key */ String, 
    /* data */ Data, 
    /* error */ js.UndefOr[Error], 
    /* isValidating */ js.UndefOr[Boolean], 
    /* revalidate */ js.UndefOr[Boolean], 
    /* populateCache */ js.UndefOr[Boolean], 
    js.Promise[Data]
  ]
  
  trait Cache[Data] extends StObject {
    
    def delete(key: Key): Unit
    
    def get(key: Key): js.UndefOr[Data | Null]
    
    def set(key: Key, value: Data): Unit
  }
  object Cache {
    
    inline def apply[Data](delete: Key => Unit, get: Key => js.UndefOr[Data | Null], set: (Key, Data) => Unit): Cache[Data] = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[Cache[Data]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cache[?], Data] (val x: Self & Cache[Data]) extends AnyVal {
      
      inline def setDelete(value: Key => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      inline def setGet(value: Key => js.UndefOr[Data | Null]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setSet(value: (Key, Data) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    SWRKey extends (): [...infer Args] | null | undefined | false ? (args : [...Args]): swr.swr/dist/types.FetcherResponse<Data> : SWRKey extends [...infer Args] ? (args : [...Args]): swr.swr/dist/types.FetcherResponse<Data> : SWRKey extends (): infer Arg | null | undefined | false ? (args : [Arg]): swr.swr/dist/types.FetcherResponse<Data> : SWRKey extends null | undefined | false ? never : SWRKey extends infer Arg ? (args : [Arg]): swr.swr/dist/types.FetcherResponse<Data> : never
    }}}
    */
  @js.native
  trait Fetcher[Data, SWRKey /* <: Key */] extends StObject
  
  type FetcherResponse[Data] = Data | js.Promise[Data]
  
  @js.native
  trait FullConfiguration
    extends StObject
       with InternalConfiguration
       with PublicConfiguration[Any, Any, BareFetcher[Any]]
  
  trait InternalConfiguration extends StObject {
    
    var cache: Cache[Any]
    
    var mutate: ScopedMutator[Any]
  }
  object InternalConfiguration {
    
    inline def apply(cache: Cache[Any], mutate: ScopedMutator[Any]): InternalConfiguration = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], mutate = mutate.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InternalConfiguration] (val x: Self) extends AnyVal {
      
      inline def setCache(value: Cache[Any]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setMutate(value: ScopedMutator[Any]): Self = StObject.set(x, "mutate", value.asInstanceOf[js.Any])
    }
  }
  
  type Key = Arguments | js.Function0[Arguments]
  
  type KeyLoader[Args /* <: Arguments */] = (js.Function2[/* index */ Double, /* previousPageData */ Any | Null, Args]) | Null
  
  type KeyedMutator[Data] = js.Function2[
    /* data */ js.UndefOr[Data | js.Promise[Data] | MutatorCallback[Data]], 
    /* opts */ js.UndefOr[Boolean | MutatorOptions[Data]], 
    js.Promise[js.UndefOr[Data]]
  ]
  
  type Middleware = js.Function1[
    /* useSWRNext */ SWRHook, 
    js.Function3[
      /* key */ Key, 
      /* fetcher */ BareFetcher[Any] | Null, 
      /* config */ SWRConfiguration[Any, Any, BareFetcher[Any]], 
      SWRResponse[Any, Any]
    ]
  ]
  
  type Mutator[Data] = MutatorWrapper[MutatorFn[Data]]
  
  type MutatorCallback[Data] = js.Function1[
    /* currentData */ js.UndefOr[Data], 
    js.UndefOr[js.Promise[js.UndefOr[Data]] | Data]
  ]
  
  type MutatorFn[Data] = js.Function4[
    /* cache */ Cache[Any], 
    /* key */ Key, 
    /* data */ js.UndefOr[Data | js.Promise[Data] | MutatorCallback[Data]], 
    /* opts */ js.UndefOr[Boolean | MutatorOptions[Data]], 
    js.Promise[js.UndefOr[Data]]
  ]
  
  trait MutatorOptions[Data] extends StObject {
    
    var optimisticData: js.UndefOr[Data | (js.Function1[/* currentData */ js.UndefOr[Data], Data])] = js.undefined
    
    var populateCache: js.UndefOr[Boolean | (js.Function2[/* result */ Any, /* currentData */ Data, Data])] = js.undefined
    
    var revalidate: js.UndefOr[Boolean] = js.undefined
    
    var rollbackOnError: js.UndefOr[Boolean] = js.undefined
  }
  object MutatorOptions {
    
    inline def apply[Data](): MutatorOptions[Data] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MutatorOptions[Data]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MutatorOptions[?], Data] (val x: Self & MutatorOptions[Data]) extends AnyVal {
      
      inline def setOptimisticData(value: Data | (js.Function1[/* currentData */ js.UndefOr[Data], Data])): Self = StObject.set(x, "optimisticData", value.asInstanceOf[js.Any])
      
      inline def setOptimisticDataFunction1(value: /* currentData */ js.UndefOr[Data] => Data): Self = StObject.set(x, "optimisticData", js.Any.fromFunction1(value))
      
      inline def setOptimisticDataUndefined: Self = StObject.set(x, "optimisticData", js.undefined)
      
      inline def setPopulateCache(value: Boolean | (js.Function2[/* result */ Any, /* currentData */ Data, Data])): Self = StObject.set(x, "populateCache", value.asInstanceOf[js.Any])
      
      inline def setPopulateCacheFunction2(value: (/* result */ Any, /* currentData */ Data) => Data): Self = StObject.set(x, "populateCache", js.Any.fromFunction2(value))
      
      inline def setPopulateCacheUndefined: Self = StObject.set(x, "populateCache", js.undefined)
      
      inline def setRevalidate(value: Boolean): Self = StObject.set(x, "revalidate", value.asInstanceOf[js.Any])
      
      inline def setRevalidateUndefined: Self = StObject.set(x, "revalidate", js.undefined)
      
      inline def setRollbackOnError(value: Boolean): Self = StObject.set(x, "rollbackOnError", value.asInstanceOf[js.Any])
      
      inline def setRollbackOnErrorUndefined: Self = StObject.set(x, "rollbackOnError", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    Fn extends (args : [...infer Parameters]): infer Result ? Parameters[3] extends boolean ? Result : Parameters[3] extends / * Inlined std.Required<std.Pick<swr.swr/dist/types.MutatorOptions<any>, 'populateCache'>> * /
  {  populateCache :boolean | (result : any, currentData : any): any} ? Parameters[3]['populateCache'] extends false ? never : Result : Result : never
    }}}
    */
  @js.native
  trait MutatorWrapper[Fn] extends StObject
  
  trait ProviderConfiguration extends StObject {
    
    def initFocus(callback: js.Function0[Unit]): js.Function0[Unit] | Unit
    
    def initReconnect(callback: js.Function0[Unit]): js.Function0[Unit] | Unit
  }
  object ProviderConfiguration {
    
    inline def apply(
      initFocus: js.Function0[Unit] => js.Function0[Unit] | Unit,
      initReconnect: js.Function0[Unit] => js.Function0[Unit] | Unit
    ): ProviderConfiguration = {
      val __obj = js.Dynamic.literal(initFocus = js.Any.fromFunction1(initFocus), initReconnect = js.Any.fromFunction1(initReconnect))
      __obj.asInstanceOf[ProviderConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProviderConfiguration] (val x: Self) extends AnyVal {
      
      inline def setInitFocus(value: js.Function0[Unit] => js.Function0[Unit] | Unit): Self = StObject.set(x, "initFocus", js.Any.fromFunction1(value))
      
      inline def setInitReconnect(value: js.Function0[Unit] => js.Function0[Unit] | Unit): Self = StObject.set(x, "initReconnect", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait PublicConfiguration[Data, Error, Fn /* <: Fetcher[Any, Key] */] extends StObject {
    
    def compare(): Boolean = js.native
    def compare(a: Data): Boolean = js.native
    def compare(a: Data, b: Data): Boolean = js.native
    def compare(a: Unit, b: Data): Boolean = js.native
    
    var dedupingInterval: Double = js.native
    
    var errorRetryCount: js.UndefOr[Double] = js.native
    
    var errorRetryInterval: Double = js.native
    
    var fallback: StringDictionary[Any] = js.native
    
    var fallbackData: js.UndefOr[Data] = js.native
    
    var fetcher: js.UndefOr[Fn] = js.native
    
    var focusThrottleInterval: Double = js.native
    
    def isOnline(): Boolean = js.native
    
    def isPaused(): Boolean = js.native
    
    def isVisible(): Boolean = js.native
    
    var loadingTimeout: Double = js.native
    
    def onDiscarded(key: String): Unit = js.native
    
    def onError(err: Error, key: String, config: PublicConfiguration[Data, Error, Fn]): Unit = js.native
    
    def onErrorRetry(
      err: Error,
      key: String,
      config: PublicConfiguration[Data, Error, Fn],
      revalidate: Revalidator,
      revalidateOpts: RequiredRevalidatorOption
    ): Unit = js.native
    
    def onLoadingSlow(key: String, config: PublicConfiguration[Data, Error, Fn]): Unit = js.native
    
    def onSuccess(data: Data, key: String, config: PublicConfiguration[Data, Error, Fn]): Unit = js.native
    
    var refreshInterval: js.UndefOr[Double | (js.Function1[/* latestData */ js.UndefOr[Data], Double])] = js.native
    
    var refreshWhenHidden: js.UndefOr[Boolean] = js.native
    
    var refreshWhenOffline: js.UndefOr[Boolean] = js.native
    
    var revalidateIfStale: Boolean = js.native
    
    var revalidateOnFocus: Boolean = js.native
    
    var revalidateOnMount: js.UndefOr[Boolean] = js.native
    
    var revalidateOnReconnect: Boolean = js.native
    
    var shouldRetryOnError: Boolean | (js.Function1[/* err */ Error, Boolean]) = js.native
    
    var suspense: js.UndefOr[Boolean] = js.native
    
    var use: js.UndefOr[js.Array[Middleware]] = js.native
  }
  
  type RevalidateCallback = js.Function1[
    /* type */ RevalidateEvent, 
    /* import warning: importer.ImportType#apply Failed type conversion: swr.swr/dist/types.RevalidateCallbackReturnType[swr.swr/dist/types.RevalidateEvent] */ js.Any
  ]
  
  @js.native
  trait RevalidateCallbackReturnType extends StObject
  
  type RevalidateEvent = /* 0 */ Double
  
  type Revalidator = js.Function1[/* revalidateOpts */ js.UndefOr[RevalidatorOptions], js.Promise[Boolean] | Unit]
  
  trait RevalidatorOptions extends StObject {
    
    var dedupe: js.UndefOr[Boolean] = js.undefined
    
    var retryCount: js.UndefOr[Double] = js.undefined
  }
  object RevalidatorOptions {
    
    inline def apply(): RevalidatorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RevalidatorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RevalidatorOptions] (val x: Self) extends AnyVal {
      
      inline def setDedupe(value: Boolean): Self = StObject.set(x, "dedupe", value.asInstanceOf[js.Any])
      
      inline def setDedupeUndefined: Self = StObject.set(x, "dedupe", js.undefined)
      
      inline def setRetryCount(value: Double): Self = StObject.set(x, "retryCount", value.asInstanceOf[js.Any])
      
      inline def setRetryCountUndefined: Self = StObject.set(x, "retryCount", js.undefined)
    }
  }
  
  /* Inlined std.Partial<swr.swr/dist/types.PublicConfiguration<Data, Error, Fn>> */
  trait SWRConfiguration[Data, Error, Fn /* <: BareFetcher[Any] */] extends StObject {
    
    var compare: js.UndefOr[js.Function2[/* a */ js.UndefOr[Data], /* b */ js.UndefOr[Data], Boolean]] = js.undefined
    
    var dedupingInterval: js.UndefOr[Double] = js.undefined
    
    var errorRetryCount: js.UndefOr[Double] = js.undefined
    
    var errorRetryInterval: js.UndefOr[Double] = js.undefined
    
    var fallback: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var fallbackData: js.UndefOr[Data] = js.undefined
    
    var fetcher: js.UndefOr[Fn] = js.undefined
    
    var focusThrottleInterval: js.UndefOr[Double] = js.undefined
    
    var isOnline: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var isPaused: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var isVisible: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var loadingTimeout: js.UndefOr[Double] = js.undefined
    
    var onDiscarded: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.undefined
    
    var onError: js.UndefOr[
        js.Function3[
          /* err */ Error, 
          /* key */ String, 
          /* config */ PublicConfiguration[Data, Error, Fn], 
          Unit
        ]
      ] = js.undefined
    
    var onErrorRetry: js.UndefOr[
        js.Function5[
          /* err */ Error, 
          /* key */ String, 
          /* config */ PublicConfiguration[Data, Error, Fn], 
          /* revalidate */ Revalidator, 
          /* revalidateOpts */ RequiredRevalidatorOption, 
          Unit
        ]
      ] = js.undefined
    
    var onLoadingSlow: js.UndefOr[
        js.Function2[/* key */ String, /* config */ PublicConfiguration[Data, Error, Fn], Unit]
      ] = js.undefined
    
    var onSuccess: js.UndefOr[
        js.Function3[
          /* data */ Data, 
          /* key */ String, 
          /* config */ PublicConfiguration[Data, Error, Fn], 
          Unit
        ]
      ] = js.undefined
    
    var refreshInterval: js.UndefOr[Double | (js.Function1[/* latestData */ js.UndefOr[Data], Double])] = js.undefined
    
    var refreshWhenHidden: js.UndefOr[Boolean] = js.undefined
    
    var refreshWhenOffline: js.UndefOr[Boolean] = js.undefined
    
    var revalidateIfStale: js.UndefOr[Boolean] = js.undefined
    
    var revalidateOnFocus: js.UndefOr[Boolean] = js.undefined
    
    var revalidateOnMount: js.UndefOr[Boolean] = js.undefined
    
    var revalidateOnReconnect: js.UndefOr[Boolean] = js.undefined
    
    var shouldRetryOnError: js.UndefOr[Boolean | (js.Function1[/* err */ Error, Boolean])] = js.undefined
    
    var suspense: js.UndefOr[Boolean] = js.undefined
    
    var use: js.UndefOr[js.Array[Middleware]] = js.undefined
  }
  object SWRConfiguration {
    
    inline def apply[Data, Error, Fn /* <: BareFetcher[Any] */](): SWRConfiguration[Data, Error, Fn] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SWRConfiguration[Data, Error, Fn]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SWRConfiguration[?, ?, ?], Data, Error, Fn /* <: BareFetcher[Any] */] (val x: Self & (SWRConfiguration[Data, Error, Fn])) extends AnyVal {
      
      inline def setCompare(value: (/* a */ js.UndefOr[Data], /* b */ js.UndefOr[Data]) => Boolean): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
      
      inline def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
      
      inline def setDedupingInterval(value: Double): Self = StObject.set(x, "dedupingInterval", value.asInstanceOf[js.Any])
      
      inline def setDedupingIntervalUndefined: Self = StObject.set(x, "dedupingInterval", js.undefined)
      
      inline def setErrorRetryCount(value: Double): Self = StObject.set(x, "errorRetryCount", value.asInstanceOf[js.Any])
      
      inline def setErrorRetryCountUndefined: Self = StObject.set(x, "errorRetryCount", js.undefined)
      
      inline def setErrorRetryInterval(value: Double): Self = StObject.set(x, "errorRetryInterval", value.asInstanceOf[js.Any])
      
      inline def setErrorRetryIntervalUndefined: Self = StObject.set(x, "errorRetryInterval", js.undefined)
      
      inline def setFallback(value: StringDictionary[Any]): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackData(value: Data): Self = StObject.set(x, "fallbackData", value.asInstanceOf[js.Any])
      
      inline def setFallbackDataUndefined: Self = StObject.set(x, "fallbackData", js.undefined)
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setFetcher(value: Fn): Self = StObject.set(x, "fetcher", value.asInstanceOf[js.Any])
      
      inline def setFetcherUndefined: Self = StObject.set(x, "fetcher", js.undefined)
      
      inline def setFocusThrottleInterval(value: Double): Self = StObject.set(x, "focusThrottleInterval", value.asInstanceOf[js.Any])
      
      inline def setFocusThrottleIntervalUndefined: Self = StObject.set(x, "focusThrottleInterval", js.undefined)
      
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
        value: (/* err */ Error, /* key */ String, /* config */ PublicConfiguration[Data, Error, Fn]) => Unit
      ): Self = StObject.set(x, "onError", js.Any.fromFunction3(value))
      
      inline def setOnErrorRetry(
        value: (/* err */ Error, /* key */ String, /* config */ PublicConfiguration[Data, Error, Fn], /* revalidate */ Revalidator, /* revalidateOpts */ RequiredRevalidatorOption) => Unit
      ): Self = StObject.set(x, "onErrorRetry", js.Any.fromFunction5(value))
      
      inline def setOnErrorRetryUndefined: Self = StObject.set(x, "onErrorRetry", js.undefined)
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnLoadingSlow(value: (/* key */ String, /* config */ PublicConfiguration[Data, Error, Fn]) => Unit): Self = StObject.set(x, "onLoadingSlow", js.Any.fromFunction2(value))
      
      inline def setOnLoadingSlowUndefined: Self = StObject.set(x, "onLoadingSlow", js.undefined)
      
      inline def setOnSuccess(
        value: (/* data */ Data, /* key */ String, /* config */ PublicConfiguration[Data, Error, Fn]) => Unit
      ): Self = StObject.set(x, "onSuccess", js.Any.fromFunction3(value))
      
      inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
      
      inline def setRefreshInterval(value: Double | (js.Function1[/* latestData */ js.UndefOr[Data], Double])): Self = StObject.set(x, "refreshInterval", value.asInstanceOf[js.Any])
      
      inline def setRefreshIntervalFunction1(value: /* latestData */ js.UndefOr[Data] => Double): Self = StObject.set(x, "refreshInterval", js.Any.fromFunction1(value))
      
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
      
      inline def setShouldRetryOnError(value: Boolean | (js.Function1[/* err */ Error, Boolean])): Self = StObject.set(x, "shouldRetryOnError", value.asInstanceOf[js.Any])
      
      inline def setShouldRetryOnErrorFunction1(value: /* err */ Error => Boolean): Self = StObject.set(x, "shouldRetryOnError", js.Any.fromFunction1(value))
      
      inline def setShouldRetryOnErrorUndefined: Self = StObject.set(x, "shouldRetryOnError", js.undefined)
      
      inline def setSuspense(value: Boolean): Self = StObject.set(x, "suspense", value.asInstanceOf[js.Any])
      
      inline def setSuspenseUndefined: Self = StObject.set(x, "suspense", js.undefined)
      
      inline def setUse(value: js.Array[Middleware]): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
      
      inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
      
      inline def setUseVarargs(value: Middleware*): Self = StObject.set(x, "use", js.Array(value*))
    }
  }
  
  @js.native
  trait SWRHook extends StObject {
    
    def apply[Data, Error](key: Key): SWRResponse[Data, Error] = js.native
    def apply[Data, Error](key: Key, config: SWRConfiguration[Data, Error, BareFetcher[Data]]): SWRResponse[Data, Error] = js.native
    def apply[Data, Error](key: Key, fetcher: Null, config: SWRConfiguration[Data, Error, BareFetcher[Data]]): SWRResponse[Data, Error] = js.native
    def apply[Data, Error](key: Key, fetcher: BareFetcher[Data]): SWRResponse[Data, Error] = js.native
    def apply[Data, Error](key: Key, fetcher: BareFetcher[Data], config: SWRConfiguration[Data, Error, BareFetcher[Data]]): SWRResponse[Data, Error] = js.native
    def apply[Data, Error, SWRKey /* <: Key */](key: SWRKey, fetcher: Fetcher[Data, SWRKey]): SWRResponse[Data, Error] = js.native
    def apply[Data, Error, SWRKey /* <: Key */](
      key: SWRKey,
      fetcher: Fetcher[Data, SWRKey],
      config: SWRConfiguration[Data, Error, Fetcher[Data, SWRKey]]
    ): SWRResponse[Data, Error] = js.native
  }
  
  trait SWRResponse[Data, Error] extends StObject {
    
    var data: js.UndefOr[Data] = js.undefined
    
    var error: js.UndefOr[Error] = js.undefined
    
    var isValidating: Boolean
    
    var mutate: KeyedMutator[Data]
  }
  object SWRResponse {
    
    inline def apply[Data, Error](
      isValidating: Boolean,
      mutate: (/* data */ js.UndefOr[Data | js.Promise[Data] | MutatorCallback[Data]], /* opts */ js.UndefOr[Boolean | MutatorOptions[Data]]) => js.Promise[js.UndefOr[Data]]
    ): SWRResponse[Data, Error] = {
      val __obj = js.Dynamic.literal(isValidating = isValidating.asInstanceOf[js.Any], mutate = js.Any.fromFunction2(mutate))
      __obj.asInstanceOf[SWRResponse[Data, Error]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SWRResponse[?, ?], Data, Error] (val x: Self & (SWRResponse[Data, Error])) extends AnyVal {
      
      inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setIsValidating(value: Boolean): Self = StObject.set(x, "isValidating", value.asInstanceOf[js.Any])
      
      inline def setMutate(
        value: (/* data */ js.UndefOr[Data | js.Promise[Data] | MutatorCallback[Data]], /* opts */ js.UndefOr[Boolean | MutatorOptions[Data]]) => js.Promise[js.UndefOr[Data]]
      ): Self = StObject.set(x, "mutate", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait ScopedMutator[Data] extends StObject {
    
    /** This is used for bound mutator */
    def apply(key: Key): js.Promise[js.UndefOr[Data]] = js.native
    def apply(key: Key, data: Data): js.Promise[js.UndefOr[Data]] = js.native
    def apply(key: Key, data: Data, opts: Boolean): js.Promise[js.UndefOr[Data]] = js.native
    def apply(key: Key, data: Data, opts: MutatorOptions[Data]): js.Promise[js.UndefOr[Data]] = js.native
    def apply(key: Key, data: js.Promise[Data]): js.Promise[js.UndefOr[Data]] = js.native
    def apply(key: Key, data: js.Promise[Data], opts: Boolean): js.Promise[js.UndefOr[Data]] = js.native
    def apply(key: Key, data: js.Promise[Data], opts: MutatorOptions[Data]): js.Promise[js.UndefOr[Data]] = js.native
    def apply(key: Key, data: Unit, opts: Boolean): js.Promise[js.UndefOr[Data]] = js.native
    def apply(key: Key, data: Unit, opts: MutatorOptions[Data]): js.Promise[js.UndefOr[Data]] = js.native
    def apply(key: Key, data: MutatorCallback[Data]): js.Promise[js.UndefOr[Data]] = js.native
    def apply(key: Key, data: MutatorCallback[Data], opts: Boolean): js.Promise[js.UndefOr[Data]] = js.native
    def apply(key: Key, data: MutatorCallback[Data], opts: MutatorOptions[Data]): js.Promise[js.UndefOr[Data]] = js.native
  }
  
  trait State[Data, Error] extends StObject {
    
    var data: js.UndefOr[Data] = js.undefined
    
    var error: js.UndefOr[Error] = js.undefined
    
    var isValidating: js.UndefOr[Boolean] = js.undefined
  }
  object State {
    
    inline def apply[Data, Error](): State[Data, Error] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[State[Data, Error]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State[?, ?], Data, Error] (val x: Self & (State[Data, Error])) extends AnyVal {
      
      inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setIsValidating(value: Boolean): Self = StObject.set(x, "isValidating", value.asInstanceOf[js.Any])
      
      inline def setIsValidatingUndefined: Self = StObject.set(x, "isValidating", js.undefined)
    }
  }
  
  type StateUpdateCallback[Data, Error] = js.Function3[
    /* data */ js.UndefOr[Data], 
    /* error */ js.UndefOr[Error], 
    /* isValidating */ js.UndefOr[Boolean], 
    Unit
  ]
}
