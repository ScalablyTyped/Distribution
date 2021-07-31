package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CameraContextStopRecordResult extends StObject {
  
  /**
    * 封面图片文件的临时路径
    */
  var tempThumbPath: js.UndefOr[String] = js.undefined
  
  /**
    * 视频的文件的临时路径
    */
  var tempVideoPath: js.UndefOr[String] = js.undefined
}
object CameraContextStopRecordResult {
  
  @scala.inline
  def apply(): CameraContextStopRecordResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraContextStopRecordResult]
  }
  
  @scala.inline
  implicit class CameraContextStopRecordResultMutableBuilder[Self <: CameraContextStopRecordResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTempThumbPath(value: String): Self = StObject.set(x, "tempThumbPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempThumbPathUndefined: Self = StObject.set(x, "tempThumbPath", js.undefined)
    
    @scala.inline
    def setTempVideoPath(value: String): Self = StObject.set(x, "tempVideoPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempVideoPathUndefined: Self = StObject.set(x, "tempVideoPath", js.undefined)
  }
}
