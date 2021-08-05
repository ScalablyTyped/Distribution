package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Company extends StObject {
  
  var company: Additional
  
  var individual: Additional
}
object Company {
  
  inline def apply(company: Additional, individual: Additional): Company = {
    val __obj = js.Dynamic.literal(company = company.asInstanceOf[js.Any], individual = individual.asInstanceOf[js.Any])
    __obj.asInstanceOf[Company]
  }
  
  extension [Self <: Company](x: Self) {
    
    inline def setCompany(value: Additional): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    inline def setIndividual(value: Additional): Self = StObject.set(x, "individual", value.asInstanceOf[js.Any])
  }
}
