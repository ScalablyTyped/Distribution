package typings.typescriptDashServices.TypeScriptNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShim extends js.Object {
  def dispose(dummy: js.Any): Unit
}

object IShim {
  @scala.inline
  def apply(dispose: js.Any => Unit): IShim = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction1(dispose))
  
    __obj.asInstanceOf[IShim]
  }
}

