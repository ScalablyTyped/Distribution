package typings.vsoNodeApi.tfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcShallowBranchRef extends js.Object {
  /**
    * Path for the branch.
    */
  var path: String
}

object TfvcShallowBranchRef {
  @scala.inline
  def apply(path: String): TfvcShallowBranchRef = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TfvcShallowBranchRef]
  }
}

