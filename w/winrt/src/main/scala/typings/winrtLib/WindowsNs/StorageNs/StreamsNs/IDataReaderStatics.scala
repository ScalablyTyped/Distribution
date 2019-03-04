package typings
package winrtLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataReaderStatics extends js.Object {
  def fromBuffer(buffer: IBuffer): DataReader
}

object IDataReaderStatics {
  @scala.inline
  def apply(fromBuffer: js.Function1[IBuffer, DataReader]): IDataReaderStatics = {
    val __obj = js.Dynamic.literal(fromBuffer = fromBuffer)
  
    __obj.asInstanceOf[IDataReaderStatics]
  }
}

