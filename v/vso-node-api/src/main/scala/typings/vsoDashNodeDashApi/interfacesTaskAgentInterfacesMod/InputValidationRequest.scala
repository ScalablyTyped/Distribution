package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputValidationRequest extends js.Object {
  var inputs: StringDictionary[InputValidationItem]
}

object InputValidationRequest {
  @scala.inline
  def apply(inputs: StringDictionary[InputValidationItem]): InputValidationRequest = {
    val __obj = js.Dynamic.literal(inputs = inputs)
  
    __obj.asInstanceOf[InputValidationRequest]
  }
}

