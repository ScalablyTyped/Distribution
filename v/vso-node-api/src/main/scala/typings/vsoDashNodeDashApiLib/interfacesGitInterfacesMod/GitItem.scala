package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitItem extends ItemModel {
  /**
    * SHA1 of commit item was fetched at
    */
  var commitId: java.lang.String
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
  var objectId: java.lang.String
  /**
    * Git object id
    */
  var originalObjectId: java.lang.String
}

object GitItem {
  @scala.inline
  def apply(
    _links: js.Any,
    commitId: java.lang.String,
    contentMetadata: FileContentMetadata,
    gitObjectType: GitObjectType,
    isFolder: scala.Boolean,
    isSymLink: scala.Boolean,
    latestProcessedChange: GitCommitRef,
    objectId: java.lang.String,
    originalObjectId: java.lang.String,
    path: java.lang.String,
    url: java.lang.String
  ): GitItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("commitId")(commitId)
    __obj.updateDynamic("contentMetadata")(contentMetadata)
    __obj.updateDynamic("gitObjectType")(gitObjectType)
    __obj.updateDynamic("isFolder")(isFolder)
    __obj.updateDynamic("isSymLink")(isSymLink)
    __obj.updateDynamic("latestProcessedChange")(latestProcessedChange)
    __obj.updateDynamic("objectId")(objectId)
    __obj.updateDynamic("originalObjectId")(originalObjectId)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[GitItem]
  }
}

