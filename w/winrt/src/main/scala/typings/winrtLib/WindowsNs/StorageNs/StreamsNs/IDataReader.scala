package typings
package winrtLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataReader extends js.Object {
  var byteOrder: ByteOrder = js.native
  var inputStreamOptions: InputStreamOptions = js.native
  var unconsumedBufferLength: scala.Double = js.native
  var unicodeEncoding: UnicodeEncoding = js.native
  def detachBuffer(): IBuffer = js.native
  def detachStream(): IInputStream = js.native
  def loadAsync(count: scala.Double): DataReaderLoadOperation = js.native
  def readBoolean(): scala.Boolean = js.native
  def readBuffer(length: scala.Double): IBuffer = js.native
  def readByte(): scala.Double = js.native
  def readBytes(value: js.Array[scala.Double]): scala.Unit = js.native
  def readBytes(value: stdLib.Uint8Array): scala.Unit = js.native
  def readDateTime(): stdLib.Date = js.native
  def readDouble(): scala.Double = js.native
  def readGuid(): java.lang.String = js.native
  def readInt16(): scala.Double = js.native
  def readInt32(): scala.Double = js.native
  def readInt64(): scala.Double = js.native
  def readSingle(): scala.Double = js.native
  def readString(codeUnitCount: scala.Double): java.lang.String = js.native
  def readTimeSpan(): scala.Double = js.native
  def readUInt16(): scala.Double = js.native
  def readUInt32(): scala.Double = js.native
  def readUInt64(): scala.Double = js.native
}

