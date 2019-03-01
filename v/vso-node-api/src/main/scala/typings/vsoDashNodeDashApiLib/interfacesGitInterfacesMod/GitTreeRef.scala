package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitTreeRef extends js.Object {
  var _links: js.Any
  /**
    * SHA1 hash of git object
    */
  var objectId: java.lang.String
  /**
    * Sum of sizes of all children
    */
  var size: scala.Double
  /**
    * Blobs and trees under this tree
    */
  var treeEntries: js.Array[GitTreeEntryRef]
  /**
    * Url to tree
    */
  var url: java.lang.String
}

object GitTreeRef {
  @scala.inline
  def apply(
    _links: js.Any,
    objectId: java.lang.String,
    size: scala.Double,
    treeEntries: js.Array[GitTreeEntryRef],
    url: java.lang.String
  ): GitTreeRef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("objectId")(objectId)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("treeEntries")(treeEntries)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[GitTreeRef]
  }
}

