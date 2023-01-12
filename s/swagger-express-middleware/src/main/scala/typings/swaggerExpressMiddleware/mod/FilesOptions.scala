package typings.swaggerExpressMiddleware.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilesOptions extends StObject {
  
  var apiPath: js.UndefOr[String] = js.undefined
  
  var rawFilesPath: js.UndefOr[String] = js.undefined
  
  var useBasePath: js.UndefOr[Boolean] = js.undefined
}
object FilesOptions {
  
  inline def apply(): FilesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilesOptions] (val x: Self) extends AnyVal {
    
    inline def setApiPath(value: String): Self = StObject.set(x, "apiPath", value.asInstanceOf[js.Any])
    
    inline def setApiPathUndefined: Self = StObject.set(x, "apiPath", js.undefined)
    
    inline def setRawFilesPath(value: String): Self = StObject.set(x, "rawFilesPath", value.asInstanceOf[js.Any])
    
    inline def setRawFilesPathUndefined: Self = StObject.set(x, "rawFilesPath", js.undefined)
    
    inline def setUseBasePath(value: Boolean): Self = StObject.set(x, "useBasePath", value.asInstanceOf[js.Any])
    
    inline def setUseBasePathUndefined: Self = StObject.set(x, "useBasePath", js.undefined)
  }
}
