package typings
package urllibLib.urllibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("urllib", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val TIMEOUT: scala.Double = js.native
  val TIMEOUTS: js.Tuple2[scala.Double, scala.Double] = js.native
  val USER_AGENT: java.lang.String = js.native
  val agent: nodeLib.httpMod.Agent = js.native
  val httpsAgent: nodeLib.httpsMod.Agent = js.native
  def create(): HttpClient[RequestOptions] = js.native
  def create(options: RequestOptions): HttpClient[RequestOptions] = js.native
  def curl[T](url: java.lang.String): js.Promise[HttpClientResponse[T]] = js.native
  def curl[T](url: java.lang.String, callback: Callback[T]): scala.Unit = js.native
  def curl[T](url: java.lang.String, options: RequestOptions): js.Promise[HttpClientResponse[T]] = js.native
  def curl[T](url: java.lang.String, options: RequestOptions, callback: Callback[T]): scala.Unit = js.native
  def curl[T](url: nodeLib.urlMod.URL): js.Promise[HttpClientResponse[T]] = js.native
  def curl[T](url: nodeLib.urlMod.URL, callback: Callback[T]): scala.Unit = js.native
  def curl[T](url: nodeLib.urlMod.URL, options: RequestOptions): js.Promise[HttpClientResponse[T]] = js.native
  def curl[T](url: nodeLib.urlMod.URL, options: RequestOptions, callback: Callback[T]): scala.Unit = js.native
  def request[T](url: java.lang.String): js.Promise[HttpClientResponse[T]] = js.native
  def request[T](url: java.lang.String, callback: Callback[T]): scala.Unit = js.native
  def request[T](url: java.lang.String, options: RequestOptions): js.Promise[HttpClientResponse[T]] = js.native
  def request[T](url: java.lang.String, options: RequestOptions, callback: Callback[T]): scala.Unit = js.native
  def request[T](url: nodeLib.urlMod.URL): js.Promise[HttpClientResponse[T]] = js.native
  def request[T](url: nodeLib.urlMod.URL, callback: Callback[T]): scala.Unit = js.native
  def request[T](url: nodeLib.urlMod.URL, options: RequestOptions): js.Promise[HttpClientResponse[T]] = js.native
  def request[T](url: nodeLib.urlMod.URL, options: RequestOptions, callback: Callback[T]): scala.Unit = js.native
  def requestThunk[T](url: java.lang.String): js.Function1[/* callback */ Callback[T], scala.Unit] = js.native
  def requestThunk[T](url: java.lang.String, options: RequestOptions): js.Function1[/* callback */ Callback[T], scala.Unit] = js.native
  def requestThunk[T](url: nodeLib.urlMod.URL): js.Function1[/* callback */ Callback[T], scala.Unit] = js.native
  def requestThunk[T](url: nodeLib.urlMod.URL, options: RequestOptions): js.Function1[/* callback */ Callback[T], scala.Unit] = js.native
  def requestWithCallback[T](url: java.lang.String, callback: Callback[T]): scala.Unit = js.native
  def requestWithCallback[T](url: java.lang.String, options: RequestOptions, callback: Callback[T]): scala.Unit = js.native
  def requestWithCallback[T](url: nodeLib.urlMod.URL, callback: Callback[T]): scala.Unit = js.native
  def requestWithCallback[T](url: nodeLib.urlMod.URL, options: RequestOptions, callback: Callback[T]): scala.Unit = js.native
}

