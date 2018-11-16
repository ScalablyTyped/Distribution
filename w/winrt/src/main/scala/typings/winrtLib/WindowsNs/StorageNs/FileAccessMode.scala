package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileAccessMode extends js.Object

@JSGlobal("Windows.Storage.FileAccessMode")
@js.native
object FileAccessMode extends js.Object {
  @js.native
  sealed trait read
    extends winrtLib.WindowsNs.StorageNs.FileAccessMode
  
  @js.native
  sealed trait readWrite
    extends winrtLib.WindowsNs.StorageNs.FileAccessMode
  
  val read: read with java.lang.String = js.native
  val readWrite: readWrite with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.StorageNs.FileAccessMode with java.lang.String] = js.native
}

