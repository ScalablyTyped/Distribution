package typings.vsoDashNodeDashApi.interfacesIdentitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangedIdentitiesContext extends js.Object {
  /**
    * Last Group SequenceId
    */
  var groupSequenceId: Double
  /**
    * Last Identity SequenceId
    */
  var identitySequenceId: Double
}

object ChangedIdentitiesContext {
  @scala.inline
  def apply(groupSequenceId: Double, identitySequenceId: Double): ChangedIdentitiesContext = {
    val __obj = js.Dynamic.literal(groupSequenceId = groupSequenceId, identitySequenceId = identitySequenceId)
  
    __obj.asInstanceOf[ChangedIdentitiesContext]
  }
}

