package typings.workboxBuild.anon

import typings.workboxGoogleAnalytics.initializeMod.GoogleAnalyticsInitializeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<workbox-build.workbox-build/build/types.GeneratePartial, 'runtimeCaching'> & workbox-build.workbox-build/build/types.RequiredSWDestPartial & {  unbundledCode :string} */
trait OmitGeneratePartialruntim extends StObject {
  
  var babelPresetEnvTargets: js.UndefOr[js.Array[String]] = js.undefined
  
  var cacheId: js.UndefOr[String | Null] = js.undefined
  
  var cleanupOutdatedCaches: js.UndefOr[Boolean] = js.undefined
  
  var clientsClaim: js.UndefOr[Boolean] = js.undefined
  
  var directoryIndex: js.UndefOr[String | Null] = js.undefined
  
  var disableDevLogs: js.UndefOr[Boolean] = js.undefined
  
  var ignoreURLParametersMatching: js.UndefOr[js.Array[js.RegExp]] = js.undefined
  
  var importScripts: js.UndefOr[js.Array[String]] = js.undefined
  
  var inlineWorkboxRuntime: js.UndefOr[Boolean] = js.undefined
  
  var mode: js.UndefOr[String | Null] = js.undefined
  
  var navigateFallback: js.UndefOr[String | Null] = js.undefined
  
  var navigateFallbackAllowlist: js.UndefOr[js.Array[js.RegExp]] = js.undefined
  
  var navigateFallbackDenylist: js.UndefOr[js.Array[js.RegExp]] = js.undefined
  
  var navigationPreload: js.UndefOr[Boolean] = js.undefined
  
  var offlineGoogleAnalytics: js.UndefOr[Boolean | GoogleAnalyticsInitializeOptions] = js.undefined
  
  var skipWaiting: js.UndefOr[Boolean] = js.undefined
  
  var sourcemap: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The path and filename of the service worker file that will be created by
    * the build process, relative to the current working directory. It must end
    * in '.js'.
    */
  var swDest: String
  
  var unbundledCode: String
}
object OmitGeneratePartialruntim {
  
  inline def apply(swDest: String, unbundledCode: String): OmitGeneratePartialruntim = {
    val __obj = js.Dynamic.literal(swDest = swDest.asInstanceOf[js.Any], unbundledCode = unbundledCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitGeneratePartialruntim]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitGeneratePartialruntim] (val x: Self) extends AnyVal {
    
    inline def setBabelPresetEnvTargets(value: js.Array[String]): Self = StObject.set(x, "babelPresetEnvTargets", value.asInstanceOf[js.Any])
    
    inline def setBabelPresetEnvTargetsUndefined: Self = StObject.set(x, "babelPresetEnvTargets", js.undefined)
    
    inline def setBabelPresetEnvTargetsVarargs(value: String*): Self = StObject.set(x, "babelPresetEnvTargets", js.Array(value*))
    
    inline def setCacheId(value: String): Self = StObject.set(x, "cacheId", value.asInstanceOf[js.Any])
    
    inline def setCacheIdNull: Self = StObject.set(x, "cacheId", null)
    
    inline def setCacheIdUndefined: Self = StObject.set(x, "cacheId", js.undefined)
    
    inline def setCleanupOutdatedCaches(value: Boolean): Self = StObject.set(x, "cleanupOutdatedCaches", value.asInstanceOf[js.Any])
    
    inline def setCleanupOutdatedCachesUndefined: Self = StObject.set(x, "cleanupOutdatedCaches", js.undefined)
    
    inline def setClientsClaim(value: Boolean): Self = StObject.set(x, "clientsClaim", value.asInstanceOf[js.Any])
    
    inline def setClientsClaimUndefined: Self = StObject.set(x, "clientsClaim", js.undefined)
    
    inline def setDirectoryIndex(value: String): Self = StObject.set(x, "directoryIndex", value.asInstanceOf[js.Any])
    
    inline def setDirectoryIndexNull: Self = StObject.set(x, "directoryIndex", null)
    
    inline def setDirectoryIndexUndefined: Self = StObject.set(x, "directoryIndex", js.undefined)
    
    inline def setDisableDevLogs(value: Boolean): Self = StObject.set(x, "disableDevLogs", value.asInstanceOf[js.Any])
    
    inline def setDisableDevLogsUndefined: Self = StObject.set(x, "disableDevLogs", js.undefined)
    
    inline def setIgnoreURLParametersMatching(value: js.Array[js.RegExp]): Self = StObject.set(x, "ignoreURLParametersMatching", value.asInstanceOf[js.Any])
    
    inline def setIgnoreURLParametersMatchingUndefined: Self = StObject.set(x, "ignoreURLParametersMatching", js.undefined)
    
    inline def setIgnoreURLParametersMatchingVarargs(value: js.RegExp*): Self = StObject.set(x, "ignoreURLParametersMatching", js.Array(value*))
    
    inline def setImportScripts(value: js.Array[String]): Self = StObject.set(x, "importScripts", value.asInstanceOf[js.Any])
    
    inline def setImportScriptsUndefined: Self = StObject.set(x, "importScripts", js.undefined)
    
    inline def setImportScriptsVarargs(value: String*): Self = StObject.set(x, "importScripts", js.Array(value*))
    
    inline def setInlineWorkboxRuntime(value: Boolean): Self = StObject.set(x, "inlineWorkboxRuntime", value.asInstanceOf[js.Any])
    
    inline def setInlineWorkboxRuntimeUndefined: Self = StObject.set(x, "inlineWorkboxRuntime", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeNull: Self = StObject.set(x, "mode", null)
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setNavigateFallback(value: String): Self = StObject.set(x, "navigateFallback", value.asInstanceOf[js.Any])
    
    inline def setNavigateFallbackAllowlist(value: js.Array[js.RegExp]): Self = StObject.set(x, "navigateFallbackAllowlist", value.asInstanceOf[js.Any])
    
    inline def setNavigateFallbackAllowlistUndefined: Self = StObject.set(x, "navigateFallbackAllowlist", js.undefined)
    
    inline def setNavigateFallbackAllowlistVarargs(value: js.RegExp*): Self = StObject.set(x, "navigateFallbackAllowlist", js.Array(value*))
    
    inline def setNavigateFallbackDenylist(value: js.Array[js.RegExp]): Self = StObject.set(x, "navigateFallbackDenylist", value.asInstanceOf[js.Any])
    
    inline def setNavigateFallbackDenylistUndefined: Self = StObject.set(x, "navigateFallbackDenylist", js.undefined)
    
    inline def setNavigateFallbackDenylistVarargs(value: js.RegExp*): Self = StObject.set(x, "navigateFallbackDenylist", js.Array(value*))
    
    inline def setNavigateFallbackNull: Self = StObject.set(x, "navigateFallback", null)
    
    inline def setNavigateFallbackUndefined: Self = StObject.set(x, "navigateFallback", js.undefined)
    
    inline def setNavigationPreload(value: Boolean): Self = StObject.set(x, "navigationPreload", value.asInstanceOf[js.Any])
    
    inline def setNavigationPreloadUndefined: Self = StObject.set(x, "navigationPreload", js.undefined)
    
    inline def setOfflineGoogleAnalytics(value: Boolean | GoogleAnalyticsInitializeOptions): Self = StObject.set(x, "offlineGoogleAnalytics", value.asInstanceOf[js.Any])
    
    inline def setOfflineGoogleAnalyticsUndefined: Self = StObject.set(x, "offlineGoogleAnalytics", js.undefined)
    
    inline def setSkipWaiting(value: Boolean): Self = StObject.set(x, "skipWaiting", value.asInstanceOf[js.Any])
    
    inline def setSkipWaitingUndefined: Self = StObject.set(x, "skipWaiting", js.undefined)
    
    inline def setSourcemap(value: Boolean): Self = StObject.set(x, "sourcemap", value.asInstanceOf[js.Any])
    
    inline def setSourcemapUndefined: Self = StObject.set(x, "sourcemap", js.undefined)
    
    inline def setSwDest(value: String): Self = StObject.set(x, "swDest", value.asInstanceOf[js.Any])
    
    inline def setUnbundledCode(value: String): Self = StObject.set(x, "unbundledCode", value.asInstanceOf[js.Any])
  }
}
