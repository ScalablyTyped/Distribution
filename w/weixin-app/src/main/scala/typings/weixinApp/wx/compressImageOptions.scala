package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait compressImageOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  // 图片路径，图片的路径，可以是相对路径、临时文件路径、存储文件路径
  var quality: js.UndefOr[Double] = js.undefined
  
  /**
    * 图片的路径，可以是相对路径，临时文件路径，存储文件路径，网络图片路径
    */
  var src: String
  
  // 默认值为80,压缩质量，范围0～100，数值越小，质量越低，压缩率越高（仅对jpg有效）。
  @JSName("success")
  def success_McompressImageOptions(tempFilePath: String): Unit
}
object compressImageOptions {
  
  inline def apply(src: String, success: String => Unit): compressImageOptions = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[compressImageOptions]
  }
  
  extension [Self <: compressImageOptions](x: Self) {
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: String => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
