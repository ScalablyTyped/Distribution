package typings.winrt.Windows.Storage.Streams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ByteOrder extends js.Object
@JSGlobal("Windows.Storage.Streams.ByteOrder")
@js.native
object ByteOrder extends js.Object {
  
  @js.native
  sealed trait bigEndian extends ByteOrder
  
  @js.native
  sealed trait littleEndian extends ByteOrder
}
