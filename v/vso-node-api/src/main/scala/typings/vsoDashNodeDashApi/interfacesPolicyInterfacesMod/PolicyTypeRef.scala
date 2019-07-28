package typings.vsoDashNodeDashApi.interfacesPolicyInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyTypeRef extends js.Object {
  /**
    * Display name of the policy type.
    */
  var displayName: String
  /**
    * The policy type ID.
    */
  var id: String
  /**
    * The URL where the policy type can be retrieved.
    */
  var url: String
}

object PolicyTypeRef {
  @scala.inline
  def apply(displayName: String, id: String, url: String): PolicyTypeRef = {
    val __obj = js.Dynamic.literal(displayName = displayName, id = id, url = url)
  
    __obj.asInstanceOf[PolicyTypeRef]
  }
}

