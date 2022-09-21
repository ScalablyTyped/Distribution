package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FsRemoveSavedFileOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  var filePath: String
}
object FsRemoveSavedFileOptions {
  
  inline def apply(filePath: String): FsRemoveSavedFileOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[FsRemoveSavedFileOptions]
  }
  
  extension [Self <: FsRemoveSavedFileOptions](x: Self) {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
  }
}
