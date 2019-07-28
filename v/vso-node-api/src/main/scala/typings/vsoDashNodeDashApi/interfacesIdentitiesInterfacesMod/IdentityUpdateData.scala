package typings.vsoDashNodeDashApi.interfacesIdentitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityUpdateData extends js.Object {
  var id: String
  var index: Double
  var updated: Boolean
}

object IdentityUpdateData {
  @scala.inline
  def apply(id: String, index: Double, updated: Boolean): IdentityUpdateData = {
    val __obj = js.Dynamic.literal(id = id, index = index, updated = updated)
  
    __obj.asInstanceOf[IdentityUpdateData]
  }
}

