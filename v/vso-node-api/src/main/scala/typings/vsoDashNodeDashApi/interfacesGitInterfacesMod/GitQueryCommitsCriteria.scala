package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitQueryCommitsCriteria extends js.Object {
  /**
    * Number of entries to skip
    */
  @JSName("$skip")
  var $skip: Double = js.native
  /**
    * Maximum number of entries to retrieve
    */
  @JSName("$top")
  var $top: Double = js.native
  /**
    * Alias or display name of the author
    */
  var author: String = js.native
  /**
    * If provided, the earliest commit in the graph to search
    */
  var compareVersion: GitVersionDescriptor = js.native
  /**
    * If true, don't include delete history entries
    */
  var excludeDeletes: Boolean = js.native
  /**
    * If provided, a lower bound for filtering commits alphabetically
    */
  var fromCommitId: String = js.native
  /**
    * If provided, only include history entries created after this date (string)
    */
  var fromDate: String = js.native
  /**
    * What Git history mode should be used. This only applies to the search criteria when Ids = null.
    */
  var historyMode: GitHistoryMode = js.native
  /**
    * If provided, specifies the exact commit ids of the commits to fetch. May not be combined with other parameters.
    */
  var ids: js.Array[String] = js.native
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: Boolean = js.native
  /**
    * Whether to include linked work items
    */
  var includeWorkItems: Boolean = js.native
  /**
    * Path of item to search under
    */
  var itemPath: String = js.native
  /**
    * If provided, identifies the commit or branch to search
    */
  var itemVersion: GitVersionDescriptor = js.native
  /**
    * If provided, an upper bound for filtering commits alphabetically
    */
  var toCommitId: String = js.native
  /**
    * If provided, only include history entries created before this date (string)
    */
  var toDate: String = js.native
  /**
    * Alias or display name of the committer
    */
  var user: String = js.native
}

