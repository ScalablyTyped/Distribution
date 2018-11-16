package typings
package vueDashResourceLib.vuejsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceMethod extends js.Object {
  def apply(): stdLib.PromiseLike[HttpResponse] = js.native
  def apply(params: js.Any): stdLib.PromiseLike[HttpResponse] = js.native
  def apply(params: js.Any, data: js.Any): stdLib.PromiseLike[HttpResponse] = js.native
  def apply(params: js.Any, data: js.Any, success: js.Function): stdLib.PromiseLike[HttpResponse] = js.native
  def apply(params: js.Any, data: js.Any, success: js.Function, error: js.Function): stdLib.PromiseLike[HttpResponse] = js.native
  def apply(params: js.Any, success: js.Function): stdLib.PromiseLike[HttpResponse] = js.native
  def apply(params: js.Any, success: js.Function, error: js.Function): stdLib.PromiseLike[HttpResponse] = js.native
  def apply(success: js.Function): stdLib.PromiseLike[HttpResponse] = js.native
  def apply(success: js.Function, error: js.Function): stdLib.PromiseLike[HttpResponse] = js.native
}

