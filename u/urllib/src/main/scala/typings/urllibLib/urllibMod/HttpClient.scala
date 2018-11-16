package typings
package urllibLib.urllibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("urllib", "HttpClient")
@js.native
class HttpClient ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(options: RequestOptions) = this()
  def curl(url: java.lang.String, callback: Callback): scala.Unit = js.native
  def curl(url: java.lang.String, options: RequestOptions, callback: Callback): scala.Unit = js.native
  def curl(url: nodeLib.urlMod.URL, callback: Callback): scala.Unit = js.native
  def curl(url: nodeLib.urlMod.URL, options: RequestOptions, callback: Callback): scala.Unit = js.native
  def request(url: java.lang.String, callback: Callback): scala.Unit = js.native
  def request(url: java.lang.String, options: RequestOptions, callback: Callback): scala.Unit = js.native
  def request(url: nodeLib.urlMod.URL, callback: Callback): scala.Unit = js.native
  def request(url: nodeLib.urlMod.URL, options: RequestOptions, callback: Callback): scala.Unit = js.native
  def requestThunk(url: java.lang.String): js.Function1[/* callback */ js.Function1[/* repeated */js.Any, scala.Unit], scala.Unit] = js.native
  def requestThunk(url: java.lang.String, options: RequestOptions): js.Function1[/* callback */ js.Function1[/* repeated */js.Any, scala.Unit], scala.Unit] = js.native
  def requestThunk(url: nodeLib.urlMod.URL): js.Function1[/* callback */ js.Function1[/* repeated */js.Any, scala.Unit], scala.Unit] = js.native
  def requestThunk(url: nodeLib.urlMod.URL, options: RequestOptions): js.Function1[/* callback */ js.Function1[/* repeated */js.Any, scala.Unit], scala.Unit] = js.native
}

