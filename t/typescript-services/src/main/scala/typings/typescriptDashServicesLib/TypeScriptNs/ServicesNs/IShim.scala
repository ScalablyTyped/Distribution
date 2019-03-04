package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShim extends js.Object {
  def dispose(dummy: js.Any): scala.Unit
}

object IShim {
  @scala.inline
  def apply(dispose: js.Function1[js.Any, scala.Unit]): IShim = {
    val __obj = js.Dynamic.literal(dispose = dispose)
  
    __obj.asInstanceOf[IShim]
  }
}

