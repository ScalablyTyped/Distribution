package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<three.three/examples/jsm/webxr/ARButton.ARButtonSessionInit> */
trait PartialARButtonSessionIni extends StObject {
  
  var domOverlay: js.UndefOr[Root] = js.undefined
  
  var optionalFeatures: js.UndefOr[js.Array[String]] = js.undefined
  
  var requiredFeatures: js.UndefOr[js.Array[String]] = js.undefined
}
object PartialARButtonSessionIni {
  
  inline def apply(): PartialARButtonSessionIni = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialARButtonSessionIni]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialARButtonSessionIni] (val x: Self) extends AnyVal {
    
    inline def setDomOverlay(value: Root): Self = StObject.set(x, "domOverlay", value.asInstanceOf[js.Any])
    
    inline def setDomOverlayUndefined: Self = StObject.set(x, "domOverlay", js.undefined)
    
    inline def setOptionalFeatures(value: js.Array[String]): Self = StObject.set(x, "optionalFeatures", value.asInstanceOf[js.Any])
    
    inline def setOptionalFeaturesUndefined: Self = StObject.set(x, "optionalFeatures", js.undefined)
    
    inline def setOptionalFeaturesVarargs(value: String*): Self = StObject.set(x, "optionalFeatures", js.Array(value*))
    
    inline def setRequiredFeatures(value: js.Array[String]): Self = StObject.set(x, "requiredFeatures", value.asInstanceOf[js.Any])
    
    inline def setRequiredFeaturesUndefined: Self = StObject.set(x, "requiredFeatures", js.undefined)
    
    inline def setRequiredFeaturesVarargs(value: String*): Self = StObject.set(x, "requiredFeatures", js.Array(value*))
  }
}
