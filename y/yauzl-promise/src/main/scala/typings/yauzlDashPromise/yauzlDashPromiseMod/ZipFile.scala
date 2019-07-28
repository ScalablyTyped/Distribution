package typings.yauzlDashPromise.yauzlDashPromiseMod

import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Readable
import typings.yauzl.yauzlMod.ZipFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yauzl-promise", "ZipFile")
@js.native
class ZipFile protected () extends EventEmitter {
  def this(
    reader: typings.yauzl.yauzlMod.RandomAccessReader,
    centralDirectoryOffset: Double,
    fileSize: Double,
    entryCount: Double,
    comment: String,
    autoClose: Boolean,
    lazyEntries: Boolean,
    decodeStrings: Boolean,
    validateEntrySizes: Boolean
  ) = this()
  // This chunk taken directly from @types/yauzl
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
  // These funcitons are custom to yauzl-promise
  def close(): js.Promise[Unit] = js.native
  def openReadStream(entry: Entry): js.Promise[Readable] = js.native
  def openReadStream(entry: Entry, options: ZipFileOptions): js.Promise[Readable] = js.native
  def readEntries(): js.Promise[js.Array[Entry]] = js.native
  def readEntries(numEntries: Double): js.Promise[js.Array[Entry]] = js.native
  def readEntry(): js.Promise[Entry] = js.native
  def walkEntries(callback: js.Function1[/* entry */ Entry, js.Promise[Unit] | Unit]): js.Promise[Unit] = js.native
  def walkEntries(callback: js.Function1[/* entry */ Entry, js.Promise[Unit] | Unit], numEntries: Double): js.Promise[Unit] = js.native
}

