package typings
package winrtLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataWriter extends js.Object {
  var byteOrder: ByteOrder = js.native
  var unicodeEncoding: UnicodeEncoding = js.native
  var unstoredBufferLength: scala.Double = js.native
  def detachBuffer(): IBuffer = js.native
  def detachStream(): IOutputStream = js.native
  def flushAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean] = js.native
  def measureString(value: java.lang.String): scala.Double = js.native
  def storeAsync(): DataWriterStoreOperation = js.native
  def writeBoolean(value: scala.Boolean): scala.Unit = js.native
  def writeBuffer(buffer: IBuffer): scala.Unit = js.native
  def writeBuffer(buffer: IBuffer, start: scala.Double, count: scala.Double): scala.Unit = js.native
  def writeByte(value: scala.Double): scala.Unit = js.native
  def writeBytes(value: js.Array[scala.Double]): scala.Unit = js.native
  def writeBytes(value: stdLib.Uint8Array): scala.Unit = js.native
  def writeDateTime(value: stdLib.Date): scala.Unit = js.native
  def writeDouble(value: scala.Double): scala.Unit = js.native
  def writeGuid(value: java.lang.String): scala.Unit = js.native
  def writeInt16(value: scala.Double): scala.Unit = js.native
  def writeInt32(value: scala.Double): scala.Unit = js.native
  def writeInt64(value: scala.Double): scala.Unit = js.native
  def writeSingle(value: scala.Double): scala.Unit = js.native
  def writeString(value: java.lang.String): scala.Double = js.native
  def writeTimeSpan(value: scala.Double): scala.Unit = js.native
  def writeUInt16(value: scala.Double): scala.Unit = js.native
  def writeUInt32(value: scala.Double): scala.Unit = js.native
  def writeUInt64(value: scala.Double): scala.Unit = js.native
}

