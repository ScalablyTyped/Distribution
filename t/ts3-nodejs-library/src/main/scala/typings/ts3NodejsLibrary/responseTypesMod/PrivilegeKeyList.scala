package typings.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivilegeKeyList extends js.Object {
  var token: String
  var token_created: Double
  /** only in server version >= 3.11.x */
  var token_customset: js.Array[TokenCustomSet]
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
    token_customset: js.Array[TokenCustomSet],
    token_description: String,
    token_id1: Double,
    token_id2: Double,
    token_type: Double
  ): PrivilegeKeyList = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], token_created = token_created.asInstanceOf[js.Any], token_customset = token_customset.asInstanceOf[js.Any], token_description = token_description.asInstanceOf[js.Any], token_id1 = token_id1.asInstanceOf[js.Any], token_id2 = token_id2.asInstanceOf[js.Any], token_type = token_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivilegeKeyList]
  }
}

