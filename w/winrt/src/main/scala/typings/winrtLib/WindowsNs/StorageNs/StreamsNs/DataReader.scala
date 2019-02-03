package typings
package winrtLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Streams.DataReader")
@js.native
class DataReader protected ()
  extends IDataReader
     with winrtLib.WindowsNs.FoundationNs.IClosable {
  def this(inputStream: IInputStream) = this()
  /* CompleteClass */
  override def close(): scala.Unit = js.native
  def dispose(): scala.Unit = js.native
}

/* static members */
@JSGlobal("Windows.Storage.Streams.DataReader")
@js.native
object DataReader extends js.Object {
  def fromBuffer(buffer: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer): winrtLib.WindowsNs.StorageNs.StreamsNs.DataReader = js.native
}

