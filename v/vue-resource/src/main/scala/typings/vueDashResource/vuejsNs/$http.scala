package typings.vueDashResource.vuejsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait $http extends js.Object {
  def apply(url: String): js.Thenable[HttpResponse] = js.native
  def apply(url: String, data: js.Any): js.Thenable[HttpResponse] = js.native
  def apply(url: String, data: js.Any, options: HttpOptions): js.Thenable[HttpResponse] = js.native
  def apply(url: String, options: HttpOptions): js.Thenable[HttpResponse] = js.native
}

