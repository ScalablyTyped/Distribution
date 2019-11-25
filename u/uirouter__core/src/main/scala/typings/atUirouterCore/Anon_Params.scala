package typings.atUirouterCore

import typings.atUirouterCore.libParamsInterfaceMod.RawParams
import typings.atUirouterCore.libStateInterfaceMod._RedirectToResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Params extends _RedirectToResult {
  var params: js.UndefOr[RawParams] = js.undefined
  var state: js.UndefOr[String] = js.undefined
}

object Anon_Params {
  @scala.inline
  def apply(params: RawParams = null, state: String = null): Anon_Params = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Params]
  }
}

