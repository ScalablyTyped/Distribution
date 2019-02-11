package typings
package yazlLib.yazlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yazl", "ZipFile")
@js.native
class ZipFile () extends js.Object {
  var outputStream: nodeLib.streamMod.Readable = js.native
  def addBuffer(buffer: bufferLib.bufferMod.Buffer, metadataPath: java.lang.String): scala.Unit = js.native
  def addBuffer(
    buffer: bufferLib.bufferMod.Buffer,
    metadataPath: java.lang.String,
    options: stdLib.Partial[Options]
  ): scala.Unit = js.native
  def addEmptyDirectory(metadataPath: java.lang.String): scala.Unit = js.native
  def addEmptyDirectory(metadataPath: java.lang.String, options: stdLib.Partial[DirectoryOptions]): scala.Unit = js.native
  def addFile(realPath: java.lang.String, metadataPath: java.lang.String): scala.Unit = js.native
  def addFile(realPath: java.lang.String, metadataPath: java.lang.String, options: stdLib.Partial[Options]): scala.Unit = js.native
  def addReadStream(input: nodeLib.streamMod.Readable, metadataPath: java.lang.String): scala.Unit = js.native
  def addReadStream(
    input: nodeLib.streamMod.Readable,
    metadataPath: java.lang.String,
    options: stdLib.Partial[ReadStreamOptions]
  ): scala.Unit = js.native
  def dateToDosDateTime(jsDate: stdLib.Date): DosDateTime = js.native
  def end(): scala.Unit = js.native
  def end(optoins: EndOptions): scala.Unit = js.native
  def end(optoins: EndOptions, finalSizeCallback: js.Function0[scala.Unit]): scala.Unit = js.native
}

