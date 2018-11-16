package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AadLoginPromptOption extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "AadLoginPromptOption")
@js.native
object AadLoginPromptOption extends js.Object {
  /**
       * Force the user to login again.  Ignore current authentication state and force the user to authenticate again. This option should be used instead of Login.
       */
  @js.native
  sealed trait FreshLogin
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.AadLoginPromptOption
  
  /**
       * Force the user to login again.
       */
  @js.native
  sealed trait Login
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.AadLoginPromptOption
  
  /**
       * Do not provide a prompt option
       */
  @js.native
  sealed trait NoOption
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.AadLoginPromptOption
  
  /**
       * Force the user to select which account they are logging in with instead of automatically picking the user up from the session state. NOTE: This does not work for switching bewtween the variants of a dual-homed user.
       */
  @js.native
  sealed trait SelectAccount
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.AadLoginPromptOption
  
  /* 3 */ val FreshLogin: FreshLogin with scala.Double = js.native
  /* 1 */ val Login: Login with scala.Double = js.native
  /* 0 */ val NoOption: NoOption with scala.Double = js.native
  /* 2 */ val SelectAccount: SelectAccount with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.AadLoginPromptOption with scala.Double
  ] = js.native
}

