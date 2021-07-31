package typings.wepy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnlyFromCamera extends StObject {
  
  var onlyFromCamera: js.UndefOr[Boolean] = js.undefined
  
  var scanType: js.UndefOr[js.Array[String]] = js.undefined
}
object OnlyFromCamera {
  
  @scala.inline
  def apply(): OnlyFromCamera = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnlyFromCamera]
  }
  
  @scala.inline
  implicit class OnlyFromCameraMutableBuilder[Self <: OnlyFromCamera] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnlyFromCamera(value: Boolean): Self = StObject.set(x, "onlyFromCamera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyFromCameraUndefined: Self = StObject.set(x, "onlyFromCamera", js.undefined)
    
    @scala.inline
    def setScanType(value: js.Array[String]): Self = StObject.set(x, "scanType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanTypeUndefined: Self = StObject.set(x, "scanType", js.undefined)
    
    @scala.inline
    def setScanTypeVarargs(value: String*): Self = StObject.set(x, "scanType", js.Array(value :_*))
  }
}
