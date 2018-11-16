package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

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
  sealed trait Error
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitStatusState
  
  /**
       * Status failed.
       */
  @js.native
  sealed trait Failed
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitStatusState
  
  /**
       * Status is not applicable to the target object.
       */
  @js.native
  sealed trait NotApplicable
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitStatusState
  
  /**
       * Status state not set. Default state.
       */
  @js.native
  sealed trait NotSet
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitStatusState
  
  /**
       * Status pending.
       */
  @js.native
  sealed trait Pending
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitStatusState
  
  /**
       * Status succeeded.
       */
  @js.native
  sealed trait Succeeded
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitStatusState
  
  /* 4 */ val Error: Error with scala.Double = js.native
  /* 3 */ val Failed: Failed with scala.Double = js.native
  /* 5 */ val NotApplicable: NotApplicable with scala.Double = js.native
  /* 0 */ val NotSet: NotSet with scala.Double = js.native
  /* 1 */ val Pending: Pending with scala.Double = js.native
  /* 2 */ val Succeeded: Succeeded with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitStatusState with scala.Double
  ] = js.native
}

