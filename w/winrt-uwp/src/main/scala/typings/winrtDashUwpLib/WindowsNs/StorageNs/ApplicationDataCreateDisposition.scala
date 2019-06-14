package typings
package winrtDashUwpLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApplicationDataCreateDisposition extends js.Object

/** Specifies options for creating application data containers or returning existing containers. This enumeration is used by the ApplicationDataContainer.CreateContainer method. */
@JSGlobal("Windows.Storage.ApplicationDataCreateDisposition")
@js.native
object ApplicationDataCreateDisposition extends js.Object {
  /** Always returns the specified container. Creates the container if it does not exist. */
  @js.native
  sealed trait always
    extends winrtDashUwpLib.WindowsNs.StorageNs.ApplicationDataCreateDisposition
  
  /** Returns the specified container only if it already exists. Raises an exception of type System.Exception if the specified container does not exist. */
  @js.native
  sealed trait existing
    extends winrtDashUwpLib.WindowsNs.StorageNs.ApplicationDataCreateDisposition
  
  /* 0 */ val always: always with scala.Double = js.native
  /* 1 */ val existing: existing with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.StorageNs.ApplicationDataCreateDisposition with scala.Double
  ] = js.native
}

