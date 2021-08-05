package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CameraContextTakePhotoResult extends StObject {
  
  /**
    * 照片文件的临时路径，安卓是jpg图片格式，ios是png
    */
  var tempImagePath: js.UndefOr[String] = js.undefined
}
object CameraContextTakePhotoResult {
  
  inline def apply(): CameraContextTakePhotoResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraContextTakePhotoResult]
  }
  
  extension [Self <: CameraContextTakePhotoResult](x: Self) {
    
    inline def setTempImagePath(value: String): Self = StObject.set(x, "tempImagePath", value.asInstanceOf[js.Any])
    
    inline def setTempImagePathUndefined: Self = StObject.set(x, "tempImagePath", js.undefined)
  }
}
