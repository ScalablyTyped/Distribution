package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait B extends StObject {
  
  var b: Boolean
}
object B {
  
  inline def apply(b: Boolean): B = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any])
    __obj.asInstanceOf[B]
  }
  
  extension [Self <: B](x: Self) {
    
    inline def setB(value: Boolean): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
  }
}
