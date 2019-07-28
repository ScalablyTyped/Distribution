package typings.tarDashStream.tarDashStreamMod

import typings.node.streamMod.PassThrough
import typings.node.streamMod.Writable
import typings.tarDashStream.tarDashStreamStrings.entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Extract extends Writable {
  @JSName("on")
  def on_entry(
    event: entry,
    listener: js.Function3[/* headers */ Headers, /* stream */ PassThrough, /* next */ js.Function0[Unit], Unit]
  ): this.type = js.native
}

