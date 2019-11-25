package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitTreeRef extends js.Object {
  var _links: js.Any
  /**
    * SHA1 hash of git object
    */
  var objectId: String
  /**
    * Sum of sizes of all children
    */
  var size: Double
  /**
    * Blobs and trees under this tree
    */
  var treeEntries: js.Array[GitTreeEntryRef]
  /**
    * Url to tree
    */
  var url: String
}

object GitTreeRef {
  @scala.inline
  def apply(
    _links: js.Any,
    objectId: String,
    size: Double,
    treeEntries: js.Array[GitTreeEntryRef],
    url: String
  ): GitTreeRef = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], treeEntries = treeEntries.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitTreeRef]
  }
}

