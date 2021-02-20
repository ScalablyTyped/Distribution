package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CameraContextTakePhotoResult extends StObject {
  
  /**
    * 照片文件的临时路径，安卓是jpg图片格式，ios是png
    */
  var tempImagePath: js.UndefOr[String] = js.native
}
object CameraContextTakePhotoResult {
  
  @scala.inline
  def apply(): CameraContextTakePhotoResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraContextTakePhotoResult]
  }
  
  @scala.inline
  implicit class CameraContextTakePhotoResultMutableBuilder[Self <: CameraContextTakePhotoResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTempImagePath(value: String): Self = StObject.set(x, "tempImagePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempImagePathUndefined: Self = StObject.set(x, "tempImagePath", js.undefined)
  }
}
