package typings.wordpressCompose

import typings.react.mod.ComponentType
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/compose/utils/create-higher-order-component", JSImport.Namespace)
@js.native
object createHigherOrderComponentMod extends js.Object {
  
  // tslint:disable:no-unnecessary-generics
  // prettier-ignore
  def default[EP](
    mapComponentToEnhancedComponent: js.Function1[/* component */ ComponentType[_], ComponentType[_]],
    modifierName: String
  ): js.Function1[/* component */ ComponentType[_], ComponentType[Omit[_, /* keyof EP */ String]]] = js.native
}
