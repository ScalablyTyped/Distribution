package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompressImageSuccessData extends StObject {
  
  /**
    * 压缩后图片的临时文件路径
    */
  var tempFilePath: js.UndefOr[String] = js.native
}
object CompressImageSuccessData {
  
  @scala.inline
  def apply(): CompressImageSuccessData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompressImageSuccessData]
  }
  
  @scala.inline
  implicit class CompressImageSuccessDataMutableBuilder[Self <: CompressImageSuccessData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempFilePathUndefined: Self = StObject.set(x, "tempFilePath", js.undefined)
  }
}
