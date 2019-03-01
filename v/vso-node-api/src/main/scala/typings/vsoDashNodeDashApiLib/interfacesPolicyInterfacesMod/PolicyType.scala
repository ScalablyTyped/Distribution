package typings
package vsoDashNodeDashApiLib.interfacesPolicyInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyType extends PolicyTypeRef {
  /**
    * The links to other objects related to this object.
    */
  var _links: js.Any
  /**
    * Detailed description of the policy type.
    */
  var description: java.lang.String
}

object PolicyType {
  @scala.inline
  def apply(
    _links: js.Any,
    description: java.lang.String,
    displayName: java.lang.String,
    id: java.lang.String,
    url: java.lang.String
  ): PolicyType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[PolicyType]
  }
}

