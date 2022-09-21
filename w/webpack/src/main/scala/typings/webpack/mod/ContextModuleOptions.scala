package typings.webpack.mod

import typings.webpack.webpackBooleans.`false`
import typings.webpack.webpackStrings.strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextModuleOptions extends StObject {
  
  var addon: js.UndefOr[String] = js.undefined
  
  var category: js.UndefOr[String] = js.undefined
  
  var chunkName: js.UndefOr[String] = js.undefined
  
  var exclude: js.UndefOr[js.RegExp] = js.undefined
  
  var groupOptions: js.UndefOr[RawChunkGroupOptions] = js.undefined
  
  var include: js.UndefOr[js.RegExp] = js.undefined
  
  var mode: ContextMode
  
  var namespaceObject: js.UndefOr[Boolean | strict] = js.undefined
  
  var recursive: Boolean
  
  /**
  	 * exports referenced from modules (won't be mangled)
  	 */
  var referencedExports: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  
  var regExp: js.RegExp
  
  var resolveOptions: Any
  
  var resource: String | `false` | js.Array[String]
  
  var resourceFragment: js.UndefOr[String] = js.undefined
  
  var resourceQuery: js.UndefOr[String] = js.undefined
  
  var typePrefix: js.UndefOr[String] = js.undefined
}
object ContextModuleOptions {
  
  inline def apply(
    mode: ContextMode,
    recursive: Boolean,
    regExp: js.RegExp,
    resolveOptions: Any,
    resource: String | `false` | js.Array[String]
  ): ContextModuleOptions = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any], regExp = regExp.asInstanceOf[js.Any], resolveOptions = resolveOptions.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextModuleOptions]
  }
  
  extension [Self <: ContextModuleOptions](x: Self) {
    
    inline def setAddon(value: String): Self = StObject.set(x, "addon", value.asInstanceOf[js.Any])
    
    inline def setAddonUndefined: Self = StObject.set(x, "addon", js.undefined)
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setChunkName(value: String): Self = StObject.set(x, "chunkName", value.asInstanceOf[js.Any])
    
    inline def setChunkNameUndefined: Self = StObject.set(x, "chunkName", js.undefined)
    
    inline def setExclude(value: js.RegExp): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setGroupOptions(value: RawChunkGroupOptions): Self = StObject.set(x, "groupOptions", value.asInstanceOf[js.Any])
    
    inline def setGroupOptionsUndefined: Self = StObject.set(x, "groupOptions", js.undefined)
    
    inline def setInclude(value: js.RegExp): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setMode(value: ContextMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setNamespaceObject(value: Boolean | strict): Self = StObject.set(x, "namespaceObject", value.asInstanceOf[js.Any])
    
    inline def setNamespaceObjectUndefined: Self = StObject.set(x, "namespaceObject", js.undefined)
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setReferencedExports(value: js.Array[js.Array[String]]): Self = StObject.set(x, "referencedExports", value.asInstanceOf[js.Any])
    
    inline def setReferencedExportsUndefined: Self = StObject.set(x, "referencedExports", js.undefined)
    
    inline def setReferencedExportsVarargs(value: js.Array[String]*): Self = StObject.set(x, "referencedExports", js.Array(value*))
    
    inline def setRegExp(value: js.RegExp): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
    
    inline def setResolveOptions(value: Any): Self = StObject.set(x, "resolveOptions", value.asInstanceOf[js.Any])
    
    inline def setResource(value: String | `false` | js.Array[String]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceFragment(value: String): Self = StObject.set(x, "resourceFragment", value.asInstanceOf[js.Any])
    
    inline def setResourceFragmentUndefined: Self = StObject.set(x, "resourceFragment", js.undefined)
    
    inline def setResourceQuery(value: String): Self = StObject.set(x, "resourceQuery", value.asInstanceOf[js.Any])
    
    inline def setResourceQueryUndefined: Self = StObject.set(x, "resourceQuery", js.undefined)
    
    inline def setResourceVarargs(value: String*): Self = StObject.set(x, "resource", js.Array(value*))
    
    inline def setTypePrefix(value: String): Self = StObject.set(x, "typePrefix", value.asInstanceOf[js.Any])
    
    inline def setTypePrefixUndefined: Self = StObject.set(x, "typePrefix", js.undefined)
  }
}
