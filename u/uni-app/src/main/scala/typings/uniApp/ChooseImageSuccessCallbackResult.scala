package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChooseImageSuccessCallbackResult extends StObject {
  
  /**
    * 图片的本地文件路径列表
    */
  var tempFilePaths: js.UndefOr[String | js.Array[js.Any]] = js.undefined
  
  /**
    * 图片的本地文件列表，每一项是一个 File 对象
    */
  var tempFiles: js.UndefOr[
    ChooseImageSuccessCallbackResultFile | js.Array[ChooseImageSuccessCallbackResultFile]
  ] = js.undefined
}
object ChooseImageSuccessCallbackResult {
  
  @scala.inline
  def apply(): ChooseImageSuccessCallbackResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseImageSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class ChooseImageSuccessCallbackResultMutableBuilder[Self <: ChooseImageSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTempFilePaths(value: String | js.Array[js.Any]): Self = StObject.set(x, "tempFilePaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempFilePathsUndefined: Self = StObject.set(x, "tempFilePaths", js.undefined)
    
    @scala.inline
    def setTempFilePathsVarargs(value: js.Any*): Self = StObject.set(x, "tempFilePaths", js.Array(value :_*))
    
    @scala.inline
    def setTempFiles(value: ChooseImageSuccessCallbackResultFile | js.Array[ChooseImageSuccessCallbackResultFile]): Self = StObject.set(x, "tempFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempFilesUndefined: Self = StObject.set(x, "tempFiles", js.undefined)
    
    @scala.inline
    def setTempFilesVarargs(value: ChooseImageSuccessCallbackResultFile*): Self = StObject.set(x, "tempFiles", js.Array(value :_*))
  }
}
