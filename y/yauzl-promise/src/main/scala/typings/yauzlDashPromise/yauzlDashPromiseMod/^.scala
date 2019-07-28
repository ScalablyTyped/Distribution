package typings.yauzlDashPromise.yauzlDashPromiseMod

import typings.node.Buffer
import typings.std.Date
import typings.yauzl.yauzlMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yauzl-promise", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def dosDateTimeToDate(date: Double, time: Double): Date = js.native
  def fromBuffer(buffer: Buffer): js.Promise[ZipFile] = js.native
  def fromBuffer(buffer: Buffer, options: Options): js.Promise[ZipFile] = js.native
  def fromFd(fd: Double): js.Promise[ZipFile] = js.native
  def fromFd(fd: Double, options: Options): js.Promise[ZipFile] = js.native
  def fromRandomAccessReader(reader: typings.yauzl.yauzlMod.RandomAccessReader, totalSize: Double): js.Promise[ZipFile] = js.native
  def fromRandomAccessReader(reader: typings.yauzl.yauzlMod.RandomAccessReader, totalSize: Double, options: Options): js.Promise[ZipFile] = js.native
  def open(path: String): js.Promise[ZipFile] = js.native
  def open(path: String, options: Options): js.Promise[ZipFile] = js.native
  def validateFileName(fileName: String): String | Null = js.native
}

