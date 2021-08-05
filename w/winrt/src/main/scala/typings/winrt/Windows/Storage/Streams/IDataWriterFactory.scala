package typings.winrt.Windows.Storage.Streams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDataWriterFactory extends StObject {
  
  def createDataWriter(outputStream: IOutputStream): DataWriter
}
object IDataWriterFactory {
  
  inline def apply(createDataWriter: IOutputStream => DataWriter): IDataWriterFactory = {
    val __obj = js.Dynamic.literal(createDataWriter = js.Any.fromFunction1(createDataWriter))
    __obj.asInstanceOf[IDataWriterFactory]
  }
  
  extension [Self <: IDataWriterFactory](x: Self) {
    
    inline def setCreateDataWriter(value: IOutputStream => DataWriter): Self = StObject.set(x, "createDataWriter", js.Any.fromFunction1(value))
  }
}
