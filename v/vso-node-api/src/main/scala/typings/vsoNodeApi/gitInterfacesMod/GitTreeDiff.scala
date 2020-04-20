package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitTreeDiff extends js.Object {
  /**
    * ObjectId of the base tree of this diff.
    */
  var baseTreeId: String
  /**
    * List of tree entries that differ between the base and target tree.  Renames and object type changes are returned as a delete for the old object and add for the new object.  If a continuation token is returned in the response header, some tree entries are yet to be processed and may yeild more diff entries. If the continuation token is not returned all the diff entries have been included in this response.
    */
  var diffEntries: js.Array[GitTreeDiffEntry]
  /**
    * ObjectId of the target tree of this diff.
    */
  var targetTreeId: String
  /**
    * REST Url to this resource.
    */
  var url: String
}

object GitTreeDiff {
  @scala.inline
  def apply(baseTreeId: String, diffEntries: js.Array[GitTreeDiffEntry], targetTreeId: String, url: String): GitTreeDiff = {
    val __obj = js.Dynamic.literal(baseTreeId = baseTreeId.asInstanceOf[js.Any], diffEntries = diffEntries.asInstanceOf[js.Any], targetTreeId = targetTreeId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitTreeDiff]
  }
}

