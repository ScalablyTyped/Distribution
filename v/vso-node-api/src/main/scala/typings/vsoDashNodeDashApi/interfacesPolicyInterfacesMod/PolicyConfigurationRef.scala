package typings.vsoDashNodeDashApi.interfacesPolicyInterfacesMod

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
    val __obj = js.Dynamic.literal(id = id, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PolicyConfigurationRef]
  }
}

