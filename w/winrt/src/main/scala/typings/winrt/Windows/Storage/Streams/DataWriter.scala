package typings.winrt.Windows.Storage.Streams

import typings.winrt.Windows.Foundation.IClosable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Streams.DataWriter")
@js.native
class DataWriter ()
  extends IDataWriter
     with IClosable {
  def this(outputStream: IOutputStream) = this()
  /* CompleteClass */
  override def close(): Unit = js.native
  def dispose(): Unit = js.native
}

