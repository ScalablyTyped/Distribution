package typings.typedDashGithubDashApi.distOwnerDashRefMod

import typings.typedDashGithubDashApi.distGithubDashRefMod.GitHubRef
import typings.typedDashGithubDashApi.distGithubDashRefMod.OptionsOrRef
import typings.typedDashGithubDashApi.distInterfacesOwnerDashRefMod.OwnerRef
import typings.typedDashGithubDashApi.distInterfacesRepositoryMod.Repository
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.all
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.created
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.full_name
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.member
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.owner
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.pushed
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/owner-ref", "OwnerRefClass")
@js.native
class OwnerRefClass protected ()
  extends GitHubRef
     with OwnerRef {
  def this(login: String, options: OptionsOrRef) = this()
  def loadRepositoriesAsync(_type: all | owner | member): js.Promise[js.Array[Repository]] = js.native
  def loadRepositoriesAsync(_type: all | owner | member, _sort: created | updated | pushed | full_name): js.Promise[js.Array[Repository]] = js.native
  def loadRepositoriesAsync(_type: all | owner | member, _sort: created | updated | pushed | full_name, _ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
}

