package typings.atUirouterCore.libStateInterfaceMod

import typings.atUirouterCore.libParamsInterfaceMod.RawParams
import typings.atUirouterCore.libTransitionInterfaceMod.TransitionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetStateDef extends js.Object {
  var options: js.UndefOr[TransitionOptions] = js.undefined
  var params: js.UndefOr[RawParams] = js.undefined
  var state: StateOrName
}

object TargetStateDef {
  @scala.inline
  def apply(state: StateOrName, options: TransitionOptions = null, params: RawParams = null): TargetStateDef = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[TargetStateDef]
  }
}

