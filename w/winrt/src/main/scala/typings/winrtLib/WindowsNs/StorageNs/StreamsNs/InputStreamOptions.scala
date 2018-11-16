package typings
package winrtLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InputStreamOptions extends js.Object

@JSGlobal("Windows.Storage.Streams.InputStreamOptions")
@js.native
object InputStreamOptions extends js.Object {
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.StorageNs.StreamsNs.InputStreamOptions
  
  @js.native
  sealed trait partial
    extends winrtLib.WindowsNs.StorageNs.StreamsNs.InputStreamOptions
  
  @js.native
  sealed trait readAhead
    extends winrtLib.WindowsNs.StorageNs.StreamsNs.InputStreamOptions
  
  val none: none with java.lang.String = js.native
  val partial: partial with java.lang.String = js.native
  val readAhead: readAhead with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.StorageNs.StreamsNs.InputStreamOptions with java.lang.String] = js.native
}

