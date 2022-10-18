package typings.wordpressCompose

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsCreateHigherOrderComponentMod {
  
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
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentType<any> extends react.react.ComponentType<infer OP> ? react.react.ComponentType<std.Omit<OP, keyof EP>> : never */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(mapComponentToEnhancedComponent.asInstanceOf[js.Any], modifierName.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* component */ ComponentType[Any], 
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentType<any> extends react.react.ComponentType<infer OP> ? react.react.ComponentType<std.Omit<OP, keyof EP>> : never */ js.Any
  ]]
}
