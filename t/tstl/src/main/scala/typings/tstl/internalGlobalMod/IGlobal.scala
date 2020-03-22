package typings.tstl.internalGlobalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGlobal extends js.Object {
  var __s_iUID: Double
  var __s_pTerminate_handler: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object IGlobal {
  @scala.inline
  def apply(__s_iUID: Double, __s_pTerminate_handler: () => Unit = null): IGlobal = {
    val __obj = js.Dynamic.literal(__s_iUID = __s_iUID.asInstanceOf[js.Any])
    if (__s_pTerminate_handler != null) __obj.updateDynamic("__s_pTerminate_handler")(js.Any.fromFunction0(__s_pTerminate_handler))
    __obj.asInstanceOf[IGlobal]
  }
}

