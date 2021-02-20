package typings.typedGithubApi

import typings.typedGithubApi.githubRefMod.GitHubRef
import typings.typedGithubApi.githubRefMod.OptionsOrRef
import typings.typedGithubApi.ownerRefMod.OwnerRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOwnerRefMod {
  
  @JSImport("typed-github-api/dist/owner-ref", "OwnerRefClass")
  @js.native
  class OwnerRefClass protected ()
    extends GitHubRef
       with OwnerRef {
    def this(login: String, options: OptionsOrRef) = this()
  }
}
