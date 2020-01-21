package typings.vastClient.mod

import typings.vastClient.AnonTimeout
import typings.vastClient.FnErr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VASTClientUrlHandler extends js.Object {
  def get(url: String, options: AnonTimeout, cb: FnErr): Unit
}

object VASTClientUrlHandler {
  @scala.inline
  def apply(get: (String, AnonTimeout, FnErr) => Unit): VASTClientUrlHandler = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction3(get))
  
    __obj.asInstanceOf[VASTClientUrlHandler]
  }
}

