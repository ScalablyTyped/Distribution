package typings
package urllibLib.urllibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("urllib", "HttpClient")
@js.native
class HttpClient[O /* <: RequestOptions */] ()
  extends nodeLib.eventsMod.EventEmitter {
  def curl[T](url: java.lang.String): js.Promise[HttpClientResponse[T]] = js.native
  def curl[T](url: java.lang.String, callback: Callback[T]): scala.Unit = js.native
  def curl[T](url: java.lang.String, options: O): js.Promise[HttpClientResponse[T]] = js.native
  def curl[T](url: java.lang.String, options: O, callback: Callback[T]): scala.Unit = js.native
  def curl[T](url: nodeLib.urlMod.URL): js.Promise[HttpClientResponse[T]] = js.native
  def curl[T](url: nodeLib.urlMod.URL, callback: Callback[T]): scala.Unit = js.native
  def curl[T](url: nodeLib.urlMod.URL, options: O): js.Promise[HttpClientResponse[T]] = js.native
  def curl[T](url: nodeLib.urlMod.URL, options: O, callback: Callback[T]): scala.Unit = js.native
  def request[T](url: java.lang.String): js.Promise[HttpClientResponse[T]] = js.native
  def request[T](url: java.lang.String, callback: Callback[T]): scala.Unit = js.native
  def request[T](url: java.lang.String, options: O): js.Promise[HttpClientResponse[T]] = js.native
  def request[T](url: java.lang.String, options: O, callback: Callback[T]): scala.Unit = js.native
  def request[T](url: nodeLib.urlMod.URL): js.Promise[HttpClientResponse[T]] = js.native
  def request[T](url: nodeLib.urlMod.URL, callback: Callback[T]): scala.Unit = js.native
  def request[T](url: nodeLib.urlMod.URL, options: O): js.Promise[HttpClientResponse[T]] = js.native
  def request[T](url: nodeLib.urlMod.URL, options: O, callback: Callback[T]): scala.Unit = js.native
  def requestThunk(url: java.lang.String): js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, scala.Unit], scala.Unit] = js.native
  def requestThunk(url: java.lang.String, options: O): js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, scala.Unit], scala.Unit] = js.native
  def requestThunk(url: nodeLib.urlMod.URL): js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, scala.Unit], scala.Unit] = js.native
  def requestThunk(url: nodeLib.urlMod.URL, options: O): js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, scala.Unit], scala.Unit] = js.native
}

