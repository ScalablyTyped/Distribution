package typings
package yauzlLib.yauzlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yauzl", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def dosDateTimeToDate(date: scala.Double, time: scala.Double): stdLib.Date = js.native
  def fromBuffer(buffer: nodeLib.Buffer): scala.Unit = js.native
  def fromBuffer(
    buffer: nodeLib.Buffer,
    callback: js.Function2[
      /* err */ js.UndefOr[nodeLib.Error], 
      /* zipfile */ js.UndefOr[yauzlLib.yauzlMod.ZipFile], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def fromBuffer(buffer: nodeLib.Buffer, options: yauzlLib.yauzlMod.Options): scala.Unit = js.native
  def fromBuffer(
    buffer: nodeLib.Buffer,
    options: yauzlLib.yauzlMod.Options,
    callback: js.Function2[
      /* err */ js.UndefOr[nodeLib.Error], 
      /* zipfile */ js.UndefOr[yauzlLib.yauzlMod.ZipFile], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def fromFd(fd: scala.Double): scala.Unit = js.native
  def fromFd(
    fd: scala.Double,
    callback: js.Function2[
      /* err */ js.UndefOr[nodeLib.Error], 
      /* zipfile */ js.UndefOr[yauzlLib.yauzlMod.ZipFile], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def fromFd(fd: scala.Double, options: yauzlLib.yauzlMod.Options): scala.Unit = js.native
  def fromFd(
    fd: scala.Double,
    options: yauzlLib.yauzlMod.Options,
    callback: js.Function2[
      /* err */ js.UndefOr[nodeLib.Error], 
      /* zipfile */ js.UndefOr[yauzlLib.yauzlMod.ZipFile], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def fromRandomAccessReader(
    reader: yauzlLib.yauzlMod.RandomAccessReader,
    totalSize: scala.Double,
    callback: js.Function2[
      /* err */ js.UndefOr[nodeLib.Error], 
      /* zipfile */ js.UndefOr[yauzlLib.yauzlMod.ZipFile], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def fromRandomAccessReader(
    reader: yauzlLib.yauzlMod.RandomAccessReader,
    totalSize: scala.Double,
    options: yauzlLib.yauzlMod.Options,
    callback: js.Function2[
      /* err */ js.UndefOr[nodeLib.Error], 
      /* zipfile */ js.UndefOr[yauzlLib.yauzlMod.ZipFile], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def open(path: java.lang.String): scala.Unit = js.native
  def open(
    path: java.lang.String,
    callback: js.Function2[
      /* err */ js.UndefOr[nodeLib.Error], 
      /* zipfile */ js.UndefOr[yauzlLib.yauzlMod.ZipFile], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def open(path: java.lang.String, options: yauzlLib.yauzlMod.Options): scala.Unit = js.native
  def open(
    path: java.lang.String,
    options: yauzlLib.yauzlMod.Options,
    callback: js.Function2[
      /* err */ js.UndefOr[nodeLib.Error], 
      /* zipfile */ js.UndefOr[yauzlLib.yauzlMod.ZipFile], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def validateFileName(fileName: java.lang.String): java.lang.String | scala.Null = js.native
}

