package typings
package winrtLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataWriterFactory extends js.Object {
  def createDataWriter(outputStream: IOutputStream): DataWriter
}

object IDataWriterFactory {
  @scala.inline
  def apply(createDataWriter: js.Function1[IOutputStream, DataWriter]): IDataWriterFactory = {
    val __obj = js.Dynamic.literal(createDataWriter = createDataWriter)
  
    __obj.asInstanceOf[IDataWriterFactory]
  }
}

