package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasToTempFilePathRes extends StObject {
  
  /**
    * 导出生成的图片路径
    */
  var tempFilePath: js.UndefOr[String] = js.undefined
}
object CanvasToTempFilePathRes {
  
  inline def apply(): CanvasToTempFilePathRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasToTempFilePathRes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanvasToTempFilePathRes] (val x: Self) extends AnyVal {
    
    inline def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
    
    inline def setTempFilePathUndefined: Self = StObject.set(x, "tempFilePath", js.undefined)
  }
}
