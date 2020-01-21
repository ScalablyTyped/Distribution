package typings.typedGithubApi

import typings.typedGithubApi.branchRefMod.BranchRefClass
import typings.typedGithubApi.interfacesBranchMod.Branch
import typings.typedGithubApi.interfacesCommitMod.CommitSummary
import typings.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import typings.typedGithubApi.repositoryRefMod.RepositoryRefClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/branch", JSImport.Namespace)
@js.native
object distBranchMod extends js.Object {
  @js.native
  class BranchClass protected ()
    extends BranchRefClass
       with Branch {
    def this(repository: RepositoryRefClass, data: typings.typedGithubApi.branchMod.Branch) = this()
    /* CompleteClass */
    override var commit: CommitSummary = js.native
    /* CompleteClass */
    override val name: String = js.native
    /* CompleteClass */
    override val repository: RepositoryRef = js.native
    /* CompleteClass */
    override def loadAsync(): js.Promise[Branch | Null] = js.native
  }
  
}

