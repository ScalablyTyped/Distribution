package typings.stripe.mod.issuing.cardholders

import typings.stripe.AnonAddressName
import typings.stripe.AnonPastdue
import typings.stripe.mod.IMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.stripeStrings.issuingDotcardholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Issuing Cardholder object represents an individual or business entity who is issued cards.
  */
trait ICardholder extends IResourceObject {
  var authorization_controls: ICardholderAuthorizationControls
  /**
    * The cardholder’s billing address.
    */
  var billing: AnonAddressName
  /**
    * Additional information about a business_entity cardholder.
    */
  var company: ICardholderBusinessEntity
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  /**
    * The cardholder’s email address.
    */
  var email: String
  /**
    * Additional information about an individual cardholder.
    */
  var individual: ICardholderIndividual
  /**
    * Whether or not this cardholder is the default cardholder.
    */
  var is_default: Boolean
  /**
    * Has the value true if the object exists in live mode or the value false if the object exists in test mode.
    */
  var livemode: Boolean
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: IMetadata
  /**
    * The cardholder’s name. This will be printed on cards issued to them.
    */
  var name: String
  /**
    * String representing the object’s type. Objects of the same type share the same value.
    */
  @JSName("object")
  var object_ICardholder: issuingDotcardholder
  /**
    * The cardholder’s phone number.
    */
  var phone_number: String
  /**
    * Information about verification requirements for the cardholder, including what information needs to be collected.
    */
  var requirements: AnonPastdue
  /**
    * One of active, inactive, or blocked.
    */
  var status: CardholderStatus
  /**
    * One of individual or business_entity.
    */
  var `type`: CardholderType
}

object ICardholder {
  @scala.inline
  def apply(
    authorization_controls: ICardholderAuthorizationControls,
    billing: AnonAddressName,
    company: ICardholderBusinessEntity,
    created: Double,
    email: String,
    id: String,
    individual: ICardholderIndividual,
    is_default: Boolean,
    livemode: Boolean,
    metadata: IMetadata,
    name: String,
    `object`: issuingDotcardholder,
    phone_number: String,
    requirements: AnonPastdue,
    status: CardholderStatus,
    `type`: CardholderType
  ): ICardholder = {
    val __obj = js.Dynamic.literal(authorization_controls = authorization_controls.asInstanceOf[js.Any], billing = billing.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], individual = individual.asInstanceOf[js.Any], is_default = is_default.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], requirements = requirements.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardholder]
  }
}

