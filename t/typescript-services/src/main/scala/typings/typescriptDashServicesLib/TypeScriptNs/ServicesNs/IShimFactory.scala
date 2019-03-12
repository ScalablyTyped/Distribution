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
  def apply(registerShim: IShim => scala.Unit, unregisterShim: IShim => scala.Unit): IShimFactory = {
    val __obj = js.Dynamic.literal(registerShim = js.Any.fromFunction1(registerShim), unregisterShim = js.Any.fromFunction1(unregisterShim))
  
    __obj.asInstanceOf[IShimFactory]
  }
}

