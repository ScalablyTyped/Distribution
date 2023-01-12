package typings.tmiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubMethods extends StObject {
  
  var plan: js.UndefOr[SubMethod] = js.undefined
  
  var planName: js.UndefOr[String] = js.undefined
  
  var prime: js.UndefOr[Boolean] = js.undefined
}
object SubMethods {
  
  inline def apply(): SubMethods = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubMethods]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubMethods] (val x: Self) extends AnyVal {
    
    inline def setPlan(value: SubMethod): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    inline def setPlanName(value: String): Self = StObject.set(x, "planName", value.asInstanceOf[js.Any])
    
    inline def setPlanNameUndefined: Self = StObject.set(x, "planName", js.undefined)
    
    inline def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
    
    inline def setPrime(value: Boolean): Self = StObject.set(x, "prime", value.asInstanceOf[js.Any])
    
    inline def setPrimeUndefined: Self = StObject.set(x, "prime", js.undefined)
  }
}
