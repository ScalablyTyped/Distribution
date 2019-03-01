package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestMessageLogDetails extends js.Object {
  /**
    * Date when the resource is created
    */
  var dateCreated: stdLib.Date
  /**
    * Id of the resource
    */
  var entryId: scala.Double
  /**
    * Message of the resource
    */
  var message: java.lang.String
}

object TestMessageLogDetails {
  @scala.inline
  def apply(dateCreated: stdLib.Date, entryId: scala.Double, message: java.lang.String): TestMessageLogDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dateCreated")(dateCreated)
    __obj.updateDynamic("entryId")(entryId)
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[TestMessageLogDetails]
  }
}

