package typings
package yauzlLib.yauzlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yauzl", "ZipFile")
@js.native
class ZipFile protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(reader: RandomAccessReader, centralDirectoryOffset: scala.Double, fileSize: scala.Double, entryCount: scala.Double, comment: java.lang.String, autoClose: scala.Boolean, lazyEntries: scala.Boolean, decodeStrings: scala.Boolean, validateEntrySizes: scala.Boolean) = this()
  var autoClose: scala.Boolean = js.native
  var comment: java.lang.String = js.native
  var decodeStrings: scala.Boolean = js.native
  var emittedError: scala.Boolean = js.native
  var entriesRead: scala.Double = js.native
  var entryCount: scala.Double = js.native
  var fileSize: scala.Double = js.native
  var isOpen: scala.Boolean = js.native
  var lazyEntries: scala.Boolean = js.native
  var readEntryCursor: scala.Boolean = js.native
  var validateEntrySizes: scala.Boolean = js.native
  def close(): scala.Unit = js.native
  def openReadStream(
    entry: Entry,
    callback: js.Function2[
      /* err */ js.UndefOr[nodeLib.Error], 
      /* stream */ js.UndefOr[nodeLib.streamMod.Readable], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def openReadStream(
    entry: Entry,
    options: ZipFileOptions,
    callback: js.Function2[
      /* err */ js.UndefOr[nodeLib.Error], 
      /* stream */ js.UndefOr[nodeLib.streamMod.Readable], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readEntry(): scala.Unit = js.native
}

