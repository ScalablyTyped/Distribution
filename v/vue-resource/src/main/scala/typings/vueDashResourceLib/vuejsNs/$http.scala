package typings
package vueDashResourceLib.vuejsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait $http extends js.Object {
  def apply(url: java.lang.String): js.Thenable[HttpResponse] = js.native
  def apply(url: java.lang.String, data: js.Any): js.Thenable[HttpResponse] = js.native
  def apply(url: java.lang.String, data: js.Any, options: HttpOptions): js.Thenable[HttpResponse] = js.native
  def apply(url: java.lang.String, options: HttpOptions): js.Thenable[HttpResponse] = js.native
}

