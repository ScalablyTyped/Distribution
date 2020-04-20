package typings.vsoNodeApi.testInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LastResultDetails extends js.Object {
  var dateCompleted: Date
  var duration: Double
  var runBy: IdentityRef
}

object LastResultDetails {
  @scala.inline
  def apply(dateCompleted: Date, duration: Double, runBy: IdentityRef): LastResultDetails = {
    val __obj = js.Dynamic.literal(dateCompleted = dateCompleted.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], runBy = runBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastResultDetails]
  }
}

