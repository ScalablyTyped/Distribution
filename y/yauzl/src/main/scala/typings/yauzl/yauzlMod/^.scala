package typings.yauzl.yauzlMod

import typings.node.Buffer
import typings.std.Date
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yauzl", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def dosDateTimeToDate(date: Double, time: Double): Date = js.native
  def fromBuffer(buffer: Buffer): Unit = js.native
  def fromBuffer(
    buffer: Buffer,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* zipfile */ js.UndefOr[ZipFile], Unit]
  ): Unit = js.native
  def fromBuffer(buffer: Buffer, options: Options): Unit = js.native
  def fromBuffer(
    buffer: Buffer,
    options: Options,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* zipfile */ js.UndefOr[ZipFile], Unit]
  ): Unit = js.native
  def fromFd(fd: Double): Unit = js.native
  def fromFd(
    fd: Double,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* zipfile */ js.UndefOr[ZipFile], Unit]
  ): Unit = js.native
  def fromFd(fd: Double, options: Options): Unit = js.native
  def fromFd(
    fd: Double,
    options: Options,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* zipfile */ js.UndefOr[ZipFile], Unit]
  ): Unit = js.native
  def fromRandomAccessReader(
    reader: RandomAccessReader,
    totalSize: Double,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* zipfile */ js.UndefOr[ZipFile], Unit]
  ): Unit = js.native
  def fromRandomAccessReader(
    reader: RandomAccessReader,
    totalSize: Double,
    options: Options,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* zipfile */ js.UndefOr[ZipFile], Unit]
  ): Unit = js.native
  def open(path: String): Unit = js.native
  def open(
    path: String,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* zipfile */ js.UndefOr[ZipFile], Unit]
  ): Unit = js.native
  def open(path: String, options: Options): Unit = js.native
  def open(
    path: String,
    options: Options,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* zipfile */ js.UndefOr[ZipFile], Unit]
  ): Unit = js.native
  def validateFileName(fileName: String): String | Null = js.native
}

