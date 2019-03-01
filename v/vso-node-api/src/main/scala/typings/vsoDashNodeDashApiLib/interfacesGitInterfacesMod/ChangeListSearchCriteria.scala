package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeListSearchCriteria extends js.Object {
  /**
    * If provided, a version descriptor to compare against base
    */
  var compareVersion: java.lang.String
  /**
    * If true, don't include delete history entries
    */
  var excludeDeletes: scala.Boolean
  /**
    * Whether or not to follow renames for the given item being queried
    */
  var followRenames: scala.Boolean
  /**
    * If provided, only include history entries created after this date (string)
    */
  var fromDate: java.lang.String
  /**
    * If provided, a version descriptor for the earliest change list to include
    */
  var fromVersion: java.lang.String
  /**
    * Path of item to search under. If the itemPaths memebr is used then it will take precedence over this.
    */
  var itemPath: java.lang.String
  /**
    * List of item paths to search under. If this member is used then itemPath will be ignored.
    */
  var itemPaths: js.Array[java.lang.String]
  /**
    * Version of the items to search
    */
  var itemVersion: java.lang.String
  /**
    * Number of results to skip (used when clicking more...)
    */
  var skip: scala.Double
  /**
    * If provided, only include history entries created before this date (string)
    */
  var toDate: java.lang.String
  /**
    * If provided, a version descriptor for the latest change list to include
    */
  var toVersion: java.lang.String
  /**
    * If provided, the maximum number of history entries to return
    */
  var top: scala.Double
  /**
    * Alias or display name of user who made the changes
    */
  var user: java.lang.String
}

object ChangeListSearchCriteria {
  @scala.inline
  def apply(
    compareVersion: java.lang.String,
    excludeDeletes: scala.Boolean,
    followRenames: scala.Boolean,
    fromDate: java.lang.String,
    fromVersion: java.lang.String,
    itemPath: java.lang.String,
    itemPaths: js.Array[java.lang.String],
    itemVersion: java.lang.String,
    skip: scala.Double,
    toDate: java.lang.String,
    toVersion: java.lang.String,
    top: scala.Double,
    user: java.lang.String
  ): ChangeListSearchCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compareVersion")(compareVersion)
    __obj.updateDynamic("excludeDeletes")(excludeDeletes)
    __obj.updateDynamic("followRenames")(followRenames)
    __obj.updateDynamic("fromDate")(fromDate)
    __obj.updateDynamic("fromVersion")(fromVersion)
    __obj.updateDynamic("itemPath")(itemPath)
    __obj.updateDynamic("itemPaths")(itemPaths)
    __obj.updateDynamic("itemVersion")(itemVersion)
    __obj.updateDynamic("skip")(skip)
    __obj.updateDynamic("toDate")(toDate)
    __obj.updateDynamic("toVersion")(toVersion)
    __obj.updateDynamic("top")(top)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[ChangeListSearchCriteria]
  }
}

