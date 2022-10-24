package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hex extends StObject {
  
  var hex: Any
  
  var inFocus: Boolean
}
object Hex {
  
  inline def apply(hex: Any, inFocus: Boolean): Hex = {
    val __obj = js.Dynamic.literal(hex = hex.asInstanceOf[js.Any], inFocus = inFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hex]
  }
  
  extension [Self <: Hex](x: Self) {
    
    inline def setHex(value: Any): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
    
    inline def setInFocus(value: Boolean): Self = StObject.set(x, "inFocus", value.asInstanceOf[js.Any])
  }
}
