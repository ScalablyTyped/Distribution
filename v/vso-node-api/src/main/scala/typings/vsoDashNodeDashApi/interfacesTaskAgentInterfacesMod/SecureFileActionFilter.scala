package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SecureFileActionFilter extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "SecureFileActionFilter")
@js.native
object SecureFileActionFilter extends js.Object {
  @js.native
  sealed trait Manage extends SecureFileActionFilter
  
  @js.native
  sealed trait None extends SecureFileActionFilter
  
  @js.native
  sealed trait Use extends SecureFileActionFilter
  
  /* 2 */ val Manage: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.SecureFileActionFilter.Manage with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.SecureFileActionFilter.None with Double = js.native
  /* 16 */ val Use: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.SecureFileActionFilter.Use with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SecureFileActionFilter with Double] = js.native
}

