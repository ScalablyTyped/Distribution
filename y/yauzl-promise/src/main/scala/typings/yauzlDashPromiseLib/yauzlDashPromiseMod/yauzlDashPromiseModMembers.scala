package typings
package yauzlDashPromiseLib.yauzlDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yauzl-promise", JSImport.Namespace)
@js.native
object yauzlDashPromiseModMembers extends js.Object {
  def dosDateTimeToDate(date: scala.Double, time: scala.Double): stdLib.Date = js.native
  def fromBuffer(buffer: nodeLib.Buffer): stdLib.Promise[ZipFile] = js.native
  def fromBuffer(buffer: nodeLib.Buffer, options: yauzlLib.yauzlMod.Options): stdLib.Promise[ZipFile] = js.native
  def fromFd(fd: scala.Double): stdLib.Promise[ZipFile] = js.native
  def fromFd(fd: scala.Double, options: yauzlLib.yauzlMod.Options): stdLib.Promise[ZipFile] = js.native
  def fromRandomAccessReader(reader: yauzlLib.yauzlMod.RandomAccessReader, totalSize: scala.Double): stdLib.Promise[ZipFile] = js.native
  def fromRandomAccessReader(
    reader: yauzlLib.yauzlMod.RandomAccessReader,
    totalSize: scala.Double,
    options: yauzlLib.yauzlMod.Options
  ): stdLib.Promise[ZipFile] = js.native
  def open(path: java.lang.String): stdLib.Promise[ZipFile] = js.native
  def open(path: java.lang.String, options: yauzlLib.yauzlMod.Options): stdLib.Promise[ZipFile] = js.native
  def validateFileName(fileName: java.lang.String): java.lang.String | scala.Null = js.native
}

