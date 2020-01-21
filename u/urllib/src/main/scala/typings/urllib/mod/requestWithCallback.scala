package typings.urllib.mod

import typings.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("urllib", "requestWithCallback")
@js.native
object requestWithCallback extends js.Object {
  def apply[T](url: String, callback: Callback[T]): Unit = js.native
  def apply[T](url: String, options: RequestOptions, callback: Callback[T]): Unit = js.native
  def apply[T](url: URL_, callback: Callback[T]): Unit = js.native
  def apply[T](url: URL_, options: RequestOptions, callback: Callback[T]): Unit = js.native
}

