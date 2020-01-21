package typings.vsoNodeApi.formInputInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputValue extends js.Object {
  /**
    * Any other data about this input
    */
  var data: StringDictionary[js.Any]
  /**
    * The text to show for the display of this value
    */
  var displayValue: String
  /**
    * The value to store for this input
    */
  var value: String
}

object InputValue {
  @scala.inline
  def apply(data: StringDictionary[js.Any], displayValue: String, value: String): InputValue = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], displayValue = displayValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InputValue]
  }
}

