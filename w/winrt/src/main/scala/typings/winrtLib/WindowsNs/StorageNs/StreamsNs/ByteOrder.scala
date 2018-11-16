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
  
  val bigEndian: bigEndian with java.lang.String = js.native
  val littleEndian: littleEndian with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.StorageNs.StreamsNs.ByteOrder with java.lang.String] = js.native
}

