package typings.winrt.Windows.Storage.Streams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDataReaderStatics extends StObject {
  
  def fromBuffer(buffer: IBuffer): DataReader
}
object IDataReaderStatics {
  
  inline def apply(fromBuffer: IBuffer => DataReader): IDataReaderStatics = {
    val __obj = js.Dynamic.literal(fromBuffer = js.Any.fromFunction1(fromBuffer))
    __obj.asInstanceOf[IDataReaderStatics]
  }
  
  extension [Self <: IDataReaderStatics](x: Self) {
    
    inline def setFromBuffer(value: IBuffer => DataReader): Self = StObject.set(x, "fromBuffer", js.Any.fromFunction1(value))
  }
}
