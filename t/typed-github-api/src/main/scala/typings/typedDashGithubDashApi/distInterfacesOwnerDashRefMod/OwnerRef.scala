package typings.typedDashGithubDashApi.distInterfacesOwnerDashRefMod

import typings.typedDashGithubDashApi.distInterfacesOrganizationMod.Organization
import typings.typedDashGithubDashApi.distInterfacesRepositoryMod.Repository
import typings.typedDashGithubDashApi.distInterfacesRepositoryMod.RepositoryRef
import typings.typedDashGithubDashApi.distInterfacesUserMod.User
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.`private`
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.all
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.created
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.forks
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.full_name
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.member
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.owner
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.public
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.pushed
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.sources
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OwnerRef extends js.Object {
  var login: String = js.native
  def getRepository(name: String): RepositoryRef = js.native
  def loadOrganizationAsync(): js.Promise[Organization | Null] = js.native
  /**
    * Loads repositories owned by this organisation.
    * @param type      The type of repository to return (default all)
    * @param sort      The field to sort by (default full_name)
    * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
    * @returns         The resulting array of repositories
    */
  def loadOrganizationRepositoriesAsync(): js.Promise[js.Array[Repository]] = js.native
  def loadOrganizationRepositoriesAsync(`type`: all | public | `private` | forks | sources | member): js.Promise[js.Array[Repository]] = js.native
  def loadOrganizationRepositoriesAsync(
    `type`: all | public | `private` | forks | sources | member,
    sort: created | updated | pushed | full_name
  ): js.Promise[js.Array[Repository]] = js.native
  def loadOrganizationRepositoriesAsync(
    `type`: all | public | `private` | forks | sources | member,
    sort: created | updated | pushed | full_name,
    ascending: Boolean
  ): js.Promise[js.Array[Repository]] = js.native
  /**
    * Loads repositories accessible to this user.
    * @param type      The type of search (default owner)
    * @param sort      The field to sort by (default full_name)
    * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
    * @returns         The resulting array of repositories
    */
  def loadRepositoriesAsync(): js.Promise[js.Array[Repository]] = js.native
  def loadRepositoriesAsync(`type`: all, sort: created): js.Promise[js.Array[Repository]] = js.native
  def loadRepositoriesAsync(`type`: all, sort: created, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
  def loadRepositoriesAsync(`type`: all, sort: full_name): js.Promise[js.Array[Repository]] = js.native
  def loadRepositoriesAsync(`type`: all, sort: full_name, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
  def loadRepositoriesAsync(`type`: all, sort: pushed): js.Promise[js.Array[Repository]] = js.native
  def loadRepositoriesAsync(`type`: all, sort: pushed, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
  def loadRepositoriesAsync(`type`: all, sort: updated): js.Promise[js.Array[Repository]] = js.native
  def loadRepositoriesAsync(`type`: all, sort: updated, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
  def loadRepositoriesAsync(`type`: member, sort: created): js.Promise[js.Array[Repository]] = js.native
  def loadRepositoriesAsync(`type`: member, sort: created, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
  def loadRepositoriesAsync(`type`: member, sort: full_name): js.Promise[js.Array[Repository]] = js.native
  def loadRepositoriesAsync(`type`: member, sort: full_name, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
  def loadRepositoriesAsync(`type`: member, sort: pushed): js.Promise[js.Array[Repository]] = js.native
  def loadRepositoriesAsync(`type`: member, sort: pushed, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
  def loadRepositoriesAsync(`type`: member, sort: updated): js.Promise[js.Array[Repository]] = js.native
  def loadRepositoriesAsync(`type`: member, sort: updated, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
  def loadRepositoriesAsync(`type`: owner, sort: created): js.Promise[js.Array[Repository]] = js.native
  def loadRepositoriesAsync(`type`: owner, sort: created, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
  def loadRepositoriesAsync(`type`: owner, sort: full_name): js.Promise[js.Array[Repository]] = js.native
  def loadRepositoriesAsync(`type`: owner, sort: full_name, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
  def loadRepositoriesAsync(`type`: owner, sort: pushed): js.Promise[js.Array[Repository]] = js.native
  def loadRepositoriesAsync(`type`: owner, sort: pushed, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
  def loadRepositoriesAsync(`type`: owner, sort: updated): js.Promise[js.Array[Repository]] = js.native
  def loadRepositoriesAsync(`type`: owner, sort: updated, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
  @JSName("loadRepositoriesAsync")
  def loadRepositoriesAsync_all(`type`: all): js.Promise[js.Array[Repository]] = js.native
  @JSName("loadRepositoriesAsync")
  def loadRepositoriesAsync_member(`type`: member): js.Promise[js.Array[Repository]] = js.native
  @JSName("loadRepositoriesAsync")
  def loadRepositoriesAsync_owner(`type`: owner): js.Promise[js.Array[Repository]] = js.native
  def loadUserAsync(): js.Promise[User | Null] = js.native
}

