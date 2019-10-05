package typings.winrt.Windows.Storage.Streams

import typings.winrt.Windows.Foundation.IClosable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Streams.DataReader")
@js.native
class DataReader protected ()
  extends IDataReader
     with IClosable {
  def this(inputStream: IInputStream) = this()
  /* CompleteClass */
  override def close(): Unit = js.native
  def dispose(): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Storage.Streams.DataReader")
@js.native
object DataReader extends js.Object {
  def fromBuffer(buffer: IBuffer): DataReader = js.native
}

