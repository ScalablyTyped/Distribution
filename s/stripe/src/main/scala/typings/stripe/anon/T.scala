package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait T extends StObject {
  
  var t: Double
  
  var v0: String
  
  var v1: String
}
object T {
  
  inline def apply(t: Double, v0: String, v1: String): T = {
    val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any], v0 = v0.asInstanceOf[js.Any], v1 = v1.asInstanceOf[js.Any])
    __obj.asInstanceOf[T]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: T] (val x: Self) extends AnyVal {
    
    inline def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    inline def setV0(value: String): Self = StObject.set(x, "v0", value.asInstanceOf[js.Any])
    
    inline def setV1(value: String): Self = StObject.set(x, "v1", value.asInstanceOf[js.Any])
  }
}
