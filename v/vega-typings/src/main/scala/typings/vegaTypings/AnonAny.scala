package typings.vegaTypings

import typings.vegaTypings.configMod.DefaultsConfig
import typings.vegaTypings.vegaTypingsStrings.any
import typings.vegaTypings.vegaTypingsStrings.container
import typings.vegaTypings.vegaTypingsStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAny extends js.Object {
  var bind: js.UndefOr[any | container | none] = js.undefined
  var defaults: js.UndefOr[DefaultsConfig] = js.undefined
  var selector: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  var timer: js.UndefOr[Boolean] = js.undefined
  var view: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  var window: js.UndefOr[Boolean | js.Array[String]] = js.undefined
}

object AnonAny {
  @scala.inline
  def apply(
    bind: any | container | none = null,
    defaults: DefaultsConfig = null,
    selector: Boolean | js.Array[String] = null,
    timer: js.UndefOr[Boolean] = js.undefined,
    view: Boolean | js.Array[String] = null,
    window: Boolean | js.Array[String] = null
  ): AnonAny = {
    val __obj = js.Dynamic.literal()
    if (bind != null) __obj.updateDynamic("bind")(bind.asInstanceOf[js.Any])
    if (defaults != null) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (!js.isUndefined(timer)) __obj.updateDynamic("timer")(timer.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAny]
  }
}

