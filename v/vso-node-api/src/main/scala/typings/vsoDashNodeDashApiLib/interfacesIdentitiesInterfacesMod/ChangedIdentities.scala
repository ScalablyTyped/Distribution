package typings
package vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod

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
    val __obj = js.Dynamic.literal(identities = identities, sequenceContext = sequenceContext)
  
    __obj.asInstanceOf[ChangedIdentities]
  }
}

