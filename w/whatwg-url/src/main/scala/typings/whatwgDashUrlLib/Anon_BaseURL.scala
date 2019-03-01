package typings
package whatwgDashUrlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseURL extends js.Object {
  var baseURL: js.UndefOr[java.lang.String] = js.undefined
  var encodingOverride: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BaseURL {
  @scala.inline
  def apply(baseURL: java.lang.String = null, encodingOverride: java.lang.String = null): Anon_BaseURL = {
    val __obj = js.Dynamic.literal()
    if (baseURL != null) __obj.updateDynamic("baseURL")(baseURL)
    if (encodingOverride != null) __obj.updateDynamic("encodingOverride")(encodingOverride)
    __obj.asInstanceOf[Anon_BaseURL]
  }
}

