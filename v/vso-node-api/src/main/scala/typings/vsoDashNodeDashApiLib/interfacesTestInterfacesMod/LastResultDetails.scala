package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LastResultDetails extends js.Object {
  var dateCompleted: stdLib.Date
  var duration: scala.Double
  var runBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
}

object LastResultDetails {
  @scala.inline
  def apply(
    dateCompleted: stdLib.Date,
    duration: scala.Double,
    runBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  ): LastResultDetails = {
    val __obj = js.Dynamic.literal(dateCompleted = dateCompleted, duration = duration, runBy = runBy)
  
    __obj.asInstanceOf[LastResultDetails]
  }
}

