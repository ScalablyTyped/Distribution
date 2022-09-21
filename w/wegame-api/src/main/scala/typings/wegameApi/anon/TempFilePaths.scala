package typings.wegameApi.anon

import typings.wegameApi.ImageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TempFilePaths extends StObject {
  
  var tempFilePaths: js.Array[String]
  
  var tempFiles: js.Array[ImageFile]
}
object TempFilePaths {
  
  inline def apply(tempFilePaths: js.Array[String], tempFiles: js.Array[ImageFile]): TempFilePaths = {
    val __obj = js.Dynamic.literal(tempFilePaths = tempFilePaths.asInstanceOf[js.Any], tempFiles = tempFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[TempFilePaths]
  }
  
  extension [Self <: TempFilePaths](x: Self) {
    
    inline def setTempFilePaths(value: js.Array[String]): Self = StObject.set(x, "tempFilePaths", value.asInstanceOf[js.Any])
    
    inline def setTempFilePathsVarargs(value: String*): Self = StObject.set(x, "tempFilePaths", js.Array(value*))
    
    inline def setTempFiles(value: js.Array[ImageFile]): Self = StObject.set(x, "tempFiles", value.asInstanceOf[js.Any])
    
    inline def setTempFilesVarargs(value: ImageFile*): Self = StObject.set(x, "tempFiles", js.Array(value*))
  }
}
