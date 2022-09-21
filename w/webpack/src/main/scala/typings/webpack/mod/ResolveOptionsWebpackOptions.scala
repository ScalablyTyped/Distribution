package typings.webpack.mod

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.anon.Alias
import typings.webpack.webpackBooleans.`false`
import typings.webpack.webpackStrings.DotDotDot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options object for resolving requests.
  */
trait ResolveOptionsWebpackOptions extends StObject {
  
  /**
  	 * Redirect module requests.
  	 */
  var alias: js.UndefOr[js.Array[Alias] | (StringDictionary[String | `false` | js.Array[String]])] = js.undefined
  
  /**
  	 * Fields in the description file (usually package.json) which are used to redirect requests inside the module.
  	 */
  var aliasFields: js.UndefOr[js.Array[String | js.Array[String]]] = js.undefined
  
  /**
  	 * Extra resolve options per dependency category. Typical categories are "commonjs", "amd", "esm".
  	 */
  var byDependency: js.UndefOr[StringDictionary[ResolveOptionsWebpackOptions]] = js.undefined
  
  /**
  	 * Enable caching of successfully resolved requests (cache entries are revalidated).
  	 */
  var cache: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Predicate function to decide which requests should be cached.
  	 */
  var cachePredicate: js.UndefOr[js.Function1[/* request */ ResolveRequest, Boolean]] = js.undefined
  
  /**
  	 * Include the context information in the cache identifier when caching.
  	 */
  var cacheWithContext: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Condition names for exports field entry point.
  	 */
  var conditionNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  	 * Filenames used to find a description file (like a package.json).
  	 */
  var descriptionFiles: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  	 * Enforce the resolver to use one of the extensions from the extensions option (User must specify requests without extension).
  	 */
  var enforceExtension: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Field names from the description file (usually package.json) which are used to provide entry points of a package.
  	 */
  var exportsFields: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  	 * An object which maps extension to extension aliases.
  	 */
  var extensionAlias: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.undefined
  
  /**
  	 * Extensions added to the request when trying to find the file.
  	 */
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  	 * Redirect module requests when normal resolving fails.
  	 */
  var fallback: js.UndefOr[js.Array[Alias] | (StringDictionary[String | `false` | js.Array[String]])] = js.undefined
  
  /**
  	 * Filesystem for the resolver.
  	 */
  var fileSystem: js.UndefOr[InputFileSystem] = js.undefined
  
  /**
  	 * Treats the request specified by the user as fully specified, meaning no extensions are added and the mainFiles in directories are not resolved (This doesn't affect requests from mainFields, aliasFields or aliases).
  	 */
  var fullySpecified: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Field names from the description file (usually package.json) which are used to provide internal request of a package (requests starting with # are considered as internal).
  	 */
  var importsFields: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  	 * Field names from the description file (package.json) which are used to find the default entry point.
  	 */
  var mainFields: js.UndefOr[js.Array[String | js.Array[String]]] = js.undefined
  
  /**
  	 * Filenames used to find the default entry point if there is no description file or main field.
  	 */
  var mainFiles: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  	 * Folder names or directory paths where to find modules.
  	 */
  var modules: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  	 * Plugins for the resolver.
  	 */
  var plugins: js.UndefOr[js.Array[ResolvePluginInstance | DotDotDot]] = js.undefined
  
  /**
  	 * Prefer to resolve server-relative URLs (starting with '/') as absolute paths before falling back to resolve in 'resolve.roots'.
  	 */
  var preferAbsolute: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Prefer to resolve module requests as relative request and fallback to resolving as module.
  	 */
  var preferRelative: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Custom resolver.
  	 */
  var resolver: js.UndefOr[Resolver] = js.undefined
  
  /**
  	 * A list of resolve restrictions. Resolve results must fulfill all of these restrictions to resolve successfully. Other resolve paths are taken when restrictions are not met.
  	 */
  var restrictions: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
  
  /**
  	 * A list of directories in which requests that are server-relative URLs (starting with '/') are resolved.
  	 */
  var roots: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  	 * Enable resolving symlinks to the original location.
  	 */
  var symlinks: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Enable caching of successfully resolved requests (cache entries are not revalidated).
  	 */
  var unsafeCache: js.UndefOr[Boolean | StringDictionary[Any]] = js.undefined
  
  /**
  	 * Use synchronous filesystem calls for the resolver.
  	 */
  var useSyncFileSystemCalls: js.UndefOr[Boolean] = js.undefined
}
object ResolveOptionsWebpackOptions {
  
  inline def apply(): ResolveOptionsWebpackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveOptionsWebpackOptions]
  }
  
  extension [Self <: ResolveOptionsWebpackOptions](x: Self) {
    
    inline def setAlias(value: js.Array[Alias] | (StringDictionary[String | `false` | js.Array[String]])): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasFields(value: js.Array[String | js.Array[String]]): Self = StObject.set(x, "aliasFields", value.asInstanceOf[js.Any])
    
    inline def setAliasFieldsUndefined: Self = StObject.set(x, "aliasFields", js.undefined)
    
    inline def setAliasFieldsVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "aliasFields", js.Array(value*))
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setAliasVarargs(value: Alias*): Self = StObject.set(x, "alias", js.Array(value*))
    
    inline def setByDependency(value: StringDictionary[ResolveOptionsWebpackOptions]): Self = StObject.set(x, "byDependency", value.asInstanceOf[js.Any])
    
    inline def setByDependencyUndefined: Self = StObject.set(x, "byDependency", js.undefined)
    
    inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCachePredicate(value: /* request */ ResolveRequest => Boolean): Self = StObject.set(x, "cachePredicate", js.Any.fromFunction1(value))
    
    inline def setCachePredicateUndefined: Self = StObject.set(x, "cachePredicate", js.undefined)
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setCacheWithContext(value: Boolean): Self = StObject.set(x, "cacheWithContext", value.asInstanceOf[js.Any])
    
    inline def setCacheWithContextUndefined: Self = StObject.set(x, "cacheWithContext", js.undefined)
    
    inline def setConditionNames(value: js.Array[String]): Self = StObject.set(x, "conditionNames", value.asInstanceOf[js.Any])
    
    inline def setConditionNamesUndefined: Self = StObject.set(x, "conditionNames", js.undefined)
    
    inline def setConditionNamesVarargs(value: String*): Self = StObject.set(x, "conditionNames", js.Array(value*))
    
    inline def setDescriptionFiles(value: js.Array[String]): Self = StObject.set(x, "descriptionFiles", value.asInstanceOf[js.Any])
    
    inline def setDescriptionFilesUndefined: Self = StObject.set(x, "descriptionFiles", js.undefined)
    
    inline def setDescriptionFilesVarargs(value: String*): Self = StObject.set(x, "descriptionFiles", js.Array(value*))
    
    inline def setEnforceExtension(value: Boolean): Self = StObject.set(x, "enforceExtension", value.asInstanceOf[js.Any])
    
    inline def setEnforceExtensionUndefined: Self = StObject.set(x, "enforceExtension", js.undefined)
    
    inline def setExportsFields(value: js.Array[String]): Self = StObject.set(x, "exportsFields", value.asInstanceOf[js.Any])
    
    inline def setExportsFieldsUndefined: Self = StObject.set(x, "exportsFields", js.undefined)
    
    inline def setExportsFieldsVarargs(value: String*): Self = StObject.set(x, "exportsFields", js.Array(value*))
    
    inline def setExtensionAlias(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "extensionAlias", value.asInstanceOf[js.Any])
    
    inline def setExtensionAliasUndefined: Self = StObject.set(x, "extensionAlias", js.undefined)
    
    inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setFallback(value: js.Array[Alias] | (StringDictionary[String | `false` | js.Array[String]])): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    inline def setFallbackVarargs(value: Alias*): Self = StObject.set(x, "fallback", js.Array(value*))
    
    inline def setFileSystem(value: InputFileSystem): Self = StObject.set(x, "fileSystem", value.asInstanceOf[js.Any])
    
    inline def setFileSystemUndefined: Self = StObject.set(x, "fileSystem", js.undefined)
    
    inline def setFullySpecified(value: Boolean): Self = StObject.set(x, "fullySpecified", value.asInstanceOf[js.Any])
    
    inline def setFullySpecifiedUndefined: Self = StObject.set(x, "fullySpecified", js.undefined)
    
    inline def setImportsFields(value: js.Array[String]): Self = StObject.set(x, "importsFields", value.asInstanceOf[js.Any])
    
    inline def setImportsFieldsUndefined: Self = StObject.set(x, "importsFields", js.undefined)
    
    inline def setImportsFieldsVarargs(value: String*): Self = StObject.set(x, "importsFields", js.Array(value*))
    
    inline def setMainFields(value: js.Array[String | js.Array[String]]): Self = StObject.set(x, "mainFields", value.asInstanceOf[js.Any])
    
    inline def setMainFieldsUndefined: Self = StObject.set(x, "mainFields", js.undefined)
    
    inline def setMainFieldsVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "mainFields", js.Array(value*))
    
    inline def setMainFiles(value: js.Array[String]): Self = StObject.set(x, "mainFiles", value.asInstanceOf[js.Any])
    
    inline def setMainFilesUndefined: Self = StObject.set(x, "mainFiles", js.undefined)
    
    inline def setMainFilesVarargs(value: String*): Self = StObject.set(x, "mainFiles", js.Array(value*))
    
    inline def setModules(value: js.Array[String]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
    
    inline def setModulesVarargs(value: String*): Self = StObject.set(x, "modules", js.Array(value*))
    
    inline def setPlugins(value: js.Array[ResolvePluginInstance | DotDotDot]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: (ResolvePluginInstance | DotDotDot)*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setPreferAbsolute(value: Boolean): Self = StObject.set(x, "preferAbsolute", value.asInstanceOf[js.Any])
    
    inline def setPreferAbsoluteUndefined: Self = StObject.set(x, "preferAbsolute", js.undefined)
    
    inline def setPreferRelative(value: Boolean): Self = StObject.set(x, "preferRelative", value.asInstanceOf[js.Any])
    
    inline def setPreferRelativeUndefined: Self = StObject.set(x, "preferRelative", js.undefined)
    
    inline def setResolver(value: Resolver): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
    
    inline def setResolverUndefined: Self = StObject.set(x, "resolver", js.undefined)
    
    inline def setRestrictions(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    inline def setRestrictionsUndefined: Self = StObject.set(x, "restrictions", js.undefined)
    
    inline def setRestrictionsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "restrictions", js.Array(value*))
    
    inline def setRoots(value: js.Array[String]): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
    
    inline def setRootsUndefined: Self = StObject.set(x, "roots", js.undefined)
    
    inline def setRootsVarargs(value: String*): Self = StObject.set(x, "roots", js.Array(value*))
    
    inline def setSymlinks(value: Boolean): Self = StObject.set(x, "symlinks", value.asInstanceOf[js.Any])
    
    inline def setSymlinksUndefined: Self = StObject.set(x, "symlinks", js.undefined)
    
    inline def setUnsafeCache(value: Boolean | StringDictionary[Any]): Self = StObject.set(x, "unsafeCache", value.asInstanceOf[js.Any])
    
    inline def setUnsafeCacheUndefined: Self = StObject.set(x, "unsafeCache", js.undefined)
    
    inline def setUseSyncFileSystemCalls(value: Boolean): Self = StObject.set(x, "useSyncFileSystemCalls", value.asInstanceOf[js.Any])
    
    inline def setUseSyncFileSystemCallsUndefined: Self = StObject.set(x, "useSyncFileSystemCalls", js.undefined)
  }
}
