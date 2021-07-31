package typings.swPrecache

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sw-precache", "generate")
  @js.native
  val generate: Generate_ = js.native
  
  @JSImport("sw-precache", "write")
  @js.native
  val write: Write_ = js.native
  
  type Generate_ = js.Function2[
    /* options */ js.UndefOr[Options], 
    /* callback */ js.UndefOr[js.Function2[/* error */ ErrnoException, /* serviceWorkerString */ String, Unit]], 
    js.Promise[String]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.swPrecache.swPrecacheStrings.networkFirst
    - typings.swPrecache.swPrecacheStrings.cacheFirst
    - typings.swPrecache.swPrecacheStrings.fastest
    - typings.swPrecache.swPrecacheStrings.cacheOnly
    - typings.swPrecache.swPrecacheStrings.networkOnly
    - typings.swToolbox.mod.Handler
  */
  type Handler = _Handler | typings.swToolbox.mod.Handler
  
  /* Rewritten from type alias, can be one of: 
    - typings.swPrecache.swPrecacheStrings.get
    - typings.swPrecache.swPrecacheStrings.post
    - typings.swPrecache.swPrecacheStrings.put
    - typings.swPrecache.swPrecacheStrings.delete
    - typings.swPrecache.swPrecacheStrings.head
  */
  trait Method extends StObject
  object Method {
    
    @scala.inline
    def delete: typings.swPrecache.swPrecacheStrings.delete = "delete".asInstanceOf[typings.swPrecache.swPrecacheStrings.delete]
    
    @scala.inline
    def get: typings.swPrecache.swPrecacheStrings.get = "get".asInstanceOf[typings.swPrecache.swPrecacheStrings.get]
    
    @scala.inline
    def head: typings.swPrecache.swPrecacheStrings.head = "head".asInstanceOf[typings.swPrecache.swPrecacheStrings.head]
    
    @scala.inline
    def post: typings.swPrecache.swPrecacheStrings.post = "post".asInstanceOf[typings.swPrecache.swPrecacheStrings.post]
    
    @scala.inline
    def put: typings.swPrecache.swPrecacheStrings.put = "put".asInstanceOf[typings.swPrecache.swPrecacheStrings.put]
  }
  
  trait Options extends StObject {
    
    var cacheId: js.UndefOr[String] = js.undefined
    
    var clientsClaim: js.UndefOr[Boolean] = js.undefined
    
    var directoryIndex: js.UndefOr[String] = js.undefined
    
    var dontCacheBustUrlsMatching: js.UndefOr[RegExp] = js.undefined
    
    var dynamicUrlToDependencies: js.UndefOr[StringDictionary[String | Buffer | js.Array[String]]] = js.undefined
    
    var handleFetch: js.UndefOr[Boolean] = js.undefined
    
    var ignoreUrlParametersMatching: js.UndefOr[js.Array[RegExp]] = js.undefined
    
    var importScripts: js.UndefOr[js.Array[String]] = js.undefined
    
    var logger: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
    
    var maximumFileSizeToCacheInBytes: js.UndefOr[Double] = js.undefined
    
    var navigateFallback: js.UndefOr[String] = js.undefined
    
    var navigateFallbackWhitelist: js.UndefOr[js.Array[RegExp]] = js.undefined
    
    var replacePrefix: js.UndefOr[String] = js.undefined
    
    var runtimeCaching: js.UndefOr[js.Array[typings.swPrecache.anon.Handler]] = js.undefined
    
    var skipWaiting: js.UndefOr[Boolean] = js.undefined
    
    var staticFileGlobs: js.UndefOr[js.Array[String]] = js.undefined
    
    var stripPrefix: js.UndefOr[String] = js.undefined
    
    var stripPrefixMulti: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var templateFilePath: js.UndefOr[String] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
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
      def setCacheId(value: String): Self = StObject.set(x, "cacheId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheIdUndefined: Self = StObject.set(x, "cacheId", js.undefined)
      
      @scala.inline
      def setClientsClaim(value: Boolean): Self = StObject.set(x, "clientsClaim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientsClaimUndefined: Self = StObject.set(x, "clientsClaim", js.undefined)
      
      @scala.inline
      def setDirectoryIndex(value: String): Self = StObject.set(x, "directoryIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryIndexUndefined: Self = StObject.set(x, "directoryIndex", js.undefined)
      
      @scala.inline
      def setDontCacheBustUrlsMatching(value: RegExp): Self = StObject.set(x, "dontCacheBustUrlsMatching", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDontCacheBustUrlsMatchingUndefined: Self = StObject.set(x, "dontCacheBustUrlsMatching", js.undefined)
      
      @scala.inline
      def setDynamicUrlToDependencies(value: StringDictionary[String | Buffer | js.Array[String]]): Self = StObject.set(x, "dynamicUrlToDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamicUrlToDependenciesUndefined: Self = StObject.set(x, "dynamicUrlToDependencies", js.undefined)
      
      @scala.inline
      def setHandleFetch(value: Boolean): Self = StObject.set(x, "handleFetch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleFetchUndefined: Self = StObject.set(x, "handleFetch", js.undefined)
      
      @scala.inline
      def setIgnoreUrlParametersMatching(value: js.Array[RegExp]): Self = StObject.set(x, "ignoreUrlParametersMatching", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUrlParametersMatchingUndefined: Self = StObject.set(x, "ignoreUrlParametersMatching", js.undefined)
      
      @scala.inline
      def setIgnoreUrlParametersMatchingVarargs(value: RegExp*): Self = StObject.set(x, "ignoreUrlParametersMatching", js.Array(value :_*))
      
      @scala.inline
      def setImportScripts(value: js.Array[String]): Self = StObject.set(x, "importScripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportScriptsUndefined: Self = StObject.set(x, "importScripts", js.undefined)
      
      @scala.inline
      def setImportScriptsVarargs(value: String*): Self = StObject.set(x, "importScripts", js.Array(value :_*))
      
      @scala.inline
      def setLogger(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setMaximumFileSizeToCacheInBytes(value: Double): Self = StObject.set(x, "maximumFileSizeToCacheInBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumFileSizeToCacheInBytesUndefined: Self = StObject.set(x, "maximumFileSizeToCacheInBytes", js.undefined)
      
      @scala.inline
      def setNavigateFallback(value: String): Self = StObject.set(x, "navigateFallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigateFallbackUndefined: Self = StObject.set(x, "navigateFallback", js.undefined)
      
      @scala.inline
      def setNavigateFallbackWhitelist(value: js.Array[RegExp]): Self = StObject.set(x, "navigateFallbackWhitelist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigateFallbackWhitelistUndefined: Self = StObject.set(x, "navigateFallbackWhitelist", js.undefined)
      
      @scala.inline
      def setNavigateFallbackWhitelistVarargs(value: RegExp*): Self = StObject.set(x, "navigateFallbackWhitelist", js.Array(value :_*))
      
      @scala.inline
      def setReplacePrefix(value: String): Self = StObject.set(x, "replacePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplacePrefixUndefined: Self = StObject.set(x, "replacePrefix", js.undefined)
      
      @scala.inline
      def setRuntimeCaching(value: js.Array[typings.swPrecache.anon.Handler]): Self = StObject.set(x, "runtimeCaching", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntimeCachingUndefined: Self = StObject.set(x, "runtimeCaching", js.undefined)
      
      @scala.inline
      def setRuntimeCachingVarargs(value: typings.swPrecache.anon.Handler*): Self = StObject.set(x, "runtimeCaching", js.Array(value :_*))
      
      @scala.inline
      def setSkipWaiting(value: Boolean): Self = StObject.set(x, "skipWaiting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipWaitingUndefined: Self = StObject.set(x, "skipWaiting", js.undefined)
      
      @scala.inline
      def setStaticFileGlobs(value: js.Array[String]): Self = StObject.set(x, "staticFileGlobs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticFileGlobsUndefined: Self = StObject.set(x, "staticFileGlobs", js.undefined)
      
      @scala.inline
      def setStaticFileGlobsVarargs(value: String*): Self = StObject.set(x, "staticFileGlobs", js.Array(value :_*))
      
      @scala.inline
      def setStripPrefix(value: String): Self = StObject.set(x, "stripPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripPrefixMulti(value: StringDictionary[String]): Self = StObject.set(x, "stripPrefixMulti", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripPrefixMultiUndefined: Self = StObject.set(x, "stripPrefixMulti", js.undefined)
      
      @scala.inline
      def setStripPrefixUndefined: Self = StObject.set(x, "stripPrefix", js.undefined)
      
      @scala.inline
      def setTemplateFilePath(value: String): Self = StObject.set(x, "templateFilePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateFilePathUndefined: Self = StObject.set(x, "templateFilePath", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  type Write_ = js.Function3[
    /* filePath */ String, 
    /* options */ js.UndefOr[Options], 
    /* callback */ js.UndefOr[js.Function1[/* error */ ErrnoException, Unit]], 
    js.Promise[String]
  ]
  
  trait _Handler extends StObject
}
