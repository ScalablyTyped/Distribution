package typings
package urllibLib.urllibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("urllib", "HttpClient2")
@js.native
class HttpClient2 ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(options: RequestOptions) = this()
  def curl(url: java.lang.String): js.Promise[_] = js.native
  def curl(url: java.lang.String, options: RequestOptions): js.Promise[_] = js.native
  def curl(url: nodeLib.urlMod.URL): js.Promise[_] = js.native
  def curl(url: nodeLib.urlMod.URL, options: RequestOptions): js.Promise[_] = js.native
  def request(url: java.lang.String): js.Promise[_] = js.native
  def request(url: java.lang.String, options: RequestOptions): js.Promise[_] = js.native
  def request(url: nodeLib.urlMod.URL): js.Promise[_] = js.native
  def request(url: nodeLib.urlMod.URL, options: RequestOptions): js.Promise[_] = js.native
  def requestThunk(url: java.lang.String): js.Function1[/* callback */ js.Function1[/* repeated */js.Any, scala.Unit], scala.Unit] = js.native
  def requestThunk(url: java.lang.String, options: RequestOptions): js.Function1[/* callback */ js.Function1[/* repeated */js.Any, scala.Unit], scala.Unit] = js.native
  def requestThunk(url: nodeLib.urlMod.URL): js.Function1[/* callback */ js.Function1[/* repeated */js.Any, scala.Unit], scala.Unit] = js.native
  def requestThunk(url: nodeLib.urlMod.URL, options: RequestOptions): js.Function1[/* callback */ js.Function1[/* repeated */js.Any, scala.Unit], scala.Unit] = js.native
}

