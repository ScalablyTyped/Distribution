package typings
package vastDashClientLib.vastDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VASTClientUrlHandler extends js.Object {
  def get(url: java.lang.String, options: vastDashClientLib.Anon_Timeout, cb: vastDashClientLib.Fn_Err): scala.Unit
}

object VASTClientUrlHandler {
  @scala.inline
  def apply(get: (java.lang.String, vastDashClientLib.Anon_Timeout, vastDashClientLib.Fn_Err) => scala.Unit): VASTClientUrlHandler = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction3(get))
  
    __obj.asInstanceOf[VASTClientUrlHandler]
  }
}

