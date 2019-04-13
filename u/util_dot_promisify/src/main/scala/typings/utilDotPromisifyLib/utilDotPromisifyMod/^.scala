package typings
package utilDotPromisifyLib.utilDotPromisifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("util.promisify", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val custom: js.Symbol = js.native
  val customPromisifyArgs: js.Symbol = js.native
  val implementation: utilDotPromisifyLib.utilDotPromisifyMod.implementation = js.native
  def apply(f: js.Function1[/* repeated */ js.Any, scala.Unit]): js.Function1[/* repeated */ js.Any, js.Promise[_]] = js.native
  def getPolyfill(): implementation = js.native
  def shim(): implementation = js.native
}

