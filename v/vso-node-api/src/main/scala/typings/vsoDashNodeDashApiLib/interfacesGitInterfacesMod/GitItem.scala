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

