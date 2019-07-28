package typings.typedDashGithubDashApi.distGithubDashApiMod

import typings.moment.momentMod.Moment
import typings.typedDashGithubDashApi.distGithubDashRefMod.GitHubRef
import typings.typedDashGithubDashApi.distGithubDashRefMod.OptionsOrRef
import typings.typedDashGithubDashApi.distInterfacesIssueMod.Issue
import typings.typedDashGithubDashApi.distInterfacesOwnerDashRefMod.OwnerRef
import typings.typedDashGithubDashApi.distInterfacesRepositoryMod.Repository
import typings.typedDashGithubDashApi.distOrganizationMod.OrganizationSummaryClass
import typings.typedDashGithubDashApi.distOwnerDashRefMod.OwnerRefClass
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.`best match`
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.`private`
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.all
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.assigned
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.closed
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.collaborator
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.comments
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.created
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.forks
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.full_name
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.mentioned
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.open
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.organization_member
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.owner
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.public
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.pushed
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.stars
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.subscribed
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/github-api", "GitHubApi")
@js.native
class GitHubApi protected () extends GitHubRef {
  def this(options: OptionsOrRef) = this()
  /* private */ def getAllSearchPagesAsync[TApiData](uri: js.Any): js.Any = js.native
  /* private */ def getIssue(issue: js.Any): js.Any = js.native
  /**
    * @deprecated Use getOwner instead
    */
  def getOrganization(login: String): OwnerRefClass = js.native
  def getOwner(login: String): OwnerRef = js.native
  /* private */ def getRepository(repository: js.Any): js.Any = js.native
  /**
    * @deprecated Use getOwner instead
    */
  def getUser(login: String): OwnerRefClass = js.native
  def loadIssuesAsync(
    filter: js.UndefOr[assigned | created | mentioned | subscribed | all],
    state: js.UndefOr[open | closed | all],
    labels: js.UndefOr[js.Array[String]],
    sort: js.UndefOr[created | updated | comments],
    ascending: js.UndefOr[Boolean],
    updatedSince: js.UndefOr[Moment]
  ): js.Promise[js.Array[Issue]] = js.native
  def loadMyOrganizationsAsync(): js.Promise[js.Array[OrganizationSummaryClass]] = js.native
  def loadMyRepositoriesAsync(visibility: `private`, affiliation: js.Array[owner | collaborator | organization_member]): js.Promise[js.Array[Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: `private`,
    affiliation: js.Array[owner | collaborator | organization_member],
    sort: created
  ): js.Promise[js.Array[Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: `private`,
    affiliation: js.Array[owner | collaborator | organization_member],
    sort: created,
    ascending: Boolean
  ): js.Promise[js.Array[Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: `private`,
    affiliation: js.Array[owner | collaborator | organization_member],
    sort: full_name
  ): js.Promise[js.Array[Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: `private`,
    affiliation: js.Array[owner | collaborator | organization_member],
    sort: full_name,
    ascending: Boolean
  ): js.Promise[js.Array[Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: `private`,
    affiliation: js.Array[owner | collaborator | organization_member],
    sort: pushed
  ): js.Promise[js.Array[Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: `private`,
    affiliation: js.Array[owner | collaborator | organization_member],
    sort: pushed,
    ascending: Boolean
  ): js.Promise[js.Array[Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: `private`,
    affiliation: js.Array[owner | collaborator | organization_member],
    sort: updated
  ): js.Promise[js.Array[Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: `private`,
    affiliation: js.Array[owner | collaborator | organization_member],
    sort: updated,
    ascending: Boolean
  ): js.Promise[js.Array[Repository]] = js.native
  def loadMyRepositoriesAsync(visibility: all, affiliation: js.Array[owner | collaborator | organization_member]): js.Promise[js.Array[Repository]] = js.native
  def loadMyRepositoriesAsync(visibility: all, affiliation: js.Array[owner | collaborator | organization_member], sort: created): js.Promise[js.Array[Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: all,
    affiliation: js.Array[owner | collaborator | organization_member],
    sort: created,
    ascending: Boolean
  ): js.Promise[js.Array[Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: all,
    affiliation: js.Array[owner | collaborator | organization_member],
    sort: full_name
  ): js.Promise[js.Array[Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: all,
    affiliation: js.Array[owner | collaborator | organization_member],
    sort: full_name,
    ascending: Boolean
  ): js.Promise[js.Array[Repository]] = js.native
  def loadMyRepositoriesAsync(visibility: all, affiliation: js.Array[owner | collaborator | organization_member], sort: pushed): js.Promise[js.Array[Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: all,
    affiliation: js.Array[owner | collaborator | organization_member],
    sort: pushed,
    ascending: Boolean
  ): js.Promise[js.Array[Repository]] = js.native
  def loadMyRepositoriesAsync(visibility: all, affiliation: js.Array[owner | collaborator | organization_member], sort: updated): js.Promise[js.Array[Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: all,
    affiliation: js.Array[owner | collaborator | organization_member],
    sort: updated,
    ascending: Boolean
  ): js.Promise[js.Array[Repository]] = js.native
  def loadMyRepositoriesAsync(visibility: public, affiliation: js.Array[owner | collaborator | organization_member]): js.Promise[js.Array[Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: public,
    affiliation: js.Array[owner | collaborator | organization_member],
    sort: created
  ): js.Promise[js.Array[Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: public,
    affiliation: js.Array[owner | collaborator | organization_member],
    sort: created,
    ascending: Boolean
  ): js.Promise[js.Array[Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: public,
    affiliation: js.Array[owner | collaborator | organization_member],
    sort: full_name
  ): js.Promise[js.Array[Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: public,
    affiliation: js.Array[owner | collaborator | organization_member],
    sort: full_name,
    ascending: Boolean
  ): js.Promise[js.Array[Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: public,
    affiliation: js.Array[owner | collaborator | organization_member],
    sort: pushed
  ): js.Promise[js.Array[Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: public,
    affiliation: js.Array[owner | collaborator | organization_member],
    sort: pushed,
    ascending: Boolean
  ): js.Promise[js.Array[Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: public,
    affiliation: js.Array[owner | collaborator | organization_member],
    sort: updated
  ): js.Promise[js.Array[Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: public,
    affiliation: js.Array[owner | collaborator | organization_member],
    sort: updated,
    ascending: Boolean
  ): js.Promise[js.Array[Repository]] = js.native
  @JSName("loadMyRepositoriesAsync")
  def loadMyRepositoriesAsync_all(visibility: all): js.Promise[js.Array[Repository]] = js.native
  @JSName("loadMyRepositoriesAsync")
  def loadMyRepositoriesAsync_private(visibility: `private`): js.Promise[js.Array[Repository]] = js.native
  @JSName("loadMyRepositoriesAsync")
  def loadMyRepositoriesAsync_public(visibility: public): js.Promise[js.Array[Repository]] = js.native
  /* private */ def searchAsync[TData, TApiData](uri: js.Any, query: js.Any, sort: js.Any, ascending: js.Any, perPage: js.Any, mapping: js.Any): js.Any = js.native
  /**
    * Loads issues matching search query.
    * @param query     The query used for the search
    * @param sort      The field to sort by (default best match)
    * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
    * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
    * @returns         An array of issues that match the query
    */
  def searchIssuesAsync(query: String): js.Promise[js.Array[Issue]] = js.native
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_bestmatch(query: String, sort: `best match`): js.Promise[js.Array[Issue]] = js.native
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_bestmatch(query: String, sort: `best match`, ascending: Boolean): js.Promise[js.Array[Issue]] = js.native
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_bestmatch(query: String, sort: `best match`, ascending: Boolean, perPage: Double): js.Promise[js.Array[Issue]] = js.native
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_comments(query: String, sort: comments): js.Promise[js.Array[Issue]] = js.native
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_comments(query: String, sort: comments, ascending: Boolean): js.Promise[js.Array[Issue]] = js.native
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_comments(query: String, sort: comments, ascending: Boolean, perPage: Double): js.Promise[js.Array[Issue]] = js.native
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_created(query: String, sort: created): js.Promise[js.Array[Issue]] = js.native
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_created(query: String, sort: created, ascending: Boolean): js.Promise[js.Array[Issue]] = js.native
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_created(query: String, sort: created, ascending: Boolean, perPage: Double): js.Promise[js.Array[Issue]] = js.native
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_updated(query: String, sort: updated): js.Promise[js.Array[Issue]] = js.native
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_updated(query: String, sort: updated, ascending: Boolean): js.Promise[js.Array[Issue]] = js.native
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_updated(query: String, sort: updated, ascending: Boolean, perPage: Double): js.Promise[js.Array[Issue]] = js.native
  /**
    * Loads issues matching search query with a score as to how well they matched.
    * @param query     The query used for the search
    * @param sort      The field to sort by (default best match)
    * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
    * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
    * @returns         An array of issues that match the query with a score as to how well they matched
    */
  def searchIssuesWithScoreAsync(query: String): js.Promise[js.Array[SearchResult[Issue]]] = js.native
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_bestmatch(query: String, sort: `best match`): js.Promise[js.Array[SearchResult[Issue]]] = js.native
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_bestmatch(query: String, sort: `best match`, ascending: Boolean): js.Promise[js.Array[SearchResult[Issue]]] = js.native
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_bestmatch(query: String, sort: `best match`, ascending: Boolean, perPage: Double): js.Promise[js.Array[SearchResult[Issue]]] = js.native
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_comments(query: String, sort: comments): js.Promise[js.Array[SearchResult[Issue]]] = js.native
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_comments(query: String, sort: comments, ascending: Boolean): js.Promise[js.Array[SearchResult[Issue]]] = js.native
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_comments(query: String, sort: comments, ascending: Boolean, perPage: Double): js.Promise[js.Array[SearchResult[Issue]]] = js.native
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_created(query: String, sort: created): js.Promise[js.Array[SearchResult[Issue]]] = js.native
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_created(query: String, sort: created, ascending: Boolean): js.Promise[js.Array[SearchResult[Issue]]] = js.native
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_created(query: String, sort: created, ascending: Boolean, perPage: Double): js.Promise[js.Array[SearchResult[Issue]]] = js.native
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_updated(query: String, sort: updated): js.Promise[js.Array[SearchResult[Issue]]] = js.native
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_updated(query: String, sort: updated, ascending: Boolean): js.Promise[js.Array[SearchResult[Issue]]] = js.native
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_updated(query: String, sort: updated, ascending: Boolean, perPage: Double): js.Promise[js.Array[SearchResult[Issue]]] = js.native
  /**
    * Loads repositories matching search query.
    * @param query     The query used for the search
    * @param sort      The field to sort by (default best match)
    * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
    * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
    * @returns         An array of repositories that match the query
    */
  def searchRepositoriesAsync(query: String): js.Promise[js.Array[Repository]] = js.native
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_bestmatch(query: String, sort: `best match`): js.Promise[js.Array[Repository]] = js.native
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_bestmatch(query: String, sort: `best match`, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_bestmatch(query: String, sort: `best match`, ascending: Boolean, perPage: Double): js.Promise[js.Array[Repository]] = js.native
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_forks(query: String, sort: forks): js.Promise[js.Array[Repository]] = js.native
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_forks(query: String, sort: forks, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_forks(query: String, sort: forks, ascending: Boolean, perPage: Double): js.Promise[js.Array[Repository]] = js.native
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_stars(query: String, sort: stars): js.Promise[js.Array[Repository]] = js.native
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_stars(query: String, sort: stars, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_stars(query: String, sort: stars, ascending: Boolean, perPage: Double): js.Promise[js.Array[Repository]] = js.native
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_updated(query: String, sort: updated): js.Promise[js.Array[Repository]] = js.native
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_updated(query: String, sort: updated, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_updated(query: String, sort: updated, ascending: Boolean, perPage: Double): js.Promise[js.Array[Repository]] = js.native
  /**
    * Loads repositories matching search query with a score as to how well they matched.
    * @param query     The query used for the search
    * @param sort      The field to sort by (default best match)
    * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
    * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
    * @returns         An array of repositories that match the query with a score as to how well they matched
    */
  def searchRepositoriesWithScoreAsync(query: String): js.Promise[js.Array[SearchResult[Repository]]] = js.native
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_bestmatch(query: String, sort: `best match`): js.Promise[js.Array[SearchResult[Repository]]] = js.native
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_bestmatch(query: String, sort: `best match`, ascending: Boolean): js.Promise[js.Array[SearchResult[Repository]]] = js.native
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_bestmatch(query: String, sort: `best match`, ascending: Boolean, perPage: Double): js.Promise[js.Array[SearchResult[Repository]]] = js.native
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_forks(query: String, sort: forks): js.Promise[js.Array[SearchResult[Repository]]] = js.native
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_forks(query: String, sort: forks, ascending: Boolean): js.Promise[js.Array[SearchResult[Repository]]] = js.native
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_forks(query: String, sort: forks, ascending: Boolean, perPage: Double): js.Promise[js.Array[SearchResult[Repository]]] = js.native
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_stars(query: String, sort: stars): js.Promise[js.Array[SearchResult[Repository]]] = js.native
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_stars(query: String, sort: stars, ascending: Boolean): js.Promise[js.Array[SearchResult[Repository]]] = js.native
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_stars(query: String, sort: stars, ascending: Boolean, perPage: Double): js.Promise[js.Array[SearchResult[Repository]]] = js.native
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_updated(query: String, sort: updated): js.Promise[js.Array[SearchResult[Repository]]] = js.native
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_updated(query: String, sort: updated, ascending: Boolean): js.Promise[js.Array[SearchResult[Repository]]] = js.native
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_updated(query: String, sort: updated, ascending: Boolean, perPage: Double): js.Promise[js.Array[SearchResult[Repository]]] = js.native
}

