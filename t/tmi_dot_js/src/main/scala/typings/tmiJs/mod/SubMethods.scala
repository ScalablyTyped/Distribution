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
  
  @scala.inline
  def apply(): SubMethods = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubMethods]
  }
  
  @scala.inline
  implicit class SubMethodsMutableBuilder[Self <: SubMethods] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlan(value: SubMethod): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanName(value: String): Self = StObject.set(x, "planName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanNameUndefined: Self = StObject.set(x, "planName", js.undefined)
    
    @scala.inline
    def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
    
    @scala.inline
    def setPrime(value: Boolean): Self = StObject.set(x, "prime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimeUndefined: Self = StObject.set(x, "prime", js.undefined)
  }
}
