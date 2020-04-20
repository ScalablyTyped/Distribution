package typings.uirouterAngularjs.interfaceMod.uirouterCoreLibStateStateRegistryAugmentingMod

import typings.uirouterAngularjs.interfaceMod.Ng1StateDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateRegistry extends js.Object {
  def register(state: Ng1StateDeclaration): js.Any
}

object StateRegistry {
  @scala.inline
  def apply(register: Ng1StateDeclaration => js.Any): StateRegistry = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register))
    __obj.asInstanceOf[StateRegistry]
  }
}

