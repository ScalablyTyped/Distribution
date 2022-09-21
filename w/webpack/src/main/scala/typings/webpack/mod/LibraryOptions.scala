package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for library.
  */
trait LibraryOptions extends StObject {
  
  /**
  	 * Add a comment in the UMD wrapper.
  	 */
  var auxiliaryComment: js.UndefOr[String | LibraryCustomUmdCommentObject] = js.undefined
  
  /**
  	 * Specify which export should be exposed as library.
  	 */
  var `export`: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
  	 * The name of the library (some types allow unnamed libraries too).
  	 */
  var name: js.UndefOr[String | js.Array[String] | LibraryCustomUmdObject] = js.undefined
  
  /**
  	 * Type of library (types included by default are 'var', 'module', 'assign', 'assign-properties', 'this', 'window', 'self', 'global', 'commonjs', 'commonjs2', 'commonjs-module', 'commonjs-static', 'amd', 'amd-require', 'umd', 'umd2', 'jsonp', 'system', but others might be added by plugins).
  	 */
  var `type`: String
  
  /**
  	 * If `output.libraryTarget` is set to umd and `output.library` is set, setting this to true will name the AMD module.
  	 */
  var umdNamedDefine: js.UndefOr[Boolean] = js.undefined
}
object LibraryOptions {
  
  inline def apply(`type`: String): LibraryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LibraryOptions]
  }
  
  extension [Self <: LibraryOptions](x: Self) {
    
    inline def setAuxiliaryComment(value: String | LibraryCustomUmdCommentObject): Self = StObject.set(x, "auxiliaryComment", value.asInstanceOf[js.Any])
    
    inline def setAuxiliaryCommentUndefined: Self = StObject.set(x, "auxiliaryComment", js.undefined)
    
    inline def setExport(value: String | js.Array[String]): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
    
    inline def setExportUndefined: Self = StObject.set(x, "export", js.undefined)
    
    inline def setExportVarargs(value: String*): Self = StObject.set(x, "export", js.Array(value*))
    
    inline def setName(value: String | js.Array[String] | LibraryCustomUmdObject): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUmdNamedDefine(value: Boolean): Self = StObject.set(x, "umdNamedDefine", value.asInstanceOf[js.Any])
    
    inline def setUmdNamedDefineUndefined: Self = StObject.set(x, "umdNamedDefine", js.undefined)
  }
}
