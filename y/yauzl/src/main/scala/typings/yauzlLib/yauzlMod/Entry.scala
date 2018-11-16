package typings
package yauzlLib.yauzlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yauzl", "Entry")
@js.native
class Entry () extends js.Object {
  var comment: java.lang.String = js.native
  var compressedSize: scala.Double = js.native
  var compressionMethod: scala.Double = js.native
  var crc32: scala.Double = js.native
  var externalFileAttributes: scala.Double = js.native
  var extraFieldLength: scala.Double = js.native
  var extraFields: js.Array[yauzlLib.Anon_Data] = js.native
  var fileCommentLength: scala.Double = js.native
  var fileName: java.lang.String = js.native
  var fileNameLength: scala.Double = js.native
  var generalPurposeBitFlag: scala.Double = js.native
  var internalFileAttributes: scala.Double = js.native
  var lastModFileDate: scala.Double = js.native
  var lastModFileTime: scala.Double = js.native
  var relativeOffsetOfLocalHeader: scala.Double = js.native
  var uncompressedSize: scala.Double = js.native
  var versionMadeBy: scala.Double = js.native
  var versionNeededToExtract: scala.Double = js.native
  def getLastModDate(): stdLib.Date = js.native
  def isCompressed(): scala.Boolean = js.native
  def isEncrypted(): scala.Boolean = js.native
}

