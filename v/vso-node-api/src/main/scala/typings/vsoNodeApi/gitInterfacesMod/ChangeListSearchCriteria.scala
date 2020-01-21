package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeListSearchCriteria extends js.Object {
  /**
    * If provided, a version descriptor to compare against base
    */
  var compareVersion: String
  /**
    * If true, don't include delete history entries
    */
  var excludeDeletes: Boolean
  /**
    * Whether or not to follow renames for the given item being queried
    */
  var followRenames: Boolean
  /**
    * If provided, only include history entries created after this date (string)
    */
  var fromDate: String
  /**
    * If provided, a version descriptor for the earliest change list to include
    */
  var fromVersion: String
  /**
    * Path of item to search under. If the itemPaths memebr is used then it will take precedence over this.
    */
  var itemPath: String
  /**
    * List of item paths to search under. If this member is used then itemPath will be ignored.
    */
  var itemPaths: js.Array[String]
  /**
    * Version of the items to search
    */
  var itemVersion: String
  /**
    * Number of results to skip (used when clicking more...)
    */
  var skip: Double
  /**
    * If provided, only include history entries created before this date (string)
    */
  var toDate: String
  /**
    * If provided, a version descriptor for the latest change list to include
    */
  var toVersion: String
  /**
    * If provided, the maximum number of history entries to return
    */
  var top: Double
  /**
    * Alias or display name of user who made the changes
    */
  var user: String
}

object ChangeListSearchCriteria {
  @scala.inline
  def apply(
    compareVersion: String,
    excludeDeletes: Boolean,
    followRenames: Boolean,
    fromDate: String,
    fromVersion: String,
    itemPath: String,
    itemPaths: js.Array[String],
    itemVersion: String,
    skip: Double,
    toDate: String,
    toVersion: String,
    top: Double,
    user: String
  ): ChangeListSearchCriteria = {
    val __obj = js.Dynamic.literal(compareVersion = compareVersion.asInstanceOf[js.Any], excludeDeletes = excludeDeletes.asInstanceOf[js.Any], followRenames = followRenames.asInstanceOf[js.Any], fromDate = fromDate.asInstanceOf[js.Any], fromVersion = fromVersion.asInstanceOf[js.Any], itemPath = itemPath.asInstanceOf[js.Any], itemPaths = itemPaths.asInstanceOf[js.Any], itemVersion = itemVersion.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any], toDate = toDate.asInstanceOf[js.Any], toVersion = toVersion.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChangeListSearchCriteria]
  }
}

