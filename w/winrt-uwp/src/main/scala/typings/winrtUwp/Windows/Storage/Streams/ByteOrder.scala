package typings.winrtUwp.Windows.Storage.Streams

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ByteOrder with Double] = js.native
  /* 1 */ @js.native
  object bigEndian extends TopLevel[bigEndian with Double]
  
  /* 0 */ @js.native
  object littleEndian extends TopLevel[littleEndian with Double]
  
}

