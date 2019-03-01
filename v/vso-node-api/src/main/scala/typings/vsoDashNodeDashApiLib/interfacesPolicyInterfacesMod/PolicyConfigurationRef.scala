package typings
package vsoDashNodeDashApiLib.interfacesPolicyInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyConfigurationRef extends js.Object {
  /**
    * The policy configuration ID.
    */
  var id: scala.Double
  /**
    * The policy configuration type.
    */
  var `type`: PolicyTypeRef
  /**
    * The URL where the policy configuration can be retrieved.
    */
  var url: java.lang.String
}

object PolicyConfigurationRef {
  @scala.inline
  def apply(id: scala.Double, `type`: PolicyTypeRef, url: java.lang.String): PolicyConfigurationRef = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[PolicyConfigurationRef]
  }
}

