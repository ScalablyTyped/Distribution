package typings.urqlCore.anon

import typings.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Url extends js.Object {
  var fetchOptions: RequestInit
  var url: String
  var value: js.Object
}

object Url {
  @scala.inline
  def apply(fetchOptions: RequestInit, url: String, value: js.Object): Url = {
    val __obj = js.Dynamic.literal(fetchOptions = fetchOptions.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Url]
  }
}

