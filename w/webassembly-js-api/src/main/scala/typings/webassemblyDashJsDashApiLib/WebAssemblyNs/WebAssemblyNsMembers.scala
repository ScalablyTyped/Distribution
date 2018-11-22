package typings
package webassemblyDashJsDashApiLib.WebAssemblyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebAssembly")
@js.native
object WebAssemblyNsMembers extends js.Object {
  def compile(bufferSource: BufferSource): stdLib.Promise[Module] = js.native
  def instantiate(bufferSource: BufferSource): stdLib.Promise[ResultObject] = js.native
  def instantiate(bufferSource: BufferSource, importObject: js.Object): stdLib.Promise[ResultObject] = js.native
  def instantiate(module: Module): stdLib.Promise[Instance] = js.native
  def instantiate(module: Module, importObject: js.Object): stdLib.Promise[Instance] = js.native
  def validate(bufferSource: BufferSource): scala.Boolean = js.native
}

