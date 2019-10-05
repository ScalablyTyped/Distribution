package typings.typescriptDashServices

import typings.typescriptDashServices.TypeScript.GetAccessor
import typings.typescriptDashServices.TypeScript.SetAccessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Getter extends js.Object {
  var getter: GetAccessor
  var setter: SetAccessor
}

object Anon_Getter {
  @scala.inline
  def apply(getter: GetAccessor, setter: SetAccessor): Anon_Getter = {
    val __obj = js.Dynamic.literal(getter = getter, setter = setter)
  
    __obj.asInstanceOf[Anon_Getter]
  }
}

