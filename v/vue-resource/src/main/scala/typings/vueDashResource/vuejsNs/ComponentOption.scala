package typings.vueDashResource.vuejsNs

import typings.vueDashResource.Anon_Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentOption extends js.Object {
  var http: js.UndefOr[Anon_Headers with HttpOptions] = js.undefined
}

object ComponentOption {
  @scala.inline
  def apply(http: Anon_Headers with HttpOptions = null): ComponentOption = {
    val __obj = js.Dynamic.literal()
    if (http != null) __obj.updateDynamic("http")(http)
    __obj.asInstanceOf[ComponentOption]
  }
}

