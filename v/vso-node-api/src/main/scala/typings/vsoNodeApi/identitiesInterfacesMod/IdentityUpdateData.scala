package typings.vsoNodeApi.identitiesInterfacesMod

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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IdentityUpdateData]
  }
}

