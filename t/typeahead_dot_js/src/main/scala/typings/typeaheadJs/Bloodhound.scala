package typings.typeaheadJs

import typings.jquery.JQueryAjaxSettings
import typings.jquery.JQueryPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Bloodhound is the typeahead.js suggestion engine. Bloodhound is robust,
  * flexible, and offers advanced functionalities such as prefetching,
  * intelligent caching, fast lookups, and backfilling with remote data.
  */
@js.native
trait Bloodhound[T] extends StObject {
  
  /**
    * Takes one argument, data, which is expected to be an array.
    * The data passed in will get added to the internal search index.
    *
    * @param data Data to be added to the internal search index.
    */
  def add(data: js.Array[T]): Unit = js.native
  
  /**
    * Returns all items from the internal search index.
    */
  def all(): js.Array[T] = js.native
  
  /**@Types/typeahead
    * Clears the internal search index that's powered by local, prefetch, and #add.
    */
  def clear(): Bloodhound[T] = js.native
  
  /**
    * If you're using prefetch, data gets cached in local storage in an effort to cut down on unnecessary network requests.
    * clearPrefetchCache offers a way to programmatically clear said cache.
    */
  def clearPrefetchCache(): Bloodhound[T] = js.native
  
  /**
    * If you're using remote, Bloodhound will cache the 10 most recent responses in an effort to provide a better user experience.
    * clearRemoteCache offers a way to programmatically clear said cache.
    */
  def clearRemoteCache(): Bloodhound[T] = js.native
  
  /**
    * Returns the data in the local search index corresponding to ids.
    *
    * @param ids Data ids.
    * @returns The corresponding data.
    */
  def get(ids: js.Array[Double]): js.Array[T] = js.native
  
  /**
    * Kicks off the initialization of the suggestion engine. Initialization
    * entails adding the data provided by local and prefetch to the internal
    * search index as well as setting up transport mechanism used by remote.
    * Before #initialize is called, the #get and #search methods will effectively be no-ops.
    *
    * Note, unless the initialize option is false, this method is implicitly called by the constructor.
    *
    * After initialization, how subsequent invocations of #initialize behave depends on
    * the reinitialize argument. If reinitialize is falsy, the method will not execute the
    * initialization logic and will just return the same jQuery promise returned
    * by the initial invocation. If reinitialize is truthy, the method will behave
    * as if it were being called for the first time.
    *
    * @param reinitialize How subsequent invocations of #initialize will behave.
    * @returns jQuery promise.
    */
  def initialize(): JQueryPromise[T] = js.native
  def initialize(reinitialize: Boolean): JQueryPromise[T] = js.native
  
  /**
    * Returns the data that matches query. Matches found in the local search
    * index will be passed to the sync callback. If the data passed to sync
    * doesn't contain at least sufficient number of datums, remote data will
    * be requested and then passed to the async callback.
    *
    * @param query Query.
    * @param sync Sync callback
    * @param async Async callback.
    * @returns The data that matches query.
    */
  def search(query: String, sync: js.Function1[/* datums */ js.Array[T], Unit]): js.Array[T] = js.native
  def search(
    query: String,
    sync: js.Function1[/* datums */ js.Array[T], Unit],
    async: js.Function1[/* datums */ js.Array[T], Unit]
  ): js.Array[T] = js.native
  
  /*
    * DEPRECATED: wraps the suggestion engine in an adapter that is compatible with the typeahead jQuery plugin
    */
  def ttAdapter(): Any = js.native
}
object Bloodhound {
  
  trait BloodhoundOptions[T] extends StObject {
    
    /**
      * Transforms a datum into an array of string tokens.
      *
      * @param datum Suggestion.
      * @returns An array of string tokens.
      */
    def datumTokenizer(datum: T): js.Array[String]
    
    /**
      * Given a datum, returns a unique id for it.
      * Defaults to JSON.stringify. Note that it is highly recommended
      * to override this option.
      *
      * @param datum Suggestion.
      * @returns Unique id for the suggestion.
      */
    var identify: js.UndefOr[js.Function1[/* datum */ T, Double]] = js.undefined
    
    /**
      * If set to false, the Bloodhound instance will not be implicitly
      * initialized by the constructor function. Defaults to true.
      */
    var initialize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An array of data or a function that returns an array of data.
      * The data will be added to the internal search index when #initialize is called.
      */
    var local: js.UndefOr[js.Array[T] | js.Function0[js.Array[T]]] = js.undefined
    
    /**
      * Can be a URL to a JSON file containing an array of data or,
      * if more configurability is needed, a prefetch options hash.
      */
    var prefetch: js.UndefOr[String | PrefetchOptions[T]] = js.undefined
    
    /**
      * Transforms a query into an array of string tokens.
      *
      * @param quiery Query.
      * @returns An array of string tokens.
      */
    def queryTokenizer(query: String): js.Array[String]
    
    /**
      * Can be a URL to fetch data from when the data provided by the internal
      * search index is insufficient or, if more configurability is needed,
      * a remote options hash.
      */
    var remote: js.UndefOr[String | RemoteOptions[T]] = js.undefined
    
    /**
      * A compare function used to sort data returned from the internal search index.
      *
      * @param a First suggestion.
      * @param b Second suggestion.
      * @returns Comparison result.
      */
    var sorter: js.UndefOr[js.Function2[/* a */ T, /* b */ T, Double]] = js.undefined
    
    /**
      * If the number of datums provided from the internal search index is
      * less than sufficient, remote will be used to backfill search
      * requests triggered by calling #search. Defaults to 5.
      */
    var sufficient: js.UndefOr[Double] = js.undefined
  }
  object BloodhoundOptions {
    
    inline def apply[T](datumTokenizer: T => js.Array[String], queryTokenizer: String => js.Array[String]): BloodhoundOptions[T] = {
      val __obj = js.Dynamic.literal(datumTokenizer = js.Any.fromFunction1(datumTokenizer), queryTokenizer = js.Any.fromFunction1(queryTokenizer))
      __obj.asInstanceOf[BloodhoundOptions[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BloodhoundOptions[?], T] (val x: Self & BloodhoundOptions[T]) extends AnyVal {
      
      inline def setDatumTokenizer(value: T => js.Array[String]): Self = StObject.set(x, "datumTokenizer", js.Any.fromFunction1(value))
      
      inline def setIdentify(value: /* datum */ T => Double): Self = StObject.set(x, "identify", js.Any.fromFunction1(value))
      
      inline def setIdentifyUndefined: Self = StObject.set(x, "identify", js.undefined)
      
      inline def setInitialize(value: Boolean): Self = StObject.set(x, "initialize", value.asInstanceOf[js.Any])
      
      inline def setInitializeUndefined: Self = StObject.set(x, "initialize", js.undefined)
      
      inline def setLocal(value: js.Array[T] | js.Function0[js.Array[T]]): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setLocalFunction0(value: () => js.Array[T]): Self = StObject.set(x, "local", js.Any.fromFunction0(value))
      
      inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
      
      inline def setLocalVarargs(value: T*): Self = StObject.set(x, "local", js.Array(value*))
      
      inline def setPrefetch(value: String | PrefetchOptions[T]): Self = StObject.set(x, "prefetch", value.asInstanceOf[js.Any])
      
      inline def setPrefetchUndefined: Self = StObject.set(x, "prefetch", js.undefined)
      
      inline def setQueryTokenizer(value: String => js.Array[String]): Self = StObject.set(x, "queryTokenizer", js.Any.fromFunction1(value))
      
      inline def setRemote(value: String | RemoteOptions[T]): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
      
      inline def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
      
      inline def setSorter(value: (/* a */ T, /* b */ T) => Double): Self = StObject.set(x, "sorter", js.Any.fromFunction2(value))
      
      inline def setSorterUndefined: Self = StObject.set(x, "sorter", js.undefined)
      
      inline def setSufficient(value: Double): Self = StObject.set(x, "sufficient", value.asInstanceOf[js.Any])
      
      inline def setSufficientUndefined: Self = StObject.set(x, "sufficient", js.undefined)
    }
  }
  
  @js.native
  trait ObjTokenizer extends StObject {
    
    /**
      * Split the string content of the given object attribute(s) on non-word
      * characters.
      */
    def nonword(key: String): js.Function1[/* obj */ Any, js.Array[String]] = js.native
    def nonword(key: js.Array[String]): js.Function1[/* obj */ Any, js.Array[String]] = js.native
    
    /**
      * Split the string content of the given object attribute(s) on
      * whitespace characters.
      */
    def whitespace(key: String): js.Function1[/* obj */ Any, js.Array[String]] = js.native
    def whitespace(key: js.Array[String]): js.Function1[/* obj */ Any, js.Array[String]] = js.native
  }
  
  /**
    * Prefetched data is fetched and processed on initialization. If the browser
    * supports local storage, the processed data will be cached there to prevent
    * additional network requests on subsequent page loads.
    *
    * WARNING: While it's possible to get away with it for smaller data sets,
    * prefetched data isn't meant to contain entire sets of data. Rather, it should
    * act as a first-level cache. Ignoring this warning means you'll run the risk
    * of hitting local storage limits.
    */
  trait PrefetchOptions[T] extends StObject {
    
    /**
      * If false, will not attempt to read or write to local storage and
      * will always load prefetch data from url on initialization. Defaults to true.
      */
    var cache: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The key that data will be stored in local storage under.
      * Defaults to value of url.
      */
    var cacheKey: js.UndefOr[String] = js.undefined
    
    /**
      * A function that provides a hook to allow you to prepare the settings
      * object passed to transport when a request is about to be made.
      * Defaults to the identity function.
      *
      * @param settings The default settings object created internally by the Bloodhound instance.
      * @returns A settings object.
      */
    var prepare: js.UndefOr[js.Function1[/* settings */ JQueryAjaxSettings, JQueryAjaxSettings]] = js.undefined
    
    /**
      * A string used for thumbprinting prefetched data. If this doesn't
      * match what's stored in local storage, the data will be refetched.
      */
    var thumbprint: js.UndefOr[String] = js.undefined
    
    /**
      * A function with the signature transform(response) that allows you to
      * transform the prefetch response before the Bloodhound instance operates
      * on it. Defaults to the identity function.
      *
      * @param response Prefetch response.
      * @returns Transform response.
      */
    var transform: js.UndefOr[js.Function1[/* response */ T, T]] = js.undefined
    
    /**
      * The time (in milliseconds) the prefetched data should be cached in
      * local storage. Defaults to 86400000 (1 day).
      */
    var ttl: js.UndefOr[Double] = js.undefined
    
    /**
      * The URL prefetch data should be loaded from.
      */
    var url: String
  }
  object PrefetchOptions {
    
    inline def apply[T](url: String): PrefetchOptions[T] = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrefetchOptions[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrefetchOptions[?], T] (val x: Self & PrefetchOptions[T]) extends AnyVal {
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheKey(value: String): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
      
      inline def setCacheKeyUndefined: Self = StObject.set(x, "cacheKey", js.undefined)
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setPrepare(value: /* settings */ JQueryAjaxSettings => JQueryAjaxSettings): Self = StObject.set(x, "prepare", js.Any.fromFunction1(value))
      
      inline def setPrepareUndefined: Self = StObject.set(x, "prepare", js.undefined)
      
      inline def setThumbprint(value: String): Self = StObject.set(x, "thumbprint", value.asInstanceOf[js.Any])
      
      inline def setThumbprintUndefined: Self = StObject.set(x, "thumbprint", js.undefined)
      
      inline def setTransform(value: /* response */ T => T): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Bloodhound only goes to the network when the internal search engine cannot
    * provide a sufficient number of results. In order to prevent an obscene
    * number of requests being made to the remote endpoint, requests are rate-limited.
    */
  trait RemoteOptions[T] extends StObject {
    
    /**
      * DEPRECATED: transform the remote response before the Bloodhound instance operates on it.
      * */
    var filter: js.UndefOr[js.Function1[/* response */ T, T]] = js.undefined
    
    /**
      * A function that provides a hook to allow you to prepare the settings
      * object passed to transport when a request is about to be made.
      * The function signature should be prepare(query, settings), where query
      * is the query #search was called with and settings is the default settings
      * object created internally by the Bloodhound instance. The prepare function
      * should return a settings object. Defaults to the identity function.
      *
      * @param query The query #search was called with.
      * @param settings The default settings object created internally by Bloodhound.
      * @returns A JqueryAjaxSettings object.
      */
    var prepare: js.UndefOr[
        js.Function2[/* query */ String, /* settings */ JQueryAjaxSettings, JQueryAjaxSettings]
      ] = js.undefined
    
    /**
      * The time interval in milliseconds that will be used by rateLimitBy.
      * Defaults to 300.
      */
    var rateLimitWait: js.UndefOr[Double] = js.undefined
    
    /**
      * The method used to rate-limit network requests.
      * Can be either debounce or throttle. Defaults to debounce.
      */
    var rateLimitby: js.UndefOr[String] = js.undefined
    
    /**
      * A function with the signature transform(response) that allows you to
      * transform the remote response before the Bloodhound instance operates on it.
      * Defaults to the identity function.
      *
      * @param response Prefetch response.
      * @returns Transform response.
      */
    var transform: js.UndefOr[js.Function1[/* response */ T, T]] = js.undefined
    
    /**
      * The URL remote data should be loaded from.
      */
    var url: String
    
    /**
      * A convenience option for prepare. If set, prepare will be a function
      * that replaces the value of this option in url with the URI encoded query.
      */
    var wildcard: js.UndefOr[String] = js.undefined
  }
  object RemoteOptions {
    
    inline def apply[T](url: String): RemoteOptions[T] = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoteOptions[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RemoteOptions[?], T] (val x: Self & RemoteOptions[T]) extends AnyVal {
      
      inline def setFilter(value: /* response */ T => T): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setPrepare(value: (/* query */ String, /* settings */ JQueryAjaxSettings) => JQueryAjaxSettings): Self = StObject.set(x, "prepare", js.Any.fromFunction2(value))
      
      inline def setPrepareUndefined: Self = StObject.set(x, "prepare", js.undefined)
      
      inline def setRateLimitWait(value: Double): Self = StObject.set(x, "rateLimitWait", value.asInstanceOf[js.Any])
      
      inline def setRateLimitWaitUndefined: Self = StObject.set(x, "rateLimitWait", js.undefined)
      
      inline def setRateLimitby(value: String): Self = StObject.set(x, "rateLimitby", value.asInstanceOf[js.Any])
      
      inline def setRateLimitbyUndefined: Self = StObject.set(x, "rateLimitby", js.undefined)
      
      inline def setTransform(value: /* response */ T => T): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWildcard(value: String): Self = StObject.set(x, "wildcard", value.asInstanceOf[js.Any])
      
      inline def setWildcardUndefined: Self = StObject.set(x, "wildcard", js.undefined)
    }
  }
  
  /**
    * Build-in tokenization methods.
    */
  trait Tokenizers extends StObject {
    
    /**
      * Split a given string on non-word characters.
      */
    def nonword(str: String): js.Array[String]
    
    /**
      * Instances of the build-in tokenization methods.
      */
    var obj: ObjTokenizer
    
    /**
      * Split a given string on whitespace characters.
      */
    def whitespace(str: String): js.Array[String]
  }
  object Tokenizers {
    
    inline def apply(nonword: String => js.Array[String], obj: ObjTokenizer, whitespace: String => js.Array[String]): Tokenizers = {
      val __obj = js.Dynamic.literal(nonword = js.Any.fromFunction1(nonword), obj = obj.asInstanceOf[js.Any], whitespace = js.Any.fromFunction1(whitespace))
      __obj.asInstanceOf[Tokenizers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Tokenizers] (val x: Self) extends AnyVal {
      
      inline def setNonword(value: String => js.Array[String]): Self = StObject.set(x, "nonword", js.Any.fromFunction1(value))
      
      inline def setObj(value: ObjTokenizer): Self = StObject.set(x, "obj", value.asInstanceOf[js.Any])
      
      inline def setWhitespace(value: String => js.Array[String]): Self = StObject.set(x, "whitespace", js.Any.fromFunction1(value))
    }
  }
}
