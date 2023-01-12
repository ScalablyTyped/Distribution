package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofAccountCompany extends StObject {
  
  val Company: TypeofCompany
  
  val Individual: TypeofIndividual
}
object TypeofAccountCompany {
  
  inline def apply(Company: TypeofCompany, Individual: TypeofIndividual): TypeofAccountCompany = {
    val __obj = js.Dynamic.literal(Company = Company.asInstanceOf[js.Any], Individual = Individual.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofAccountCompany]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofAccountCompany] (val x: Self) extends AnyVal {
    
    inline def setCompany(value: TypeofCompany): Self = StObject.set(x, "Company", value.asInstanceOf[js.Any])
    
    inline def setIndividual(value: TypeofIndividual): Self = StObject.set(x, "Individual", value.asInstanceOf[js.Any])
  }
}
