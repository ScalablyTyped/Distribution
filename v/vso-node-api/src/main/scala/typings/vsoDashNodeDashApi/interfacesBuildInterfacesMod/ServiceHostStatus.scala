package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.ServiceHostStatus.Offline
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.ServiceHostStatus.Online
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ServiceHostStatus extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "ServiceHostStatus")
@js.native
object ServiceHostStatus extends js.Object {
  /**
    * The service host is currently disconnected and not accepting commands.
    */
  @js.native
  sealed trait Offline extends ServiceHostStatus
  
  /**
    * The service host is currently connected and accepting commands.
    */
  @js.native
  sealed trait Online extends ServiceHostStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ServiceHostStatus with Double] = js.native
  /* 2 */ @js.native
  object Offline extends TopLevel[Offline with Double]
  
  /* 1 */ @js.native
  object Online extends TopLevel[Online with Double]
  
}

