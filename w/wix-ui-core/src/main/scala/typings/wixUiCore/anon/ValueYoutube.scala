package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueYoutube extends StObject {
  
  var label: String
  
  var value: Youtube
}
object ValueYoutube {
  
  inline def apply(label: String, value: Youtube): ValueYoutube = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueYoutube]
  }
  
  extension [Self <: ValueYoutube](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Youtube): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
