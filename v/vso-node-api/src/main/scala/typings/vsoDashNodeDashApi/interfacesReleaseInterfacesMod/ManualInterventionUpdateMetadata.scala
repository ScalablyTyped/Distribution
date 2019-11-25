package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManualInterventionUpdateMetadata extends js.Object {
  /**
    * Sets the comment for manual intervention update.
    */
  var comment: String
  /**
    * Sets the status of the manual intervention.
    */
  var status: ManualInterventionStatus
}

object ManualInterventionUpdateMetadata {
  @scala.inline
  def apply(comment: String, status: ManualInterventionStatus): ManualInterventionUpdateMetadata = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ManualInterventionUpdateMetadata]
  }
}

