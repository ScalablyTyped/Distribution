package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecConfigMod.DefaultsConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Defaults extends js.Object {
  var defaults: js.UndefOr[DefaultsConfig] = js.undefined
}

object Anon_Defaults {
  @scala.inline
  def apply(defaults: DefaultsConfig = null): Anon_Defaults = {
    val __obj = js.Dynamic.literal()
    if (defaults != null) __obj.updateDynamic("defaults")(defaults)
    __obj.asInstanceOf[Anon_Defaults]
  }
}

