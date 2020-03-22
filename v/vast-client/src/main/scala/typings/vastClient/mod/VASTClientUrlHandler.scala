package typings.vastClient.mod

import typings.vastClient.AnonTimeout
import typings.vastClient.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VASTClientUrlHandler extends js.Object {
  def get(url: String, options: AnonTimeout, cb: FnCall): Unit
}

object VASTClientUrlHandler {
  @scala.inline
  def apply(get: (String, AnonTimeout, FnCall) => Unit): VASTClientUrlHandler = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction3(get))
  
    __obj.asInstanceOf[VASTClientUrlHandler]
  }
}

