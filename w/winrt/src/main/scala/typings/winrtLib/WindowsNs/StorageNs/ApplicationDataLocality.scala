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
  
  val local: local with java.lang.String = js.native
  val roaming: roaming with java.lang.String = js.native
  val temporary: temporary with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.StorageNs.ApplicationDataLocality with java.lang.String] = js.native
}

