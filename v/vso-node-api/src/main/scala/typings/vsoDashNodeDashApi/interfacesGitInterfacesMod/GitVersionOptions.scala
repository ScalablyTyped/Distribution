package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitVersionOptions extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitVersionOptions")
@js.native
object GitVersionOptions extends js.Object {
  /**
    * First parent of commit (HEAD^)
    */
  @js.native
  sealed trait FirstParent extends GitVersionOptions
  
  /**
    * Not specified
    */
  @js.native
  sealed trait None extends GitVersionOptions
  
  /**
    * Commit that changed item prior to the current version
    */
  @js.native
  sealed trait PreviousChange extends GitVersionOptions
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitVersionOptions with Double] = js.native
  /* 2 */ @js.native
  object FirstParent extends TopLevel[FirstParent with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object PreviousChange extends TopLevel[PreviousChange with Double]
  
}

