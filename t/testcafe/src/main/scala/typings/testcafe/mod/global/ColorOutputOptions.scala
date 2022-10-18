package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorOutputOptions extends StObject {
  
  var color: Boolean
  
  var noColor: Boolean
}
object ColorOutputOptions {
  
  inline def apply(color: Boolean, noColor: Boolean): ColorOutputOptions = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], noColor = noColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorOutputOptions]
  }
  
  extension [Self <: ColorOutputOptions](x: Self) {
    
    inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setNoColor(value: Boolean): Self = StObject.set(x, "noColor", value.asInstanceOf[js.Any])
  }
}
