package typings
package vsoDashNodeDashApiLib.interfacesPolicyInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyTypeRef extends js.Object {
  /**
    * Display name of the policy type.
    */
  var displayName: java.lang.String
  /**
    * The policy type ID.
    */
  var id: java.lang.String
  /**
    * The URL where the policy type can be retrieved.
    */
  var url: java.lang.String
}

object PolicyTypeRef {
  @scala.inline
  def apply(displayName: java.lang.String, id: java.lang.String, url: java.lang.String): PolicyTypeRef = {
    val __obj = js.Dynamic.literal(displayName = displayName, id = id, url = url)
  
    __obj.asInstanceOf[PolicyTypeRef]
  }
}

