package typings.webshotNode.mod

import typings.node.NodeJS.ReadableStream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webshot-node", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(src: String): ReadableStream = js.native
  def apply(src: String, cb: js.Function1[/* e */ Error | Null, Unit]): ReadableStream = js.native
  def apply(src: String, dst: String): Unit = js.native
  def apply(src: String, dst: String, cb: js.Function1[/* e */ Error | Null, Unit]): Unit = js.native
  def apply(src: String, dst: String, options: Options): Unit = js.native
  def apply(src: String, dst: String, options: Options, cb: js.Function1[/* e */ Error | Null, Unit]): Unit = js.native
  def apply(src: String, options: Options): ReadableStream = js.native
  def apply(src: String, options: Options, cb: js.Function1[/* e */ Error | Null, Unit]): ReadableStream = js.native
}
