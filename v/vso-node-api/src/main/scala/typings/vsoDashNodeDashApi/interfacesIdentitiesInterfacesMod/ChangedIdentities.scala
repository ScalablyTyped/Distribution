package typings.vsoDashNodeDashApi.interfacesIdentitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangedIdentities extends js.Object {
  /**
    * Changed Identities
    */
  var identities: js.Array[Identity]
  /**
    * Last Identity SequenceId
    */
  var sequenceContext: ChangedIdentitiesContext
}

object ChangedIdentities {
  @scala.inline
  def apply(identities: js.Array[Identity], sequenceContext: ChangedIdentitiesContext): ChangedIdentities = {
    val __obj = js.Dynamic.literal(identities = identities.asInstanceOf[js.Any], sequenceContext = sequenceContext.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChangedIdentities]
  }
}

