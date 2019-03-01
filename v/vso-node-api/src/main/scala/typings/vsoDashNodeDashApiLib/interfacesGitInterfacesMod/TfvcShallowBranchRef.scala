package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcShallowBranchRef extends js.Object {
  /**
    * Path for the branch.
    */
  var path: java.lang.String
}

object TfvcShallowBranchRef {
  @scala.inline
  def apply(path: java.lang.String): TfvcShallowBranchRef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[TfvcShallowBranchRef]
  }
}

