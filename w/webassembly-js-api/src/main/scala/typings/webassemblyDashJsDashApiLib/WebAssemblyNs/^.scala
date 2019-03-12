package typings
package webassemblyDashJsDashApiLib.WebAssemblyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebAssembly")
@js.native
object ^ extends js.Object {
  def compile(bufferSource: BufferSource): js.Promise[Module] = js.native
  def instantiate(bufferSource: BufferSource): js.Promise[ResultObject] = js.native
  def instantiate(bufferSource: BufferSource, importObject: js.Object): js.Promise[ResultObject] = js.native
  def instantiate(module: Module): js.Promise[Instance] = js.native
  def instantiate(module: Module, importObject: js.Object): js.Promise[Instance] = js.native
  def validate(bufferSource: BufferSource): scala.Boolean = js.native
}

