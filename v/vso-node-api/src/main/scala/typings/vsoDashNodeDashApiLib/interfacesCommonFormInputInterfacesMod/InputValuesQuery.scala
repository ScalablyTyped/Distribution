package typings
package vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputValuesQuery extends js.Object {
  var currentValues: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * The input values to return on input, and the result from the consumer on output.
    */
  var inputValues: js.Array[InputValues]
  /**
    * Subscription containing information about the publisher/consumer and the current input values
    */
  var resource: js.Any
}

object InputValuesQuery {
  @scala.inline
  def apply(
    currentValues: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    inputValues: js.Array[InputValues],
    resource: js.Any
  ): InputValuesQuery = {
    val __obj = js.Dynamic.literal(currentValues = currentValues, inputValues = inputValues, resource = resource)
  
    __obj.asInstanceOf[InputValuesQuery]
  }
}

