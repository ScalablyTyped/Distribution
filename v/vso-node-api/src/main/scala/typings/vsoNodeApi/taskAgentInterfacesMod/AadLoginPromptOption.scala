package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AadLoginPromptOption extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "AadLoginPromptOption")
@js.native
object AadLoginPromptOption extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AadLoginPromptOption with Double] = js.native
  
  /**
    * Force the user to login again.  Ignore current authentication state and force the user to authenticate again. This option should be used instead of Login.
    */
  @js.native
  sealed trait FreshLogin extends AadLoginPromptOption
  /* 3 */ val FreshLogin: typings.vsoNodeApi.taskAgentInterfacesMod.AadLoginPromptOption.FreshLogin with Double = js.native
  
  /**
    * Force the user to login again.
    */
  @js.native
  sealed trait Login extends AadLoginPromptOption
  /* 1 */ val Login: typings.vsoNodeApi.taskAgentInterfacesMod.AadLoginPromptOption.Login with Double = js.native
  
  /**
    * Do not provide a prompt option
    */
  @js.native
  sealed trait NoOption extends AadLoginPromptOption
  /* 0 */ val NoOption: typings.vsoNodeApi.taskAgentInterfacesMod.AadLoginPromptOption.NoOption with Double = js.native
  
  /**
    * Force the user to select which account they are logging in with instead of automatically picking the user up from the session state. NOTE: This does not work for switching bewtween the variants of a dual-homed user.
    */
  @js.native
  sealed trait SelectAccount extends AadLoginPromptOption
  /* 2 */ val SelectAccount: typings.vsoNodeApi.taskAgentInterfacesMod.AadLoginPromptOption.SelectAccount with Double = js.native
}
