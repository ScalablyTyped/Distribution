package typings.wavesurferJs.mod

import typings.wavesurferJs.AnonInstantiableWaveSurferPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginDefinition extends js.Object {
  var deferInit: js.UndefOr[Boolean] = js.undefined
  var instance: AnonInstantiableWaveSurferPlugin
  var name: String
  var params: js.Object
  var staticProps: js.UndefOr[js.Object] = js.undefined
}

object PluginDefinition {
  @scala.inline
  def apply(
    instance: AnonInstantiableWaveSurferPlugin,
    name: String,
    params: js.Object,
    deferInit: js.UndefOr[Boolean] = js.undefined,
    staticProps: js.Object = null
  ): PluginDefinition = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    if (!js.isUndefined(deferInit)) __obj.updateDynamic("deferInit")(deferInit.asInstanceOf[js.Any])
    if (staticProps != null) __obj.updateDynamic("staticProps")(staticProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginDefinition]
  }
}

