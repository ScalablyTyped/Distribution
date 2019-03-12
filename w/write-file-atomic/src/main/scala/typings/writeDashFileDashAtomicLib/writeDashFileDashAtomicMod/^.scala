package typings
package writeDashFileDashAtomicLib.writeDashFileDashAtomicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("write-file-atomic", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    filename: java.lang.String,
    data: java.lang.String | nodeLib.Buffer,
    callback: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def apply(
    filename: java.lang.String,
    data: java.lang.String | nodeLib.Buffer,
    options: writeDashFileDashAtomicLib.writeDashFileDashAtomicMod.writeFileNs.Options,
    callback: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def sync(filename: java.lang.String, data: java.lang.String): scala.Unit = js.native
  def sync(
    filename: java.lang.String,
    data: java.lang.String,
    options: writeDashFileDashAtomicLib.writeDashFileDashAtomicMod.writeFileNs.Options
  ): scala.Unit = js.native
  def sync(filename: java.lang.String, data: nodeLib.Buffer): scala.Unit = js.native
  def sync(
    filename: java.lang.String,
    data: nodeLib.Buffer,
    options: writeDashFileDashAtomicLib.writeDashFileDashAtomicMod.writeFileNs.Options
  ): scala.Unit = js.native
}

