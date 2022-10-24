package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoxSizingAny extends StObject {
  
  @JSName("*")
  var Asterisk: BoxSizing
  
  var boxSizing: Any
}
object BoxSizingAny {
  
  inline def apply(Asterisk: BoxSizing, boxSizing: Any): BoxSizingAny = {
    val __obj = js.Dynamic.literal(boxSizing = boxSizing.asInstanceOf[js.Any])
    __obj.updateDynamic("*")(Asterisk.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxSizingAny]
  }
  
  extension [Self <: BoxSizingAny](x: Self) {
    
    inline def setAsterisk(value: BoxSizing): Self = StObject.set(x, "*", value.asInstanceOf[js.Any])
    
    inline def setBoxSizing(value: Any): Self = StObject.set(x, "boxSizing", value.asInstanceOf[js.Any])
  }
}
