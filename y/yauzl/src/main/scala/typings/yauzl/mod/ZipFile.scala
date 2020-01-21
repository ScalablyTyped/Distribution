package typings.yauzl.mod

import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Readable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yauzl", "ZipFile")
@js.native
class ZipFile protected () extends EventEmitter {
  def this(
    reader: RandomAccessReader,
    centralDirectoryOffset: Double,
    fileSize: Double,
    entryCount: Double,
    comment: String,
    autoClose: Boolean,
    lazyEntries: Boolean,
    decodeStrings: Boolean,
    validateEntrySizes: Boolean
  ) = this()
  var autoClose: Boolean = js.native
  var comment: String = js.native
  var decodeStrings: Boolean = js.native
  var emittedError: Boolean = js.native
  var entriesRead: Double = js.native
  var entryCount: Double = js.native
  var fileSize: Double = js.native
  var isOpen: Boolean = js.native
  var lazyEntries: Boolean = js.native
  var readEntryCursor: Boolean = js.native
  var validateEntrySizes: Boolean = js.native
  def close(): Unit = js.native
  def openReadStream(
    entry: Entry,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* stream */ js.UndefOr[Readable], Unit]
  ): Unit = js.native
  def openReadStream(
    entry: Entry,
    options: ZipFileOptions,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* stream */ js.UndefOr[Readable], Unit]
  ): Unit = js.native
  def readEntry(): Unit = js.native
}

