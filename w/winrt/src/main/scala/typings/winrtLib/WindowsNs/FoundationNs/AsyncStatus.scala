package typings
package winrtLib.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AsyncStatus extends js.Object

@JSGlobal("Windows.Foundation.AsyncStatus")
@js.native
object AsyncStatus extends js.Object {
  @js.native
  sealed trait canceled
    extends winrtLib.WindowsNs.FoundationNs.AsyncStatus
  
  @js.native
  sealed trait completed
    extends winrtLib.WindowsNs.FoundationNs.AsyncStatus
  
  @js.native
  sealed trait error
    extends winrtLib.WindowsNs.FoundationNs.AsyncStatus
  
  @js.native
  sealed trait started
    extends winrtLib.WindowsNs.FoundationNs.AsyncStatus
  
  val canceled: canceled with java.lang.String = js.native
  val completed: completed with java.lang.String = js.native
  val error: error with java.lang.String = js.native
  val started: started with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.FoundationNs.AsyncStatus with java.lang.String] = js.native
}

