package typings
package typedDashGithubDashApiLib.distOwnerDashRefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/owner-ref", "OwnerRefClass")
@js.native
class OwnerRefClass protected ()
  extends typedDashGithubDashApiLib.distGithubDashRefMod.GitHubRef
     with typedDashGithubDashApiLib.distInterfacesOwnerDashRefMod.OwnerRef {
  def this(login: java.lang.String, options: typedDashGithubDashApiLib.distGithubDashRefMod.OptionsOrRef) = this()
  def loadRepositoriesAsync(
    _type: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.all | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.member
  ): js.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  def loadRepositoriesAsync(
    _type: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.all | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.member,
    _sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.created | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.updated | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.pushed | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.full_name
  ): js.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
  def loadRepositoriesAsync(
    _type: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.all | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.owner | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.member,
    _sort: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.created | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.updated | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.pushed | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.full_name,
    _ascending: scala.Boolean
  ): js.Promise[js.Array[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]] = js.native
}

