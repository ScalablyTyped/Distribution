package typings.uinput.mod

import typings.node.fsMod.WriteStream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("uinput", "send_event")
@js.native
object sendEvent extends js.Object {
  
  def apply(
    stream: WriteStream,
    typeParam: Double,
    code: Double,
    value: Double,
    callback: js.Function1[/* err */ Error, Unit]
  ): Unit = js.native
}
