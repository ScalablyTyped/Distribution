package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApplicationDataCreateDisposition extends js.Object

@JSGlobal("Windows.Storage.ApplicationDataCreateDisposition")
@js.native
object ApplicationDataCreateDisposition extends js.Object {
  @js.native
  sealed trait always
    extends winrtLib.WindowsNs.StorageNs.ApplicationDataCreateDisposition
  
  @js.native
  sealed trait existing
    extends winrtLib.WindowsNs.StorageNs.ApplicationDataCreateDisposition
  
  /* 0 */ val always: always with scala.Double = js.native
  /* 1 */ val existing: existing with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.StorageNs.ApplicationDataCreateDisposition with scala.Double] = js.native
}

