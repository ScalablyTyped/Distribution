package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitTreeDiff extends js.Object {
  /**
    * ObjectId of the base tree of this diff.
    */
  var baseTreeId: java.lang.String
  /**
    * List of tree entries that differ between the base and target tree.  Renames and object type changes are returned as a delete for the old object and add for the new object.  If a continuation token is returned in the response header, some tree entries are yet to be processed and may yeild more diff entries. If the continuation token is not returned all the diff entries have been included in this response.
    */
  var diffEntries: js.Array[GitTreeDiffEntry]
  /**
    * ObjectId of the target tree of this diff.
    */
  var targetTreeId: java.lang.String
  /**
    * REST Url to this resource.
    */
  var url: java.lang.String
}

object GitTreeDiff {
  @scala.inline
  def apply(
    baseTreeId: java.lang.String,
    diffEntries: js.Array[GitTreeDiffEntry],
    targetTreeId: java.lang.String,
    url: java.lang.String
  ): GitTreeDiff = {
    val __obj = js.Dynamic.literal(baseTreeId = baseTreeId, diffEntries = diffEntries, targetTreeId = targetTreeId, url = url)
  
    __obj.asInstanceOf[GitTreeDiff]
  }
}

