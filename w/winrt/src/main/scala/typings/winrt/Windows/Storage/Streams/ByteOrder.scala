package typings.winrt.Windows.Storage.Streams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ByteOrder extends StObject
@JSGlobal("Windows.Storage.Streams.ByteOrder")
@js.native
object ByteOrder extends StObject {
  
  @js.native
  sealed trait bigEndian
    extends StObject
       with ByteOrder
  
  @js.native
  sealed trait littleEndian
    extends StObject
       with ByteOrder
}
