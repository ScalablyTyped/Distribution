package typings.winrt.WindowsNs.MediaNs.PlayToNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlayToConnectionError extends js.Object

@JSGlobal("Windows.Media.PlayTo.PlayToConnectionError")
@js.native
object PlayToConnectionError extends js.Object {
  @js.native
  sealed trait deviceError extends PlayToConnectionError
  
  @js.native
  sealed trait deviceLocked extends PlayToConnectionError
  
  @js.native
  sealed trait deviceNotResponding extends PlayToConnectionError
  
  @js.native
  sealed trait none extends PlayToConnectionError
  
  /* 2 */ val deviceError: typings.winrt.WindowsNs.MediaNs.PlayToNs.PlayToConnectionError.deviceError with Double = js.native
  /* 3 */ val deviceLocked: typings.winrt.WindowsNs.MediaNs.PlayToNs.PlayToConnectionError.deviceLocked with Double = js.native
  /* 1 */ val deviceNotResponding: typings.winrt.WindowsNs.MediaNs.PlayToNs.PlayToConnectionError.deviceNotResponding with Double = js.native
  /* 0 */ val none: typings.winrt.WindowsNs.MediaNs.PlayToNs.PlayToConnectionError.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PlayToConnectionError with Double] = js.native
}

