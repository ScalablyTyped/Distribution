package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputValidationRequest extends js.Object {
  var inputs: org.scalablytyped.runtime.StringDictionary[InputValidationItem]
}

object InputValidationRequest {
  @scala.inline
  def apply(inputs: org.scalablytyped.runtime.StringDictionary[InputValidationItem]): InputValidationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("inputs")(inputs)
    __obj.asInstanceOf[InputValidationRequest]
  }
}

