package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcChangesetSearchCriteria extends js.Object {
  /**
    * Alias or display name of user who made the changes
    */
  var author: String
  /**
    * Whether or not to follow renames for the given item being queried
    */
  var followRenames: Boolean
  /**
    * If provided, only include changesets created after this date (string) Think of a better name for this.
    */
  var fromDate: String
  /**
    * If provided, only include changesets after this changesetID
    */
  var fromId: Double
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: Boolean
  /**
    * Path of item to search under
    */
  var itemPath: String
  /**
    * If provided, only include changesets created before this date (string) Think of a better name for this.
    */
  var toDate: String
  /**
    * If provided, a version descriptor for the latest change list to include
    */
  var toId: Double
}

object TfvcChangesetSearchCriteria {
  @scala.inline
  def apply(
    author: String,
    followRenames: Boolean,
    fromDate: String,
    fromId: Double,
    includeLinks: Boolean,
    itemPath: String,
    toDate: String,
    toId: Double
  ): TfvcChangesetSearchCriteria = {
    val __obj = js.Dynamic.literal(author = author, followRenames = followRenames, fromDate = fromDate, fromId = fromId, includeLinks = includeLinks, itemPath = itemPath, toDate = toDate, toId = toId)
  
    __obj.asInstanceOf[TfvcChangesetSearchCriteria]
  }
}

