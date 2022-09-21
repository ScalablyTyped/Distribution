package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OtherCanMangleProvide extends StObject {
  
  var exports: Any
  
  var otherCanMangleProvide: Any
  
  var otherProvided: Any
  
  var otherTerminalBinding: Any
}
object OtherCanMangleProvide {
  
  inline def apply(exports: Any, otherCanMangleProvide: Any, otherProvided: Any, otherTerminalBinding: Any): OtherCanMangleProvide = {
    val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any], otherCanMangleProvide = otherCanMangleProvide.asInstanceOf[js.Any], otherProvided = otherProvided.asInstanceOf[js.Any], otherTerminalBinding = otherTerminalBinding.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherCanMangleProvide]
  }
  
  extension [Self <: OtherCanMangleProvide](x: Self) {
    
    inline def setExports(value: Any): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setOtherCanMangleProvide(value: Any): Self = StObject.set(x, "otherCanMangleProvide", value.asInstanceOf[js.Any])
    
    inline def setOtherProvided(value: Any): Self = StObject.set(x, "otherProvided", value.asInstanceOf[js.Any])
    
    inline def setOtherTerminalBinding(value: Any): Self = StObject.set(x, "otherTerminalBinding", value.asInstanceOf[js.Any])
  }
}
