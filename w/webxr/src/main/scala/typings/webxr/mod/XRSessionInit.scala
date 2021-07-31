package typings.webxr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRSessionInit extends StObject {
  
  var optionalFeatures: js.UndefOr[js.Array[String]] = js.undefined
  
  var requiredFeatures: js.UndefOr[js.Array[String]] = js.undefined
}
object XRSessionInit {
  
  @scala.inline
  def apply(): XRSessionInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XRSessionInit]
  }
  
  @scala.inline
  implicit class XRSessionInitMutableBuilder[Self <: XRSessionInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptionalFeatures(value: js.Array[String]): Self = StObject.set(x, "optionalFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalFeaturesUndefined: Self = StObject.set(x, "optionalFeatures", js.undefined)
    
    @scala.inline
    def setOptionalFeaturesVarargs(value: String*): Self = StObject.set(x, "optionalFeatures", js.Array(value :_*))
    
    @scala.inline
    def setRequiredFeatures(value: js.Array[String]): Self = StObject.set(x, "requiredFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredFeaturesUndefined: Self = StObject.set(x, "requiredFeatures", js.undefined)
    
    @scala.inline
    def setRequiredFeaturesVarargs(value: String*): Self = StObject.set(x, "requiredFeatures", js.Array(value :_*))
  }
}
