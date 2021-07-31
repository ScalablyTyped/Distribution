package typings.winrt.Windows.Storage.Streams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDataReaderStatics extends StObject {
  
  def fromBuffer(buffer: IBuffer): DataReader
}
object IDataReaderStatics {
  
  @scala.inline
  def apply(fromBuffer: IBuffer => DataReader): IDataReaderStatics = {
    val __obj = js.Dynamic.literal(fromBuffer = js.Any.fromFunction1(fromBuffer))
    __obj.asInstanceOf[IDataReaderStatics]
  }
  
  @scala.inline
  implicit class IDataReaderStaticsMutableBuilder[Self <: IDataReaderStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromBuffer(value: IBuffer => DataReader): Self = StObject.set(x, "fromBuffer", js.Any.fromFunction1(value))
  }
}
