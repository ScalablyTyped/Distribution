package typings
package webassemblyDashJsDashApiLib.WebAssemblyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebAssembly")
@js.native
object WebAssemblyNsMembers extends js.Object {
  def compile(bufferSource: stdLib.ArrayBuffer): stdLib.Promise[Module] = js.native
  def compile(bufferSource: stdLib.Uint8Array): stdLib.Promise[Module] = js.native
  def instantiate(bufferSource: stdLib.ArrayBuffer): stdLib.Promise[ResultObject] = js.native
  def instantiate(bufferSource: stdLib.ArrayBuffer, importObject: js.Any): stdLib.Promise[ResultObject] = js.native
  def instantiate(bufferSource: stdLib.Uint8Array): stdLib.Promise[ResultObject] = js.native
  def instantiate(bufferSource: stdLib.Uint8Array, importObject: js.Any): stdLib.Promise[ResultObject] = js.native
  def instantiate(module: Module): stdLib.Promise[Instance] = js.native
  def instantiate(module: Module, importObject: js.Any): stdLib.Promise[Instance] = js.native
  def validate(bufferSource: stdLib.ArrayBuffer): scala.Boolean = js.native
  def validate(bufferSource: stdLib.Uint8Array): scala.Boolean = js.native
}

