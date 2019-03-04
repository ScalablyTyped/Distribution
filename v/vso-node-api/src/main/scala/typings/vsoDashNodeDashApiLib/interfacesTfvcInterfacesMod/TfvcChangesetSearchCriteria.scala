package typings
package vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcChangesetSearchCriteria extends js.Object {
  /**
    * Alias or display name of user who made the changes
    */
  var author: java.lang.String
  /**
    * Whether or not to follow renames for the given item being queried
    */
  var followRenames: scala.Boolean
  /**
    * If provided, only include changesets created after this date (string) Think of a better name for this.
    */
  var fromDate: java.lang.String
  /**
    * If provided, only include changesets after this changesetID
    */
  var fromId: scala.Double
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: scala.Boolean
  /**
    * Path of item to search under
    */
  var itemPath: java.lang.String
  /**
    * If provided, only include changesets created before this date (string) Think of a better name for this.
    */
  var toDate: java.lang.String
  /**
    * If provided, a version descriptor for the latest change list to include
    */
  var toId: scala.Double
}

object TfvcChangesetSearchCriteria {
  @scala.inline
  def apply(
    author: java.lang.String,
    followRenames: scala.Boolean,
    fromDate: java.lang.String,
    fromId: scala.Double,
    includeLinks: scala.Boolean,
    itemPath: java.lang.String,
    toDate: java.lang.String,
    toId: scala.Double
  ): TfvcChangesetSearchCriteria = {
    val __obj = js.Dynamic.literal(author = author, followRenames = followRenames, fromDate = fromDate, fromId = fromId, includeLinks = includeLinks, itemPath = itemPath, toDate = toDate, toId = toId)
  
    __obj.asInstanceOf[TfvcChangesetSearchCriteria]
  }
}

