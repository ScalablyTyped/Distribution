package typings.vsoNodeApi.formInputInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputValuesQuery extends js.Object {
  var currentValues: StringDictionary[String] = js.native
  /**
    * The input values to return on input, and the result from the consumer on output.
    */
  var inputValues: js.Array[InputValues] = js.native
  /**
    * Subscription containing information about the publisher/consumer and the current input values
    */
  var resource: js.Any = js.native
}

object InputValuesQuery {
  @scala.inline
  def apply(currentValues: StringDictionary[String], inputValues: js.Array[InputValues], resource: js.Any): InputValuesQuery = {
    val __obj = js.Dynamic.literal(currentValues = currentValues.asInstanceOf[js.Any], inputValues = inputValues.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputValuesQuery]
  }
  @scala.inline
  implicit class InputValuesQueryOps[Self <: InputValuesQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrentValues(value: StringDictionary[String]): Self = this.set("currentValues", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputValuesVarargs(value: InputValues*): Self = this.set("inputValues", js.Array(value :_*))
    @scala.inline
    def setInputValues(value: js.Array[InputValues]): Self = this.set("inputValues", value.asInstanceOf[js.Any])
    @scala.inline
    def setResource(value: js.Any): Self = this.set("resource", value.asInstanceOf[js.Any])
  }
  
}

