package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitTreeDiffEntry extends js.Object {
  /**
    * SHA1 hash of the object in the base tree, if it exists. Will be null in case of adds.
    */
  var baseObjectId: String
  /**
    * Type of change that affected this entry.
    */
  var changeType: VersionControlChangeType
  /**
    * Object type of the tree entry. Blob, Tree or Commit("submodule")
    */
  var objectType: GitObjectType
  /**
    * Relative path in base and target trees.
    */
  var path: String
  /**
    * SHA1 hash of the object in the target tree, if it exists. Will be null in case of deletes.
    */
  var targetObjectId: String
}

object GitTreeDiffEntry {
  @scala.inline
  def apply(
    baseObjectId: String,
    changeType: VersionControlChangeType,
    objectType: GitObjectType,
    path: String,
    targetObjectId: String
  ): GitTreeDiffEntry = {
    val __obj = js.Dynamic.literal(baseObjectId = baseObjectId.asInstanceOf[js.Any], changeType = changeType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], targetObjectId = targetObjectId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitTreeDiffEntry]
  }
}

