package typings.whatwgUrl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseURL extends js.Object {
  var baseURL: js.UndefOr[String] = js.undefined
  var encodingOverride: js.UndefOr[String] = js.undefined
}

object BaseURL {
  @scala.inline
  def apply(baseURL: String = null, encodingOverride: String = null): BaseURL = {
    val __obj = js.Dynamic.literal()
    if (baseURL != null) __obj.updateDynamic("baseURL")(baseURL.asInstanceOf[js.Any])
    if (encodingOverride != null) __obj.updateDynamic("encodingOverride")(encodingOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseURL]
  }
}

