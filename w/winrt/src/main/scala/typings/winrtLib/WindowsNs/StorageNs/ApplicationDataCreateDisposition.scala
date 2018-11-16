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
  
  val always: always with java.lang.String = js.native
  val existing: existing with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.StorageNs.ApplicationDataCreateDisposition with java.lang.String
  ] = js.native
}

