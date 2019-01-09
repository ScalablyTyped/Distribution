package typings
package vegaDashTypingsLib.typesRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Loader extends js.Object {
  def file(filename: java.lang.String): js.Promise[java.lang.String] = js.native
  def http(uri: java.lang.String, options: js.Any): js.Promise[java.lang.String] = js.native
  def load(uri: java.lang.String): js.Promise[java.lang.String] = js.native
  def load(uri: java.lang.String, options: js.Any): js.Promise[java.lang.String] = js.native
  def sanitize(uri: java.lang.String, options: js.Any): js.Promise[vegaDashTypingsLib.Anon_Href] = js.native
}

