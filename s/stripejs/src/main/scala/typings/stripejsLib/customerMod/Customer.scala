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
    val __obj = js.Dynamic.literal(address = address, email = email, name = name, phone = phone, verified_address = verified_address, verified_email = verified_email, verified_name = verified_name, verified_phone = verified_phone)
  
    __obj.asInstanceOf[Customer]
  }
}

