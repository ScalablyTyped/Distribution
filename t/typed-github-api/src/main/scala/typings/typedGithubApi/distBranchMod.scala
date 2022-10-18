package typings.typedGithubApi

import typings.typedGithubApi.distBranchRefMod.BranchRefClass
import typings.typedGithubApi.distInterfacesBranchMod.Branch
import typings.typedGithubApi.distInterfacesCommitMod.CommitSummary
import typings.typedGithubApi.distInterfacesRepositoryMod.RepositoryRef
import typings.typedGithubApi.distRepositoryRefMod.RepositoryRefClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBranchMod {
  
  @JSImport("typed-github-api/dist/branch", "BranchClass")
  @js.native
  open class BranchClass protected ()
    extends BranchRefClass
       with Branch {
    def this(repository: RepositoryRefClass, data: typings.typedGithubApi.distApiInterfacesBranchMod.Branch) = this()
    
    /* CompleteClass */
    var commit: CommitSummary = js.native
    
    /* CompleteClass */
    override def loadAsync(): js.Promise[Branch | Null] = js.native
    
    /* CompleteClass */
    override val name: String = js.native
    
    /* CompleteClass */
    override val repository: RepositoryRef = js.native
  }
}
