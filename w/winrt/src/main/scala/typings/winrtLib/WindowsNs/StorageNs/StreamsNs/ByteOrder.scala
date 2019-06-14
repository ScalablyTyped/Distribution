package typings
package winrtLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ByteOrder extends js.Object

@JSGlobal("Windows.Storage.Streams.ByteOrder")
@js.native
object ByteOrder extends js.Object {
  @js.native
  sealed trait bigEndian
    extends winrtLib.WindowsNs.StorageNs.StreamsNs.ByteOrder
  
  @js.native
  sealed trait littleEndian
    extends winrtLib.WindowsNs.StorageNs.StreamsNs.ByteOrder
  
  /* 1 */ val bigEndian: bigEndian with scala.Double = js.native
  /* 0 */ val littleEndian: littleEndian with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.StorageNs.StreamsNs.ByteOrder with scala.Double] = js.native
}

