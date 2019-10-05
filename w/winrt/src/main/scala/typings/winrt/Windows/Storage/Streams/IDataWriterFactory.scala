package typings.winrt.Windows.Storage.Streams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataWriterFactory extends js.Object {
  def createDataWriter(outputStream: IOutputStream): DataWriter
}

object IDataWriterFactory {
  @scala.inline
  def apply(createDataWriter: IOutputStream => DataWriter): IDataWriterFactory = {
    val __obj = js.Dynamic.literal(createDataWriter = js.Any.fromFunction1(createDataWriter))
  
    __obj.asInstanceOf[IDataWriterFactory]
  }
}

