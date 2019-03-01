package typings
package atUirouterAngularjsLib.libInterfaceMod.libStateStateRegistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateRegistry extends js.Object {
  def register(state: atUirouterAngularjsLib.libInterfaceMod.Ng1StateDeclaration): js.Any
}

object StateRegistry {
  @scala.inline
  def apply(register: js.Function1[atUirouterAngularjsLib.libInterfaceMod.Ng1StateDeclaration, js.Any]): StateRegistry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("register")(register)
    __obj.asInstanceOf[StateRegistry]
  }
}

