package typings.stripe.mod.accounts

import typings.stripe.anon.Additionaldocument
import typings.stripe.anon.Currentlydue
import typings.stripe.mod.IMetadata
import typings.stripe.stripeStrings.person
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPerson
  extends StObject
     with IPersonShared {
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  /**
    * Whether the person’s personal ID number was provided.
    */
  var id_number_provided: Boolean
  
  /**
    * Set of key-value pairs that you can attach to an object.
    * This can be useful for storing additional information about
    * the object in a structured format.
    */
  var metadata: IMetadata
  
  /**
    * String representing the object’s type. Objects of the same type share the same value.
    */
  var `object`: person
  
  /**
    * Information about the requirements for this person, including what information needs to be collected, and by when.
    */
  var requirements: Currentlydue
  
  /**
    * Whether the person’s last 4 SSN digits was provided.
    */
  var ssn_last_4_provided: Boolean
  
  /**
    * The person’s verification document information.
    */
  var verification: Additionaldocument
}
object IPerson {
  
  @scala.inline
  def apply(
    created: Double,
    id: String,
    id_number_provided: Boolean,
    metadata: IMetadata,
    requirements: Currentlydue,
    ssn_last_4_provided: Boolean,
    verification: Additionaldocument
  ): IPerson = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], id_number_provided = id_number_provided.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], requirements = requirements.asInstanceOf[js.Any], ssn_last_4_provided = ssn_last_4_provided.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
    __obj.updateDynamic("object")("person")
    __obj.asInstanceOf[IPerson]
  }
  
  @scala.inline
  implicit class IPersonMutableBuilder[Self <: IPerson] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId_number_provided(value: Boolean): Self = StObject.set(x, "id_number_provided", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: person): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequirements(value: Currentlydue): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsn_last_4_provided(value: Boolean): Self = StObject.set(x, "ssn_last_4_provided", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerification(value: Additionaldocument): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
  }
}
