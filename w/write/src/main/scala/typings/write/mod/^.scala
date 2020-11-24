package typings.write.mod

import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("write", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(filepath: String, data: String): js.Promise[Result[String]] = js.native
  def apply(filepath: String, data: String, callback: Callback[String]): Unit = js.native
  def apply(filepath: String, data: String, options: Options): js.Promise[Result[String]] = js.native
  def apply(filepath: String, data: String, options: Options, callback: Callback[String]): Unit = js.native
  def apply(filepath: String, data: Buffer): js.Promise[Result[Buffer]] = js.native
  def apply(filepath: String, data: Buffer, callback: Callback[Buffer]): Unit = js.native
  def apply(filepath: String, data: Buffer, options: Options): js.Promise[Result[Buffer]] = js.native
  def apply(filepath: String, data: Buffer, options: Options, callback: Callback[Buffer]): Unit = js.native
  def apply(filepath: String, data: Uint8Array): js.Promise[Result[Uint8Array]] = js.native
  def apply(filepath: String, data: Uint8Array, callback: Callback[Uint8Array]): Unit = js.native
  def apply(filepath: String, data: Uint8Array, options: Options): js.Promise[Result[Uint8Array]] = js.native
  def apply(filepath: String, data: Uint8Array, options: Options, callback: Callback[Uint8Array]): Unit = js.native
}
