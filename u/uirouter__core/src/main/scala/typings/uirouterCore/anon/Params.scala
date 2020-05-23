package typings.uirouterCore.anon

import typings.uirouterCore.paramsInterfaceMod.RawParams
import typings.uirouterCore.stateInterfaceMod._RedirectToResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends _RedirectToResult {
  var params: js.UndefOr[RawParams] = js.undefined
  var state: js.UndefOr[String] = js.undefined
}

object Params {
  @scala.inline
  def apply(params: RawParams = null, state: String = null): Params = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
}

