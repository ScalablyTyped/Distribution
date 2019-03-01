package typings
package atUirouterCoreLib.libStateInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetStateDef extends js.Object {
  var options: js.UndefOr[atUirouterCoreLib.libTransitionInterfaceMod.TransitionOptions] = js.undefined
  var params: js.UndefOr[atUirouterCoreLib.libParamsInterfaceMod.RawParams] = js.undefined
  var state: StateOrName
}

object TargetStateDef {
  @scala.inline
  def apply(
    state: StateOrName,
    options: atUirouterCoreLib.libTransitionInterfaceMod.TransitionOptions = null,
    params: atUirouterCoreLib.libParamsInterfaceMod.RawParams = null
  ): TargetStateDef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[TargetStateDef]
  }
}

