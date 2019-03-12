package typings
package timezoneDashJsLib.timezoneDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimezoneJsOptions extends js.Object {
  var async: js.UndefOr[scala.Boolean] = js.undefined
  var error: js.UndefOr[js.Function1[/* err */ stdLib.Error, scala.Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* data */ java.lang.String, scala.Unit]] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object TimezoneJsOptions {
  @scala.inline
  def apply(
    async: js.UndefOr[scala.Boolean] = js.undefined,
    error: /* err */ stdLib.Error => scala.Unit = null,
    success: /* data */ java.lang.String => scala.Unit = null,
    url: java.lang.String = null
  ): TimezoneJsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[TimezoneJsOptions]
  }
}

