package typings
package typescriptDashServicesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Getter extends js.Object {
  var getter: typescriptDashServicesLib.TypeScriptNs.GetAccessor
  var setter: typescriptDashServicesLib.TypeScriptNs.SetAccessor
}

object Anon_Getter {
  @scala.inline
  def apply(
    getter: typescriptDashServicesLib.TypeScriptNs.GetAccessor,
    setter: typescriptDashServicesLib.TypeScriptNs.SetAccessor
  ): Anon_Getter = {
    val __obj = js.Dynamic.literal(getter = getter, setter = setter)
  
    __obj.asInstanceOf[Anon_Getter]
  }
}

