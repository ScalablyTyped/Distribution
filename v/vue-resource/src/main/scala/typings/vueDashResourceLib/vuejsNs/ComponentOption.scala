package typings
package vueDashResourceLib.vuejsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentOption extends js.Object {
  var http: js.UndefOr[vueDashResourceLib.Anon_Headers with HttpOptions] = js.undefined
}

object ComponentOption {
  @scala.inline
  def apply(http: vueDashResourceLib.Anon_Headers with HttpOptions = null): ComponentOption = {
    val __obj = js.Dynamic.literal()
    if (http != null) __obj.updateDynamic("http")(http)
    __obj.asInstanceOf[ComponentOption]
  }
}

