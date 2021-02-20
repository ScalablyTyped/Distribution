package typings.webpack.webpackOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LibraryCustomUmdObject extends StObject {
  
  /**
  	 * Name of the exposed AMD library in the UMD
  	 */
  var amd: js.UndefOr[String] = js.native
  
  /**
  	 * Name of the exposed commonjs export in the UMD
  	 */
  var commonjs: js.UndefOr[String] = js.native
  
  /**
  	 * Name of the property exposed globally by a UMD library
  	 */
  var root: js.UndefOr[String | ArrayOfStringValues] = js.native
}
object LibraryCustomUmdObject {
  
  @scala.inline
  def apply(): LibraryCustomUmdObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LibraryCustomUmdObject]
  }
  
  @scala.inline
  implicit class LibraryCustomUmdObjectMutableBuilder[Self <: LibraryCustomUmdObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmd(value: String): Self = StObject.set(x, "amd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmdUndefined: Self = StObject.set(x, "amd", js.undefined)
    
    @scala.inline
    def setCommonjs(value: String): Self = StObject.set(x, "commonjs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonjsUndefined: Self = StObject.set(x, "commonjs", js.undefined)
    
    @scala.inline
    def setRoot(value: String | ArrayOfStringValues): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setRootVarargs(value: String*): Self = StObject.set(x, "root", js.Array(value :_*))
  }
}
