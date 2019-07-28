package typings.vastDashClient.vastDashClientMod

import typings.vastDashClient.Anon_Timeout
import typings.vastDashClient.Fn_Err
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VASTClientUrlHandler extends js.Object {
  def get(url: String, options: Anon_Timeout, cb: Fn_Err): Unit
}

object VASTClientUrlHandler {
  @scala.inline
  def apply(get: (String, Anon_Timeout, Fn_Err) => Unit): VASTClientUrlHandler = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction3(get))
  
    __obj.asInstanceOf[VASTClientUrlHandler]
  }
}

