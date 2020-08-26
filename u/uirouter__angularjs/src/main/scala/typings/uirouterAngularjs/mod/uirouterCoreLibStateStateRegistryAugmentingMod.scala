package typings.uirouterAngularjs.mod

import typings.uirouterAngularjs.anon.Instantiable
import typings.uirouterAngularjs.interfaceMod.Ng1StateDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/state/stateRegistry", JSImport.Namespace)
@js.native
object uirouterCoreLibStateStateRegistryAugmentingMod extends js.Object {
  @js.native
  trait StateRegistry extends js.Object {
    def register(state: Instantiable): js.Any = js.native
    def register(state: Ng1StateDeclaration): js.Any = js.native
  }
  
}

