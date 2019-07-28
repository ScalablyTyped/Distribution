package typings.urllib.urllibMod

import typings.node.eventsMod.EventEmitter
import typings.node.urlMod.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("urllib", "HttpClient")
@js.native
class HttpClient[O /* <: RequestOptions */] () extends EventEmitter {
  def curl[T](url: String): js.Promise[HttpClientResponse[T]] = js.native
  def curl[T](url: String, callback: Callback[T]): Unit = js.native
  def curl[T](url: String, options: O): js.Promise[HttpClientResponse[T]] = js.native
  def curl[T](url: String, options: O, callback: Callback[T]): Unit = js.native
  def curl[T](url: URL): js.Promise[HttpClientResponse[T]] = js.native
  def curl[T](url: URL, callback: Callback[T]): Unit = js.native
  def curl[T](url: URL, options: O): js.Promise[HttpClientResponse[T]] = js.native
  def curl[T](url: URL, options: O, callback: Callback[T]): Unit = js.native
  def request[T](url: String): js.Promise[HttpClientResponse[T]] = js.native
  def request[T](url: String, callback: Callback[T]): Unit = js.native
  def request[T](url: String, options: O): js.Promise[HttpClientResponse[T]] = js.native
  def request[T](url: String, options: O, callback: Callback[T]): Unit = js.native
  def request[T](url: URL): js.Promise[HttpClientResponse[T]] = js.native
  def request[T](url: URL, callback: Callback[T]): Unit = js.native
  def request[T](url: URL, options: O): js.Promise[HttpClientResponse[T]] = js.native
  def request[T](url: URL, options: O, callback: Callback[T]): Unit = js.native
  def requestThunk(url: String): js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, Unit], Unit] = js.native
  def requestThunk(url: String, options: O): js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, Unit], Unit] = js.native
  def requestThunk(url: URL): js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, Unit], Unit] = js.native
  def requestThunk(url: URL, options: O): js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, Unit], Unit] = js.native
}

