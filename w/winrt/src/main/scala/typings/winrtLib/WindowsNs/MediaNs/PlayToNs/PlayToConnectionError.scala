package typings
package winrtLib.WindowsNs.MediaNs.PlayToNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlayToConnectionError extends js.Object

@JSGlobal("Windows.Media.PlayTo.PlayToConnectionError")
@js.native
object PlayToConnectionError extends js.Object {
  @js.native
  sealed trait deviceError
    extends winrtLib.WindowsNs.MediaNs.PlayToNs.PlayToConnectionError
  
  @js.native
  sealed trait deviceLocked
    extends winrtLib.WindowsNs.MediaNs.PlayToNs.PlayToConnectionError
  
  @js.native
  sealed trait deviceNotResponding
    extends winrtLib.WindowsNs.MediaNs.PlayToNs.PlayToConnectionError
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.MediaNs.PlayToNs.PlayToConnectionError
  
  val deviceError: deviceError with java.lang.String = js.native
  val deviceLocked: deviceLocked with java.lang.String = js.native
  val deviceNotResponding: deviceNotResponding with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.MediaNs.PlayToNs.PlayToConnectionError with java.lang.String] = js.native
}

