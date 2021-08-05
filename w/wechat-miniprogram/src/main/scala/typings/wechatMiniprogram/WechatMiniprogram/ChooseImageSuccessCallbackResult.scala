package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChooseImageSuccessCallbackResult extends StObject {
  
  var errMsg: String
  
  /** 图片的本地临时文件路径列表 (本地路径) */
  var tempFilePaths: js.Array[String]
  
  /** 图片的本地临时文件列表
    *
    * 最低基础库： `1.2.0` */
  var tempFiles: js.Array[ImageFile]
}
object ChooseImageSuccessCallbackResult {
  
  inline def apply(errMsg: String, tempFilePaths: js.Array[String], tempFiles: js.Array[ImageFile]): ChooseImageSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], tempFilePaths = tempFilePaths.asInstanceOf[js.Any], tempFiles = tempFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseImageSuccessCallbackResult]
  }
  
  extension [Self <: ChooseImageSuccessCallbackResult](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setTempFilePaths(value: js.Array[String]): Self = StObject.set(x, "tempFilePaths", value.asInstanceOf[js.Any])
    
    inline def setTempFilePathsVarargs(value: String*): Self = StObject.set(x, "tempFilePaths", js.Array(value :_*))
    
    inline def setTempFiles(value: js.Array[ImageFile]): Self = StObject.set(x, "tempFiles", value.asInstanceOf[js.Any])
    
    inline def setTempFilesVarargs(value: ImageFile*): Self = StObject.set(x, "tempFiles", js.Array(value :_*))
  }
}
