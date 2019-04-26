package typings
package stripeLib.stripeMod.invoicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomField extends js.Object {
  /**
    * The name of the custom field.
    */
  var name: java.lang.String
  /**
    * The value of the custom field.
    */
  var value: java.lang.String
}

object ICustomField {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String): ICustomField = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[ICustomField]
  }
}

