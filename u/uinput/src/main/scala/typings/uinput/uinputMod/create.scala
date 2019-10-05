package typings.uinput.uinputMod

import typings.node.fsMod.WriteStream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uinput", "create")
@js.native
object create extends js.Object {
  def apply(stream: WriteStream, options: CreateOptions, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

