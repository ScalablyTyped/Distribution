package typings.sweValidation

import typings.sweValidation.anon.Id
import typings.sweValidation.anon.Sex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait cin extends StObject {
    
    var corporation: Id
    
    var isValid: Boolean
  }
  object cin {
    
    @JSImport("swe-validation", "cin")
    @js.native
    def apply(number: Double): cin = js.native
    
    extension [Self <: cin](x: Self) {
      
      inline def setCorporation(value: Id): Self = StObject.set(x, "corporation", value.asInstanceOf[js.Any])
      
      inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    }
  }
  
  trait ssn extends StObject {
    
    var isValid: Boolean
    
    var person: js.UndefOr[Sex] = js.undefined
  }
  object ssn {
    
    @JSImport("swe-validation", "ssn")
    @js.native
    def apply(number: Double): ssn = js.native
    
    extension [Self <: ssn](x: Self) {
      
      inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
      
      inline def setPerson(value: Sex): Self = StObject.set(x, "person", value.asInstanceOf[js.Any])
      
      inline def setPersonUndefined: Self = StObject.set(x, "person", js.undefined)
    }
  }
}
