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
  def create(): HttpClient = js.native
  def create(options: RequestOptions): HttpClient = js.native
  def curl(url: java.lang.String): js.Promise[_] = js.native
  def curl(url: java.lang.String, callback: Callback): scala.Unit = js.native
  def curl(url: java.lang.String, options: RequestOptions): js.Promise[_] = js.native
  def curl(url: java.lang.String, options: RequestOptions, callback: Callback): scala.Unit = js.native
  def curl(url: nodeLib.urlMod.URL): js.Promise[_] = js.native
  def curl(url: nodeLib.urlMod.URL, callback: Callback): scala.Unit = js.native
  def curl(url: nodeLib.urlMod.URL, options: RequestOptions): js.Promise[_] = js.native
  def curl(url: nodeLib.urlMod.URL, options: RequestOptions, callback: Callback): scala.Unit = js.native
  def request(url: java.lang.String): js.Promise[_] = js.native
  def request(url: java.lang.String, callback: Callback): scala.Unit = js.native
  def request(url: java.lang.String, options: RequestOptions): js.Promise[_] = js.native
  def request(url: java.lang.String, options: RequestOptions, callback: Callback): scala.Unit = js.native
  def request(url: nodeLib.urlMod.URL): js.Promise[_] = js.native
  def request(url: nodeLib.urlMod.URL, callback: Callback): scala.Unit = js.native
  def request(url: nodeLib.urlMod.URL, options: RequestOptions): js.Promise[_] = js.native
  def request(url: nodeLib.urlMod.URL, options: RequestOptions, callback: Callback): scala.Unit = js.native
  def requestThunk(url: java.lang.String): js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, scala.Unit], scala.Unit] = js.native
  def requestThunk(url: java.lang.String, options: RequestOptions): js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, scala.Unit], scala.Unit] = js.native
  def requestThunk(url: nodeLib.urlMod.URL): js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, scala.Unit], scala.Unit] = js.native
  def requestThunk(url: nodeLib.urlMod.URL, options: RequestOptions): js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, scala.Unit], scala.Unit] = js.native
  def requestWithCallback(url: java.lang.String, callback: Callback): scala.Unit = js.native
  def requestWithCallback(url: java.lang.String, options: RequestOptions, callback: Callback): scala.Unit = js.native
  def requestWithCallback(url: nodeLib.urlMod.URL, callback: Callback): scala.Unit = js.native
  def requestWithCallback(url: nodeLib.urlMod.URL, options: RequestOptions, callback: Callback): scala.Unit = js.native
}

