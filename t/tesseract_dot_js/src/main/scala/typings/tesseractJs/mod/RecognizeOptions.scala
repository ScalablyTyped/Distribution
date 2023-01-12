package typings.tesseractJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecognizeOptions extends StObject {
  
  var rectangle: Rectangle
}
object RecognizeOptions {
  
  inline def apply(rectangle: Rectangle): RecognizeOptions = {
    val __obj = js.Dynamic.literal(rectangle = rectangle.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecognizeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecognizeOptions] (val x: Self) extends AnyVal {
    
    inline def setRectangle(value: Rectangle): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
  }
}
