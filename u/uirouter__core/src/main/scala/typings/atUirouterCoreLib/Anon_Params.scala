package typings
package atUirouterCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Params
  extends atUirouterCoreLib.libStateInterfaceMod._RedirectToResult {
  var params: js.UndefOr[atUirouterCoreLib.libParamsInterfaceMod.RawParams] = js.undefined
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Params {
  @scala.inline
  def apply(params: atUirouterCoreLib.libParamsInterfaceMod.RawParams = null, state: java.lang.String = null): Anon_Params = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Anon_Params]
  }
}

