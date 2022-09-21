package typings.tengitsui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawableUploaderOpts extends StObject {
  
  // 上传地址
  var action: js.UndefOr[String] = js.undefined
  
  var beforeUpload: js.UndefOr[js.Function2[/* file */ Any, /* fileList */ js.Array[Any], Boolean]] = js.undefined
  
  def customRequest(file: Any, onProgress: js.Function0[js.Object]): js.Object
  
  // 上传附加参数
  var data: js.UndefOr[Any] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var listType: js.UndefOr[String] = js.undefined
  
  // 最大文件数
  var maxLength: js.UndefOr[Double] = js.undefined
}
object DrawableUploaderOpts {
  
  inline def apply(customRequest: (Any, js.Function0[js.Object]) => js.Object): DrawableUploaderOpts = {
    val __obj = js.Dynamic.literal(customRequest = js.Any.fromFunction2(customRequest))
    __obj.asInstanceOf[DrawableUploaderOpts]
  }
  
  extension [Self <: DrawableUploaderOpts](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setBeforeUpload(value: (/* file */ Any, /* fileList */ js.Array[Any]) => Boolean): Self = StObject.set(x, "beforeUpload", js.Any.fromFunction2(value))
    
    inline def setBeforeUploadUndefined: Self = StObject.set(x, "beforeUpload", js.undefined)
    
    inline def setCustomRequest(value: (Any, js.Function0[js.Object]) => js.Object): Self = StObject.set(x, "customRequest", js.Any.fromFunction2(value))
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setListType(value: String): Self = StObject.set(x, "listType", value.asInstanceOf[js.Any])
    
    inline def setListTypeUndefined: Self = StObject.set(x, "listType", js.undefined)
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
  }
}
