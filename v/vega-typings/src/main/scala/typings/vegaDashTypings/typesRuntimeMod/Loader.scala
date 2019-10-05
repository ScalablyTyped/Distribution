package typings.vegaDashTypings.typesRuntimeMod

import typings.vegaDashTypings.Anon_Href
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Loader extends js.Object {
  def file(filename: String): js.Promise[String] = js.native
  def http(uri: String, options: js.Any): js.Promise[String] = js.native
  def load(uri: String): js.Promise[String] = js.native
  def load(uri: String, options: js.Any): js.Promise[String] = js.native
  def sanitize(uri: String, options: js.Any): js.Promise[Anon_Href] = js.native
}

@JSImport("vega-typings/types/runtime", "loader")
@js.native
object loader extends js.Object {
  def apply(): Loader = js.native
  def apply(opt: LoaderOptions): Loader = js.native
}

