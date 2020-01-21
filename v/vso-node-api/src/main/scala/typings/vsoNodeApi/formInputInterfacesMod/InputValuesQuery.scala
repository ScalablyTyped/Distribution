package typings.vsoNodeApi.formInputInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputValuesQuery extends js.Object {
  var currentValues: StringDictionary[String]
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
  def apply(currentValues: StringDictionary[String], inputValues: js.Array[InputValues], resource: js.Any): InputValuesQuery = {
    val __obj = js.Dynamic.literal(currentValues = currentValues.asInstanceOf[js.Any], inputValues = inputValues.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InputValuesQuery]
  }
}

