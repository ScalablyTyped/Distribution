package typings.winrtUwp.Windows.Storage.Streams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ByteOrder extends StObject
/** Specifies the byte order of a stream. */
@JSGlobal("Windows.Storage.Streams.ByteOrder")
@js.native
object ByteOrder extends StObject {
  
  /** The most significant byte (highest address) is stored first. */
  @js.native
  sealed trait bigEndian
    extends StObject
       with ByteOrder
  
  /** The least significant byte (lowest address) is stored first. */
  @js.native
  sealed trait littleEndian
    extends StObject
       with ByteOrder
}
