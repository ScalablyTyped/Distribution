package typings.swPrecache

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
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
    /* callback */ js.UndefOr[
      js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ /* error */ Any, 
        /* serviceWorkerString */ String, 
        Unit
      ]
    ], 
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
    
    inline def delete: typings.swPrecache.swPrecacheStrings.delete = "delete".asInstanceOf[typings.swPrecache.swPrecacheStrings.delete]
    
    inline def get: typings.swPrecache.swPrecacheStrings.get = "get".asInstanceOf[typings.swPrecache.swPrecacheStrings.get]
    
    inline def head: typings.swPrecache.swPrecacheStrings.head = "head".asInstanceOf[typings.swPrecache.swPrecacheStrings.head]
    
    inline def post: typings.swPrecache.swPrecacheStrings.post = "post".asInstanceOf[typings.swPrecache.swPrecacheStrings.post]
    
    inline def put: typings.swPrecache.swPrecacheStrings.put = "put".asInstanceOf[typings.swPrecache.swPrecacheStrings.put]
  }
  
  trait Options extends StObject {
    
    var cacheId: js.UndefOr[String] = js.undefined
    
    var clientsClaim: js.UndefOr[Boolean] = js.undefined
    
    var directoryIndex: js.UndefOr[String] = js.undefined
    
    var dontCacheBustUrlsMatching: js.UndefOr[js.RegExp] = js.undefined
    
    var dynamicUrlToDependencies: js.UndefOr[StringDictionary[String | Buffer | js.Array[String]]] = js.undefined
    
    var handleFetch: js.UndefOr[Boolean] = js.undefined
    
    var ignoreUrlParametersMatching: js.UndefOr[js.Array[js.RegExp]] = js.undefined
    
    var importScripts: js.UndefOr[js.Array[String]] = js.undefined
    
    var logger: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    var maximumFileSizeToCacheInBytes: js.UndefOr[Double] = js.undefined
    
    var navigateFallback: js.UndefOr[String] = js.undefined
    
    var navigateFallbackWhitelist: js.UndefOr[js.Array[js.RegExp]] = js.undefined
    
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
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCacheId(value: String): Self = StObject.set(x, "cacheId", value.asInstanceOf[js.Any])
      
      inline def setCacheIdUndefined: Self = StObject.set(x, "cacheId", js.undefined)
      
      inline def setClientsClaim(value: Boolean): Self = StObject.set(x, "clientsClaim", value.asInstanceOf[js.Any])
      
      inline def setClientsClaimUndefined: Self = StObject.set(x, "clientsClaim", js.undefined)
      
      inline def setDirectoryIndex(value: String): Self = StObject.set(x, "directoryIndex", value.asInstanceOf[js.Any])
      
      inline def setDirectoryIndexUndefined: Self = StObject.set(x, "directoryIndex", js.undefined)
      
      inline def setDontCacheBustUrlsMatching(value: js.RegExp): Self = StObject.set(x, "dontCacheBustUrlsMatching", value.asInstanceOf[js.Any])
      
      inline def setDontCacheBustUrlsMatchingUndefined: Self = StObject.set(x, "dontCacheBustUrlsMatching", js.undefined)
      
      inline def setDynamicUrlToDependencies(value: StringDictionary[String | Buffer | js.Array[String]]): Self = StObject.set(x, "dynamicUrlToDependencies", value.asInstanceOf[js.Any])
      
      inline def setDynamicUrlToDependenciesUndefined: Self = StObject.set(x, "dynamicUrlToDependencies", js.undefined)
      
      inline def setHandleFetch(value: Boolean): Self = StObject.set(x, "handleFetch", value.asInstanceOf[js.Any])
      
      inline def setHandleFetchUndefined: Self = StObject.set(x, "handleFetch", js.undefined)
      
      inline def setIgnoreUrlParametersMatching(value: js.Array[js.RegExp]): Self = StObject.set(x, "ignoreUrlParametersMatching", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUrlParametersMatchingUndefined: Self = StObject.set(x, "ignoreUrlParametersMatching", js.undefined)
      
      inline def setIgnoreUrlParametersMatchingVarargs(value: js.RegExp*): Self = StObject.set(x, "ignoreUrlParametersMatching", js.Array(value*))
      
      inline def setImportScripts(value: js.Array[String]): Self = StObject.set(x, "importScripts", value.asInstanceOf[js.Any])
      
      inline def setImportScriptsUndefined: Self = StObject.set(x, "importScripts", js.undefined)
      
      inline def setImportScriptsVarargs(value: String*): Self = StObject.set(x, "importScripts", js.Array(value*))
      
      inline def setLogger(value: /* repeated */ Any => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction1(value))
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setMaximumFileSizeToCacheInBytes(value: Double): Self = StObject.set(x, "maximumFileSizeToCacheInBytes", value.asInstanceOf[js.Any])
      
      inline def setMaximumFileSizeToCacheInBytesUndefined: Self = StObject.set(x, "maximumFileSizeToCacheInBytes", js.undefined)
      
      inline def setNavigateFallback(value: String): Self = StObject.set(x, "navigateFallback", value.asInstanceOf[js.Any])
      
      inline def setNavigateFallbackUndefined: Self = StObject.set(x, "navigateFallback", js.undefined)
      
      inline def setNavigateFallbackWhitelist(value: js.Array[js.RegExp]): Self = StObject.set(x, "navigateFallbackWhitelist", value.asInstanceOf[js.Any])
      
      inline def setNavigateFallbackWhitelistUndefined: Self = StObject.set(x, "navigateFallbackWhitelist", js.undefined)
      
      inline def setNavigateFallbackWhitelistVarargs(value: js.RegExp*): Self = StObject.set(x, "navigateFallbackWhitelist", js.Array(value*))
      
      inline def setReplacePrefix(value: String): Self = StObject.set(x, "replacePrefix", value.asInstanceOf[js.Any])
      
      inline def setReplacePrefixUndefined: Self = StObject.set(x, "replacePrefix", js.undefined)
      
      inline def setRuntimeCaching(value: js.Array[typings.swPrecache.anon.Handler]): Self = StObject.set(x, "runtimeCaching", value.asInstanceOf[js.Any])
      
      inline def setRuntimeCachingUndefined: Self = StObject.set(x, "runtimeCaching", js.undefined)
      
      inline def setRuntimeCachingVarargs(value: typings.swPrecache.anon.Handler*): Self = StObject.set(x, "runtimeCaching", js.Array(value*))
      
      inline def setSkipWaiting(value: Boolean): Self = StObject.set(x, "skipWaiting", value.asInstanceOf[js.Any])
      
      inline def setSkipWaitingUndefined: Self = StObject.set(x, "skipWaiting", js.undefined)
      
      inline def setStaticFileGlobs(value: js.Array[String]): Self = StObject.set(x, "staticFileGlobs", value.asInstanceOf[js.Any])
      
      inline def setStaticFileGlobsUndefined: Self = StObject.set(x, "staticFileGlobs", js.undefined)
      
      inline def setStaticFileGlobsVarargs(value: String*): Self = StObject.set(x, "staticFileGlobs", js.Array(value*))
      
      inline def setStripPrefix(value: String): Self = StObject.set(x, "stripPrefix", value.asInstanceOf[js.Any])
      
      inline def setStripPrefixMulti(value: StringDictionary[String]): Self = StObject.set(x, "stripPrefixMulti", value.asInstanceOf[js.Any])
      
      inline def setStripPrefixMultiUndefined: Self = StObject.set(x, "stripPrefixMulti", js.undefined)
      
      inline def setStripPrefixUndefined: Self = StObject.set(x, "stripPrefix", js.undefined)
      
      inline def setTemplateFilePath(value: String): Self = StObject.set(x, "templateFilePath", value.asInstanceOf[js.Any])
      
      inline def setTemplateFilePathUndefined: Self = StObject.set(x, "templateFilePath", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  type Write_ = js.Function3[
    /* filePath */ String, 
    /* options */ js.UndefOr[Options], 
    /* callback */ js.UndefOr[
      js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ /* error */ Any, 
        Unit
      ]
    ], 
    js.Promise[String]
  ]
  
  trait _Handler extends StObject
}
