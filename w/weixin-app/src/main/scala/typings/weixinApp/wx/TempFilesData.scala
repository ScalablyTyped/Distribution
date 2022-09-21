package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TempFilesData extends StObject {
  
  /** 文件的临时路径 */
  var tempFilePaths: js.Array[String]
  
  /**
    * 图片的本地文件列表，每一项是一个 File 对象
    * @version 1.2.0
    */
  var tempFiles: js.Array[TempFile]
}
object TempFilesData {
  
  inline def apply(tempFilePaths: js.Array[String], tempFiles: js.Array[TempFile]): TempFilesData = {
    val __obj = js.Dynamic.literal(tempFilePaths = tempFilePaths.asInstanceOf[js.Any], tempFiles = tempFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[TempFilesData]
  }
  
  extension [Self <: TempFilesData](x: Self) {
    
    inline def setTempFilePaths(value: js.Array[String]): Self = StObject.set(x, "tempFilePaths", value.asInstanceOf[js.Any])
    
    inline def setTempFilePathsVarargs(value: String*): Self = StObject.set(x, "tempFilePaths", js.Array(value*))
    
    inline def setTempFiles(value: js.Array[TempFile]): Self = StObject.set(x, "tempFiles", value.asInstanceOf[js.Any])
    
    inline def setTempFilesVarargs(value: TempFile*): Self = StObject.set(x, "tempFiles", js.Array(value*))
  }
}
