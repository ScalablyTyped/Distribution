package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResultPayload extends js.Object {
  var comment: java.lang.String
  var name: java.lang.String
  var stream: java.lang.String
}

object TestResultPayload {
  @scala.inline
  def apply(comment: java.lang.String, name: java.lang.String, stream: java.lang.String): TestResultPayload = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("comment")(comment)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("stream")(stream)
    __obj.asInstanceOf[TestResultPayload]
  }
}

