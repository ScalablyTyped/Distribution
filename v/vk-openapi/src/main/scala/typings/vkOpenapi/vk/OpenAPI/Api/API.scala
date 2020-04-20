package typings.vkOpenapi.vk.OpenAPI.Api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait API extends js.Object {
  def call(method: String, params: ApiParams, cb: js.Function1[/* response */ js.Any, Unit]): Unit
}

object API {
  @scala.inline
  def apply(call: (String, ApiParams, js.Function1[/* response */ js.Any, Unit]) => Unit): API = {
    val __obj = js.Dynamic.literal(call = js.Any.fromFunction3(call))
    __obj.asInstanceOf[API]
  }
}

