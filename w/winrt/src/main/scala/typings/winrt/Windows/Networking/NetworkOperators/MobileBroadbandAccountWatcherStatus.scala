package typings.winrt.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MobileBroadbandAccountWatcherStatus extends js.Object
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcherStatus")
@js.native
object MobileBroadbandAccountWatcherStatus extends js.Object {
  
  @js.native
  sealed trait aborted extends MobileBroadbandAccountWatcherStatus
  
  @js.native
  sealed trait created extends MobileBroadbandAccountWatcherStatus
  
  @js.native
  sealed trait enumerationCompleted extends MobileBroadbandAccountWatcherStatus
  
  @js.native
  sealed trait started extends MobileBroadbandAccountWatcherStatus
  
  @js.native
  sealed trait stopped extends MobileBroadbandAccountWatcherStatus
}
