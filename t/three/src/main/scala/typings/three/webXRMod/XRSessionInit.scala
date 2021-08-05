package typings.three.webXRMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRSessionInit extends StObject {
  
  var optionalFeatures: js.UndefOr[js.Array[String]] = js.undefined
  
  var requiredFeatures: js.UndefOr[js.Array[String]] = js.undefined
}
object XRSessionInit {
  
  inline def apply(): XRSessionInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XRSessionInit]
  }
  
  extension [Self <: XRSessionInit](x: Self) {
    
    inline def setOptionalFeatures(value: js.Array[String]): Self = StObject.set(x, "optionalFeatures", value.asInstanceOf[js.Any])
    
    inline def setOptionalFeaturesUndefined: Self = StObject.set(x, "optionalFeatures", js.undefined)
    
    inline def setOptionalFeaturesVarargs(value: String*): Self = StObject.set(x, "optionalFeatures", js.Array(value :_*))
    
    inline def setRequiredFeatures(value: js.Array[String]): Self = StObject.set(x, "requiredFeatures", value.asInstanceOf[js.Any])
    
    inline def setRequiredFeaturesUndefined: Self = StObject.set(x, "requiredFeatures", js.undefined)
    
    inline def setRequiredFeaturesVarargs(value: String*): Self = StObject.set(x, "requiredFeatures", js.Array(value :_*))
  }
}
