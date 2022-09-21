package typings.wordpressCompose

import typings.react.mod.ComponentType
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createHigherOrderComponentMod {
  
  @JSImport("@wordpress/compose/utils/create-higher-order-component", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // tslint:disable:no-unnecessary-generics
  // prettier-ignore
  inline def default[EP](
    mapComponentToEnhancedComponent: js.Function1[/* component */ ComponentType[Any], ComponentType[Any]],
    modifierName: String
  ): js.Function1[
    /* component */ ComponentType[Any], 
    ComponentType[Omit[Any, /* keyof EP */ String]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(mapComponentToEnhancedComponent.asInstanceOf[js.Any], modifierName.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* component */ ComponentType[Any], 
    ComponentType[Omit[Any, /* keyof EP */ String]]
  ]]
}
