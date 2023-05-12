package typings.tesseractJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectData extends StObject {
  
  var orientation_confidence: Double | Null
  
  var orientation_degrees: Double | Null
  
  var script: String | Null
  
  var script_confidence: Double | Null
  
  var tesseract_script_id: Double | Null
}
object DetectData {
  
  inline def apply(): DetectData = {
    val __obj = js.Dynamic.literal(orientation_confidence = null, orientation_degrees = null, script = null, script_confidence = null, tesseract_script_id = null)
    __obj.asInstanceOf[DetectData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetectData] (val x: Self) extends AnyVal {
    
    inline def setOrientation_confidence(value: Double): Self = StObject.set(x, "orientation_confidence", value.asInstanceOf[js.Any])
    
    inline def setOrientation_confidenceNull: Self = StObject.set(x, "orientation_confidence", null)
    
    inline def setOrientation_degrees(value: Double): Self = StObject.set(x, "orientation_degrees", value.asInstanceOf[js.Any])
    
    inline def setOrientation_degreesNull: Self = StObject.set(x, "orientation_degrees", null)
    
    inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptNull: Self = StObject.set(x, "script", null)
    
    inline def setScript_confidence(value: Double): Self = StObject.set(x, "script_confidence", value.asInstanceOf[js.Any])
    
    inline def setScript_confidenceNull: Self = StObject.set(x, "script_confidence", null)
    
    inline def setTesseract_script_id(value: Double): Self = StObject.set(x, "tesseract_script_id", value.asInstanceOf[js.Any])
    
    inline def setTesseract_script_idNull: Self = StObject.set(x, "tesseract_script_id", null)
  }
}
