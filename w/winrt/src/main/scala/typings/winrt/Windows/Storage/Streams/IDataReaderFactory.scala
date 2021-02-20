package typings.winrt.Windows.Storage.Streams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDataReaderFactory extends StObject {
  
  def createDataReader(inputStream: IInputStream): DataReader = js.native
}
object IDataReaderFactory {
  
  @scala.inline
  def apply(createDataReader: IInputStream => DataReader): IDataReaderFactory = {
    val __obj = js.Dynamic.literal(createDataReader = js.Any.fromFunction1(createDataReader))
    __obj.asInstanceOf[IDataReaderFactory]
  }
  
  @scala.inline
  implicit class IDataReaderFactoryMutableBuilder[Self <: IDataReaderFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateDataReader(value: IInputStream => DataReader): Self = StObject.set(x, "createDataReader", js.Any.fromFunction1(value))
  }
}
