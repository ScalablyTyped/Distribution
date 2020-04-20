package typings.vsoNodeApi.coreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityData extends js.Object {
  var identityIds: js.Array[String]
}

object IdentityData {
  @scala.inline
  def apply(identityIds: js.Array[String]): IdentityData = {
    val __obj = js.Dynamic.literal(identityIds = identityIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityData]
  }
}

