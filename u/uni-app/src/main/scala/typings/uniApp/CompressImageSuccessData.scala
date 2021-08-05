package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompressImageSuccessData extends StObject {
  
  /**
    * 压缩后图片的临时文件路径
    */
  var tempFilePath: js.UndefOr[String] = js.undefined
}
object CompressImageSuccessData {
  
  inline def apply(): CompressImageSuccessData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompressImageSuccessData]
  }
  
  extension [Self <: CompressImageSuccessData](x: Self) {
    
    inline def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
    
    inline def setTempFilePathUndefined: Self = StObject.set(x, "tempFilePath", js.undefined)
  }
}
