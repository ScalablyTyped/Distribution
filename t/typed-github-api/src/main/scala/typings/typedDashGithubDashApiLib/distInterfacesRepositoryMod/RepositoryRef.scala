package typings
package typedDashGithubDashApiLib.distInterfacesRepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryRef extends js.Object {
  val name: java.lang.String = js.native
  val owner: typedDashGithubDashApiLib.distInterfacesOwnerDashRefMod.OwnerRef = js.native
  def getBranch(name: java.lang.String): typedDashGithubDashApiLib.distInterfacesBranchMod.BranchRef = js.native
  def getCommit(sha: java.lang.String): typedDashGithubDashApiLib.distInterfacesCommitMod.CommitRef = js.native
  def getIssue(issueNumber: scala.Double): typedDashGithubDashApiLib.distInterfacesIssueMod.IssueRef = js.native
  def getPullRequest(pullRequestNumber: scala.Double): typedDashGithubDashApiLib.distInterfacesPullDashRequestMod.PullRequestRef = js.native
  def loadAsync(): js.Promise[Repository | scala.Null] = js.native
  /**
    * Loads branches from this repository.
    * @param protectedOnly Only loads protected branches
    * @returns             The resulting array of branches
    */
  def loadBranchesAsync(): js.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesBranchMod.BranchRef]] = js.native
  def loadBranchesAsync(protectedOnly: scala.Boolean): js.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesBranchMod.BranchRef]] = js.native
  /**
    * Loads commits from this repository.
    * @param start         SHA or branch to start listing commits from. Default: the repository�s default branch (usually master)
    * @param pathIncluded  Only commits containing this file path will be returned
    * @param author        GitHub login or email address by which to filter by commit author
    * @param since         Only commits after this date will be returned
    * @param until         Only commits before this date will be returned
    * @returns             The resulting array of commits
    */
  def loadCommitsAsync(): js.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesCommitMod.CommitSummary]] = js.native
  def loadCommitsAsync(start: java.lang.String): js.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesCommitMod.CommitSummary]] = js.native
  def loadCommitsAsync(start: java.lang.String, pathIncluded: java.lang.String): js.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesCommitMod.CommitSummary]] = js.native
  def loadCommitsAsync(start: java.lang.String, pathIncluded: java.lang.String, author: java.lang.String): js.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesCommitMod.CommitSummary]] = js.native
  def loadCommitsAsync(
    start: java.lang.String,
    pathIncluded: java.lang.String,
    author: java.lang.String,
    since: momentLib.momentMod.momentNs.Moment
  ): js.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesCommitMod.CommitSummary]] = js.native
  def loadCommitsAsync(
    start: java.lang.String,
    pathIncluded: java.lang.String,
    author: java.lang.String,
    since: momentLib.momentMod.momentNs.Moment,
    until: momentLib.momentMod.momentNs.Moment
  ): js.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesCommitMod.CommitSummary]] = js.native
  /**
    * Loads issues for this repository.
    * @param milestone     Only loads issues for this milestone, if specified;
    *                      specify * to say the issue must be in a milestone and none to say it must not;
    *                      if a number is passed, it should refer to a milestone by its number field
    * @param state         Only loads issues for this state (default open)
    * @param assignee      Only loads issues where this user is assigned, if specified;
    *                      pass in none for issues with no assigned user, and * for issues assigned to any user
    * @param creator       Only loads issues created by this user, if specified
    * @param mentioned     Only loads issues where this user is mentioned, if specified
    * @param labels        Only loads issues tagged with one of these labels, if specified
    * @param sort          The field to sort by (default created)
    * @param ascending     Whether to sort ascending rather than descending (default false)
    * @param updatedSince  Only issues updated at or after this time are returned
    * @returns             The resulting array of issues
    */
  def loadIssuesAsync(
    milestone: js.UndefOr[
      scala.Double | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.`*` | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.none
    ],
    state: js.UndefOr[
      typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.open | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.closed | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.all
    ],
    assignee: js.UndefOr[
      java.lang.String | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.`*` | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.none
    ],
    creator: js.UndefOr[java.lang.String],
    mentioned: js.UndefOr[java.lang.String],
    labels: js.UndefOr[js.Array[java.lang.String]],
    sort: js.UndefOr[
      typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.created | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.updated | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.comments
    ],
    ascending: js.UndefOr[scala.Boolean],
    updatedSince: js.UndefOr[momentLib.momentMod.momentNs.Moment]
  ): js.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesIssueMod.Issue]] = js.native
  /**
    * Loads pull requests for this repository.
    * @param state         Only loads pull requests for this state (default open)
    * @param headBranch    Only loads pull requests where the head to be merged is from this branch
    * @param headUsersFork Only loads pull requests where the head to be merged is from this user's fork
    * @param baseBranch    Only loads pull requests where the base to be merged in to is this branch
    * @param sort          The field to sort by (default created)
    * @param ascending     Whether to sort ascending rather than descending (default false unless sorting by created date)
    * @returns             The resulting array of pull requests
    */
  def loadPullRequestsAsync(
    state: js.UndefOr[
      typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.all | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.closed | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.open
    ],
    headBranch: js.UndefOr[java.lang.String],
    headUsersFork: js.UndefOr[java.lang.String],
    baseBranch: js.UndefOr[java.lang.String],
    sort: js.UndefOr[
      typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.created | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.`long-running` | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.popularity | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.updated
    ],
    ascending: js.UndefOr[scala.Boolean]
  ): js.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesPullDashRequestMod.PullRequest]] = js.native
}

