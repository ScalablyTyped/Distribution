package typings
package typedDashGithubDashApiLib.distGithubDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/github-api", "GitHubApi")
@js.native
class GitHubApi protected ()
  extends typedDashGithubDashApiLib.distGithubDashRefMod.GitHubRef {
  def this(options: typedDashGithubDashApiLib.distGithubDashRefMod.OptionsOrRef) = this()
  /* private */ def getAllSearchPagesAsync[TApiData](uri: js.Any): js.Any = js.native
  /* private */ def getIssue(issue: js.Any): js.Any = js.native
  /**
       * @deprecated Use getOwner instead
       */
  def getOrganization(login: java.lang.String): typedDashGithubDashApiLib.distOwnerDashRefMod.OwnerRefClass = js.native
  def getOwner(login: java.lang.String): typedDashGithubDashApiLib.distInterfacesOwnerDashRefMod.OwnerRef = js.native
  /* private */ def getRepository(repository: js.Any): js.Any = js.native
  /**
       * @deprecated Use getOwner instead
       */
  def getUser(login: java.lang.String): typedDashGithubDashApiLib.distOwnerDashRefMod.OwnerRefClass = js.native
  def loadIssuesAsync(
    filter: js.UndefOr[
      typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.assigned | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.created | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.mentioned | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.subscribed | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.all
    ],
    state: js.UndefOr[
      typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.open | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.closed | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.all
    ],
    labels: js.UndefOr[js.Array[java.lang.String]],
    sort: js.UndefOr[
      typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.created | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.updated | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.comments
    ],
    ascending: js.UndefOr[scala.Boolean],
    updatedSince: js.UndefOr[momentLib.momentMod.momentNs.Moment]
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesIssueMod.Issue]] = js.native
  def loadMyOrganizationsAsync(): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distOrganizationMod.OrganizationSummaryClass]] = js.native
  def loadMyRepositoriesAsync(
    visibility: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.`private`,
    affiliation: js.Array[
      typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.collaborator | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.organization_member
    ]
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.`private`,
    affiliation: js.Array[
      typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.collaborator | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.organization_member
    ],
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.created
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.`private`,
    affiliation: js.Array[
      typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.collaborator | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.organization_member
    ],
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.created,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.`private`,
    affiliation: js.Array[
      typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.collaborator | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.organization_member
    ],
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.full_name
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.`private`,
    affiliation: js.Array[
      typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.collaborator | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.organization_member
    ],
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.full_name,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.`private`,
    affiliation: js.Array[
      typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.collaborator | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.organization_member
    ],
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.pushed
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.`private`,
    affiliation: js.Array[
      typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.collaborator | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.organization_member
    ],
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.pushed,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.`private`,
    affiliation: js.Array[
      typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.collaborator | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.organization_member
    ],
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.updated
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.`private`,
    affiliation: js.Array[
      typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.collaborator | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.organization_member
    ],
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.updated,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.all,
    affiliation: js.Array[
      typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.collaborator | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.organization_member
    ]
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.all,
    affiliation: js.Array[
      typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.collaborator | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.organization_member
    ],
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.created
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.all,
    affiliation: js.Array[
      typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.collaborator | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.organization_member
    ],
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.created,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.all,
    affiliation: js.Array[
      typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.collaborator | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.organization_member
    ],
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.full_name
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.all,
    affiliation: js.Array[
      typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.collaborator | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.organization_member
    ],
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.full_name,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.all,
    affiliation: js.Array[
      typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.collaborator | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.organization_member
    ],
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.pushed
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.all,
    affiliation: js.Array[
      typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.collaborator | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.organization_member
    ],
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.pushed,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.all,
    affiliation: js.Array[
      typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.collaborator | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.organization_member
    ],
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.updated
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.all,
    affiliation: js.Array[
      typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.collaborator | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.organization_member
    ],
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.updated,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.public,
    affiliation: js.Array[
      typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.collaborator | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.organization_member
    ]
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.public,
    affiliation: js.Array[
      typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.collaborator | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.organization_member
    ],
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.created
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.public,
    affiliation: js.Array[
      typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.collaborator | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.organization_member
    ],
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.created,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.public,
    affiliation: js.Array[
      typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.collaborator | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.organization_member
    ],
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.full_name
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.public,
    affiliation: js.Array[
      typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.collaborator | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.organization_member
    ],
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.full_name,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.public,
    affiliation: js.Array[
      typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.collaborator | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.organization_member
    ],
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.pushed
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.public,
    affiliation: js.Array[
      typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.collaborator | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.organization_member
    ],
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.pushed,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.public,
    affiliation: js.Array[
      typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.collaborator | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.organization_member
    ],
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.updated
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  def loadMyRepositoriesAsync(
    visibility: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.public,
    affiliation: js.Array[
      typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.collaborator | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.organization_member
    ],
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.updated,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  @JSName("loadMyRepositoriesAsync")
  def loadMyRepositoriesAsync_all(visibility: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.all): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  @JSName("loadMyRepositoriesAsync")
  def loadMyRepositoriesAsync_private(visibility: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.`private`): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  @JSName("loadMyRepositoriesAsync")
  def loadMyRepositoriesAsync_public(visibility: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.public): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /* private */ def searchAsync[TData, TApiData](uri: js.Any, query: js.Any, sort: js.Any, ascending: js.Any, perPage: js.Any, mapping: js.Any): js.Any = js.native
  /**
       * Loads issues matching search query.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of issues that match the query
       */
  def searchIssuesAsync(query: java.lang.String): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesIssueMod.Issue]] = js.native
  /**
       * Loads issues matching search query.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of issues that match the query
       */
  @JSName("searchIssuesAsync")
  def `searchIssuesAsync_best match`(
    query: java.lang.String,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.`best match`
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesIssueMod.Issue]] = js.native
  /**
       * Loads issues matching search query.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of issues that match the query
       */
  @JSName("searchIssuesAsync")
  def `searchIssuesAsync_best match`(
    query: java.lang.String,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.`best match`,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesIssueMod.Issue]] = js.native
  /**
       * Loads issues matching search query.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of issues that match the query
       */
  @JSName("searchIssuesAsync")
  def `searchIssuesAsync_best match`(
    query: java.lang.String,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.`best match`,
    ascending: scala.Boolean,
    perPage: scala.Double
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesIssueMod.Issue]] = js.native
  /**
       * Loads issues matching search query.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of issues that match the query
       */
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_comments(query: java.lang.String, sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.comments): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesIssueMod.Issue]] = js.native
  /**
       * Loads issues matching search query.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of issues that match the query
       */
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_comments(
    query: java.lang.String,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.comments,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesIssueMod.Issue]] = js.native
  /**
       * Loads issues matching search query.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of issues that match the query
       */
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_comments(
    query: java.lang.String,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.comments,
    ascending: scala.Boolean,
    perPage: scala.Double
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesIssueMod.Issue]] = js.native
  /**
       * Loads issues matching search query.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of issues that match the query
       */
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_created(query: java.lang.String, sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.created): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesIssueMod.Issue]] = js.native
  /**
       * Loads issues matching search query.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of issues that match the query
       */
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_created(
    query: java.lang.String,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.created,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesIssueMod.Issue]] = js.native
  /**
       * Loads issues matching search query.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of issues that match the query
       */
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_created(
    query: java.lang.String,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.created,
    ascending: scala.Boolean,
    perPage: scala.Double
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesIssueMod.Issue]] = js.native
  /**
       * Loads issues matching search query.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of issues that match the query
       */
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_updated(query: java.lang.String, sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.updated): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesIssueMod.Issue]] = js.native
  /**
       * Loads issues matching search query.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of issues that match the query
       */
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_updated(
    query: java.lang.String,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.updated,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesIssueMod.Issue]] = js.native
  /**
       * Loads issues matching search query.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of issues that match the query
       */
  @JSName("searchIssuesAsync")
  def searchIssuesAsync_updated(
    query: java.lang.String,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.updated,
    ascending: scala.Boolean,
    perPage: scala.Double
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesIssueMod.Issue]] = js.native
  /**
       * Loads issues matching search query with a score as to how well they matched.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of issues that match the query with a score as to how well they matched
       */
  def searchIssuesWithScoreAsync(query: java.lang.String): stdLib.Promise[js.Array[SearchResult[typedDashGithubDashApiLib.distInterfacesIssueMod.Issue]]] = js.native
  /**
       * Loads issues matching search query with a score as to how well they matched.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of issues that match the query with a score as to how well they matched
       */
  @JSName("searchIssuesWithScoreAsync")
  def `searchIssuesWithScoreAsync_best match`(
    query: java.lang.String,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.`best match`
  ): stdLib.Promise[js.Array[SearchResult[typedDashGithubDashApiLib.distInterfacesIssueMod.Issue]]] = js.native
  /**
       * Loads issues matching search query with a score as to how well they matched.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of issues that match the query with a score as to how well they matched
       */
  @JSName("searchIssuesWithScoreAsync")
  def `searchIssuesWithScoreAsync_best match`(
    query: java.lang.String,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.`best match`,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[SearchResult[typedDashGithubDashApiLib.distInterfacesIssueMod.Issue]]] = js.native
  /**
       * Loads issues matching search query with a score as to how well they matched.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of issues that match the query with a score as to how well they matched
       */
  @JSName("searchIssuesWithScoreAsync")
  def `searchIssuesWithScoreAsync_best match`(
    query: java.lang.String,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.`best match`,
    ascending: scala.Boolean,
    perPage: scala.Double
  ): stdLib.Promise[js.Array[SearchResult[typedDashGithubDashApiLib.distInterfacesIssueMod.Issue]]] = js.native
  /**
       * Loads issues matching search query with a score as to how well they matched.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of issues that match the query with a score as to how well they matched
       */
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_comments(query: java.lang.String, sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.comments): stdLib.Promise[js.Array[SearchResult[typedDashGithubDashApiLib.distInterfacesIssueMod.Issue]]] = js.native
  /**
       * Loads issues matching search query with a score as to how well they matched.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of issues that match the query with a score as to how well they matched
       */
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_comments(
    query: java.lang.String,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.comments,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[SearchResult[typedDashGithubDashApiLib.distInterfacesIssueMod.Issue]]] = js.native
  /**
       * Loads issues matching search query with a score as to how well they matched.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of issues that match the query with a score as to how well they matched
       */
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_comments(
    query: java.lang.String,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.comments,
    ascending: scala.Boolean,
    perPage: scala.Double
  ): stdLib.Promise[js.Array[SearchResult[typedDashGithubDashApiLib.distInterfacesIssueMod.Issue]]] = js.native
  /**
       * Loads issues matching search query with a score as to how well they matched.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of issues that match the query with a score as to how well they matched
       */
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_created(query: java.lang.String, sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.created): stdLib.Promise[js.Array[SearchResult[typedDashGithubDashApiLib.distInterfacesIssueMod.Issue]]] = js.native
  /**
       * Loads issues matching search query with a score as to how well they matched.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of issues that match the query with a score as to how well they matched
       */
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_created(
    query: java.lang.String,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.created,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[SearchResult[typedDashGithubDashApiLib.distInterfacesIssueMod.Issue]]] = js.native
  /**
       * Loads issues matching search query with a score as to how well they matched.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of issues that match the query with a score as to how well they matched
       */
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_created(
    query: java.lang.String,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.created,
    ascending: scala.Boolean,
    perPage: scala.Double
  ): stdLib.Promise[js.Array[SearchResult[typedDashGithubDashApiLib.distInterfacesIssueMod.Issue]]] = js.native
  /**
       * Loads issues matching search query with a score as to how well they matched.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of issues that match the query with a score as to how well they matched
       */
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_updated(query: java.lang.String, sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.updated): stdLib.Promise[js.Array[SearchResult[typedDashGithubDashApiLib.distInterfacesIssueMod.Issue]]] = js.native
  /**
       * Loads issues matching search query with a score as to how well they matched.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of issues that match the query with a score as to how well they matched
       */
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_updated(
    query: java.lang.String,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.updated,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[SearchResult[typedDashGithubDashApiLib.distInterfacesIssueMod.Issue]]] = js.native
  /**
       * Loads issues matching search query with a score as to how well they matched.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of issues that match the query with a score as to how well they matched
       */
  @JSName("searchIssuesWithScoreAsync")
  def searchIssuesWithScoreAsync_updated(
    query: java.lang.String,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.updated,
    ascending: scala.Boolean,
    perPage: scala.Double
  ): stdLib.Promise[js.Array[SearchResult[typedDashGithubDashApiLib.distInterfacesIssueMod.Issue]]] = js.native
  /**
       * Loads repositories matching search query.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of repositories that match the query
       */
  def searchRepositoriesAsync(query: java.lang.String): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories matching search query.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of repositories that match the query
       */
  @JSName("searchRepositoriesAsync")
  def `searchRepositoriesAsync_best match`(
    query: java.lang.String,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.`best match`
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories matching search query.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of repositories that match the query
       */
  @JSName("searchRepositoriesAsync")
  def `searchRepositoriesAsync_best match`(
    query: java.lang.String,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.`best match`,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories matching search query.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of repositories that match the query
       */
  @JSName("searchRepositoriesAsync")
  def `searchRepositoriesAsync_best match`(
    query: java.lang.String,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.`best match`,
    ascending: scala.Boolean,
    perPage: scala.Double
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories matching search query.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of repositories that match the query
       */
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_forks(query: java.lang.String, sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.forks): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories matching search query.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of repositories that match the query
       */
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_forks(
    query: java.lang.String,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.forks,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories matching search query.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of repositories that match the query
       */
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_forks(
    query: java.lang.String,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.forks,
    ascending: scala.Boolean,
    perPage: scala.Double
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories matching search query.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of repositories that match the query
       */
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_stars(query: java.lang.String, sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.stars): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories matching search query.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of repositories that match the query
       */
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_stars(
    query: java.lang.String,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.stars,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories matching search query.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of repositories that match the query
       */
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_stars(
    query: java.lang.String,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.stars,
    ascending: scala.Boolean,
    perPage: scala.Double
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories matching search query.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of repositories that match the query
       */
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_updated(query: java.lang.String, sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.updated): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories matching search query.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of repositories that match the query
       */
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_updated(
    query: java.lang.String,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.updated,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories matching search query.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of repositories that match the query
       */
  @JSName("searchRepositoriesAsync")
  def searchRepositoriesAsync_updated(
    query: java.lang.String,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.updated,
    ascending: scala.Boolean,
    perPage: scala.Double
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories matching search query with a score as to how well they matched.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of repositories that match the query with a score as to how well they matched
       */
  def searchRepositoriesWithScoreAsync(query: java.lang.String): stdLib.Promise[
    js.Array[SearchResult[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]]
  ] = js.native
  /**
       * Loads repositories matching search query with a score as to how well they matched.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of repositories that match the query with a score as to how well they matched
       */
  @JSName("searchRepositoriesWithScoreAsync")
  def `searchRepositoriesWithScoreAsync_best match`(
    query: java.lang.String,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.`best match`
  ): stdLib.Promise[
    js.Array[SearchResult[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]]
  ] = js.native
  /**
       * Loads repositories matching search query with a score as to how well they matched.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of repositories that match the query with a score as to how well they matched
       */
  @JSName("searchRepositoriesWithScoreAsync")
  def `searchRepositoriesWithScoreAsync_best match`(
    query: java.lang.String,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.`best match`,
    ascending: scala.Boolean
  ): stdLib.Promise[
    js.Array[SearchResult[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]]
  ] = js.native
  /**
       * Loads repositories matching search query with a score as to how well they matched.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of repositories that match the query with a score as to how well they matched
       */
  @JSName("searchRepositoriesWithScoreAsync")
  def `searchRepositoriesWithScoreAsync_best match`(
    query: java.lang.String,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.`best match`,
    ascending: scala.Boolean,
    perPage: scala.Double
  ): stdLib.Promise[
    js.Array[SearchResult[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]]
  ] = js.native
  /**
       * Loads repositories matching search query with a score as to how well they matched.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of repositories that match the query with a score as to how well they matched
       */
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_forks(query: java.lang.String, sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.forks): stdLib.Promise[
    js.Array[SearchResult[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]]
  ] = js.native
  /**
       * Loads repositories matching search query with a score as to how well they matched.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of repositories that match the query with a score as to how well they matched
       */
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_forks(
    query: java.lang.String,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.forks,
    ascending: scala.Boolean
  ): stdLib.Promise[
    js.Array[SearchResult[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]]
  ] = js.native
  /**
       * Loads repositories matching search query with a score as to how well they matched.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of repositories that match the query with a score as to how well they matched
       */
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_forks(
    query: java.lang.String,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.forks,
    ascending: scala.Boolean,
    perPage: scala.Double
  ): stdLib.Promise[
    js.Array[SearchResult[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]]
  ] = js.native
  /**
       * Loads repositories matching search query with a score as to how well they matched.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of repositories that match the query with a score as to how well they matched
       */
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_stars(query: java.lang.String, sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.stars): stdLib.Promise[
    js.Array[SearchResult[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]]
  ] = js.native
  /**
       * Loads repositories matching search query with a score as to how well they matched.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of repositories that match the query with a score as to how well they matched
       */
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_stars(
    query: java.lang.String,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.stars,
    ascending: scala.Boolean
  ): stdLib.Promise[
    js.Array[SearchResult[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]]
  ] = js.native
  /**
       * Loads repositories matching search query with a score as to how well they matched.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of repositories that match the query with a score as to how well they matched
       */
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_stars(
    query: java.lang.String,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.stars,
    ascending: scala.Boolean,
    perPage: scala.Double
  ): stdLib.Promise[
    js.Array[SearchResult[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]]
  ] = js.native
  /**
       * Loads repositories matching search query with a score as to how well they matched.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of repositories that match the query with a score as to how well they matched
       */
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_updated(query: java.lang.String, sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.updated): stdLib.Promise[
    js.Array[SearchResult[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]]
  ] = js.native
  /**
       * Loads repositories matching search query with a score as to how well they matched.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of repositories that match the query with a score as to how well they matched
       */
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_updated(
    query: java.lang.String,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.updated,
    ascending: scala.Boolean
  ): stdLib.Promise[
    js.Array[SearchResult[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]]
  ] = js.native
  /**
       * Loads repositories matching search query with a score as to how well they matched.
       * @param query     The query used for the search
       * @param sort      The field to sort by (default best match)
       * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
       * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
       * @returns         An array of repositories that match the query with a score as to how well they matched
       */
  @JSName("searchRepositoriesWithScoreAsync")
  def searchRepositoriesWithScoreAsync_updated(
    query: java.lang.String,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.updated,
    ascending: scala.Boolean,
    perPage: scala.Double
  ): stdLib.Promise[
    js.Array[SearchResult[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]]
  ] = js.native
}

