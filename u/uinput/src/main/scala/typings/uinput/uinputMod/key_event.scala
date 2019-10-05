package typings.uinput.uinputMod

import typings.node.fsMod.WriteStream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uinput", "key_event")
@js.native
object key_event extends js.Object {
  def apply(stream: WriteStream, code: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

