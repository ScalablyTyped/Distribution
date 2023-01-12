package typings.webpack.mod

import typings.std.Set
import typings.webpack.anon.ForceRelative
import typings.webpack.webpackBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveOptionsTypes extends StObject {
  
  var alias: js.Array[AliasOption]
  
  var aliasFields: Set[String | js.Array[String]]
  
  def cachePredicate(arg0: ResolveRequest): Boolean
  
  var cacheWithContext: Boolean
  
  /**
  	 * A list of exports field condition names.
  	 */
  var conditionNames: Set[String]
  
  var descriptionFiles: js.Array[String]
  
  var enforceExtension: Boolean
  
  var exportsFields: Set[String | js.Array[String]]
  
  var extensionAlias: js.Array[ExtensionAliasOption]
  
  var extensions: Set[String]
  
  var fallback: js.Array[AliasOption]
  
  var fileSystem: typings.std.FileSystem
  
  var fullySpecified: Boolean
  
  var importsFields: Set[String | js.Array[String]]
  
  var mainFields: js.Array[ForceRelative]
  
  var mainFiles: Set[String]
  
  var modules: js.Array[String | js.Array[String]]
  
  var plugins: js.Array[typings.std.Plugin]
  
  var pnpApi: Null | PnpApiImpl
  
  var preferAbsolute: Boolean
  
  var preferRelative: Boolean
  
  var resolveToContext: Boolean
  
  var resolver: js.UndefOr[Resolver] = js.undefined
  
  var restrictions: Set[String | js.RegExp]
  
  var roots: Set[String]
  
  var symlinks: Boolean
  
  var unsafeCache: `false` | js.Object
}
object ResolveOptionsTypes {
  
  inline def apply(
    alias: js.Array[AliasOption],
    aliasFields: Set[String | js.Array[String]],
    cachePredicate: ResolveRequest => Boolean,
    cacheWithContext: Boolean,
    conditionNames: Set[String],
    descriptionFiles: js.Array[String],
    enforceExtension: Boolean,
    exportsFields: Set[String | js.Array[String]],
    extensionAlias: js.Array[ExtensionAliasOption],
    extensions: Set[String],
    fallback: js.Array[AliasOption],
    fileSystem: typings.std.FileSystem,
    fullySpecified: Boolean,
    importsFields: Set[String | js.Array[String]],
    mainFields: js.Array[ForceRelative],
    mainFiles: Set[String],
    modules: js.Array[String | js.Array[String]],
    plugins: js.Array[typings.std.Plugin],
    preferAbsolute: Boolean,
    preferRelative: Boolean,
    resolveToContext: Boolean,
    restrictions: Set[String | js.RegExp],
    roots: Set[String],
    symlinks: Boolean,
    unsafeCache: `false` | js.Object
  ): ResolveOptionsTypes = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], aliasFields = aliasFields.asInstanceOf[js.Any], cachePredicate = js.Any.fromFunction1(cachePredicate), cacheWithContext = cacheWithContext.asInstanceOf[js.Any], conditionNames = conditionNames.asInstanceOf[js.Any], descriptionFiles = descriptionFiles.asInstanceOf[js.Any], enforceExtension = enforceExtension.asInstanceOf[js.Any], exportsFields = exportsFields.asInstanceOf[js.Any], extensionAlias = extensionAlias.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], fallback = fallback.asInstanceOf[js.Any], fileSystem = fileSystem.asInstanceOf[js.Any], fullySpecified = fullySpecified.asInstanceOf[js.Any], importsFields = importsFields.asInstanceOf[js.Any], mainFields = mainFields.asInstanceOf[js.Any], mainFiles = mainFiles.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], preferAbsolute = preferAbsolute.asInstanceOf[js.Any], preferRelative = preferRelative.asInstanceOf[js.Any], resolveToContext = resolveToContext.asInstanceOf[js.Any], restrictions = restrictions.asInstanceOf[js.Any], roots = roots.asInstanceOf[js.Any], symlinks = symlinks.asInstanceOf[js.Any], unsafeCache = unsafeCache.asInstanceOf[js.Any], pnpApi = null)
    __obj.asInstanceOf[ResolveOptionsTypes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolveOptionsTypes] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: js.Array[AliasOption]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasFields(value: Set[String | js.Array[String]]): Self = StObject.set(x, "aliasFields", value.asInstanceOf[js.Any])
    
    inline def setAliasVarargs(value: AliasOption*): Self = StObject.set(x, "alias", js.Array(value*))
    
    inline def setCachePredicate(value: ResolveRequest => Boolean): Self = StObject.set(x, "cachePredicate", js.Any.fromFunction1(value))
    
    inline def setCacheWithContext(value: Boolean): Self = StObject.set(x, "cacheWithContext", value.asInstanceOf[js.Any])
    
    inline def setConditionNames(value: Set[String]): Self = StObject.set(x, "conditionNames", value.asInstanceOf[js.Any])
    
    inline def setDescriptionFiles(value: js.Array[String]): Self = StObject.set(x, "descriptionFiles", value.asInstanceOf[js.Any])
    
    inline def setDescriptionFilesVarargs(value: String*): Self = StObject.set(x, "descriptionFiles", js.Array(value*))
    
    inline def setEnforceExtension(value: Boolean): Self = StObject.set(x, "enforceExtension", value.asInstanceOf[js.Any])
    
    inline def setExportsFields(value: Set[String | js.Array[String]]): Self = StObject.set(x, "exportsFields", value.asInstanceOf[js.Any])
    
    inline def setExtensionAlias(value: js.Array[ExtensionAliasOption]): Self = StObject.set(x, "extensionAlias", value.asInstanceOf[js.Any])
    
    inline def setExtensionAliasVarargs(value: ExtensionAliasOption*): Self = StObject.set(x, "extensionAlias", js.Array(value*))
    
    inline def setExtensions(value: Set[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setFallback(value: js.Array[AliasOption]): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setFallbackVarargs(value: AliasOption*): Self = StObject.set(x, "fallback", js.Array(value*))
    
    inline def setFileSystem(value: typings.std.FileSystem): Self = StObject.set(x, "fileSystem", value.asInstanceOf[js.Any])
    
    inline def setFullySpecified(value: Boolean): Self = StObject.set(x, "fullySpecified", value.asInstanceOf[js.Any])
    
    inline def setImportsFields(value: Set[String | js.Array[String]]): Self = StObject.set(x, "importsFields", value.asInstanceOf[js.Any])
    
    inline def setMainFields(value: js.Array[ForceRelative]): Self = StObject.set(x, "mainFields", value.asInstanceOf[js.Any])
    
    inline def setMainFieldsVarargs(value: ForceRelative*): Self = StObject.set(x, "mainFields", js.Array(value*))
    
    inline def setMainFiles(value: Set[String]): Self = StObject.set(x, "mainFiles", value.asInstanceOf[js.Any])
    
    inline def setModules(value: js.Array[String | js.Array[String]]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setModulesVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "modules", js.Array(value*))
    
    inline def setPlugins(value: js.Array[typings.std.Plugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsVarargs(value: typings.std.Plugin*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setPnpApi(value: PnpApiImpl): Self = StObject.set(x, "pnpApi", value.asInstanceOf[js.Any])
    
    inline def setPnpApiNull: Self = StObject.set(x, "pnpApi", null)
    
    inline def setPreferAbsolute(value: Boolean): Self = StObject.set(x, "preferAbsolute", value.asInstanceOf[js.Any])
    
    inline def setPreferRelative(value: Boolean): Self = StObject.set(x, "preferRelative", value.asInstanceOf[js.Any])
    
    inline def setResolveToContext(value: Boolean): Self = StObject.set(x, "resolveToContext", value.asInstanceOf[js.Any])
    
    inline def setResolver(value: Resolver): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
    
    inline def setResolverUndefined: Self = StObject.set(x, "resolver", js.undefined)
    
    inline def setRestrictions(value: Set[String | js.RegExp]): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    inline def setRoots(value: Set[String]): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
    
    inline def setSymlinks(value: Boolean): Self = StObject.set(x, "symlinks", value.asInstanceOf[js.Any])
    
    inline def setUnsafeCache(value: `false` | js.Object): Self = StObject.set(x, "unsafeCache", value.asInstanceOf[js.Any])
  }
}
