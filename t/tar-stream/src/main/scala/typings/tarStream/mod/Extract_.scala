package typings.tarStream.mod

import typings.node.streamMod.PassThrough
import typings.node.streamMod.Writable
import typings.tarStream.tarStreamStrings.entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Extract_ extends Writable {
  
  @JSName("on")
  def on_entry(
    event: entry,
    listener: js.Function3[/* headers */ Headers, /* stream */ PassThrough, /* next */ js.Function0[Unit], Unit]
  ): this.type = js.native
}
