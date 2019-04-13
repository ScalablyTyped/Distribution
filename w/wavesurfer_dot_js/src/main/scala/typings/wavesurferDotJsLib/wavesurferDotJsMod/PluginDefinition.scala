package typings
package wavesurferDotJsLib.wavesurferDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginDefinition extends js.Object {
  var deferInit: js.UndefOr[scala.Boolean] = js.undefined
  var instance: wavesurferDotJsLib.Anon_Params
  var name: java.lang.String
  var params: js.Object
  var staticProps: js.UndefOr[js.Object] = js.undefined
}

object PluginDefinition {
  @scala.inline
  def apply(
    instance: wavesurferDotJsLib.Anon_Params,
    name: java.lang.String,
    params: js.Object,
    deferInit: js.UndefOr[scala.Boolean] = js.undefined,
    staticProps: js.Object = null
  ): PluginDefinition = {
    val __obj = js.Dynamic.literal(instance = instance, name = name, params = params)
    if (!js.isUndefined(deferInit)) __obj.updateDynamic("deferInit")(deferInit)
    if (staticProps != null) __obj.updateDynamic("staticProps")(staticProps)
    __obj.asInstanceOf[PluginDefinition]
  }
}

