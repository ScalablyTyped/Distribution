package typings.tar.mod

import typings.node.streamMod.Writable
import typings.std.Error
import typings.tar.AnonSync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tar", "t")
@js.native
object t extends js.Object {
  def apply(): Writable = js.native
  def apply(options: ListOptions with FileOptions with AnonSync): Unit = js.native
  def apply(options: ListOptions with FileOptions with AnonSync, fileList: js.Array[String]): Unit = js.native
  def apply(
    options: ListOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Writable = js.native
}

