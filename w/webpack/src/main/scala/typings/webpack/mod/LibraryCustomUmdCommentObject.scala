package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Set explicit comments for `commonjs`, `commonjs2`, `amd`, and `root`.
  */
trait LibraryCustomUmdCommentObject extends StObject {
  
  /**
  	 * Set comment for `amd` section in UMD.
  	 */
  var amd: js.UndefOr[String] = js.undefined
  
  /**
  	 * Set comment for `commonjs` (exports) section in UMD.
  	 */
  var commonjs: js.UndefOr[String] = js.undefined
  
  /**
  	 * Set comment for `commonjs2` (module.exports) section in UMD.
  	 */
  var commonjs2: js.UndefOr[String] = js.undefined
  
  /**
  	 * Set comment for `root` (global variable) section in UMD.
  	 */
  var root: js.UndefOr[String] = js.undefined
}
object LibraryCustomUmdCommentObject {
  
  inline def apply(): LibraryCustomUmdCommentObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LibraryCustomUmdCommentObject]
  }
  
  extension [Self <: LibraryCustomUmdCommentObject](x: Self) {
    
    inline def setAmd(value: String): Self = StObject.set(x, "amd", value.asInstanceOf[js.Any])
    
    inline def setAmdUndefined: Self = StObject.set(x, "amd", js.undefined)
    
    inline def setCommonjs(value: String): Self = StObject.set(x, "commonjs", value.asInstanceOf[js.Any])
    
    inline def setCommonjs2(value: String): Self = StObject.set(x, "commonjs2", value.asInstanceOf[js.Any])
    
    inline def setCommonjs2Undefined: Self = StObject.set(x, "commonjs2", js.undefined)
    
    inline def setCommonjsUndefined: Self = StObject.set(x, "commonjs", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
