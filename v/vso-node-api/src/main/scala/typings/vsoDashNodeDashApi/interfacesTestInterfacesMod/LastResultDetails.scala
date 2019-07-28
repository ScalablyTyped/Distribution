package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
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
    val __obj = js.Dynamic.literal(dateCompleted = dateCompleted, duration = duration, runBy = runBy)
  
    __obj.asInstanceOf[LastResultDetails]
  }
}

