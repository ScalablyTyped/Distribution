package typings.wordpressCompose

import typings.react.mod.ComponentType
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createHigherOrderComponentMod {
  
  // tslint:disable:no-unnecessary-generics
  // prettier-ignore
  @JSImport("@wordpress/compose/utils/create-higher-order-component", JSImport.Default)
  @js.native
  def default[EP](
    mapComponentToEnhancedComponent: js.Function1[/* component */ ComponentType[_], ComponentType[_]],
    modifierName: String
  ): js.Function1[/* component */ ComponentType[_], ComponentType[Omit[_, /* keyof EP */ String]]] = js.native
}
