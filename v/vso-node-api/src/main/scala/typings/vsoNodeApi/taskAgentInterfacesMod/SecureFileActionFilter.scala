package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SecureFileActionFilter extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "SecureFileActionFilter")
@js.native
object SecureFileActionFilter extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SecureFileActionFilter with Double] = js.native
  
  @js.native
  sealed trait Manage extends SecureFileActionFilter
  /* 2 */ val Manage: typings.vsoNodeApi.taskAgentInterfacesMod.SecureFileActionFilter.Manage with Double = js.native
  
  @js.native
  sealed trait None extends SecureFileActionFilter
  /* 0 */ val None: typings.vsoNodeApi.taskAgentInterfacesMod.SecureFileActionFilter.None with Double = js.native
  
  @js.native
  sealed trait Use extends SecureFileActionFilter
  /* 16 */ val Use: typings.vsoNodeApi.taskAgentInterfacesMod.SecureFileActionFilter.Use with Double = js.native
}
