package typings.typedGithubApi

import typings.moment.mod.Moment
import typings.typedGithubApi.anon.Admin
import typings.typedGithubApi.distInterfacesBranchMod.BranchRef
import typings.typedGithubApi.distInterfacesCommitMod.CommitRef
import typings.typedGithubApi.distInterfacesCommitMod.CommitSummary
import typings.typedGithubApi.distInterfacesIssueMod.Issue
import typings.typedGithubApi.distInterfacesIssueMod.IssueRef
import typings.typedGithubApi.distInterfacesOwnerRefMod.OwnerRef
import typings.typedGithubApi.distInterfacesPullRequestMod.PullRequest
import typings.typedGithubApi.distInterfacesPullRequestMod.PullRequestRef
import typings.typedGithubApi.distInterfacesUserMod.UserSummary
import typings.typedGithubApi.typedGithubApiStrings.Asterisk
import typings.typedGithubApi.typedGithubApiStrings.`long-running`
import typings.typedGithubApi.typedGithubApiStrings.all
import typings.typedGithubApi.typedGithubApiStrings.closed
import typings.typedGithubApi.typedGithubApiStrings.comments
import typings.typedGithubApi.typedGithubApiStrings.created
import typings.typedGithubApi.typedGithubApiStrings.none
import typings.typedGithubApi.typedGithubApiStrings.open
import typings.typedGithubApi.typedGithubApiStrings.popularity
import typings.typedGithubApi.typedGithubApiStrings.updated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesRepositoryMod {
  
  @js.native
  trait Repository
    extends StObject
       with RepositoryRef {
    
    var allowMergeCommit: Boolean = js.native
    
    var allowRebasemerge: Boolean = js.native
    
    var allowSquashMerge: Boolean = js.native
    
    var created: Moment = js.native
    
    var defaultBranch: String = js.native
    
    var description: String = js.native
    
    var forksCount: Double = js.native
    
    var fullName: String = js.native
    
    var hasDownloads: Boolean = js.native
    
    var hasIssues: Boolean = js.native
    
    var hasPages: Boolean = js.native
    
    var hasWiki: Boolean = js.native
    
    var homePage: String = js.native
    
    var htmlUri: String = js.native
    
    var id: Double = js.native
    
    var isFork: Boolean = js.native
    
    var isPrivate: Boolean = js.native
    
    var language: js.UndefOr[String] = js.native
    
    var networkCount: Double = js.native
    
    var openIssuesCount: Double = js.native
    
    @JSName("owner")
    var owner_Repository: UserSummary = js.native
    
    var permissions: Admin = js.native
    
    var pushed: Moment = js.native
    
    var size: Double = js.native
    
    var starGazersCount: Double = js.native
    
    var subscribersCount: Double = js.native
    
    var topics: js.Array[String] = js.native
    
    var updated: Moment = js.native
    
    var watchersCount: Double = js.native
  }
  
  @js.native
  trait RepositoryRef extends StObject {
    
    def getBranch(name: String): BranchRef = js.native
    
    def getCommit(sha: String): CommitRef = js.native
    
    def getIssue(issueNumber: Double): IssueRef = js.native
    
    def getPullRequest(pullRequestNumber: Double): PullRequestRef = js.native
    
    def loadAsync(): js.Promise[Repository | Null] = js.native
    
    /**
      * Loads branches from this repository.
      * @param protectedOnly Only loads protected branches
      * @returns             The resulting array of branches
      */
    def loadBranchesAsync(): js.Promise[js.Array[BranchRef]] = js.native
    def loadBranchesAsync(protectedOnly: Boolean): js.Promise[js.Array[BranchRef]] = js.native
    
    /**
      * Loads commits from this repository.
      * @param start         SHA or branch to start listing commits from. Default: the repository�s default branch (usually master)
      * @param pathIncluded  Only commits containing this file path will be returned
      * @param author        GitHub login or email address by which to filter by commit author
      * @param since         Only commits after this date will be returned
      * @param until         Only commits before this date will be returned
      * @returns             The resulting array of commits
      */
    def loadCommitsAsync(): js.Promise[js.Array[CommitSummary]] = js.native
    def loadCommitsAsync(start: String): js.Promise[js.Array[CommitSummary]] = js.native
    def loadCommitsAsync(start: String, pathIncluded: String): js.Promise[js.Array[CommitSummary]] = js.native
    def loadCommitsAsync(start: String, pathIncluded: String, author: String): js.Promise[js.Array[CommitSummary]] = js.native
    def loadCommitsAsync(start: String, pathIncluded: String, author: String, since: Unit, until: Moment): js.Promise[js.Array[CommitSummary]] = js.native
    def loadCommitsAsync(start: String, pathIncluded: String, author: String, since: Moment): js.Promise[js.Array[CommitSummary]] = js.native
    def loadCommitsAsync(start: String, pathIncluded: String, author: String, since: Moment, until: Moment): js.Promise[js.Array[CommitSummary]] = js.native
    def loadCommitsAsync(start: String, pathIncluded: String, author: Unit, since: Unit, until: Moment): js.Promise[js.Array[CommitSummary]] = js.native
    def loadCommitsAsync(start: String, pathIncluded: String, author: Unit, since: Moment): js.Promise[js.Array[CommitSummary]] = js.native
    def loadCommitsAsync(start: String, pathIncluded: String, author: Unit, since: Moment, until: Moment): js.Promise[js.Array[CommitSummary]] = js.native
    def loadCommitsAsync(start: String, pathIncluded: Unit, author: String): js.Promise[js.Array[CommitSummary]] = js.native
    def loadCommitsAsync(start: String, pathIncluded: Unit, author: String, since: Unit, until: Moment): js.Promise[js.Array[CommitSummary]] = js.native
    def loadCommitsAsync(start: String, pathIncluded: Unit, author: String, since: Moment): js.Promise[js.Array[CommitSummary]] = js.native
    def loadCommitsAsync(start: String, pathIncluded: Unit, author: String, since: Moment, until: Moment): js.Promise[js.Array[CommitSummary]] = js.native
    def loadCommitsAsync(start: String, pathIncluded: Unit, author: Unit, since: Unit, until: Moment): js.Promise[js.Array[CommitSummary]] = js.native
    def loadCommitsAsync(start: String, pathIncluded: Unit, author: Unit, since: Moment): js.Promise[js.Array[CommitSummary]] = js.native
    def loadCommitsAsync(start: String, pathIncluded: Unit, author: Unit, since: Moment, until: Moment): js.Promise[js.Array[CommitSummary]] = js.native
    def loadCommitsAsync(start: Unit, pathIncluded: String): js.Promise[js.Array[CommitSummary]] = js.native
    def loadCommitsAsync(start: Unit, pathIncluded: String, author: String): js.Promise[js.Array[CommitSummary]] = js.native
    def loadCommitsAsync(start: Unit, pathIncluded: String, author: String, since: Unit, until: Moment): js.Promise[js.Array[CommitSummary]] = js.native
    def loadCommitsAsync(start: Unit, pathIncluded: String, author: String, since: Moment): js.Promise[js.Array[CommitSummary]] = js.native
    def loadCommitsAsync(start: Unit, pathIncluded: String, author: String, since: Moment, until: Moment): js.Promise[js.Array[CommitSummary]] = js.native
    def loadCommitsAsync(start: Unit, pathIncluded: String, author: Unit, since: Unit, until: Moment): js.Promise[js.Array[CommitSummary]] = js.native
    def loadCommitsAsync(start: Unit, pathIncluded: String, author: Unit, since: Moment): js.Promise[js.Array[CommitSummary]] = js.native
    def loadCommitsAsync(start: Unit, pathIncluded: String, author: Unit, since: Moment, until: Moment): js.Promise[js.Array[CommitSummary]] = js.native
    def loadCommitsAsync(start: Unit, pathIncluded: Unit, author: String): js.Promise[js.Array[CommitSummary]] = js.native
    def loadCommitsAsync(start: Unit, pathIncluded: Unit, author: String, since: Unit, until: Moment): js.Promise[js.Array[CommitSummary]] = js.native
    def loadCommitsAsync(start: Unit, pathIncluded: Unit, author: String, since: Moment): js.Promise[js.Array[CommitSummary]] = js.native
    def loadCommitsAsync(start: Unit, pathIncluded: Unit, author: String, since: Moment, until: Moment): js.Promise[js.Array[CommitSummary]] = js.native
    def loadCommitsAsync(start: Unit, pathIncluded: Unit, author: Unit, since: Unit, until: Moment): js.Promise[js.Array[CommitSummary]] = js.native
    def loadCommitsAsync(start: Unit, pathIncluded: Unit, author: Unit, since: Moment): js.Promise[js.Array[CommitSummary]] = js.native
    def loadCommitsAsync(start: Unit, pathIncluded: Unit, author: Unit, since: Moment, until: Moment): js.Promise[js.Array[CommitSummary]] = js.native
    
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
      milestone: js.UndefOr[Double | Asterisk | none],
      state: js.UndefOr[open | closed | all],
      assignee: js.UndefOr[String | Asterisk | none],
      creator: js.UndefOr[String],
      mentioned: js.UndefOr[String],
      labels: js.UndefOr[js.Array[String]],
      sort: js.UndefOr[created | updated | comments],
      ascending: js.UndefOr[Boolean],
      updatedSince: js.UndefOr[Moment]
    ): js.Promise[js.Array[Issue]] = js.native
    
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
      state: js.UndefOr[open | closed | all],
      headBranch: js.UndefOr[String],
      headUsersFork: js.UndefOr[String],
      baseBranch: js.UndefOr[String],
      sort: js.UndefOr[created | updated | popularity | `long-running`],
      ascending: js.UndefOr[Boolean]
    ): js.Promise[js.Array[PullRequest]] = js.native
    
    val name: String = js.native
    
    val owner: OwnerRef = js.native
  }
}
