package typings.typedGithubApi

import typings.typedGithubApi.distGithubRefMod.GitHubRef
import typings.typedGithubApi.distInterfacesIssueMod.Issue
import typings.typedGithubApi.distInterfacesIssueMod.IssueRef
import typings.typedGithubApi.distInterfacesRepositoryMod.Repository
import typings.typedGithubApi.distInterfacesRepositoryMod.RepositoryRef
import typings.typedGithubApi.distRepositoryRefMod.RepositoryRefClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIssueRefMod {
  
  @JSImport("typed-github-api/dist/issue-ref", "IssueRefClass")
  @js.native
  open class IssueRefClass protected ()
    extends GitHubRef
       with IssueRef {
    def this(repository: RepositoryRefClass, issueNumber: Double) = this()
    
    /* CompleteClass */
    override def loadAsync(): js.Promise[Issue | Null] = js.native
    
    /* CompleteClass */
    override def loadRepositoryAsync(): js.Promise[Repository] = js.native
    
    /* CompleteClass */
    override val number: Double = js.native
    
    val repository: RepositoryRef = js.native
  }
}
