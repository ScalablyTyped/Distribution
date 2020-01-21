package typings.yauzl.mod

import typings.std.Date
import typings.yauzl.AnonData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yauzl", "Entry")
@js.native
class Entry () extends js.Object {
  var comment: String = js.native
  var compressedSize: Double = js.native
  var compressionMethod: Double = js.native
  var crc32: Double = js.native
  var externalFileAttributes: Double = js.native
  var extraFieldLength: Double = js.native
  var extraFields: js.Array[AnonData] = js.native
  var fileCommentLength: Double = js.native
  var fileName: String = js.native
  var fileNameLength: Double = js.native
  var generalPurposeBitFlag: Double = js.native
  var internalFileAttributes: Double = js.native
  var lastModFileDate: Double = js.native
  var lastModFileTime: Double = js.native
  var relativeOffsetOfLocalHeader: Double = js.native
  var uncompressedSize: Double = js.native
  var versionMadeBy: Double = js.native
  var versionNeededToExtract: Double = js.native
  def getLastModDate(): Date = js.native
  def isCompressed(): Boolean = js.native
  def isEncrypted(): Boolean = js.native
}

