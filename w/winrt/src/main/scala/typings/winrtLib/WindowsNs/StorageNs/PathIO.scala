package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.PathIO")
@js.native
class PathIO () extends js.Object

/* static members */
@JSGlobal("Windows.Storage.PathIO")
@js.native
object PathIO extends js.Object {
  def appendLinesAsync(
    absolutePath: java.lang.String,
    lines: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def appendLinesAsync(
    absolutePath: java.lang.String,
    lines: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String],
    encoding: winrtLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def appendTextAsync(absolutePath: java.lang.String, contents: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def appendTextAsync(
    absolutePath: java.lang.String,
    contents: java.lang.String,
    encoding: winrtLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def readBufferAsync(absolutePath: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer] = js.native
  def readLinesAsync(absolutePath: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String]] = js.native
  def readLinesAsync(absolutePath: java.lang.String, encoding: winrtLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String]] = js.native
  def readTextAsync(absolutePath: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String] = js.native
  def readTextAsync(absolutePath: java.lang.String, encoding: winrtLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String] = js.native
  def writeBufferAsync(absolutePath: java.lang.String, buffer: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def writeBytesAsync(absolutePath: java.lang.String, buffer: stdLib.Uint8Array): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def writeLinesAsync(
    absolutePath: java.lang.String,
    lines: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def writeLinesAsync(
    absolutePath: java.lang.String,
    lines: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String],
    encoding: winrtLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def writeTextAsync(absolutePath: java.lang.String, contents: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def writeTextAsync(
    absolutePath: java.lang.String,
    contents: java.lang.String,
    encoding: winrtLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
}

