package typings.winrt.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MobileBroadbandAccountWatcherStatus with Double] = js.native
  /* 4 */ @js.native
  object aborted extends TopLevel[aborted with Double]
  
  /* 0 */ @js.native
  object created extends TopLevel[created with Double]
  
  /* 2 */ @js.native
  object enumerationCompleted extends TopLevel[enumerationCompleted with Double]
  
  /* 1 */ @js.native
  object started extends TopLevel[started with Double]
  
  /* 3 */ @js.native
  object stopped extends TopLevel[stopped with Double]
  
}

