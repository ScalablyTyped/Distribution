package typings.typedGithubApi

import typings.typedGithubApi.distOwnerRefMod.OwnerRefClass
import typings.typedGithubApi.githubRefMod.GitHubRef
import typings.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repositoryRefMod {
  
  @JSImport("typed-github-api/dist/repository-ref", "RepositoryRefClass")
  @js.native
  class RepositoryRefClass protected ()
    extends GitHubRef
       with RepositoryRef {
    def this(owner: OwnerRefClass, name: String) = this()
  }
}
