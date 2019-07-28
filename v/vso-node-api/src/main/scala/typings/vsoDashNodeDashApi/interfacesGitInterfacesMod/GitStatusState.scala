package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitStatusState extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitStatusState")
@js.native
object GitStatusState extends js.Object {
  /**
    * Status with an error.
    */
  @js.native
  sealed trait Error extends GitStatusState
  
  /**
    * Status failed.
    */
  @js.native
  sealed trait Failed extends GitStatusState
  
  /**
    * Status is not applicable to the target object.
    */
  @js.native
  sealed trait NotApplicable extends GitStatusState
  
  /**
    * Status state not set. Default state.
    */
  @js.native
  sealed trait NotSet extends GitStatusState
  
  /**
    * Status pending.
    */
  @js.native
  sealed trait Pending extends GitStatusState
  
  /**
    * Status succeeded.
    */
  @js.native
  sealed trait Succeeded extends GitStatusState
  
  /* 4 */ val Error: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitStatusState.Error with Double = js.native
  /* 3 */ val Failed: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitStatusState.Failed with Double = js.native
  /* 5 */ val NotApplicable: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitStatusState.NotApplicable with Double = js.native
  /* 0 */ val NotSet: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitStatusState.NotSet with Double = js.native
  /* 1 */ val Pending: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitStatusState.Pending with Double = js.native
  /* 2 */ val Succeeded: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitStatusState.Succeeded with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitStatusState with Double] = js.native
}

