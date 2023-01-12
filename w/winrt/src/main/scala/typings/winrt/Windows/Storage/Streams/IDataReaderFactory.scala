package typings.winrt.Windows.Storage.Streams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDataReaderFactory extends StObject {
  
  def createDataReader(inputStream: IInputStream): DataReader
}
object IDataReaderFactory {
  
  inline def apply(createDataReader: IInputStream => DataReader): IDataReaderFactory = {
    val __obj = js.Dynamic.literal(createDataReader = js.Any.fromFunction1(createDataReader))
    __obj.asInstanceOf[IDataReaderFactory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDataReaderFactory] (val x: Self) extends AnyVal {
    
    inline def setCreateDataReader(value: IInputStream => DataReader): Self = StObject.set(x, "createDataReader", js.Any.fromFunction1(value))
  }
}
