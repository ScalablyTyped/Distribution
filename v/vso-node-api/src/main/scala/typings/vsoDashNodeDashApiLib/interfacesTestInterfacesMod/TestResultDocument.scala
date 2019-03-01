package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResultDocument extends js.Object {
  var operationReference: TestOperationReference
  var payload: TestResultPayload
}

object TestResultDocument {
  @scala.inline
  def apply(operationReference: TestOperationReference, payload: TestResultPayload): TestResultDocument = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operationReference")(operationReference)
    __obj.updateDynamic("payload")(payload)
    __obj.asInstanceOf[TestResultDocument]
  }
}

