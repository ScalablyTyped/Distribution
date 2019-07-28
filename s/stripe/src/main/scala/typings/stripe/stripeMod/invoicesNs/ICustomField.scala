package typings.stripe.stripeMod.invoicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomField extends js.Object {
  /**
    * The name of the custom field.
    */
  var name: String
  /**
    * The value of the custom field.
    */
  var value: String
}

object ICustomField {
  @scala.inline
  def apply(name: String, value: String): ICustomField = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[ICustomField]
  }
}

