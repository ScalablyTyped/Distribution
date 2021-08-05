package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait On extends StObject {
  
  var name: String
  
  var on: js.Array[Events]
}
object On {
  
  inline def apply(name: String, on: js.Array[Events]): On = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[On]
  }
  
  extension [Self <: On](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOn(value: js.Array[Events]): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    inline def setOnVarargs(value: Events*): Self = StObject.set(x, "on", js.Array(value :_*))
  }
}
