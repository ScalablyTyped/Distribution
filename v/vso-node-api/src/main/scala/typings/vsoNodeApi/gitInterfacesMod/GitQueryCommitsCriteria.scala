package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitQueryCommitsCriteria extends js.Object {
  /**
    * Number of entries to skip
    */
  @JSName("$skip")
  var $skip: Double
  /**
    * Maximum number of entries to retrieve
    */
  @JSName("$top")
  var $top: Double
  /**
    * Alias or display name of the author
    */
  var author: String
  /**
    * If provided, the earliest commit in the graph to search
    */
  var compareVersion: GitVersionDescriptor
  /**
    * If true, don't include delete history entries
    */
  var excludeDeletes: Boolean
  /**
    * If provided, a lower bound for filtering commits alphabetically
    */
  var fromCommitId: String
  /**
    * If provided, only include history entries created after this date (string)
    */
  var fromDate: String
  /**
    * What Git history mode should be used. This only applies to the search criteria when Ids = null.
    */
  var historyMode: GitHistoryMode
  /**
    * If provided, specifies the exact commit ids of the commits to fetch. May not be combined with other parameters.
    */
  var ids: js.Array[String]
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: Boolean
  /**
    * Whether to include linked work items
    */
  var includeWorkItems: Boolean
  /**
    * Path of item to search under
    */
  var itemPath: String
  /**
    * If provided, identifies the commit or branch to search
    */
  var itemVersion: GitVersionDescriptor
  /**
    * If provided, an upper bound for filtering commits alphabetically
    */
  var toCommitId: String
  /**
    * If provided, only include history entries created before this date (string)
    */
  var toDate: String
  /**
    * Alias or display name of the committer
    */
  var user: String
}

object GitQueryCommitsCriteria {
  @scala.inline
  def apply(
    $skip: Double,
    $top: Double,
    author: String,
    compareVersion: GitVersionDescriptor,
    excludeDeletes: Boolean,
    fromCommitId: String,
    fromDate: String,
    historyMode: GitHistoryMode,
    ids: js.Array[String],
    includeLinks: Boolean,
    includeWorkItems: Boolean,
    itemPath: String,
    itemVersion: GitVersionDescriptor,
    toCommitId: String,
    toDate: String,
    user: String
  ): GitQueryCommitsCriteria = {
    val __obj = js.Dynamic.literal($skip = $skip.asInstanceOf[js.Any], $top = $top.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], compareVersion = compareVersion.asInstanceOf[js.Any], excludeDeletes = excludeDeletes.asInstanceOf[js.Any], fromCommitId = fromCommitId.asInstanceOf[js.Any], fromDate = fromDate.asInstanceOf[js.Any], historyMode = historyMode.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], includeLinks = includeLinks.asInstanceOf[js.Any], includeWorkItems = includeWorkItems.asInstanceOf[js.Any], itemPath = itemPath.asInstanceOf[js.Any], itemVersion = itemVersion.asInstanceOf[js.Any], toCommitId = toCommitId.asInstanceOf[js.Any], toDate = toDate.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitQueryCommitsCriteria]
  }
}

