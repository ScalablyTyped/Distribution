package typings.urllib.urllibMod

import typings.node.httpMod.Agent
import typings.node.urlMod.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("urllib", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val TIMEOUT: Double = js.native
  val TIMEOUTS: js.Tuple2[Double, Double] = js.native
  val USER_AGENT: String = js.native
  val agent: Agent = js.native
  val httpsAgent: typings.node.httpsMod.Agent = js.native
  def create(): HttpClient[RequestOptions] = js.native
  def create(options: RequestOptions): HttpClient[RequestOptions] = js.native
  def curl[T](url: String): js.Promise[HttpClientResponse[T]] = js.native
  def curl[T](url: String, callback: Callback[T]): Unit = js.native
  def curl[T](url: String, options: RequestOptions): js.Promise[HttpClientResponse[T]] = js.native
  def curl[T](url: String, options: RequestOptions, callback: Callback[T]): Unit = js.native
  def curl[T](url: URL): js.Promise[HttpClientResponse[T]] = js.native
  def curl[T](url: URL, callback: Callback[T]): Unit = js.native
  def curl[T](url: URL, options: RequestOptions): js.Promise[HttpClientResponse[T]] = js.native
  def curl[T](url: URL, options: RequestOptions, callback: Callback[T]): Unit = js.native
  def request[T](url: String): js.Promise[HttpClientResponse[T]] = js.native
  def request[T](url: String, callback: Callback[T]): Unit = js.native
  def request[T](url: String, options: RequestOptions): js.Promise[HttpClientResponse[T]] = js.native
  def request[T](url: String, options: RequestOptions, callback: Callback[T]): Unit = js.native
  def request[T](url: URL): js.Promise[HttpClientResponse[T]] = js.native
  def request[T](url: URL, callback: Callback[T]): Unit = js.native
  def request[T](url: URL, options: RequestOptions): js.Promise[HttpClientResponse[T]] = js.native
  def request[T](url: URL, options: RequestOptions, callback: Callback[T]): Unit = js.native
  def requestThunk[T](url: String): js.Function1[/* callback */ Callback[T], Unit] = js.native
  def requestThunk[T](url: String, options: RequestOptions): js.Function1[/* callback */ Callback[T], Unit] = js.native
  def requestThunk[T](url: URL): js.Function1[/* callback */ Callback[T], Unit] = js.native
  def requestThunk[T](url: URL, options: RequestOptions): js.Function1[/* callback */ Callback[T], Unit] = js.native
  def requestWithCallback[T](url: String, callback: Callback[T]): Unit = js.native
  def requestWithCallback[T](url: String, options: RequestOptions, callback: Callback[T]): Unit = js.native
  def requestWithCallback[T](url: URL, callback: Callback[T]): Unit = js.native
  def requestWithCallback[T](url: URL, options: RequestOptions, callback: Callback[T]): Unit = js.native
}

