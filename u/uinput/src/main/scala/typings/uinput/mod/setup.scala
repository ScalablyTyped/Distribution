package typings.uinput.mod

import typings.node.fsMod.WriteStream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uinput", "setup")
@js.native
object setup extends js.Object {
  def apply(options: SetupOptions, callback: js.Function2[/* err */ Error, /* stream */ WriteStream, Unit]): Unit = js.native
}

