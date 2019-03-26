package typings
package tabrisLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Body")
@js.native
class Body () extends js.Object {
  var bodyUsed: scala.Boolean = js.native
  def arrayBuffer(): js.Promise[stdLib.ArrayBuffer] = js.native
  // TODO: enable when Blob support is added
  // blob(): Promise<Blob>;
  // formData(): Promise<FormData>;
  def json(): js.Promise[_] = js.native
  @JSName("json")
  def json_T[T](): js.Promise[T] = js.native
  def text(): js.Promise[java.lang.String] = js.native
}

