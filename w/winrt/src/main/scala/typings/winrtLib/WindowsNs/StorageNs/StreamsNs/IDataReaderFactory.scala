package typings
package winrtLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataReaderFactory extends js.Object {
  def createDataReader(inputStream: IInputStream): DataReader
}

object IDataReaderFactory {
  @scala.inline
  def apply(createDataReader: js.Function1[IInputStream, DataReader]): IDataReaderFactory = {
    val __obj = js.Dynamic.literal(createDataReader = createDataReader)
  
    __obj.asInstanceOf[IDataReaderFactory]
  }
}

