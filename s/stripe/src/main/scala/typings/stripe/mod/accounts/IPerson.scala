package typings.stripe.mod.accounts

import typings.stripe.anon.Additionaldocument
import typings.stripe.anon.Currentlydue
import typings.stripe.mod.IMetadata
import typings.stripe.stripeStrings.person
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPerson extends IPersonShared {
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double = js.native
  /**
    * Unique identifier for the object.
    */
  var id: String = js.native
  /**
    * Whether the person’s personal ID number was provided.
    */
  var id_number_provided: Boolean = js.native
  /**
    * Set of key-value pairs that you can attach to an object.
    * This can be useful for storing additional information about
    * the object in a structured format.
    */
  var metadata: IMetadata = js.native
  /**
    * String representing the object’s type. Objects of the same type share the same value.
    */
  var `object`: person = js.native
  /**
    * Information about the requirements for this person, including what information needs to be collected, and by when.
    */
  var requirements: Currentlydue = js.native
  /**
    * Whether the person’s last 4 SSN digits was provided.
    */
  var ssn_last_4_provided: Boolean = js.native
  /**
    * The person’s verification document information.
    */
  var verification: Additionaldocument = js.native
}

object IPerson {
  @scala.inline
  def apply(
    created: Double,
    id: String,
    id_number_provided: Boolean,
    metadata: IMetadata,
    `object`: person,
    requirements: Currentlydue,
    ssn_last_4_provided: Boolean,
    verification: Additionaldocument
  ): IPerson = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], id_number_provided = id_number_provided.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], requirements = requirements.asInstanceOf[js.Any], ssn_last_4_provided = ssn_last_4_provided.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPerson]
  }
  @scala.inline
  implicit class IPersonOps[Self <: IPerson] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setId_number_provided(value: Boolean): Self = this.set("id_number_provided", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: person): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequirements(value: Currentlydue): Self = this.set("requirements", value.asInstanceOf[js.Any])
    @scala.inline
    def setSsn_last_4_provided(value: Boolean): Self = this.set("ssn_last_4_provided", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerification(value: Additionaldocument): Self = this.set("verification", value.asInstanceOf[js.Any])
  }
  
}

