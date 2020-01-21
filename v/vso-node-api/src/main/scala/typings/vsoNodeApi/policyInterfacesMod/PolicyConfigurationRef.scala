package typings.vsoNodeApi.policyInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyConfigurationRef extends js.Object {
  /**
    * The policy configuration ID.
    */
  var id: Double
  /**
    * The policy configuration type.
    */
  var `type`: PolicyTypeRef
  /**
    * The URL where the policy configuration can be retrieved.
    */
  var url: String
}

object PolicyConfigurationRef {
  @scala.inline
  def apply(id: Double, `type`: PolicyTypeRef, url: String): PolicyConfigurationRef = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyConfigurationRef]
  }
}

