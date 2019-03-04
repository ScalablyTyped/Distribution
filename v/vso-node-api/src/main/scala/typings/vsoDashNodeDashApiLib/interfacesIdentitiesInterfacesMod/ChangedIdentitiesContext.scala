package typings
package vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangedIdentitiesContext extends js.Object {
  /**
    * Last Group SequenceId
    */
  var groupSequenceId: scala.Double
  /**
    * Last Identity SequenceId
    */
  var identitySequenceId: scala.Double
}

object ChangedIdentitiesContext {
  @scala.inline
  def apply(groupSequenceId: scala.Double, identitySequenceId: scala.Double): ChangedIdentitiesContext = {
    val __obj = js.Dynamic.literal(groupSequenceId = groupSequenceId, identitySequenceId = identitySequenceId)
  
    __obj.asInstanceOf[ChangedIdentitiesContext]
  }
}

