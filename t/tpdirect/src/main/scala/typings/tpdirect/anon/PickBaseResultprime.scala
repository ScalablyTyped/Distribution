package typings.tpdirect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<tpdirect.BaseResult, 'prime'> */
trait PickBaseResultprime extends StObject {
  
  var prime: String
}
object PickBaseResultprime {
  
  inline def apply(prime: String): PickBaseResultprime = {
    val __obj = js.Dynamic.literal(prime = prime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickBaseResultprime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickBaseResultprime] (val x: Self) extends AnyVal {
    
    inline def setPrime(value: String): Self = StObject.set(x, "prime", value.asInstanceOf[js.Any])
  }
}
