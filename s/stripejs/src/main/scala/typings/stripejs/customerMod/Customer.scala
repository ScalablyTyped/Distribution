package typings.stripejs.customerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Customer extends js.Object {
  /**
    * The Address of the customer
    */
  var address: Address
  /**
    * The email address of the customer
    */
  var email: String
  /**
    * The full name of the owner
    */
  var name: String
  /**
    * The phone number of the customer
    * NOTE: This includes the extension
    */
  var phone: String
  /**
    * Verified customer’s address
    */
  val verified_address: Address
  /**
    * Verified customer’s email address
    */
  val verified_email: String
  /**
    * Verified customer’s full name
    */
  val verified_name: String
  /**
    * Verified customer’s phone number
    */
  val verified_phone: String
}

object Customer {
  @scala.inline
  def apply(
    address: Address,
    email: String,
    name: String,
    phone: String,
    verified_address: Address,
    verified_email: String,
    verified_name: String,
    verified_phone: String
  ): Customer = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], verified_address = verified_address.asInstanceOf[js.Any], verified_email = verified_email.asInstanceOf[js.Any], verified_name = verified_name.asInstanceOf[js.Any], verified_phone = verified_phone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Customer]
  }
}

