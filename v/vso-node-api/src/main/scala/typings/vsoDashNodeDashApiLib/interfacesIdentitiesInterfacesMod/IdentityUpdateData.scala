package typings
package vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityUpdateData extends js.Object {
  var id: java.lang.String
  var index: scala.Double
  var updated: scala.Boolean
}

object IdentityUpdateData {
  @scala.inline
  def apply(id: java.lang.String, index: scala.Double, updated: scala.Boolean): IdentityUpdateData = {
    val __obj = js.Dynamic.literal(id = id, index = index, updated = updated)
  
    __obj.asInstanceOf[IdentityUpdateData]
  }
}

