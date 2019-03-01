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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("groupSequenceId")(groupSequenceId)
    __obj.updateDynamic("identitySequenceId")(identitySequenceId)
    __obj.asInstanceOf[ChangedIdentitiesContext]
  }
}

