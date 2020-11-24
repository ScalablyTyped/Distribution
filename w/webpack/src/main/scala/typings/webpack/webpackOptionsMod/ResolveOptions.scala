package typings.webpack.webpackOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.anon.Alias
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolveOptions extends js.Object {
  
  /**
  	 * Redirect module requests
  	 */
  var alias: js.UndefOr[(/**
  				 * New request
  				 */
  StringDictionary[String]) | js.Array[Alias]] = js.native
  
  /**
  	 * Fields in the description file (package.json) which are used to redirect requests inside the module
  	 */
  var aliasFields: js.UndefOr[ArrayOfStringOrStringArrayValues] = js.native
  
  /**
  	 * Predicate function to decide which requests should be cached
  	 */
  var cachePredicate: js.UndefOr[js.Function] = js.native
  
  /**
  	 * Include the context information in the cache identifier when caching
  	 */
  var cacheWithContext: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Enable concord resolving extras
  	 */
  var concord: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Filenames used to find a description file
  	 */
  var descriptionFiles: js.UndefOr[ArrayOfStringValues] = js.native
  
  /**
  	 * Enforce using one of the extensions from the extensions option
  	 */
  var enforceExtension: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Enforce using one of the module extensions from the moduleExtensions option
  	 */
  var enforceModuleExtension: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Extensions added to the request when trying to find the file
  	 */
  var extensions: js.UndefOr[ArrayOfStringValues] = js.native
  
  /**
  	 * Filesystem for the resolver
  	 */
  var fileSystem: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
  	 * Field names from the description file (package.json) which are used to find the default entry point
  	 */
  var mainFields: js.UndefOr[ArrayOfStringOrStringArrayValues] = js.native
  
  /**
  	 * Filenames used to find the default entry point if there is no description file or main field
  	 */
  var mainFiles: js.UndefOr[ArrayOfStringValues] = js.native
  
  /**
  	 * Extensions added to the module request when trying to find the module
  	 */
  var moduleExtensions: js.UndefOr[ArrayOfStringValues] = js.native
  
  /**
  	 * Folder names or directory paths where to find modules
  	 */
  var modules: js.UndefOr[ArrayOfStringValues] = js.native
  
  /**
  	 * Plugins for the resolver
  	 */
  var plugins: js.UndefOr[js.Array[WebpackPluginInstance | WebpackPluginFunction]] = js.native
  
  /**
  	 * Custom resolver
  	 */
  var resolver: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
  	 * A list of directories in which requests that are server-relative URLs (starting with '/') are resolved. On non-windows system these requests are tried to resolve as absolute path first.
  	 */
  var roots: js.UndefOr[js.Array[String]] = js.native
  
  /**
  	 * Enable resolving symlinks to the original location
  	 */
  var symlinks: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Enable caching of successfully resolved requests
  	 */
  var unsafeCache: js.UndefOr[Boolean | StringDictionary[js.Any]] = js.native
  
  /**
  	 * Use synchronous filesystem calls for the resolver
  	 */
  var useSyncFileSystemCalls: js.UndefOr[Boolean] = js.native
}
object ResolveOptions {
  
  @scala.inline
  def apply(): ResolveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveOptions]
  }
  
  @scala.inline
  implicit class ResolveOptionsOps[Self <: ResolveOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAliasVarargs(value: Alias*): Self = this.set("alias", js.Array(value :_*))
    
    @scala.inline
    def setAlias(value: (/**
    				 * New request
    				 */
    StringDictionary[String]) | js.Array[Alias]): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    
    @scala.inline
    def setAliasFieldsVarargs(value: (String | js.Array[String])*): Self = this.set("aliasFields", js.Array(value :_*))
    
    @scala.inline
    def setAliasFields(value: ArrayOfStringOrStringArrayValues): Self = this.set("aliasFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliasFields: Self = this.set("aliasFields", js.undefined)
    
    @scala.inline
    def setCachePredicate(value: js.Function): Self = this.set("cachePredicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCachePredicate: Self = this.set("cachePredicate", js.undefined)
    
    @scala.inline
    def setCacheWithContext(value: Boolean): Self = this.set("cacheWithContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheWithContext: Self = this.set("cacheWithContext", js.undefined)
    
    @scala.inline
    def setConcord(value: Boolean): Self = this.set("concord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcord: Self = this.set("concord", js.undefined)
    
    @scala.inline
    def setDescriptionFilesVarargs(value: String*): Self = this.set("descriptionFiles", js.Array(value :_*))
    
    @scala.inline
    def setDescriptionFiles(value: ArrayOfStringValues): Self = this.set("descriptionFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescriptionFiles: Self = this.set("descriptionFiles", js.undefined)
    
    @scala.inline
    def setEnforceExtension(value: Boolean): Self = this.set("enforceExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforceExtension: Self = this.set("enforceExtension", js.undefined)
    
    @scala.inline
    def setEnforceModuleExtension(value: Boolean): Self = this.set("enforceModuleExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforceModuleExtension: Self = this.set("enforceModuleExtension", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: ArrayOfStringValues): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setFileSystem(value: StringDictionary[js.Any]): Self = this.set("fileSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileSystem: Self = this.set("fileSystem", js.undefined)
    
    @scala.inline
    def setMainFieldsVarargs(value: (String | js.Array[String])*): Self = this.set("mainFields", js.Array(value :_*))
    
    @scala.inline
    def setMainFields(value: ArrayOfStringOrStringArrayValues): Self = this.set("mainFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainFields: Self = this.set("mainFields", js.undefined)
    
    @scala.inline
    def setMainFilesVarargs(value: String*): Self = this.set("mainFiles", js.Array(value :_*))
    
    @scala.inline
    def setMainFiles(value: ArrayOfStringValues): Self = this.set("mainFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainFiles: Self = this.set("mainFiles", js.undefined)
    
    @scala.inline
    def setModuleExtensionsVarargs(value: String*): Self = this.set("moduleExtensions", js.Array(value :_*))
    
    @scala.inline
    def setModuleExtensions(value: ArrayOfStringValues): Self = this.set("moduleExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModuleExtensions: Self = this.set("moduleExtensions", js.undefined)
    
    @scala.inline
    def setModulesVarargs(value: String*): Self = this.set("modules", js.Array(value :_*))
    
    @scala.inline
    def setModules(value: ArrayOfStringValues): Self = this.set("modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModules: Self = this.set("modules", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: (WebpackPluginInstance | WebpackPluginFunction)*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[WebpackPluginInstance | WebpackPluginFunction]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setResolver(value: StringDictionary[js.Any]): Self = this.set("resolver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolver: Self = this.set("resolver", js.undefined)
    
    @scala.inline
    def setRootsVarargs(value: String*): Self = this.set("roots", js.Array(value :_*))
    
    @scala.inline
    def setRoots(value: js.Array[String]): Self = this.set("roots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoots: Self = this.set("roots", js.undefined)
    
    @scala.inline
    def setSymlinks(value: Boolean): Self = this.set("symlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymlinks: Self = this.set("symlinks", js.undefined)
    
    @scala.inline
    def setUnsafeCache(value: Boolean | StringDictionary[js.Any]): Self = this.set("unsafeCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsafeCache: Self = this.set("unsafeCache", js.undefined)
    
    @scala.inline
    def setUseSyncFileSystemCalls(value: Boolean): Self = this.set("useSyncFileSystemCalls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSyncFileSystemCalls: Self = this.set("useSyncFileSystemCalls", js.undefined)
  }
}
