package typings.webpack.webpackOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.anon.Alias
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveOptions extends StObject {
  
  /**
  	 * Redirect module requests
  	 */
  var alias: js.UndefOr[(/**
  				 * New request
  				 */
  StringDictionary[String]) | js.Array[Alias]] = js.undefined
  
  /**
  	 * Fields in the description file (package.json) which are used to redirect requests inside the module
  	 */
  var aliasFields: js.UndefOr[ArrayOfStringOrStringArrayValues] = js.undefined
  
  /**
  	 * Predicate function to decide which requests should be cached
  	 */
  var cachePredicate: js.UndefOr[js.Function] = js.undefined
  
  /**
  	 * Include the context information in the cache identifier when caching
  	 */
  var cacheWithContext: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Enable concord resolving extras
  	 */
  var concord: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Filenames used to find a description file
  	 */
  var descriptionFiles: js.UndefOr[ArrayOfStringValues] = js.undefined
  
  /**
  	 * Enforce using one of the extensions from the extensions option
  	 */
  var enforceExtension: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Enforce using one of the module extensions from the moduleExtensions option
  	 */
  var enforceModuleExtension: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Extensions added to the request when trying to find the file
  	 */
  var extensions: js.UndefOr[ArrayOfStringValues] = js.undefined
  
  /**
  	 * Filesystem for the resolver
  	 */
  var fileSystem: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
  	 * Field names from the description file (package.json) which are used to find the default entry point
  	 */
  var mainFields: js.UndefOr[ArrayOfStringOrStringArrayValues] = js.undefined
  
  /**
  	 * Filenames used to find the default entry point if there is no description file or main field
  	 */
  var mainFiles: js.UndefOr[ArrayOfStringValues] = js.undefined
  
  /**
  	 * Extensions added to the module request when trying to find the module
  	 */
  var moduleExtensions: js.UndefOr[ArrayOfStringValues] = js.undefined
  
  /**
  	 * Folder names or directory paths where to find modules
  	 */
  var modules: js.UndefOr[ArrayOfStringValues] = js.undefined
  
  /**
  	 * Plugins for the resolver
  	 */
  var plugins: js.UndefOr[js.Array[WebpackPluginInstance | WebpackPluginFunction]] = js.undefined
  
  /**
  	 * Custom resolver
  	 */
  var resolver: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
  	 * A list of directories in which requests that are server-relative URLs (starting with '/') are resolved. On non-windows system these requests are tried to resolve as absolute path first.
  	 */
  var roots: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  	 * Enable resolving symlinks to the original location
  	 */
  var symlinks: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Enable caching of successfully resolved requests
  	 */
  var unsafeCache: js.UndefOr[Boolean | StringDictionary[js.Any]] = js.undefined
  
  /**
  	 * Use synchronous filesystem calls for the resolver
  	 */
  var useSyncFileSystemCalls: js.UndefOr[Boolean] = js.undefined
}
object ResolveOptions {
  
  inline def apply(): ResolveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveOptions]
  }
  
  extension [Self <: ResolveOptions](x: Self) {
    
    inline def setAlias(value: (/**
    				 * New request
    				 */
    StringDictionary[String]) | js.Array[Alias]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasFields(value: ArrayOfStringOrStringArrayValues): Self = StObject.set(x, "aliasFields", value.asInstanceOf[js.Any])
    
    inline def setAliasFieldsUndefined: Self = StObject.set(x, "aliasFields", js.undefined)
    
    inline def setAliasFieldsVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "aliasFields", js.Array(value :_*))
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setAliasVarargs(value: Alias*): Self = StObject.set(x, "alias", js.Array(value :_*))
    
    inline def setCachePredicate(value: js.Function): Self = StObject.set(x, "cachePredicate", value.asInstanceOf[js.Any])
    
    inline def setCachePredicateUndefined: Self = StObject.set(x, "cachePredicate", js.undefined)
    
    inline def setCacheWithContext(value: Boolean): Self = StObject.set(x, "cacheWithContext", value.asInstanceOf[js.Any])
    
    inline def setCacheWithContextUndefined: Self = StObject.set(x, "cacheWithContext", js.undefined)
    
    inline def setConcord(value: Boolean): Self = StObject.set(x, "concord", value.asInstanceOf[js.Any])
    
    inline def setConcordUndefined: Self = StObject.set(x, "concord", js.undefined)
    
    inline def setDescriptionFiles(value: ArrayOfStringValues): Self = StObject.set(x, "descriptionFiles", value.asInstanceOf[js.Any])
    
    inline def setDescriptionFilesUndefined: Self = StObject.set(x, "descriptionFiles", js.undefined)
    
    inline def setDescriptionFilesVarargs(value: String*): Self = StObject.set(x, "descriptionFiles", js.Array(value :_*))
    
    inline def setEnforceExtension(value: Boolean): Self = StObject.set(x, "enforceExtension", value.asInstanceOf[js.Any])
    
    inline def setEnforceExtensionUndefined: Self = StObject.set(x, "enforceExtension", js.undefined)
    
    inline def setEnforceModuleExtension(value: Boolean): Self = StObject.set(x, "enforceModuleExtension", value.asInstanceOf[js.Any])
    
    inline def setEnforceModuleExtensionUndefined: Self = StObject.set(x, "enforceModuleExtension", js.undefined)
    
    inline def setExtensions(value: ArrayOfStringValues): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    inline def setFileSystem(value: StringDictionary[js.Any]): Self = StObject.set(x, "fileSystem", value.asInstanceOf[js.Any])
    
    inline def setFileSystemUndefined: Self = StObject.set(x, "fileSystem", js.undefined)
    
    inline def setMainFields(value: ArrayOfStringOrStringArrayValues): Self = StObject.set(x, "mainFields", value.asInstanceOf[js.Any])
    
    inline def setMainFieldsUndefined: Self = StObject.set(x, "mainFields", js.undefined)
    
    inline def setMainFieldsVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "mainFields", js.Array(value :_*))
    
    inline def setMainFiles(value: ArrayOfStringValues): Self = StObject.set(x, "mainFiles", value.asInstanceOf[js.Any])
    
    inline def setMainFilesUndefined: Self = StObject.set(x, "mainFiles", js.undefined)
    
    inline def setMainFilesVarargs(value: String*): Self = StObject.set(x, "mainFiles", js.Array(value :_*))
    
    inline def setModuleExtensions(value: ArrayOfStringValues): Self = StObject.set(x, "moduleExtensions", value.asInstanceOf[js.Any])
    
    inline def setModuleExtensionsUndefined: Self = StObject.set(x, "moduleExtensions", js.undefined)
    
    inline def setModuleExtensionsVarargs(value: String*): Self = StObject.set(x, "moduleExtensions", js.Array(value :_*))
    
    inline def setModules(value: ArrayOfStringValues): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
    
    inline def setModulesVarargs(value: String*): Self = StObject.set(x, "modules", js.Array(value :_*))
    
    inline def setPlugins(value: js.Array[WebpackPluginInstance | WebpackPluginFunction]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: (WebpackPluginInstance | WebpackPluginFunction)*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    
    inline def setResolver(value: StringDictionary[js.Any]): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
    
    inline def setResolverUndefined: Self = StObject.set(x, "resolver", js.undefined)
    
    inline def setRoots(value: js.Array[String]): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
    
    inline def setRootsUndefined: Self = StObject.set(x, "roots", js.undefined)
    
    inline def setRootsVarargs(value: String*): Self = StObject.set(x, "roots", js.Array(value :_*))
    
    inline def setSymlinks(value: Boolean): Self = StObject.set(x, "symlinks", value.asInstanceOf[js.Any])
    
    inline def setSymlinksUndefined: Self = StObject.set(x, "symlinks", js.undefined)
    
    inline def setUnsafeCache(value: Boolean | StringDictionary[js.Any]): Self = StObject.set(x, "unsafeCache", value.asInstanceOf[js.Any])
    
    inline def setUnsafeCacheUndefined: Self = StObject.set(x, "unsafeCache", js.undefined)
    
    inline def setUseSyncFileSystemCalls(value: Boolean): Self = StObject.set(x, "useSyncFileSystemCalls", value.asInstanceOf[js.Any])
    
    inline def setUseSyncFileSystemCallsUndefined: Self = StObject.set(x, "useSyncFileSystemCalls", js.undefined)
  }
}
