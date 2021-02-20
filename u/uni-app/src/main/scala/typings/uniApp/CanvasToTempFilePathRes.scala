package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasToTempFilePathRes extends StObject {
  
  /**
    * 导出生成的图片路径
    */
  var tempFilePath: js.UndefOr[String] = js.native
}
object CanvasToTempFilePathRes {
  
  @scala.inline
  def apply(): CanvasToTempFilePathRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasToTempFilePathRes]
  }
  
  @scala.inline
  implicit class CanvasToTempFilePathResMutableBuilder[Self <: CanvasToTempFilePathRes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempFilePathUndefined: Self = StObject.set(x, "tempFilePath", js.undefined)
  }
}
