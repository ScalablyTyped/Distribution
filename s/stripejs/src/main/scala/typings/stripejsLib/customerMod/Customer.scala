package typings
package stripejsLib.customerMod

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
  var email: java.lang.String
  /**
    * The full name of the owner
    */
  var name: java.lang.String
  /**
    * The phone number of the customer
    * NOTE: This includes the extension
    */
  var phone: java.lang.String
  /**
    * Verified customer’s address
    */
  val verified_address: Address
  /**
    * Verified customer’s email address
    */
  val verified_email: java.lang.String
  /**
    * Verified customer’s full name
    */
  val verified_name: java.lang.String
  /**
    * Verified customer’s phone number
    */
  val verified_phone: java.lang.String
}

object Customer {
  @scala.inline
  def apply(
    address: Address,
    email: java.lang.String,
    name: java.lang.String,
    phone: java.lang.String,
    verified_address: Address,
    verified_email: java.lang.String,
    verified_name: java.lang.String,
    verified_phone: java.lang.String
  ): Customer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("email")(email)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("phone")(phone)
    __obj.updateDynamic("verified_address")(verified_address)
    __obj.updateDynamic("verified_email")(verified_email)
    __obj.updateDynamic("verified_name")(verified_name)
    __obj.updateDynamic("verified_phone")(verified_phone)
    __obj.asInstanceOf[Customer]
  }
}

