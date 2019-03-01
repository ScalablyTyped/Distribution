package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManualInterventionUpdateMetadata extends js.Object {
  /**
    * Sets the comment for manual intervention update.
    */
  var comment: java.lang.String
  /**
    * Sets the status of the manual intervention.
    */
  var status: ManualInterventionStatus
}

object ManualInterventionUpdateMetadata {
  @scala.inline
  def apply(comment: java.lang.String, status: ManualInterventionStatus): ManualInterventionUpdateMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("comment")(comment)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[ManualInterventionUpdateMetadata]
  }
}

