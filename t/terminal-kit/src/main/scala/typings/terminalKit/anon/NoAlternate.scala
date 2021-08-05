package typings.terminalKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoAlternate extends StObject {
  
  var noAlternate: Boolean
}
object NoAlternate {
  
  inline def apply(noAlternate: Boolean): NoAlternate = {
    val __obj = js.Dynamic.literal(noAlternate = noAlternate.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoAlternate]
  }
  
  extension [Self <: NoAlternate](x: Self) {
    
    inline def setNoAlternate(value: Boolean): Self = StObject.set(x, "noAlternate", value.asInstanceOf[js.Any])
  }
}
