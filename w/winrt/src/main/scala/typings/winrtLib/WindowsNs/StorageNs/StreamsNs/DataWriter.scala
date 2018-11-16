package typings
package winrtLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Streams.DataWriter")
@js.native
class DataWriter ()
  extends IDataWriter
     with winrtLib.WindowsNs.FoundationNs.IClosable {
  def this(outputStream: IOutputStream) = this()
  /* CompleteClass */
  override def close(): scala.Unit = js.native
  def dispose(): scala.Unit = js.native
}

