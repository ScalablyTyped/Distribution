package typings
package vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputValue extends js.Object {
  /**
    * Any other data about this input
    */
  var data: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * The text to show for the display of this value
    */
  var displayValue: java.lang.String
  /**
    * The value to store for this input
    */
  var value: java.lang.String
}

object InputValue {
  @scala.inline
  def apply(
    data: org.scalablytyped.runtime.StringDictionary[js.Any],
    displayValue: java.lang.String,
    value: java.lang.String
  ): InputValue = {
    val __obj = js.Dynamic.literal(data = data, displayValue = displayValue, value = value)
  
    __obj.asInstanceOf[InputValue]
  }
}

