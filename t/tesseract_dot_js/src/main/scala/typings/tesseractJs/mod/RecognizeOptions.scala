package typings.tesseractJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecognizeOptions extends StObject {
  
  var pdfTextOnly: Boolean
  
  var pdfTitle: String
  
  var rectangle: Rectangle
  
  var rotateAuto: Boolean
  
  var rotateRadians: Double
}
object RecognizeOptions {
  
  inline def apply(
    pdfTextOnly: Boolean,
    pdfTitle: String,
    rectangle: Rectangle,
    rotateAuto: Boolean,
    rotateRadians: Double
  ): RecognizeOptions = {
    val __obj = js.Dynamic.literal(pdfTextOnly = pdfTextOnly.asInstanceOf[js.Any], pdfTitle = pdfTitle.asInstanceOf[js.Any], rectangle = rectangle.asInstanceOf[js.Any], rotateAuto = rotateAuto.asInstanceOf[js.Any], rotateRadians = rotateRadians.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecognizeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecognizeOptions] (val x: Self) extends AnyVal {
    
    inline def setPdfTextOnly(value: Boolean): Self = StObject.set(x, "pdfTextOnly", value.asInstanceOf[js.Any])
    
    inline def setPdfTitle(value: String): Self = StObject.set(x, "pdfTitle", value.asInstanceOf[js.Any])
    
    inline def setRectangle(value: Rectangle): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
    
    inline def setRotateAuto(value: Boolean): Self = StObject.set(x, "rotateAuto", value.asInstanceOf[js.Any])
    
    inline def setRotateRadians(value: Double): Self = StObject.set(x, "rotateRadians", value.asInstanceOf[js.Any])
  }
}
