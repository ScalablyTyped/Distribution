package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

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
  
  /* 2 */ val FirstParent: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitVersionOptions.FirstParent with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitVersionOptions.None with Double = js.native
  /* 1 */ val PreviousChange: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitVersionOptions.PreviousChange with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitVersionOptions with Double] = js.native
}

