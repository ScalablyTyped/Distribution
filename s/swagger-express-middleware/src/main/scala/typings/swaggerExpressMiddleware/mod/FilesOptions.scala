package typings.swaggerExpressMiddleware.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilesOptions extends StObject {
  
  var apiPath: js.UndefOr[String] = js.native
  
  var rawFilesPath: js.UndefOr[String] = js.native
  
  var useBasePath: js.UndefOr[Boolean] = js.native
}
object FilesOptions {
  
  @scala.inline
  def apply(): FilesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilesOptions]
  }
  
  @scala.inline
  implicit class FilesOptionsMutableBuilder[Self <: FilesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiPath(value: String): Self = StObject.set(x, "apiPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiPathUndefined: Self = StObject.set(x, "apiPath", js.undefined)
    
    @scala.inline
    def setRawFilesPath(value: String): Self = StObject.set(x, "rawFilesPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawFilesPathUndefined: Self = StObject.set(x, "rawFilesPath", js.undefined)
    
    @scala.inline
    def setUseBasePath(value: Boolean): Self = StObject.set(x, "useBasePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseBasePathUndefined: Self = StObject.set(x, "useBasePath", js.undefined)
  }
}
