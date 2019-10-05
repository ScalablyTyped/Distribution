package typings.vueDashResource.vuejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceMethod extends js.Object {
  def apply(): js.Thenable[HttpResponse] = js.native
  def apply(params: js.Any): js.Thenable[HttpResponse] = js.native
  def apply(params: js.Any, data: js.Any): js.Thenable[HttpResponse] = js.native
  def apply(params: js.Any, data: js.Any, success: js.Function): js.Thenable[HttpResponse] = js.native
  def apply(params: js.Any, data: js.Any, success: js.Function, error: js.Function): js.Thenable[HttpResponse] = js.native
  def apply(params: js.Any, success: js.Function): js.Thenable[HttpResponse] = js.native
  def apply(params: js.Any, success: js.Function, error: js.Function): js.Thenable[HttpResponse] = js.native
  def apply(success: js.Function): js.Thenable[HttpResponse] = js.native
  def apply(success: js.Function, error: js.Function): js.Thenable[HttpResponse] = js.native
}

