package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShimFactory extends js.Object {
  def registerShim(shim: IShim): scala.Unit
  def unregisterShim(shim: IShim): scala.Unit
}

object IShimFactory {
  @scala.inline
  def apply(registerShim: js.Function1[IShim, scala.Unit], unregisterShim: js.Function1[IShim, scala.Unit]): IShimFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("registerShim")(registerShim)
    __obj.updateDynamic("unregisterShim")(unregisterShim)
    __obj.asInstanceOf[IShimFactory]
  }
}

