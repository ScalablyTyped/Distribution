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
    val __obj = js.Dynamic.literal(_links = _links, description = description, displayName = displayName, id = id, url = url)
  
    __obj.asInstanceOf[PolicyType]
  }
}

