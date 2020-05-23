package typings.yazl.mod

import typings.node.NodeJS.ReadableStream
import typings.node.bufferMod.Buffer
import typings.std.Date
import typings.yazl.anon.PartialDirectoryOptions
import typings.yazl.anon.PartialOptions
import typings.yazl.anon.PartialReadStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yazl", "ZipFile")
@js.native
class ZipFile () extends js.Object {
  var outputStream: ReadableStream = js.native
  def addBuffer(buffer: Buffer, metadataPath: String): Unit = js.native
  def addBuffer(buffer: Buffer, metadataPath: String, options: PartialOptions): Unit = js.native
  def addEmptyDirectory(metadataPath: String): Unit = js.native
  def addEmptyDirectory(metadataPath: String, options: PartialDirectoryOptions): Unit = js.native
  def addFile(realPath: String, metadataPath: String): Unit = js.native
  def addFile(realPath: String, metadataPath: String, options: PartialOptions): Unit = js.native
  def addReadStream(input: ReadableStream, metadataPath: String): Unit = js.native
  def addReadStream(input: ReadableStream, metadataPath: String, options: PartialReadStreamOptions): Unit = js.native
  def dateToDosDateTime(jsDate: Date): DosDateTime = js.native
  def end(): Unit = js.native
  def end(options: EndOptions): Unit = js.native
  def end(options: EndOptions, finalSizeCallback: js.Function0[Unit]): Unit = js.native
}

