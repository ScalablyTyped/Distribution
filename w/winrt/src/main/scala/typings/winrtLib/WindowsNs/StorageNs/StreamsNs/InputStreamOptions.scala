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
  
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val partial: partial with scala.Double = js.native
  /* 2 */ val readAhead: readAhead with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.StorageNs.StreamsNs.InputStreamOptions with scala.Double] = js.native
}

