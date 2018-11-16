package typings
package typedDashGithubDashApiLib.distInterfacesOwnerDashRefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OwnerRef extends js.Object {
  var login: java.lang.String = js.native
  def getRepository(name: java.lang.String): typedDashGithubDashApiLib.distInterfacesRepositoryMod.RepositoryRef = js.native
  def loadOrganizationAsync(): stdLib.Promise[
    typedDashGithubDashApiLib.distInterfacesOrganizationMod.Organization | scala.Null
  ] = js.native
  /**
       * Loads repositories owned by this organisation.
       * @param type      The type of repository to return (default all)
       * @param sort      The field to sort by (default full_name)
       * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
       * @returns         The resulting array of repositories
       */
  def loadOrganizationRepositoriesAsync(): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories owned by this organisation.
       * @param type      The type of repository to return (default all)
       * @param sort      The field to sort by (default full_name)
       * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
       * @returns         The resulting array of repositories
       */
  def loadOrganizationRepositoriesAsync(
    `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.all | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.public | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.`private` | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.forks | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.sources | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.member
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories owned by this organisation.
       * @param type      The type of repository to return (default all)
       * @param sort      The field to sort by (default full_name)
       * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
       * @returns         The resulting array of repositories
       */
  def loadOrganizationRepositoriesAsync(
    `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.all | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.public | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.`private` | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.forks | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.sources | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.member,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.created | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.updated | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.pushed | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.full_name
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories owned by this organisation.
       * @param type      The type of repository to return (default all)
       * @param sort      The field to sort by (default full_name)
       * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
       * @returns         The resulting array of repositories
       */
  def loadOrganizationRepositoriesAsync(
    `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.all | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.public | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.`private` | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.forks | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.sources | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.member,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.created | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.updated | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.pushed | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.full_name,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories accessible to this user.
       * @param type      The type of search (default owner)
       * @param sort      The field to sort by (default full_name)
       * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
       * @returns         The resulting array of repositories
       */
  def loadRepositoriesAsync(): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories accessible to this user.
       * @param type      The type of search (default owner)
       * @param sort      The field to sort by (default full_name)
       * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
       * @returns         The resulting array of repositories
       */
  def loadRepositoriesAsync(
    `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.all,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.created
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories accessible to this user.
       * @param type      The type of search (default owner)
       * @param sort      The field to sort by (default full_name)
       * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
       * @returns         The resulting array of repositories
       */
  def loadRepositoriesAsync(
    `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.all,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.created,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories accessible to this user.
       * @param type      The type of search (default owner)
       * @param sort      The field to sort by (default full_name)
       * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
       * @returns         The resulting array of repositories
       */
  def loadRepositoriesAsync(
    `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.all,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.full_name
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories accessible to this user.
       * @param type      The type of search (default owner)
       * @param sort      The field to sort by (default full_name)
       * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
       * @returns         The resulting array of repositories
       */
  def loadRepositoriesAsync(
    `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.all,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.full_name,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories accessible to this user.
       * @param type      The type of search (default owner)
       * @param sort      The field to sort by (default full_name)
       * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
       * @returns         The resulting array of repositories
       */
  def loadRepositoriesAsync(
    `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.all,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.pushed
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories accessible to this user.
       * @param type      The type of search (default owner)
       * @param sort      The field to sort by (default full_name)
       * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
       * @returns         The resulting array of repositories
       */
  def loadRepositoriesAsync(
    `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.all,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.pushed,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories accessible to this user.
       * @param type      The type of search (default owner)
       * @param sort      The field to sort by (default full_name)
       * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
       * @returns         The resulting array of repositories
       */
  def loadRepositoriesAsync(
    `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.all,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.updated
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories accessible to this user.
       * @param type      The type of search (default owner)
       * @param sort      The field to sort by (default full_name)
       * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
       * @returns         The resulting array of repositories
       */
  def loadRepositoriesAsync(
    `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.all,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.updated,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories accessible to this user.
       * @param type      The type of search (default owner)
       * @param sort      The field to sort by (default full_name)
       * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
       * @returns         The resulting array of repositories
       */
  def loadRepositoriesAsync(
    `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.member,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.created
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories accessible to this user.
       * @param type      The type of search (default owner)
       * @param sort      The field to sort by (default full_name)
       * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
       * @returns         The resulting array of repositories
       */
  def loadRepositoriesAsync(
    `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.member,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.created,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories accessible to this user.
       * @param type      The type of search (default owner)
       * @param sort      The field to sort by (default full_name)
       * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
       * @returns         The resulting array of repositories
       */
  def loadRepositoriesAsync(
    `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.member,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.full_name
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories accessible to this user.
       * @param type      The type of search (default owner)
       * @param sort      The field to sort by (default full_name)
       * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
       * @returns         The resulting array of repositories
       */
  def loadRepositoriesAsync(
    `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.member,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.full_name,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories accessible to this user.
       * @param type      The type of search (default owner)
       * @param sort      The field to sort by (default full_name)
       * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
       * @returns         The resulting array of repositories
       */
  def loadRepositoriesAsync(
    `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.member,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.pushed
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories accessible to this user.
       * @param type      The type of search (default owner)
       * @param sort      The field to sort by (default full_name)
       * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
       * @returns         The resulting array of repositories
       */
  def loadRepositoriesAsync(
    `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.member,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.pushed,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories accessible to this user.
       * @param type      The type of search (default owner)
       * @param sort      The field to sort by (default full_name)
       * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
       * @returns         The resulting array of repositories
       */
  def loadRepositoriesAsync(
    `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.member,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.updated
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories accessible to this user.
       * @param type      The type of search (default owner)
       * @param sort      The field to sort by (default full_name)
       * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
       * @returns         The resulting array of repositories
       */
  def loadRepositoriesAsync(
    `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.member,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.updated,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories accessible to this user.
       * @param type      The type of search (default owner)
       * @param sort      The field to sort by (default full_name)
       * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
       * @returns         The resulting array of repositories
       */
  def loadRepositoriesAsync(
    `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.created
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories accessible to this user.
       * @param type      The type of search (default owner)
       * @param sort      The field to sort by (default full_name)
       * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
       * @returns         The resulting array of repositories
       */
  def loadRepositoriesAsync(
    `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.created,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories accessible to this user.
       * @param type      The type of search (default owner)
       * @param sort      The field to sort by (default full_name)
       * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
       * @returns         The resulting array of repositories
       */
  def loadRepositoriesAsync(
    `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.full_name
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories accessible to this user.
       * @param type      The type of search (default owner)
       * @param sort      The field to sort by (default full_name)
       * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
       * @returns         The resulting array of repositories
       */
  def loadRepositoriesAsync(
    `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.full_name,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories accessible to this user.
       * @param type      The type of search (default owner)
       * @param sort      The field to sort by (default full_name)
       * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
       * @returns         The resulting array of repositories
       */
  def loadRepositoriesAsync(
    `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.pushed
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories accessible to this user.
       * @param type      The type of search (default owner)
       * @param sort      The field to sort by (default full_name)
       * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
       * @returns         The resulting array of repositories
       */
  def loadRepositoriesAsync(
    `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.pushed,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories accessible to this user.
       * @param type      The type of search (default owner)
       * @param sort      The field to sort by (default full_name)
       * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
       * @returns         The resulting array of repositories
       */
  def loadRepositoriesAsync(
    `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.updated
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories accessible to this user.
       * @param type      The type of search (default owner)
       * @param sort      The field to sort by (default full_name)
       * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
       * @returns         The resulting array of repositories
       */
  def loadRepositoriesAsync(
    `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner,
    sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.updated,
    ascending: scala.Boolean
  ): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories accessible to this user.
       * @param type      The type of search (default owner)
       * @param sort      The field to sort by (default full_name)
       * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
       * @returns         The resulting array of repositories
       */
  @JSName("loadRepositoriesAsync")
  def loadRepositoriesAsync_all(`type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.all): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories accessible to this user.
       * @param type      The type of search (default owner)
       * @param sort      The field to sort by (default full_name)
       * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
       * @returns         The resulting array of repositories
       */
  @JSName("loadRepositoriesAsync")
  def loadRepositoriesAsync_member(`type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.member): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  /**
       * Loads repositories accessible to this user.
       * @param type      The type of search (default owner)
       * @param sort      The field to sort by (default full_name)
       * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
       * @returns         The resulting array of repositories
       */
  @JSName("loadRepositoriesAsync")
  def loadRepositoriesAsync_owner(`type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner): stdLib.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  def loadUserAsync(): stdLib.Promise[typedDashGithubDashApiLib.distInterfacesUserMod.User | scala.Null] = js.native
}

