package typings.tesseractJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectData extends StObject {
  
  var orientation_confidence: Double
  
  var orientation_degrees: Double
  
  var script: String
  
  var script_confidence: Double
  
  var tesseract_script_id: Double
}
object DetectData {
  
  inline def apply(
    orientation_confidence: Double,
    orientation_degrees: Double,
    script: String,
    script_confidence: Double,
    tesseract_script_id: Double
  ): DetectData = {
    val __obj = js.Dynamic.literal(orientation_confidence = orientation_confidence.asInstanceOf[js.Any], orientation_degrees = orientation_degrees.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], script_confidence = script_confidence.asInstanceOf[js.Any], tesseract_script_id = tesseract_script_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetectData] (val x: Self) extends AnyVal {
    
    inline def setOrientation_confidence(value: Double): Self = StObject.set(x, "orientation_confidence", value.asInstanceOf[js.Any])
    
    inline def setOrientation_degrees(value: Double): Self = StObject.set(x, "orientation_degrees", value.asInstanceOf[js.Any])
    
    inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScript_confidence(value: Double): Self = StObject.set(x, "script_confidence", value.asInstanceOf[js.Any])
    
    inline def setTesseract_script_id(value: Double): Self = StObject.set(x, "tesseract_script_id", value.asInstanceOf[js.Any])
  }
}
