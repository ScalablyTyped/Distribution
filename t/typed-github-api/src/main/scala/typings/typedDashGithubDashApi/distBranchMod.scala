package typings.typedDashGithubDashApi

import typings.typedDashGithubDashApi.distBranchDashRefMod.BranchRefClass
import typings.typedDashGithubDashApi.distInterfacesBranchMod.Branch
import typings.typedDashGithubDashApi.distInterfacesCommitMod.CommitSummary
import typings.typedDashGithubDashApi.distInterfacesRepositoryMod.RepositoryRef
import typings.typedDashGithubDashApi.distRepositoryDashRefMod.RepositoryRefClass
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
    def this(
      repository: RepositoryRefClass,
      data: typings.typedDashGithubDashApi.distApiDashInterfacesBranchMod.Branch
    ) = this()
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

