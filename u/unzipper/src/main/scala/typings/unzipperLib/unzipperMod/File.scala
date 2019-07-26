package typings
package unzipperLib.unzipperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File extends js.Object {
  var comment: java.lang.String = js.native
  var compressedSize: scala.Double = js.native
  var compressionMethod: scala.Double = js.native
  var crc32: scala.Double = js.native
  var diskNumber: scala.Double = js.native
  var externalFileAttributes: scala.Double = js.native
  var extra: js.Any = js.native
  var extraFieldLength: scala.Double = js.native
  var fileCommentLength: scala.Double = js.native
  var fileNameLength: scala.Double = js.native
  var flags: scala.Double = js.native
  var internalFileAttributes: scala.Double = js.native
  var isUnicode: scala.Double = js.native
  var lastModifiedDate: scala.Double = js.native
  var lastModifiedTime: scala.Double = js.native
  var offsetToLocalFileHeader: scala.Double = js.native
  var path: java.lang.String = js.native
  var pathBuffer: nodeLib.Buffer = js.native
  var signature: scala.Double = js.native
  var `type`: unzipperLib.unzipperLibStrings.Directory | unzipperLib.unzipperLibStrings.File = js.native
  var uncompressedSize: scala.Double = js.native
  var versionMadeBy: scala.Double = js.native
  var versionsNeededToExtract: scala.Double = js.native
  def buffer(): js.Promise[nodeLib.Buffer] = js.native
  def buffer(password: java.lang.String): js.Promise[nodeLib.Buffer] = js.native
  def stream(): Entry = js.native
  def stream(password: java.lang.String): Entry = js.native
}

