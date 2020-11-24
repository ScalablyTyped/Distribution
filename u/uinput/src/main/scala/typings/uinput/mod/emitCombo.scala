package typings.uinput.mod

import typings.node.fsMod.WriteStream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("uinput", "emit_combo")
@js.native
object emitCombo extends js.Object {
  
  def apply(stream: WriteStream, codes: js.Array[Double], callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}
