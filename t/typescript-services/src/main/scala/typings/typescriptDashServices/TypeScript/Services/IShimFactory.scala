package typings.typescriptDashServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShimFactory extends js.Object {
  def registerShim(shim: IShim): Unit
  def unregisterShim(shim: IShim): Unit
}

object IShimFactory {
  @scala.inline
  def apply(registerShim: IShim => Unit, unregisterShim: IShim => Unit): IShimFactory = {
    val __obj = js.Dynamic.literal(registerShim = js.Any.fromFunction1(registerShim), unregisterShim = js.Any.fromFunction1(unregisterShim))
  
    __obj.asInstanceOf[IShimFactory]
  }
}

