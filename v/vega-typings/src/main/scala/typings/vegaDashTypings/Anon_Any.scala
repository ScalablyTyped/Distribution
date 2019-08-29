package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecConfigMod.DefaultsConfig
import typings.vegaDashTypings.vegaDashTypingsStrings.any
import typings.vegaDashTypings.vegaDashTypingsStrings.container
import typings.vegaDashTypings.vegaDashTypingsStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Any extends js.Object {
  var bind: js.UndefOr[any | container | none] = js.undefined
  var defaults: js.UndefOr[DefaultsConfig] = js.undefined
  var selector: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  var timer: js.UndefOr[Boolean] = js.undefined
  var view: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  var window: js.UndefOr[Boolean | js.Array[String]] = js.undefined
}

object Anon_Any {
  @scala.inline
  def apply(
    bind: any | container | none = null,
    defaults: DefaultsConfig = null,
    selector: Boolean | js.Array[String] = null,
    timer: js.UndefOr[Boolean] = js.undefined,
    view: Boolean | js.Array[String] = null,
    window: Boolean | js.Array[String] = null
  ): Anon_Any = {
    val __obj = js.Dynamic.literal()
    if (bind != null) __obj.updateDynamic("bind")(bind.asInstanceOf[js.Any])
    if (defaults != null) __obj.updateDynamic("defaults")(defaults)
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (!js.isUndefined(timer)) __obj.updateDynamic("timer")(timer)
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Any]
  }
}

