package typings
package winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ByteOrder extends js.Object

/** Specifies the byte order of a stream. */
@JSGlobal("Windows.Storage.Streams.ByteOrder")
@js.native
object ByteOrder extends js.Object {
  /** The most significant byte (highest address) is stored first. */
  @js.native
  sealed trait bigEndian
    extends winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.ByteOrder
  
  /** The least significant byte (lowest address) is stored first. */
  @js.native
  sealed trait littleEndian
    extends winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.ByteOrder
  
  val bigEndian: bigEndian with java.lang.String = js.native
  val littleEndian: littleEndian with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.ByteOrder with java.lang.String] = js.native
}

