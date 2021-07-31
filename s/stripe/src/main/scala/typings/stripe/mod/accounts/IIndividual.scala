package typings.stripe.mod.accounts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IIndividual
  extends StObject
     with IIndividualShared {
  
  /**
    * Whether the individual’s personal ID number was provided.
    */
  var id_number_provided: Boolean
  
  /**
    * Whether the individual’s last 4 SSN digits was provided.
    */
  var ssn_last_4_provided: Boolean
}
object IIndividual {
  
  @scala.inline
  def apply(id_number_provided: Boolean, ssn_last_4_provided: Boolean): IIndividual = {
    val __obj = js.Dynamic.literal(id_number_provided = id_number_provided.asInstanceOf[js.Any], ssn_last_4_provided = ssn_last_4_provided.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIndividual]
  }
  
  @scala.inline
  implicit class IIndividualMutableBuilder[Self <: IIndividual] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId_number_provided(value: Boolean): Self = StObject.set(x, "id_number_provided", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsn_last_4_provided(value: Boolean): Self = StObject.set(x, "ssn_last_4_provided", value.asInstanceOf[js.Any])
  }
}
