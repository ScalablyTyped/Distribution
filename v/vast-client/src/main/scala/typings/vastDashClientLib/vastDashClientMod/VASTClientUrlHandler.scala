package typings
package vastDashClientLib.vastDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VASTClientUrlHandler extends js.Object {
  def get(url: java.lang.String, options: vastDashClientLib.Anon_Timeout, cb: vastDashClientLib.Anon_Err): scala.Unit
}

object VASTClientUrlHandler {
  @scala.inline
  def apply(
    get: js.Function3[
      java.lang.String, 
      vastDashClientLib.Anon_Timeout, 
      vastDashClientLib.Anon_Err, 
      scala.Unit
    ]
  ): VASTClientUrlHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.asInstanceOf[VASTClientUrlHandler]
  }
}

