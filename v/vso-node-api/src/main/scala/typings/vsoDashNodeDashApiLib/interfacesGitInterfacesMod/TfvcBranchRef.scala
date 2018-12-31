package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcBranchRef extends TfvcShallowBranchRef {
  /**
    * A collection of REST reference links.
    */
  var _links: js.Any
  /**
    * Creation date of the branch.
    */
  var createdDate: stdLib.Date
  /**
    * Description of the branch.
    */
  var description: java.lang.String
  /**
    * Is the branch deleted?
    */
  var isDeleted: scala.Boolean
  /**
    * Alias or display name of user
    */
  var owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * URL to retrieve the item.
    */
  var url: java.lang.String
}

