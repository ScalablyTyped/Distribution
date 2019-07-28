package typings.winrt.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataReaderFactory extends js.Object {
  def createDataReader(inputStream: IInputStream): DataReader
}

object IDataReaderFactory {
  @scala.inline
  def apply(createDataReader: IInputStream => DataReader): IDataReaderFactory = {
    val __obj = js.Dynamic.literal(createDataReader = js.Any.fromFunction1(createDataReader))
  
    __obj.asInstanceOf[IDataReaderFactory]
  }
}

