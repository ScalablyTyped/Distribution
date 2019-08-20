package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivilegeKeyList extends js.Object {
  var token: String
  var token_created: Double
  var token_description: String
  var token_id1: Double
  var token_id2: Double
  var token_type: Double
}

object PrivilegeKeyList {
  @scala.inline
  def apply(
    token: String,
    token_created: Double,
    token_description: String,
    token_id1: Double,
    token_id2: Double,
    token_type: Double
  ): PrivilegeKeyList = {
    val __obj = js.Dynamic.literal(token = token, token_created = token_created, token_description = token_description, token_id1 = token_id1, token_id2 = token_id2, token_type = token_type)
  
    __obj.asInstanceOf[PrivilegeKeyList]
  }
}

