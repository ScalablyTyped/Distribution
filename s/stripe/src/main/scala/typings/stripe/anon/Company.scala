package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Company extends StObject {
  
  var company: Additional = js.native
  
  var individual: Additional = js.native
}
object Company {
  
  @scala.inline
  def apply(company: Additional, individual: Additional): Company = {
    val __obj = js.Dynamic.literal(company = company.asInstanceOf[js.Any], individual = individual.asInstanceOf[js.Any])
    __obj.asInstanceOf[Company]
  }
  
  @scala.inline
  implicit class CompanyMutableBuilder[Self <: Company] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompany(value: Additional): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndividual(value: Additional): Self = StObject.set(x, "individual", value.asInstanceOf[js.Any])
  }
}
