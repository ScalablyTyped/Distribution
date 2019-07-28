package typings.winrt.WindowsNs.StorageNs

import typings.std.Uint8Array
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IIterable
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrt.WindowsNs.FoundationNs.IAsyncAction
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IBuffer
import typings.winrt.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPathIOStatics extends js.Object {
  def appendLinesAsync(absolutePath: String, lines: IIterable[String]): IAsyncAction = js.native
  def appendLinesAsync(absolutePath: String, lines: IIterable[String], encoding: UnicodeEncoding): IAsyncAction = js.native
  def appendTextAsync(absolutePath: String, contents: String): IAsyncAction = js.native
  def appendTextAsync(absolutePath: String, contents: String, encoding: UnicodeEncoding): IAsyncAction = js.native
  def readBufferAsync(absolutePath: String): IAsyncOperation[IBuffer] = js.native
  def readLinesAsync(absolutePath: String): IAsyncOperation[IVector[String]] = js.native
  def readLinesAsync(absolutePath: String, encoding: UnicodeEncoding): IAsyncOperation[IVector[String]] = js.native
  def readTextAsync(absolutePath: String): IAsyncOperation[String] = js.native
  def readTextAsync(absolutePath: String, encoding: UnicodeEncoding): IAsyncOperation[String] = js.native
  def writeBufferAsync(absolutePath: String, buffer: IBuffer): IAsyncAction = js.native
  def writeBytesAsync(absolutePath: String, buffer: Uint8Array): IAsyncAction = js.native
  def writeLinesAsync(absolutePath: String, lines: IIterable[String]): IAsyncAction = js.native
  def writeLinesAsync(absolutePath: String, lines: IIterable[String], encoding: UnicodeEncoding): IAsyncAction = js.native
  def writeTextAsync(absolutePath: String, contents: String): IAsyncAction = js.native
  def writeTextAsync(absolutePath: String, contents: String, encoding: UnicodeEncoding): IAsyncAction = js.native
}

