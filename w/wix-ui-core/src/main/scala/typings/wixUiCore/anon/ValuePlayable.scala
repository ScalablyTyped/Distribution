package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValuePlayable extends StObject {
  
  var label: String
  
  var value: Playable
}
object ValuePlayable {
  
  inline def apply(label: String, value: Playable): ValuePlayable = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValuePlayable]
  }
  
  extension [Self <: ValuePlayable](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Playable): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
