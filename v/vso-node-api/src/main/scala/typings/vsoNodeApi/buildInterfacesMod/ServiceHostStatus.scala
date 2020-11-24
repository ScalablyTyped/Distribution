package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ServiceHostStatus extends js.Object
@JSImport("vso-node-api/interfaces/BuildInterfaces", "ServiceHostStatus")
@js.native
object ServiceHostStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ServiceHostStatus with Double] = js.native
  
  /**
    * The service host is currently disconnected and not accepting commands.
    */
  @js.native
  sealed trait Offline extends ServiceHostStatus
  /* 2 */ @js.native
  object Offline extends TopLevel[Offline with Double]
  
  /**
    * The service host is currently connected and accepting commands.
    */
  @js.native
  sealed trait Online extends ServiceHostStatus
  /* 1 */ @js.native
  object Online extends TopLevel[Online with Double]
}
