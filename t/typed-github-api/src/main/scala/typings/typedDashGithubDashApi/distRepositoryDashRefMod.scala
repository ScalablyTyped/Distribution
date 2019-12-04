package typings.typedDashGithubDashApi

import typings.typedDashGithubDashApi.distGithubDashRefMod.GitHubRef
import typings.typedDashGithubDashApi.distInterfacesRepositoryMod.RepositoryRef
import typings.typedDashGithubDashApi.distOwnerDashRefMod.OwnerRefClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/repository-ref", JSImport.Namespace)
@js.native
object distRepositoryDashRefMod extends js.Object {
  @js.native
  class RepositoryRefClass protected ()
    extends GitHubRef
       with RepositoryRef {
    def this(owner: OwnerRefClass, name: String) = this()
  }
  
}

