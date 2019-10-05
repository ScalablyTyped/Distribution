package typings.winrt.Windows.Storage.Streams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ByteOrder extends js.Object

@JSGlobal("Windows.Storage.Streams.ByteOrder")
@js.native
object ByteOrder extends js.Object {
  @js.native
  sealed trait bigEndian extends ByteOrder
  
  @js.native
  sealed trait littleEndian extends ByteOrder
  
  /* 1 */ val bigEndian: typings.winrt.Windows.Storage.Streams.ByteOrder.bigEndian with Double = js.native
  /* 0 */ val littleEndian: typings.winrt.Windows.Storage.Streams.ByteOrder.littleEndian with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ByteOrder with Double] = js.native
}

