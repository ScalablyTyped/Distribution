package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitItem extends ItemModel {
  /**
    * SHA1 of commit item was fetched at
    */
  var commitId: String
  /**
    * Type of object (Commit, Tree, Blob, Tag, ...)
    */
  var gitObjectType: GitObjectType
  /**
    * Shallow ref to commit that last changed this item Only populated if latestProcessedChange is requested May not be accurate if latest change is not yet cached
    */
  var latestProcessedChange: GitCommitRef
  /**
    * Git object id
    */
  var objectId: String
  /**
    * Git object id
    */
  var originalObjectId: String
}

object GitItem {
  @scala.inline
  def apply(
    _links: js.Any,
    commitId: String,
    contentMetadata: FileContentMetadata,
    gitObjectType: GitObjectType,
    isFolder: Boolean,
    isSymLink: Boolean,
    latestProcessedChange: GitCommitRef,
    objectId: String,
    originalObjectId: String,
    path: String,
    url: String
  ): GitItem = {
    val __obj = js.Dynamic.literal(_links = _links, commitId = commitId, contentMetadata = contentMetadata, gitObjectType = gitObjectType, isFolder = isFolder, isSymLink = isSymLink, latestProcessedChange = latestProcessedChange, objectId = objectId, originalObjectId = originalObjectId, path = path, url = url)
  
    __obj.asInstanceOf[GitItem]
  }
}

