package typings.webpack.mod

import typings.webpack.webpackBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseResolveRequest extends StObject {
  
  var descriptionFileData: js.UndefOr[js.Object] = js.undefined
  
  var descriptionFilePath: js.UndefOr[String] = js.undefined
  
  var descriptionFileRoot: js.UndefOr[String] = js.undefined
  
  var fullySpecified: js.UndefOr[Boolean] = js.undefined
  
  var ignoreSymlinks: js.UndefOr[Boolean] = js.undefined
  
  var path: String | `false`
  
  var relativePath: js.UndefOr[String] = js.undefined
}
object BaseResolveRequest {
  
  inline def apply(path: String | `false`): BaseResolveRequest = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseResolveRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseResolveRequest] (val x: Self) extends AnyVal {
    
    inline def setDescriptionFileData(value: js.Object): Self = StObject.set(x, "descriptionFileData", value.asInstanceOf[js.Any])
    
    inline def setDescriptionFileDataUndefined: Self = StObject.set(x, "descriptionFileData", js.undefined)
    
    inline def setDescriptionFilePath(value: String): Self = StObject.set(x, "descriptionFilePath", value.asInstanceOf[js.Any])
    
    inline def setDescriptionFilePathUndefined: Self = StObject.set(x, "descriptionFilePath", js.undefined)
    
    inline def setDescriptionFileRoot(value: String): Self = StObject.set(x, "descriptionFileRoot", value.asInstanceOf[js.Any])
    
    inline def setDescriptionFileRootUndefined: Self = StObject.set(x, "descriptionFileRoot", js.undefined)
    
    inline def setFullySpecified(value: Boolean): Self = StObject.set(x, "fullySpecified", value.asInstanceOf[js.Any])
    
    inline def setFullySpecifiedUndefined: Self = StObject.set(x, "fullySpecified", js.undefined)
    
    inline def setIgnoreSymlinks(value: Boolean): Self = StObject.set(x, "ignoreSymlinks", value.asInstanceOf[js.Any])
    
    inline def setIgnoreSymlinksUndefined: Self = StObject.set(x, "ignoreSymlinks", js.undefined)
    
    inline def setPath(value: String | `false`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
    
    inline def setRelativePathUndefined: Self = StObject.set(x, "relativePath", js.undefined)
  }
}
