package typings.vite.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Required<vite.vite.ResolveOptions> */
trait InternalResolveOptions extends StObject {
  
  /**
    * src code mode also attempts the following:
    * - resolving /xxx as URLs
    * - resolving bare imports from optimized deps
    */
  var asSrc: js.UndefOr[Boolean] = js.undefined
  
  var browserField: Boolean
  
  var conditions: js.Array[String]
  
  var dedupe: js.Array[String]
  
  var extensions: js.Array[String]
  
  var getDepsOptimizer: js.UndefOr[js.Function1[/* ssr */ Boolean, js.UndefOr[DepsOptimizer]]] = js.undefined
  
  var isBuild: Boolean
  
  var isFromTsImporter: js.UndefOr[Boolean] = js.undefined
  
  var isProduction: Boolean
  
  var isRequire: js.UndefOr[Boolean] = js.undefined
  
  var mainFields: js.Array[String]
  
  var packageCache: js.UndefOr[PackageCache] = js.undefined
  
  var preferRelative: js.UndefOr[Boolean] = js.undefined
  
  var preserveSymlinks: Boolean
  
  var root: String
  
  var scan: js.UndefOr[Boolean] = js.undefined
  
  var shouldExternalize: js.UndefOr[js.Function1[/* id */ String, js.UndefOr[Boolean]]] = js.undefined
  
  var ssrConfig: js.UndefOr[SSROptions] = js.undefined
  
  var ssrOptimizeCheck: js.UndefOr[Boolean] = js.undefined
  
  var tryEsmOnly: js.UndefOr[Boolean] = js.undefined
  
  var tryIndex: js.UndefOr[Boolean] = js.undefined
  
  var tryPrefix: js.UndefOr[String] = js.undefined
}
object InternalResolveOptions {
  
  inline def apply(
    browserField: Boolean,
    conditions: js.Array[String],
    dedupe: js.Array[String],
    extensions: js.Array[String],
    isBuild: Boolean,
    isProduction: Boolean,
    mainFields: js.Array[String],
    preserveSymlinks: Boolean,
    root: String
  ): InternalResolveOptions = {
    val __obj = js.Dynamic.literal(browserField = browserField.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], dedupe = dedupe.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], isBuild = isBuild.asInstanceOf[js.Any], isProduction = isProduction.asInstanceOf[js.Any], mainFields = mainFields.asInstanceOf[js.Any], preserveSymlinks = preserveSymlinks.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalResolveOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InternalResolveOptions] (val x: Self) extends AnyVal {
    
    inline def setAsSrc(value: Boolean): Self = StObject.set(x, "asSrc", value.asInstanceOf[js.Any])
    
    inline def setAsSrcUndefined: Self = StObject.set(x, "asSrc", js.undefined)
    
    inline def setBrowserField(value: Boolean): Self = StObject.set(x, "browserField", value.asInstanceOf[js.Any])
    
    inline def setConditions(value: js.Array[String]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsVarargs(value: String*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setDedupe(value: js.Array[String]): Self = StObject.set(x, "dedupe", value.asInstanceOf[js.Any])
    
    inline def setDedupeVarargs(value: String*): Self = StObject.set(x, "dedupe", js.Array(value*))
    
    inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setGetDepsOptimizer(value: /* ssr */ Boolean => js.UndefOr[DepsOptimizer]): Self = StObject.set(x, "getDepsOptimizer", js.Any.fromFunction1(value))
    
    inline def setGetDepsOptimizerUndefined: Self = StObject.set(x, "getDepsOptimizer", js.undefined)
    
    inline def setIsBuild(value: Boolean): Self = StObject.set(x, "isBuild", value.asInstanceOf[js.Any])
    
    inline def setIsFromTsImporter(value: Boolean): Self = StObject.set(x, "isFromTsImporter", value.asInstanceOf[js.Any])
    
    inline def setIsFromTsImporterUndefined: Self = StObject.set(x, "isFromTsImporter", js.undefined)
    
    inline def setIsProduction(value: Boolean): Self = StObject.set(x, "isProduction", value.asInstanceOf[js.Any])
    
    inline def setIsRequire(value: Boolean): Self = StObject.set(x, "isRequire", value.asInstanceOf[js.Any])
    
    inline def setIsRequireUndefined: Self = StObject.set(x, "isRequire", js.undefined)
    
    inline def setMainFields(value: js.Array[String]): Self = StObject.set(x, "mainFields", value.asInstanceOf[js.Any])
    
    inline def setMainFieldsVarargs(value: String*): Self = StObject.set(x, "mainFields", js.Array(value*))
    
    inline def setPackageCache(value: PackageCache): Self = StObject.set(x, "packageCache", value.asInstanceOf[js.Any])
    
    inline def setPackageCacheUndefined: Self = StObject.set(x, "packageCache", js.undefined)
    
    inline def setPreferRelative(value: Boolean): Self = StObject.set(x, "preferRelative", value.asInstanceOf[js.Any])
    
    inline def setPreferRelativeUndefined: Self = StObject.set(x, "preferRelative", js.undefined)
    
    inline def setPreserveSymlinks(value: Boolean): Self = StObject.set(x, "preserveSymlinks", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setScan(value: Boolean): Self = StObject.set(x, "scan", value.asInstanceOf[js.Any])
    
    inline def setScanUndefined: Self = StObject.set(x, "scan", js.undefined)
    
    inline def setShouldExternalize(value: /* id */ String => js.UndefOr[Boolean]): Self = StObject.set(x, "shouldExternalize", js.Any.fromFunction1(value))
    
    inline def setShouldExternalizeUndefined: Self = StObject.set(x, "shouldExternalize", js.undefined)
    
    inline def setSsrConfig(value: SSROptions): Self = StObject.set(x, "ssrConfig", value.asInstanceOf[js.Any])
    
    inline def setSsrConfigUndefined: Self = StObject.set(x, "ssrConfig", js.undefined)
    
    inline def setSsrOptimizeCheck(value: Boolean): Self = StObject.set(x, "ssrOptimizeCheck", value.asInstanceOf[js.Any])
    
    inline def setSsrOptimizeCheckUndefined: Self = StObject.set(x, "ssrOptimizeCheck", js.undefined)
    
    inline def setTryEsmOnly(value: Boolean): Self = StObject.set(x, "tryEsmOnly", value.asInstanceOf[js.Any])
    
    inline def setTryEsmOnlyUndefined: Self = StObject.set(x, "tryEsmOnly", js.undefined)
    
    inline def setTryIndex(value: Boolean): Self = StObject.set(x, "tryIndex", value.asInstanceOf[js.Any])
    
    inline def setTryIndexUndefined: Self = StObject.set(x, "tryIndex", js.undefined)
    
    inline def setTryPrefix(value: String): Self = StObject.set(x, "tryPrefix", value.asInstanceOf[js.Any])
    
    inline def setTryPrefixUndefined: Self = StObject.set(x, "tryPrefix", js.undefined)
  }
}
