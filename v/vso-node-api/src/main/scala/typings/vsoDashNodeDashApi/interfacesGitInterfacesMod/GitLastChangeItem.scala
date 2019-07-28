package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitLastChangeItem extends js.Object {
  /**
    * Gets or sets the commit Id this item was modified most recently for the provided version.
    */
  var commitId: String
  /**
    * Gets or sets the path of the item.
    */
  var path: String
}

object GitLastChangeItem {
  @scala.inline
  def apply(commitId: String, path: String): GitLastChangeItem = {
    val __obj = js.Dynamic.literal(commitId = commitId, path = path)
  
    __obj.asInstanceOf[GitLastChangeItem]
  }
}

