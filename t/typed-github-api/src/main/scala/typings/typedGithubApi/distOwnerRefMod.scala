package typings.typedGithubApi

import typings.typedGithubApi.githubRefMod.GitHubRef
import typings.typedGithubApi.githubRefMod.OptionsOrRef
import typings.typedGithubApi.ownerRefMod.OwnerRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/owner-ref", JSImport.Namespace)
@js.native
object distOwnerRefMod extends js.Object {
  @js.native
  class OwnerRefClass protected ()
    extends GitHubRef
       with OwnerRef {
    def this(login: String, options: OptionsOrRef) = this()
  }
  
}

