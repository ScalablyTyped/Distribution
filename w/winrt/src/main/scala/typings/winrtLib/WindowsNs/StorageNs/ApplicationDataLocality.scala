package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApplicationDataLocality extends js.Object

@JSGlobal("Windows.Storage.ApplicationDataLocality")
@js.native
object ApplicationDataLocality extends js.Object {
  @js.native
  sealed trait local
    extends winrtLib.WindowsNs.StorageNs.ApplicationDataLocality
  
  @js.native
  sealed trait roaming
    extends winrtLib.WindowsNs.StorageNs.ApplicationDataLocality
  
  @js.native
  sealed trait temporary
    extends winrtLib.WindowsNs.StorageNs.ApplicationDataLocality
  
  /* 0 */ val local: local with scala.Double = js.native
  /* 1 */ val roaming: roaming with scala.Double = js.native
  /* 2 */ val temporary: temporary with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.StorageNs.ApplicationDataLocality with scala.Double] = js.native
}

