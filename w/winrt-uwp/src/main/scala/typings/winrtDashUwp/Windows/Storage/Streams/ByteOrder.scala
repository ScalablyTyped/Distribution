package typings.winrtDashUwp.Windows.Storage.Streams

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
  sealed trait bigEndian extends ByteOrder
  
  /** The least significant byte (lowest address) is stored first. */
  @js.native
  sealed trait littleEndian extends ByteOrder
  
  /* 1 */ val bigEndian: typings.winrtDashUwp.Windows.Storage.Streams.ByteOrder.bigEndian with Double = js.native
  /* 0 */ val littleEndian: typings.winrtDashUwp.Windows.Storage.Streams.ByteOrder.littleEndian with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ByteOrder with Double] = js.native
}

