package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitLastChangeItem extends js.Object {
  /**
    * Gets or sets the commit Id this item was modified most recently for the provided version.
    */
  var commitId: java.lang.String
  /**
    * Gets or sets the path of the item.
    */
  var path: java.lang.String
}

object GitLastChangeItem {
  @scala.inline
  def apply(commitId: java.lang.String, path: java.lang.String): GitLastChangeItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("commitId")(commitId)
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[GitLastChangeItem]
  }
}

